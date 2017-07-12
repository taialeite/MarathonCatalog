package ie.ergogrouppractice.marathoncatalog;

public class Port {

	private PortType portType;
	
	private int portNumber;

	public Port(PortType portType, int portNumber) {
		
		super();
		this.portType = portType;
		this.portNumber = portNumber;
	}

	public PortType getPortType() {
		return portType;
	}

	public void setPortType(PortType portType) {
		this.portType = portType;
	}

	public int getPortNumber() {
		return portNumber;
	}

	public void setPortNumber(int portNumber) {
		this.portNumber = portNumber;
	}

	@Override
	public String toString() {
		return "Port [portType=" + portType + ", portNumber=" + portNumber + "]";
	}
	
	
	
}
