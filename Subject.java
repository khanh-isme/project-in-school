package homework;

public class Subject {
	private double diem;
	private String title;
	
	Subject( String title , double diem){
		this.title=title;
		this.diem=diem;
	}
	
	public void setDiem(double diem) {
		this.diem=diem;
	}
	public double getDiem() {
		return this.diem;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return this.title;
	}
	
	public String toString() {
		return "MonHoc: "+title+"Diem: "+diem;
	}
}
