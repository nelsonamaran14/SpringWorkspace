package in.mindcraft.SpringApp1;

public class Student {
	private int rollNo;
	private String name;
	private Address add;
	private Laptop laptop;
	
	
	

	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	
	
	//display statement
	public void display() {
		System.out.println(rollNo);
		System.out.println(name);
		add.display();
		laptop.display();
		
	}
	
	

}
