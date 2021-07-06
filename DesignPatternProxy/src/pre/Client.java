package pre;

import metier.Imetier;

import proxy.Proxy;

import java.io.*;

public class Client {
    private Imetier imetier = new Proxy();

    public Client() {
        try {
            BufferedReader bufferedReader= new BufferedReader(new FileReader(new File("config.txt")));
            String ClassName=bufferedReader.readLine();
            imetier= (Imetier) Class.forName(ClassName).newInstance();

        } catch (Exception e) {
             e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Client();
    }
}
