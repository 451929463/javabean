package webjavabean.domain;

public class Clazz {
	private String Scope;
	private String city;
	public String getScope() {
		return Scope;
	}
	public void setScope(String scope) {
		Scope = scope;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Clazz(String scope, String city) {
		super();
		Scope = scope;
		this.city = city;
	}
	public Clazz() {
		super();
	}
	@Override
	public String toString() {
		return "Clazz [Scope=" + Scope + ", city=" + city + "]";
	}
	
	
}
