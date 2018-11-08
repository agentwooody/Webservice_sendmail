package publish;

import javax.xml.ws.Endpoint;
import javatest.javatest;

public class Publish {
	public static void main(String[] args) {
	String address="http://localhost:666/Webservice";
	Endpoint.publish(address, new javatest());
}
}