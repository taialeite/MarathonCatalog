package ie.ergogrouppractice.marathoncatalog;

import java.util.Arrays;

public class Marathon {
	
	private byte[] json;

	public Marathon(byte[] json) {
		super();
		this.json = json;
	}

	public byte[] getJson() {
		return json;
	}

	public void setJson(byte[] json) {
		this.json = json;
	}

	@Override
	public String toString() {
		return "Marathon [json=" + Arrays.toString(json) + "]";
	}
	
	

}
