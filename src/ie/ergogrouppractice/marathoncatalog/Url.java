package ie.ergogrouppractice.marathoncatalog;

public class Url {
	
	private String internal;
	
	private String external;

	public Url(String internal, String external) {
		super();
		this.internal = internal;
		this.external = external;
	}

	public String getInternal() {
		return internal;
	}

	public void setInternal(String internal) {
		this.internal = internal;
	}

	public String getExternal() {
		return external;
	}

	public void setExternal(String external) {
		this.external = external;
	}

	@Override
	public String toString() {
		return "Url [internal=" + internal + ", external=" + external + "]";
	}
	
	

}
