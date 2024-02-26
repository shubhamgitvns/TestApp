
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author shubham
 */
public class Echoclient {
     public static void main(String[] args)throws Exception{
        Socket s = new Socket("localhost",999);
        System.out.println("Enter message");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        
        
        PrintWriter pw = new PrintWriter(s.getOutputStream());
      pw.println(line);
        pw.flush();
        Scanner in = new Scanner(s.getInputStream());
        line = in.nextLine();
        System.out.println("Client= " + line);
        
        
        
    }
    
}








