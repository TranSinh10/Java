package oop;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TinhLuongNhanVien {
    public static final int LCB = 1000;
    protected String hoTen;
    protected String ngaySinh;
    protected int luong;

    public static class NhanVienVanPhong {
        public int soNgayLamViec;
    }
    public static class NhanVienSX {
        public int soSP;
    }
    public void tinhLuong() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên nhân viên: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập ngày sinh của nhân viên: ");
        ngaySinh = scanner.nextLine();

        System.out.println("Bạn là NVVP chọn 1, là NVSX chọn 2 (1 hoặc 2): ");
        int nv = scanner.nextInt();

        switch (nv) {
            case 1:
                System.out.print("Nhập số ngày làm việc: ");
                int snlv = scanner.nextInt();
                luong = snlv * 100000;
                break;
            case 2:
                System.out.print("Nhập số sản phẩm: ");
                int ssp = scanner.nextInt();
                luong = LCB + ssp * 5000;
                break;
        }
    }
    public void thongTinNhanVien() {
        System.out.println("Nhân viên " + hoTen + " \nSinh ngày " + ngaySinh + " \nCó lương = " + luong);
        
    }

    public static void main(String[] args) {
        TinhLuongNhanVien tinhLuong = new TinhLuongNhanVien();
        tinhLuong.tinhLuong();
        tinhLuong.thongTinNhanVien();
    }
}
