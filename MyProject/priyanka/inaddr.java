package priyanka;
import java.net.*;
public class inaddr {

	public inaddr() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)throws Exception {
		InetAddress ip=InetAddress.getByName("192.168.1.5");
		System.out.println(ip.getHostName()+" "+ip.getHostAddress());
		
	}

}
