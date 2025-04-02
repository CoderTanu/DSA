package MapPractise;

import java.util.Objects;

public class Person {
	
	private String name;
	private String id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Person(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
	
	
	
	
	

}
