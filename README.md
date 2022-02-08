## Localism
### A GUI LOCAL AREA CHAT
#### INTRO:
Pure Java GUI program to chat in LAN and force show Pop Msg box on Windows machines in LAN (Prank ,sent anonymous msg)
## How to Run?
- #### step 1: goto the same directory which have Compiled Jar file.
JAR File :(Localism-1.0.jar)
- #### Step 2: run this command to run GUI :
```sh
java -cp Localism-1.0.jar com.mushtaqalvi.localism.Main_GUI
```

- Note: Java JVM path should be in environment variable .

##### You can also rebuild or modify the code . just open this project in NetBeans IDE to recode the source code. Compile and Execute.

## How It Works?
! This Software is written in Pure java language (A NetBeans IDE project) . Its UI is made of AWT and JFrame GUI libraries.
! A Server Client Also known as Socket Programming approach is used in this project to send data from machines to each other.
! A machine must be server to handle all the clients joined over same LAN (Local Area Network) to that specific server (Port 6666).

### Why you said prank ?

The system command (msg) in Windows OS is used to send anonymous Pop BOx containig msg in it over LAN to connected machines.
###### Demo Command:
##### msg /SERVER:127.0.0.1 * "I am message" 

# Can I use it over WAN? (Over Wide Area Network aka Global Internet)
##### Yes . Just reroute the LAN trafic to WAN (Use NGROK or anyother alternative routing service.)
##### Ngrok is free dude.
[Go To Ngrok official WebSite](https://ngrok.com/)
[How to SetUP NGROK ? Read DOC](https://ngrok.com/docs)


# Home
<img src="https://github.com/MushtaqAlvi/Localism_Chat/blob/main/screenshots/home.png"
     alt="Localism Main Screen"
     style="float: left; margin-right: 10px;" />
     
# Start as a Server over localhost
##### Just click the server button to start the server
### Other Clients must use Server's machine's IP to connect in chatroom
<img src="https://github.com/MushtaqAlvi/Localism_Chat/blob/main/screenshots/server.png"
     alt="Localism Main Screen"
     style="float: left; margin-right: 10px;" />
# Joined Chat Room
##### Must Set Server's IP first . Then Click Join.
<img src="https://github.com/MushtaqAlvi/Localism_Chat/blob/main/screenshots/joined.png"
     alt="Localism Main Screen"
     style="float: left; margin-right: 10px;" />
# AboutUS
<img src="https://github.com/MushtaqAlvi/Localism_Chat/blob/main/screenshots/localism_aboutus_small.png"
     alt="Localism Main Screen"
     style="float: left; margin-right: 10px;" />
     
     
