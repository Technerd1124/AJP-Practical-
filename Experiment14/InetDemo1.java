import java.net.*;
public class InetDemo1 {
    public static void main(String[] args) throws UnknownHostException{
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);

        address = InetAddress.getByName("yahoo.com");
        System.out.println(address);
        System.out.println("Host Name : " + address.getHostName());
        System.out.println("Host Address : " + address.getHostAddress());

        InetAddress[] sw = InetAddress.getAllByName("www.razer.com");
      
        for(InetAddress i : sw){
            System.out.println(i);
        }
    }
}
