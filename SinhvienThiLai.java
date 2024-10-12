package homework;

import java.util.ArrayList;

public class SinhvienThiLai extends Sinhvien {
	private String type;
	
	public void setType(String s) {
		this.type=s;
	}
	public String getType() {
		return this.type;
	}
	//public SinhvienThiLai(String mssv ,String name, String lop , ArrayList<Subject> subjectList, String type) {
		//super( mssv, name, lop, subjectList);
		//this.type=type;
	//}
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.println("dac biet: "+ type);
	}
}
