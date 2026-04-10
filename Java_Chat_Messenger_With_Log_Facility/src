import java.net.*;
import java.io.*;

class server
{
    public static void main(String Arg[]) throws Exception
    {
        // Message indicating server start
        System.out.println("Server application is running...");

        // Create ServerSocket at port 2100
        ServerSocket ssobj = new ServerSocket(5100);
        System.out.println("Server is waiting for the client at port number 5100");

        // Accept connection request from client
        Socket sobj = ssobj.accept();
        System.out.println("Connection successful with the Client...");

        // Stream to send data to client
        PrintStream ps = new PrintStream(sobj.getOutputStream());

        // Stream to read data from client
        BufferedReader br1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

        // Stream to read data from server keyboard
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        // -------- Chat Log File Setup --------
        // Creates or opens chat_log.txt in append mode
        BufferedWriter bw = new BufferedWriter(new FileWriter("chat_log.txt", true));

        String str1, str2;

        System.out.println("Chat Messenger application Started..");

        // Continuous communication loop
        try
        {
            while((str1 = br1.readLine()) != null)
            {
                // check if client ends chat
                if(str1.equalsIgnoreCase("end"))
                {
                    System.out.println("Client ended chat...");
                    break;
                }

                System.out.println("Client says : " + str1);

                bw.write("Client : " + str1);
                bw.newLine();
                bw.flush();

                System.out.println("Enter message for client : ");
                str2 = br2.readLine();

                // check if server ends chat
                if(str2.equalsIgnoreCase("end"))
                {
                    ps.println("end");
                    System.out.println("Server ended chat...");
                    break;
                }

                ps.println(str2);

                bw.write("Server : " + str2);
                bw.newLine();
                bw.flush();
            }
        }
        catch(SocketException e)
        {
            System.out.println("Client disconnected...");
        }

        // Closing resources
        bw.close();
        sobj.close();
        ssobj.close();

        System.out.println("Thank you for using Chat Application..");
    }
}