// Very simple client that just sends
// lines to the server and reads lines from the user

import java.net.*;
import java.io.*;

public class EchoClient1
{
  public static void main(String[] args)   throws IOException
  {
      String str;
    // Passing null to getByName() produces the
    // special "Local Loopback" IP address, for
    // testing on one machine w/o a network:

    InetAddress addr = InetAddress.getLocalHost();

    // Alternatively, you can use
    // the address or name:
    // InetAddress addr = InetAddress.getByName("cpm8");
    // InetAddress addr = InetAddress.getByName("localhost");
    System.out.println("addr = " + addr);
    Socket socket =  new Socket(addr,5482);

    // Guard everything in a try-finally to make
    // sure that the socket is closed:

    try
    {
      System.out.println("socket = " + socket);
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      // Output is automatically flushed
      // by PrintWriter:
      PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
              socket.getOutputStream())),true);
      while((str=in.readLine())!="END")
      {
             out.println(str);
      }
      out.println("END");
    }
      finally
      {
      System.out.println("closing...");
      socket.close();
      }
  }
} 
