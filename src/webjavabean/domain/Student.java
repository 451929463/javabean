package webjavabean.domain;

public class Student {
	private int id ;
	private int name;
	private Clazz clazz;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public Clazz getClazz() {
		return clazz;
	}
	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}
	public Student(int id, int name, Clazz clazz) {
		super();
		this.id = id;
		this.name = name;
		this.clazz = clazz;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", clazz=" + clazz
				+ "]";
	}
	
	
}
