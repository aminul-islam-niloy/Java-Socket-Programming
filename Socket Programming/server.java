import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class server {
    public static void main(String[] args) throws IOException
    {
        //create server socet
        ServerSocket server = new ServerSocket(95);

        //wait for the connection
        System.out.println("Waiting for the client");
        Socket conn = server.accept();
        System.out.println("client connected"); 

         //get the socket i/o stream and perform the processing
        // inputstream to recive information from  client
        //outputStream to sendinformation to the client

        BufferedReader in = new BufferedReader(
               new InputStreamReader(conn.getInputStream()));

               String str= in.readLine();
               System.out.println("client: "+str);

               //interchange start
            PrintWriter out = new PrintWriter(conn.getOutputStream());
             out.println("Hi client ");
             out.flush();


               in.close();
               conn.close();
               out.close();
        
    }
}
