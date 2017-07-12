package ie.ergogrouppractice.marathoncatalog;

public enum Type {

	T("Tool"),
	S("Software Project");

	private String description;

	private Type(String description){
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public Type getByDescription(String description){
		Type type = null;
		for(Type value : Type.values()){
			if(value.getDescription().equalsIgnoreCase(description)){
				type = value;
			}
		}
		return type;

	}
	
	public String toString(){ 
        return description; 
    } 

}
