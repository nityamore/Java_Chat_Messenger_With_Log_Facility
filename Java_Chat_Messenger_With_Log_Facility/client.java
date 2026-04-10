import java.net.*;
import java.io.*;

class client
{
    public static void main(String Arg[]) throws Exception
    {
        // Client start message
        System.out.println("Client application is running...");

        // Connect to server running on localhost port 5100
        Socket sobj = new Socket("localhost",5100);
        System.out.println("Connection successful with the Server...");

        // Stream to send message to server
        PrintStream ps = new PrintStream(sobj.getOutputStream());

        // Stream to receive message from server
        BufferedReader br1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

        // Stream to read client input from keyboard
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        String str1, str2;

        System.out.println("Chat Messenger application Started..");

        // Client continues sending messages until "end"
        while(!(str1 = br2.readLine()).equals("end"))
        {
            // Send message to server
            ps.println(str1);

            // Receive reply from server
            str2 = br1.readLine();

            // if server ends chat
            if(str2.equalsIgnoreCase("end"))
            {
                System.out.println("Server ended chat...");
                break;
            }

            System.out.println("Server says : "+str2);
            System.out.println("Enter the message for server : ");
        }

        // send "end" to server when client exits loop
        ps.println("end");

        System.out.println("Thank you for using Chat Application..");
    }
}