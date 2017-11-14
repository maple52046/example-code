import java.net.Socket;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Client {
    public static void main(String[] args) {
	    BufferedWriter bw;
	    try {
            Socket sk = new Socket("127.0.0.1",5050);
            System.out.println("Server connected");
            bw = new BufferedWriter(new OutputStreamWriter(sk.getOutputStream())); 
            while(sk.isConnected()){
                BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
                System.out.print("client:");            
                bw.write("Client:"+br.readLine()+"\n"); 
                bw.flush();
		    }

	    }
	    catch (IOException e) {
		    e.printStackTrace();
	    }
    }
}

// vim: ts=4 sw=4 expandtab
