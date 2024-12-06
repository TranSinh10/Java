package collections;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

class NhanVien {
    private static int incrementId = 1;
    private int maNhanVien;
    private String ten;
    private String gioiTinh;
    private String ngaySinh;
    private String soDienThoai;
    private String trinhDoChuyenMon;

    public NhanVien(String ten, String gioiTinh, String ngaySinh, String soDienThoai, String trinhDoChuyenMon) {
        this.maNhanVien = incrementId++;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.soDienThoai = soDienThoai;
        this.trinhDoChuyenMon = trinhDoChuyenMon;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public String getTen() {
        return ten;
    }

    public void hienThiThongTin() {
        System.out.println("Thông tin nhân viên:");
        System.out.println("Mã nhân viên: " + maNhanVien);
        System.out.println("Tên: " + ten);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Số điện thoại: " + soDienThoai);
        System.out.println("Trình độ chuyên môn: " + trinhDoChuyenMon);
        System.out.println("-------------------------");
    }

    public void capNhatThongTin(String ten, String gioiTinh, String ngaySinh, String soDienThoai, String trinhDoChuyenMon) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.soDienThoai = soDienThoai;
        this.trinhDoChuyenMon = trinhDoChuyenMon;
    }
}

public class QuanlyNhanVien {
    public static void main(String[] args) {
        HashMap<Integer, NhanVien> danhSachNhanVien = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String chon;

        do {
            System.out.println("Menu:");
            System.out.println("1. add - Thêm nhân viên");
            System.out.println("2. display - Hiển thị thông tin nhân viên");
            System.out.println("3. update - Cập nhật thông tin nhân viên");
            System.out.println("4. find - Tìm kiếm nhân viên");
            System.out.println("5. exit - Thoát");
            System.out.print("Chon: ");
            chon = scanner.nextLine().toLowerCase();

            switch (chon) {
                case "add":
                    System.out.println("Nhập thông tin nhân viên:");

                    System.out.print("Tên: ");
                    String ten = scanner.nextLine();

                    String gioiTinh;
                    do {
                        System.out.print("Giới tính (nam/nữ): ");
                        gioiTinh = scanner.nextLine();
                        if (!gioiTinh.equals("nam") && !gioiTinh.equals("nữ")) {
                            System.out.println("Giới tính chỉ được nhập là nam hoặc nữ");
                        }
                    } while (!gioiTinh.equals("nam") && !gioiTinh.equals("nữ"));

                    String ngaySinh;
                    do {
                        System.out.print("Ngày sinh (dd/mm/yyyy): ");
                        ngaySinh = scanner.nextLine();
                    } while (ngaySinh.length() != 10);

                    System.out.print("Số điện thoại: ");
                    String soDienThoai = scanner.nextLine();

                    String trinhDoChuyenMon;
                    do {
                        System.out.print("Trình độ chuyên môn (Trung cấp/Cao đẳng/Đại học): ");
                        trinhDoChuyenMon = scanner.nextLine();
                        if (!trinhDoChuyenMon.equalsIgnoreCase("Trung cấp")
                                && !trinhDoChuyenMon.equalsIgnoreCase("Cao đẳng")
                                && !trinhDoChuyenMon.equalsIgnoreCase("Đại học")) {
                            System.out.println("Trình độ chuyên môn chỉ được nhập Trung cấp, Cao đẳng hoặc Đại học");
                        }
                    } while (!trinhDoChuyenMon.equalsIgnoreCase("Trung cấp")
                            && !trinhDoChuyenMon.equalsIgnoreCase("Cao đẳng")
                            && !trinhDoChuyenMon.equalsIgnoreCase("Đại học"));

                    NhanVien nv = new NhanVien(ten, gioiTinh, ngaySinh, soDienThoai, trinhDoChuyenMon);
                    danhSachNhanVien.put(nv.getMaNhanVien(), nv);
                    break;

                case "display":
                    if (danhSachNhanVien.isEmpty()) {
                        System.out.println("Not found information.");
                    } else {
                        for (NhanVien nv1 : danhSachNhanVien.values()) {
                            nv1.hienThiThongTin();
                        }
                    }
                    break;

                case "update":
                    System.out.print("Nhập mã nhân viên cần cập nhật: ");
                    int maNhanVienUpdate = scanner.nextInt();
                    scanner.nextLine();

                    if (danhSachNhanVien.containsKey(maNhanVienUpdate)) {
                        NhanVien nvUpdate = danhSachNhanVien.get(maNhanVienUpdate);

                        System.out.print("Cập nhật tên: ");
                        ten = scanner.nextLine();

                        do {
                            System.out.print("Cập nhật giới tính (nam/nữ): ");
                            gioiTinh = scanner.nextLine().toLowerCase();
                        } while (!gioiTinh.equals("nam") && !gioiTinh.equals("nữ"));

                        do {
                            System.out.print("Cập nhật ngày sinh (dd/mm/yyyy): ");
                            ngaySinh = scanner.nextLine();
                        } while (ngaySinh.length() != 10);

                        System.out.print("Cập nhật số điện thoại: ");
                        soDienThoai = scanner.nextLine();

                        do {
                            System.out.print("Cập nhật trình độ chuyên môn (Trung cấp/Cao đẳng/Đại học): ");
                            trinhDoChuyenMon = scanner.nextLine();
                        } while (!trinhDoChuyenMon.equalsIgnoreCase("Trung cấp") 
                        		&& !trinhDoChuyenMon.equalsIgnoreCase("Cao đẳng")
                        		&& !trinhDoChuyenMon.equalsIgnoreCase("Đại học"));

                        nvUpdate.capNhatThongTin(ten, gioiTinh, ngaySinh, soDienThoai, trinhDoChuyenMon);
                    } else {
                        System.out.println("Not found information.");
                    }
                    break;

                case "find":
                    System.out.print("Nhập mã hoặc tên nhân viên cần tìm: ");
                    String thongTinCanTim = scanner.nextLine();

                    boolean timThay = false;
                    for (NhanVien timNv : danhSachNhanVien.values()) {
                        if (String.valueOf(timNv.getMaNhanVien()).equals(thongTinCanTim)
                                || timNv.getTen().equalsIgnoreCase(thongTinCanTim)) {
                        	timNv.hienThiThongTin();
                            timThay = true;
                        }
                    }

                    if (!timThay) {
                        System.out.println("Not found information.");
                    }
                    break;

                case "exit":
                    System.out.println("Thoát.");
                    break;
            }
        } while (!chon.equals("exit"));
    }
}
