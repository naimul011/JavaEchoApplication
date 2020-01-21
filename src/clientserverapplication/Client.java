/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserverapplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author User
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost",9999);
        
        BufferedReader userInput =  new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter a string. ");
        String str = userInput.readLine();
        
        PrintWriter out = new PrintWriter(client.getOutputStream(),true);
        out.println(str);
        
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        
        System.out.println(in.readLine());
    }
}
