package homework;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Sinhvien {
	private String mssv;
	private String name;
	private String lop;
	private ArrayList<Subject> subjectList;
	
	public Sinhvien() {
		subjectList= new ArrayList<Subject>();
	}
	
	 public Sinhvien(String maSinhVien, String hoTen, String lop, ArrayList<Subject> subjectList) {
	        this.mssv = mssv;
	        this.name = name;
	        this.lop = lop;
	        this.subjectList = subjectList;
	 }
	
	public String getName() {
		return this.name;
	}
	
	public void setName( String name) {
		this.name = name;
	}
	
	public String getMssv() {
		return this.mssv;
	}
	
	public void setMssv(String maSinhVien) {
        this.mssv = maSinhVien;
    }
	
	public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
	
    public ArrayList<Subject> getSubjectList() {
	        return subjectList;
	    }
    
    public void setSubjectList(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }
    
    // Phương thức nhập thông tin sinh viên
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        mssv = scanner.nextLine();
        System.out.print("Nhập họ tên: ");
        name = scanner.nextLine();
        System.out.print("Nhập lớp: ");
        lop = scanner.nextLine();

        System.out.print("Nhập số lượng môn học: ");
        int soMonHoc = scanner.nextInt();
        scanner.nextLine(); // Xử lý ký tự xuống dòng sau khi nhập số

        for (int i = 0; i < soMonHoc; i++) {
            System.out.print("Nhập tên môn học " + (i + 1) + ": ");
            String tenMonHoc = scanner.nextLine();
            
            System.out.print("Nhập điểm môn " + (i + 1) + ": ");
            double diem = scanner.nextDouble();
            scanner.nextLine(); // Xử lý ký tự xuống dòng

            Subject monHoc = new Subject (tenMonHoc, diem); // Tạo đối tượng MonHoc
            subjectList.add(monHoc); // Thêm vào danh sách các môn học
        }
    }
    
    // Phương thức tính điểm trung bình
    public double tinhDiemTrungBinh() {
        double tongDiem = 0;
        for (Subject monHoc : subjectList) {
            tongDiem += monHoc.getDiem();
        }
        return tongDiem / subjectList.size();
    }
    
 // Phương thức xếp loại sinh viên
    public String xepLoai() {
        double dtb = tinhDiemTrungBinh();
        if (dtb >= 8) {
            return "Giỏi";
        } else if (dtb >= 6.5) {
            return "Khá";
        } else if (dtb >= 5) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }
    
    //Phương thức xuất thông tin sinh viên
    public void xuatThongTin() {
        System.out.println("Mã sinh viên: " + mssv);
        System.out.println("Họ tên: " + name);
        System.out.println("Lớp: " + lop);
        
        for (Subject monHoc : subjectList) {
            System.out.println(monHoc.toString());
        }

        System.out.println("Điểm trung bình: " + tinhDiemTrungBinh());
        System.out.println("Xếp loại: " + xepLoai());
    }
    
    // Phương thức sửa điểm môn học
    public void suaDiemMonHoc(String tenMonHocCanSua, double diemMoi) {
        boolean found = false;
        for (Subject monHoc : subjectList) {
            if (monHoc.getTitle().equalsIgnoreCase(tenMonHocCanSua)) { // Tìm môn học theo tên
                monHoc.setDiem(diemMoi); // Cập nhật điểm mới
                found = true;
                System.out.println("Điểm môn " + tenMonHocCanSua + " đã được cập nhật thành: " + diemMoi);
                break; // Dừng vòng lặp sau khi tìm thấy và sửa
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy môn học có tên: " + tenMonHocCanSua);
        }
    }
	
    
}


