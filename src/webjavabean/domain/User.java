package webjavabean.domain;

public class User {
	private int id;
	private String nameString;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User(int id, String nameString, int age) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.age = age;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", nameString=" + nameString + ", age=" + age
				+ "]";
	}
	
	
}
