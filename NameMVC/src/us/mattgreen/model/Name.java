package us.mattgreen.model;

public class Name {

	private String id;
	private String first;
	private String last;

	public Name(String id, String first, String last) {
		this.id = id;
		this.first = first;
		this.last = last;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

}
