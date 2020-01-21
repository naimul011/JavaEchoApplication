
package clientserverapplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9999);
        
        System.out.println("Waiting for client to connect....");
        Socket client = server.accept();
        System.out.println("Connection has been established.");
        
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String str = in.readLine();
        
        PrintWriter out = new PrintWriter(client.getOutputStream(),true);
        out.println("Server: "+str);
        
    }
}
