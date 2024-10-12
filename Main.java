package homework;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QuanlySinhvien quanly = new QuanlySinhvien();
		
		Sinhvien sv1 = new Sinhvien();
		sv1.setMssv("1");
		sv1.setName("khanh");
		sv1.setLop("2");
		sv1.getSubjectList().add(new Dethi("toan",10,Dethi.Made.m12));
		sv1.getSubjectList().add(new Subject("ly",10));
		
		
		SinhvienThiLai sv2 = new SinhvienThiLai();
		sv2.setMssv("2");
		sv2.setName("hoang");
		sv2.setLop("3");
		sv2.getSubjectList().add(new Subject("toan",9));
		sv2.getSubjectList().add(new Subject("ly",9));
		sv2.setType("thi lai lan 2");
		
		quanly.themSinhVien(sv1);
		quanly.themSinhVien(sv2);
		
		quanly.suaDiemSinhVien("1", "toan", 9.5);
		
		quanly.xuatDanhSachSinhVien();
		
		
	}

}
