package ensp;

class Employee{
	private String name,mail;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {  
	    this.name = name;  
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail=mail;
	}
	
public class Encapsulation {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Manasa");
		emp.setMail("manasa.s@imaginnovate.com");
		System.out.println(emp.getName());
		System.out.println(emp.getMail());
		emp.getName();
		emp.getMail();
	}
}
}