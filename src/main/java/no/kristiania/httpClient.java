package no.kristiania;

import java.io.IOException;
import java.net.Socket;

public class httpClient
{


  public static void main(String[] args)throws IOException
  {
    Socket socket = new Socket("urlecho.appspot.com", 80);
    socket.getOutputStream().write("GET /echo?status200&Content-Type=text%2Fhtml&body=Goodbye%20world! HTTP/1.1\r\n".getBytes());
    socket.getOutputStream().write("Host: urlecho.appspot.com\r\n".getBytes());
    socket.getOutputStream().write("Connection: Close\r\n".getBytes());
    socket.getOutputStream().write("\r\n".getBytes());
    socket.getOutputStream().flush();

    int c;
    while ((c = socket.getInputStream().read()) !=-1){

      System.out.print((char) c);
    }
  }


}
