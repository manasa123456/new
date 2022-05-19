package ensp;
 class Bank{
	 private int bal ,id;
	 private String name;

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
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

	 

public class EncapsBank {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.setBal(20000);
		b.setId(12);
		b.setName("manaasa");
		System.out.println("Bank balance"+b.getBal());
		System.out.println("Bank Id"+b.getId());
		System.out.println("Name"+b.getName());	
	}

}
 }
 
