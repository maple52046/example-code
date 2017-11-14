import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Server{

    public static void main(String[] args) {
        try {
            ServerSocket svs = new ServerSocket(5050);
            System.out.println("waiting for client");   
            Socket sk = svs.accept();
            System.out.println("Clinet connected");
            while(sk.isConnected()){
                BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
                String msg=br.readLine();
                if(msg==null){
                    break;
                }
                System.out.println(msg);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// vim: ts=4 sw=4 expandtab
