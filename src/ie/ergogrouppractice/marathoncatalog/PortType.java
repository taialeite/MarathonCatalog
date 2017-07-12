package ie.ergogrouppractice.marathoncatalog;

public enum PortType {

	H("HostPort"),
	C("ContainerPort"),
	P("Port");
	
	private String description;
	
	private PortType(String description){
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	
	public PortType getByDescription(String description){
		PortType portType = null;
		for(PortType value : portType.values()){
			if(value.getDescription().equalsIgnoreCase(description)){
				portType = value;
			}
		}
		return portType;

	}
	
	public String toString(){ 
        return description; 
    } 
	
}
