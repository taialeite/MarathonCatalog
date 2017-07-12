package ie.ergogrouppractice.marathoncatalog;

import java.util.List;

public class Service {
	
	private Long id;

	private String name;
	
	private Type type;
	
	private Url url;
		
	private Marathon marathonGroup;
	
	private List<Port> listOfPorts;

	public Service(Long id, String name, Type type, Url url, Marathon marathonGroup, List<Port> listOfPorts) {
		
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.url = url;
		this.marathonGroup = marathonGroup;
		this.listOfPorts = listOfPorts;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Url getUrl() {
		return url;
	}

	public void setUrl(Url url) {
		this.url = url;
	}

	public Marathon getMarathonGroup() {
		return marathonGroup;
	}

	public void setMarathonGroup(Marathon marathonGroup) {
		this.marathonGroup = marathonGroup;
	}

	public List<Port> getListOfPorts() {
		return listOfPorts;
	}

	public void setListOfPorts(List<Port> listOfPorts) {
		this.listOfPorts = listOfPorts;
	}

	@Override
	public String toString() {
		return "Service [id=" + id + ", name=" + name + ", type=" + type + ", url=" + url + ", marathonGroup="
				+ marathonGroup + ", listOfPorts=" + listOfPorts + "]";
	}
	
	
	

}
