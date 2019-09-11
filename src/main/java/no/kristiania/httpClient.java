package no.kristiania;

import java.io.IOException;
import java.net.Socket;

public class httpClient
{
private String host;
  private int statusCode;

  public httpClient(String host){
 this.host=host;
}

  public static void main(String[] args)throws IOException
   {
     new httpClient("urlecho.appspot.com").executeRequest();
   }

  public void executeRequest() throws IOException {

    Socket socket = new Socket(host, 80);
    socket.getOutputStream().write("GET /echo?status200&Content-Type=text%2Fhtml&body=Goodbye%20world! HTTP/1.1\r\n".getBytes());
    socket.getOutputStream().write(("Host: " + host + "\r\n").getBytes());
    socket.getOutputStream().write("Connection: Close\r\n".getBytes());
    socket.getOutputStream().write("\r\n".getBytes());
    socket.getOutputStream().flush();

    int c;
    while ((c = socket.getInputStream().read()) !=-1){

      System.out.print((char) c);
    }
  }


  public int getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(int statusCode) {
    this.statusCode = statusCode;
  }
}
