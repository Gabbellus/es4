package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
                System.out.println("ciao");

        ServerSocket ss = new ServerSocket(3000);
        Socket s = ss.accept();
        Socket socket = new Socket("127.0.0.1", 3000);    
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        System.out.println("ciao");
    
    
    }

}