package ie.ergogrouppractice.marathoncatalog;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		new Main();
	}
	
	
	public Main(){
		
		Url url = new Url("https://stackoverflow.com/questions/6834037/initialize-a-long-in-java", "blabla");
		
		byte[] b = {1};
		
		Port port1 = new Port(PortType.C, 12345);
		Port port2 = new Port(PortType.H, 12222);
		Port port3 = new Port(PortType.P, 111111);
		
		List <Port> porta = new ArrayList<>();
		
		porta.add(port1);
		porta.add(port2);
		porta.add(port3);

		Marathon marathon = new Marathon(b);
		Service service = new Service(179168812379012345L, "Test", Type.T, url, marathon, porta);
		System.out.println(service.toString());
	}

}
