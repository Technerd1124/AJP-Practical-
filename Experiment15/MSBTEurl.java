import java.net.*;

public class MSBTEurl {
    public static void main(String args[]) throws MalformedURLException {
        URL hp = new URL("http://www.msbte.org.in");
        System.out.println("Protocol: " + hp.getProtocol());
        System.out.println("Port: " + hp.getPort());
        System.out.println("Host: " + hp.getHost());
        System.out.println("File: " + hp.getFile());
    }
}
