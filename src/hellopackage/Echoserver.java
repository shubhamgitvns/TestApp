/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellopackage;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author shubham
 */
public class Echoserver {
        public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(999);
         
//        String line = scanner.nextLine();
       
        
       
        while(true){
            System.out.println("waiting for connectiomn");
            Socket s = ss.accept();
            
            
            System.out.println("connected");
           Scanner sc = new Scanner(s.getInputStream());
            System.out.println("Waiting for input");
            
            String input = sc.nextLine();
            System.out.println("Server= " + input);
          
            PrintWriter out = new PrintWriter(s.getOutputStream());
            out.println(input);
            out.flush();
            out.close();
            
                  
            
            
        }
        
        
    }
    
}




