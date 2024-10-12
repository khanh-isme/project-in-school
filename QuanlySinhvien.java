package homework;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanlySinhvien {
    private ArrayList<Sinhvien> danhSachSinhVien;

    // Constructor khởi tạo danh sách sinh viên
    public QuanlySinhvien() {
        danhSachSinhVien = new ArrayList<>();
    }

    // Phương thức thêm sinh viên
    public void themSinhVien(Sinhvien sinhVien) {
        danhSachSinhVien.add(sinhVien);
    }

    // Phương thức tìm sinh viên theo mã sinh viên
    public Sinhvien timSinhVienTheoMa(String maSinhVien) {
        for (Sinhvien sinhVien : danhSachSinhVien) {
            if (sinhVien.getMssv().equalsIgnoreCase(maSinhVien)) {
                return sinhVien; // Trả về đối tượng sinh viên nếu tìm thấy
            }
        }
        return null; // Trả về null nếu không tìm thấy sinh viên
    }

    // Phương thức sửa điểm môn học cho sinh viên cụ thể
    public void suaDiemSinhVien(String maSinhVien, String tenMonHoc, double diemMoi) {
        Sinhvien sinhVien = timSinhVienTheoMa(maSinhVien);
        if (sinhVien != null) {
            sinhVien.suaDiemMonHoc(tenMonHoc, diemMoi); // Gọi phương thức sửa điểm của sinh viên
        } else {
            System.out.println("Không tìm thấy sinh viên với mã: " + maSinhVien);
        }
    }

    // Phương thức xuất danh sách sinh viên
    public void xuatDanhSachSinhVien() {
        for (Sinhvien sinhVien : danhSachSinhVien) {
            sinhVien.xuatThongTin();
        }
    }
}
