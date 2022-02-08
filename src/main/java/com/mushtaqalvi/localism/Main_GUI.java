package com.mushtaqalvi.localism;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.Label;
import java.awt.List;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;

/**
 *
 * @author asp
 */
public class Main_GUI extends javax.swing.JFrame {

    DefaultListModel listModel;

    /**
     * Creates new form MajjuUstad
     */
    public Main_GUI() {
        listModel = new DefaultListModel();

        // listModel.addElement( new Label("I am boy"));
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        msgEdt = new javax.swing.JTextField();
        ipEdt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        AboutUs = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        IpBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        serverBtn = new javax.swing.JToggleButton();
        joinChat = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        usernameEdt = new javax.swing.JLabel();
        sendMsg = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        edtMsg = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        LanStatus = new javax.swing.JLabel();
        IpBtn1 = new javax.swing.JButton();
        ipStatus1 = new javax.swing.JLabel();
        serverIP = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ipStatus = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        serverPort = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 200, 0, 0));

        msgEdt.setBackground(new java.awt.Color(204, 204, 204));
        msgEdt.setColumns(5);
        msgEdt.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        msgEdt.setToolTipText("Type Your Message Here");
        msgEdt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        msgEdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msgEdtActionPerformed(evt);
            }
        });

        ipEdt.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                ipEdtInputMethodTextChanged(evt);
            }
        });
        ipEdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipEdtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Localism (A simple LAN) Chatting and Prank tool");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Custom IP to send alert:");

        submit.setForeground(new java.awt.Color(0, 0, 0));
        submit.setText("Send PoP Alert");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(204, 0, 204));
        jLabel3.setText("Message : ");
        jLabel3.setToolTipText("");

        jLabel5.setText("Status : ");

        status.setForeground(new java.awt.Color(0, 0, 255));
        status.setText("(Not Featured)");

        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("v1.0");

        AboutUs.setForeground(new java.awt.Color(0, 204, 204));
        AboutUs.setText("About US");
        AboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutUsAction(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(204, 0, 51));
        jButton2.setText("Pro Mode");
        jButton2.setEnabled(false);

        IpBtn.setText("Disabled");
        IpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IpBtnActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Group Chat over LAN", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(51, 153, 0))), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 0, 0))); // NOI18N

        jList1.setModel(listModel);
        jScrollPane2.setViewportView(jList1);

        jLabel12.setText("Server runs at");

        jLabel13.setText("Localhost");

        jLabel14.setText("Port 6666");

        serverBtn.setText("On Server");
        serverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverBtnActionPerformed(evt);
            }
        });

        joinChat.setText("Join Chat");
        joinChat.setEnabled(false);
        joinChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinChatActionPerformed(evt);
            }
        });

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setText("Username:");

        usernameEdt.setForeground(new java.awt.Color(255, 0, 51));
        usernameEdt.setText("Fill Username");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(serverBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(joinChat, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameEdt)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(serverBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(joinChat)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameEdt)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sendMsg.setText("Send message");
        sendMsg.setEnabled(false);
        sendMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMsgActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("This force to send anonymous alert message.");

        edtMsg.setToolTipText("       Type Message Here");
        edtMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtMsgActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("Type Here Below:");

        LanStatus.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        LanStatus.setForeground(new java.awt.Color(255, 0, 51));
        LanStatus.setText("Dont forget to set Server's IP default port is always 6666 of server");

        IpBtn1.setText("Set");
        IpBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IpBtn1ActionPerformed(evt);
            }
        });

        ipStatus1.setForeground(new java.awt.Color(255, 0, 51));

        serverIP.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                serverIPInputMethodTextChanged(evt);
            }
        });
        serverIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverIPActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Set LAN IP (Chat Server IP)");

        jLabel11.setText("Port:");

        serverPort.setText("6666");
        serverPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverPortActionPerformed(evt);
            }
        });

        jLabel16.setText("https://github.com/MushtaqAlvi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(submit)
                        .addGap(176, 176, 176)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sendMsg)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(status))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                            .addComponent(jButton2)
                                            .addGap(18, 18, 18)
                                            .addComponent(AboutUs))
                                        .addComponent(msgEdt))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(249, 249, 249)
                                        .addComponent(ipStatus1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(93, 93, 93)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ipStatus)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ipEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(IpBtn)))))
                                .addGap(40, 40, 40))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(93, 93, 93)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addGap(6, 6, 6)
                                                .addComponent(serverPort, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(serverIP, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(IpBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtMsg)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(24, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(LanStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(26, 26, 26))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(AboutUs)
                                    .addComponent(jButton2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(msgEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(status)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ipEdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IpBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(1, 1, 1)
                                .addComponent(serverIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(serverPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(IpBtn1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ipStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ipStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(submit)
                        .addComponent(sendMsg))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LanStatus)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void msgEdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msgEdtActionPerformed
        // TODO add your 

    }//GEN-LAST:event_msgEdtActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your

        String msg = msgEdt.getText().toString();

//       if(sir.isSelected())
//       {
//       
//           String command = "msg /SERVER:10.0.2.99 * \"" + msg + "\" ";
// 
//           
//           try {
//               Process process = Runtime.getRuntime().exec(command);
//           } catch (IOException ex) {
//               Logger.getLogger(Main_GUI.class.getName()).log(Level.SEVERE, null, ex);
//           }
//       }
        if (IpBtn.getText().contains("Enabled")) {

            String command = "msg /SERVER:" + ipEdt.getText().toString() + " * \"" + msg + "\" ";

            try {
                Process process = Runtime.getRuntime().exec(command);
            } catch (IOException ex) {
                Logger.getLogger(Main_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_submitActionPerformed

    private void aboutUsAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutUsAction

        javax.swing.JDialog jdAvoutUs = new AboutUs();

        jdAvoutUs.setBounds(450, 300, 1, 1);
        jdAvoutUs.pack();
        jdAvoutUs.setVisible(true);

    }//GEN-LAST:event_aboutUsAction

    void validateIP() {

        if (ipEdt.getText().isEmpty()) {
            ipEdt.setEnabled(true);
            IpBtn.setText("Disabled");

            ipStatus.setText("Please fill Ip field");

            return;

        } else {

            if (ipEdt.getText().length() > 15 || ipEdt.getText().length() < 7) {
                ipStatus.setText("Invalid IP");
                IpBtn.setSelected(false);
                IpBtn.setText("Disabled");
                ipEdt.setEnabled(true);
                return;
            } else {
                IpBtn.setText("Enabled");
                ipStatus.setText("Make sure IP is valid");
                ipEdt.setEnabled(false);

            }

        }

    }

    private void ipEdtInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_ipEdtInputMethodTextChanged
        // TODO add your handling code here:

        validateIP();

    }//GEN-LAST:event_ipEdtInputMethodTextChanged

    private void ipEdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipEdtActionPerformed
        // TODO add your handling code here:
        validateIP();
    }//GEN-LAST:event_ipEdtActionPerformed

    private void IpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IpBtnActionPerformed

        if (IpBtn.getText().contains("Enabled")) {
            IpBtn.setText("Disabled");
            ipEdt.setEnabled(true);

        } else {
            validateIP();

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_IpBtnActionPerformed

    private void edtMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtMsgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtMsgActionPerformed

    private void IpBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IpBtn1ActionPerformed

        if (serverIP.getText().isEmpty()) {
            return;

        }

        if (IpBtn1.getText().contains("Set")) {

            joinChat.setEnabled(true);
            serverIP.setEnabled(false);
            IpBtn1.setText("Unset");
            LanStatus.setText("");

        } else {

            LanStatus.setText("Please Set your LAN IP . Open cmd and type ipconfig to get LAN IP");
            serverIP.setEnabled(true);
            IpBtn1.setText("Set");

        }

// TODO add your handling code here:
    }//GEN-LAST:event_IpBtn1ActionPerformed

    private void serverIPInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_serverIPInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_serverIPInputMethodTextChanged

    private void serverIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serverIPActionPerformed

    private void sendMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMsgActionPerformed

        
        if(username.getText().isEmpty())
                {
                
                
                usernameEdt.setText("Fill Username");
                return;
                
                }
        else{
        
           usernameEdt.setText("");
                
        }
        
        if (s != null) {

            System.out.println("Sending Message: \n " + edtMsg.getText().toString() + "\n");

            try {

                DataOutputStream dout = new DataOutputStream(s.getOutputStream());

                dout.writeUTF(username.getText().toString() + "-:-->  "  + edtMsg.getText().toString());

//               
//        dout.writeUTF("heeheh");
                System.out.println("Msg Sent done! ");

                dout.flush();

            } catch (IOException ex) {
                Logger.getLogger(Main_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

//    if( listModel.getElementAt( (listModel.getSize())-1).toString().contains("Me:"))
//    {
////    
////    listModel.addElement(edtMsg.getText().toString());
//    }
//    else 
//    {
//       listModel.addElement("Me:");
//       listModel.addElement(edtMsg.getText().toString());
//    }
        // TODO add your handling code here:
    }//GEN-LAST:event_sendMsgActionPerformed

    Server server;

    Socket s = null;
    Runnable rsocket;
    Thread tsocket;

    private void serverPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serverPortActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void joinChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinChatActionPerformed

        if (s == null) {

            try {
                s = new Socket(serverIP.getText().toString(), Integer.parseInt(serverPort.getText().toString()));
                joinChat.setEnabled(false);
                joinChat.setText("Chat Joined");
                    sendMsg.setEnabled(true);
                rsocket = () -> {
                    System.out.println("Listioning started for incoming messages from Server");
                    DataInputStream in = null;
                    try {

                        in = new DataInputStream(new BufferedInputStream(s.getInputStream()));

                    } catch (IOException ex) {
                        Logger.getLogger(Main_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    byte[] messageByte = new byte[1000];
                    String dataString = "";
                    while (true) {
                        try {
                            //        int bytesRead = in.read(messageByte);
                            //        dataString = new String(messageByte, 0, bytesRead);

                            dataString = in.readUTF();
                        } catch (IOException ex) {

                            Logger.getLogger(Main_GUI.class.getName()).log(Level.SEVERE, null, ex);

                            System.out.println("\n\n It seems that Connection to Server lost");
                            joinChat.setEnabled(true);
                            break;
                        }

                        if (s == null) {
                            break;
                        }
                        System.out.println("Msg Received: " + s.getLocalSocketAddress());
                        System.out.println(dataString);

                        listModel.addElement(s.getLocalSocketAddress() + ": ");

                        listModel.addElement(dataString);
                    }

                };

                tsocket = new Thread(rsocket);
                tsocket.start();

                // TODO add your handling code here:
            } catch (IOException ex) {
                Logger.getLogger(Main_GUI.class.getName()).log(Level.SEVERE, null, ex);

            }

        }
    }//GEN-LAST:event_joinChatActionPerformed

    private void serverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverBtnActionPerformed

        this.server = new Server();

        serverBtn.setEnabled(false);
    }//GEN-LAST:event_serverBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AboutUs;
    private javax.swing.JButton IpBtn;
    private javax.swing.JButton IpBtn1;
    private javax.swing.JLabel LanStatus;
    private javax.swing.JTextField edtMsg;
    private javax.swing.JTextField ipEdt;
    private javax.swing.JLabel ipStatus;
    private javax.swing.JLabel ipStatus1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton joinChat;
    private javax.swing.JTextField msgEdt;
    private javax.swing.JButton sendMsg;
    private javax.swing.JToggleButton serverBtn;
    private javax.swing.JTextField serverIP;
    private javax.swing.JTextField serverPort;
    private javax.swing.JLabel status;
    private javax.swing.JButton submit;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usernameEdt;
    // End of variables declaration//GEN-END:variables
}
