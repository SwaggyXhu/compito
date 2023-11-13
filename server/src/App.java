import java.io.BufferedReader;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class App {
    public static void main(String[] args) throws Exception {
        
        try{

         System.out.println("Server Avviato ");
         ServerSocket server = new ServerSocket(3000);

         Socket s = server.accept();
         System.out.println("Un cliente si è connesso");

         BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
         DataOutputStream out = new DataOutputStream(s.getOutputStream());

         String stringricevuta = in.readLine();
         System.out.println("il client ha inviato " + stringricevuta);

         String stringamodificata =stringricevuta.toUpperCase();
         out.writeBytes(stringamodificata + "\n");

        server.close();
        s.close();






        }catch(Exception e){

            System.out.println(e.getMessage());
        }


   

       





    }
}
