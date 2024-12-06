package oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class KhachHang {
    protected String tenKhachHang;
    protected int soLuongHang;
    protected double donGia;

    public KhachHang(String tenKhachHang, int soLuongHang, double donGia) {
        this.tenKhachHang = tenKhachHang;
        this.soLuongHang = soLuongHang;
        this.donGia = donGia;
    }

    public double tinhTien() {
        double thanhTien = soLuongHang * donGia;
        thanhTien += thanhTien * 0.1;
        return thanhTien;
    }

    public String getLoaiKhachHang() {
        return "A (Bình thường)";
    }
}

class KhachHangThanThiet extends KhachHang {
    private int soNamThanThiet;

    public KhachHangThanThiet(String tenKhachHang, int soLuongHang, double donGia, int soNamThanThiet) {
        super(tenKhachHang, soLuongHang, donGia);
        this.soNamThanThiet = soNamThanThiet;
    }

    @Override
    public double tinhTien() {
        double phanTramKhuyenMai = Math.min(soNamThanThiet * 0.05, 0.5);
        double thanhTien = soLuongHang * donGia * (1 - phanTramKhuyenMai);
        thanhTien += thanhTien * 0.1;
        return thanhTien;
    }

    @Override
    public String getLoaiKhachHang() {
        return "B (Thân thiết)";
    }
}

class KhachHangDacBiet extends KhachHang {
    public KhachHangDacBiet(String tenKhachHang, int soLuongHang, double donGia) {
        super(tenKhachHang, soLuongHang, donGia);
    }

    @Override
    public double tinhTien() {
        double thanhTien = soLuongHang * donGia * 0.5;
        thanhTien += thanhTien * 0.1;
        return thanhTien;
    }

    @Override
    public String getLoaiKhachHang() {
        return "C (Đặc biệt)";
    }
}

public class QuanLyKhachHang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<KhachHang> danhSachKhachHang = new ArrayList<>();

        System.out.print("Nhập số lượng khách hàng loại A (bình thường): ");
        int x = scanner.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.println("Khách hàng loại A #" + (i + 1));
            scanner.nextLine();
            System.out.print("Nhập tên khách hàng: ");
            String ten = scanner.nextLine();
            System.out.print("Nhập số lượng hàng: ");
            int soLuong = scanner.nextInt();
            System.out.print("Nhập đơn giá: ");
            double donGia = scanner.nextDouble();

            danhSachKhachHang.add(new KhachHang(ten, soLuong, donGia));
        }

        System.out.print("Nhập số lượng khách hàng loại B (thân thiết): ");
        int y = scanner.nextInt();
        for (int i = 0; i < y; i++) {
            System.out.println("Khách hàng loại B #" + (i + 1));
            scanner.nextLine();
            System.out.print("Nhập tên khách hàng: ");
            String ten = scanner.nextLine();
            System.out.print("Nhập số lượng hàng: ");
            int soLuong = scanner.nextInt();
            System.out.print("Nhập đơn giá: ");
            double donGia = scanner.nextDouble();
            System.out.print("Nhập số năm thân thiết: ");
            int soNamThanThiet = scanner.nextInt();

            danhSachKhachHang.add(new KhachHangThanThiet(ten, soLuong, donGia, soNamThanThiet));
        }

        System.out.print("Nhập số lượng khách hàng loại C (đặc biệt): ");
        int z = scanner.nextInt();
        for (int i = 0; i < z; i++) {
            System.out.println("Khách hàng loại C #" + (i + 1));
            scanner.nextLine();
            System.out.print("Nhập tên khách hàng: ");
            String ten = scanner.nextLine();
            System.out.print("Nhập số lượng hàng: ");
            int soLuong = scanner.nextInt();
            System.out.print("Nhập đơn giá: ");
            double donGia = scanner.nextDouble();

            danhSachKhachHang.add(new KhachHangDacBiet(ten, soLuong, donGia));
        }
        double tongSoTien = 0;
        System.out.println("\nDanh sách khách hàng và số tiền phải trả:");
        for (KhachHang kh : danhSachKhachHang) {
            double soTien = kh.tinhTien();
            tongSoTien += soTien;
            System.out.println("- Tên: " + kh.tenKhachHang + ", Loại: " + kh.getLoaiKhachHang() +
                    ", Số tiền phải trả: " + soTien);
        }

        System.out.println("\nTổng số tiền công ty thu được: " + tongSoTien);
    }
}
