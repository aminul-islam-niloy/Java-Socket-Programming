import java.net.*;
import java.io.*;

public class client {
    public static void main(String[] args) throws IOException
     {
        Socket conn = new Socket("localhost",95);

        //get the socket i/o stream and perform the processing
        // inputstream to recive information from  server
        //outputStream to sendinformation to the server
        PrintWriter out = new PrintWriter(conn.getOutputStream());
        out.println("Hello server");
        out.flush();

        //interchange start
        BufferedReader in = new BufferedReader(
            new InputStreamReader(conn.getInputStream()));

            String str= in.readLine();
            System.out.println("server: "+str);

        //close the connecction
        
        out.close();
        conn.close();

        in.close();


    }
}