
import java.net.*;
import java.io.*;
import java.util.*;

public class URLDemo1 {
    public static void main(String[] args) throws IOException, MalformedURLException {

        URL url = new URL("https://www.razer.com/gaming-mice");
        URLConnection uc = url.openConnection();

        System.out.println("Date:" + new Date(uc.getDate()));
        System.out.println("Content Type: " + uc.getContentType());
        System.out.println("Content Length: " + uc.getContentLength());
    }
}