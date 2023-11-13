import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class App {
    public static void main(String[] args) throws Exception {
        

       try{
              
               Socket s = new Socket("loalhost",3000);

               BufferedReader in = new BufferedReader(new InputStreamReader((s.getInputStream())));
               DataOutputStream out = new DataOutputStream(s.getOutputStream());

               out.writeBytes("Ciao a tutti"+ "\n");
               String risposta =in.readLine();

               System.out.println("il server ha detto "+ risposta );

               s.close();




       }catch(Exception e){
        System.out.println(e.getMessage());
       }







    }
}
