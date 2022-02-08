/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mushtaqalvi.localism;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mushtaq
 */
public class Server {

    ServerSocket serversocket;

    Runnable r2;
    Runnable r3;
    Thread t1;
    Thread t2;
    Thread t3;
    Socket s;
    Socket s1;
    ArrayList<Socket> socketArray;

    public Server() {

        socketArray = new ArrayList<Socket>();
        System.out.println("Server Code Starting...");

        try {

            this.serversocket = new ServerSocket(6666);
            System.out.println("Server Started...");

        } catch (IOException ex) {

            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);

            System.out.println("Failed to Run server on localhost (127.0.0.1) and Port 6666");
            System.exit(1);

        }

        Runnable r1 = ()
                -> {
            System.out.println("Thread r1 started  ");

            while (true) {

                try {

                    System.out.println("Listioning to requeset from client");
                    s1 = serversocket.accept();
                    s = s1;
                    System.out.println("User joined...");

                } catch (IOException ex) {
                    System.out.println("Falied to get connection from client ");
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }

                socketArray.add(s);

                clientHandle(s);

            }

        };
        t1 = new Thread(r1);
        t1.start();

    }

    void broadcast(String msg) {
        Socket socket;
        DataOutputStream dout;

        for (int x = 0; x <= socketArray.size() - 1; x++) {

            socket = socketArray.get(x);

            try {
                dout = new DataOutputStream(socket.getOutputStream());
                dout.writeUTF(msg);
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public void clientHandle(Socket s) {

        System.out.println("This is the clientHandle function");

        Runnable r2 = () -> {

            System.out.println("Thread r2 started");
            DataInputStream in;
            String msg;

            try {

                in = new DataInputStream(new BufferedInputStream(s.getInputStream()));

                byte[] messageByte = new byte[1000];
                String dataString = "";
                while (true) {

                    dataString = in.readUTF();
                    if (s == null) {
                        break;
                    }

                    System.out.println("Server :- Client " + s.getLocalSocketAddress());
                    System.out.println(dataString);

                    broadcast(dataString);

                }


            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }

        };

        t2 = new Thread(r2);
        t2.start();

    }

}
