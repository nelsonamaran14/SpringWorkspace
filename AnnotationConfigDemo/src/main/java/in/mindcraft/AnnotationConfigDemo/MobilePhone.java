package in.mindcraft.AnnotationConfigDemo;

public class MobilePhone {
	private int mid;
	private String make;
	
	
	//constructor
	public MobilePhone() {
		
	}
	
	//getter setter
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	public void show() {
		System.out.println(mid+" "+make);
		
	}

}
