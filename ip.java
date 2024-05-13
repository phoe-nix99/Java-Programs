import java.net.InetAddress;

public class ip {

    public static void main(String[] args) throws Exception {

        InetAddress ip = InetAddress.getLocalHost();
        System.out.println("IP of my system is : "+ip.getHostAddress());
        
    }
    
}
