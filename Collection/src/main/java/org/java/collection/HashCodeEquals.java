package org.java.collection;

public class HashCodeEquals {
	private int id;
	private String name;
	
	public HashCodeEquals(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashCodeEquals other = (HashCodeEquals) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	// if we override the equal method then we will get the equality = true.
	// in this we particularly equal the id's.
	/*
	 * @Override public boolean equals(Object obj) { // TODO Auto-generated method
	 * stub
	 * 
	 * if(obj == null) { return false; } else if(!(obj instanceof HashCodeEquals)) {
	 * return false; } else if(obj == this) { return true; } else { return
	 * this.getId() == ((HashCodeEquals) obj).getId(); } }
	 */
	
	
	
}
