package no.kristiania;

import java.net.Socket;

public class httpClient {
  public static void main(String[] args) {
    Socket socket=new Socket("urlecho.appspot.com",80);
  }
}



