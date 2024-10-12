package homework;

public class Dethi extends Subject {
	private String made;
	private int socau;
	private String dokho;
	
	Dethi(String monhoc, double diem , Made made){
		super(monhoc,diem);
		this.made=made.name();
	}
	public void setMade(Made made) {
		this.made= made.name();
	}
	public String getMade() {
		return this.made;
	} 
	public enum Made {
		m12,m23,m34;
	}
	
	public void setDokho( Dokho dokho) {
		this.dokho= dokho.name();
	}
	public enum Dokho{
		de,trungbinh,kho;
	}
	public String getDokho() {
		return this.dokho;
	}
	public String toString() { 	
		return "MonHoc: "+getTitle()+" Diem: "+getDiem()+" ma de: "+ this.made;
	}
	
}
