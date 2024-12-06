package oop;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Nguoi{
	private String hoTen;
	private int tuoi;
	private String ngheNghiep;
	private int soCCCD;
	public Nguoi(String hoTen, int tuoi, String ngheNghiep, int soCCCD) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.ngheNghiep = ngheNghiep;
		this.soCCCD = soCCCD;
	}
	
	public void hienThiThongTin() {
		System.out.println("Ho ten : " + hoTen);
		System.out.println("Tuoi : " + tuoi);
		System.out.println("Nghe nghiep : " + ngheNghiep);
		System.out.println("So CCCD : " + soCCCD);
		System.out.println("---------");
	}
}
class HoGiaDinh{
	private int soThanhVien;
	private int soNha;
	private List<Nguoi> danhSachThanhVien;
	public HoGiaDinh(int soThanhVien, int soNha) {
		this.soThanhVien = soThanhVien;
		this.soNha = soNha;
		this.danhSachThanhVien = new ArrayList<>();
	}
	public void themThanhVien(Nguoi nguoi) {
		danhSachThanhVien.add(nguoi);
	}
	public void hienThiThongTin() {
		System.out.println("So nha: " + soNha);
		System.out.println("So thanh vien: " + soThanhVien);
		System.out.println("Danh sach thanh vien: ");
		for(Nguoi nguoi : danhSachThanhVien) {
			nguoi.hienThiThongTin();
		}
	}
}
class KhuPho{
	private List<HoGiaDinh> danhSachHoGiaDinh;
	public KhuPho(){
		this.danhSachHoGiaDinh = new ArrayList<>();
	}
	public void themHoGiaDinh(HoGiaDinh hoGiaDinh) {
		danhSachHoGiaDinh.add(hoGiaDinh);
	}
	public void hienThiThongTin() {
		System.out.println("Thong tin cac ho gia dinh trong khu pho: ");
		for(HoGiaDinh hoGiaDinh : danhSachHoGiaDinh) {
			hoGiaDinh.hienThiThongTin();
		}
	}
}
public class QuanLyKhuPho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		KhuPho khuPho = new KhuPho();
		System.out.println("Nhap so luong ho dan trong khu pho: ");
		int soHoDan = scanner.nextInt();
		scanner.nextLine();
		for(int i = 0; i<soHoDan; i++) {
			System.out.println("Nhap thong tin ho dan thu " + (i+1) + ":");
			System.out.println("Nhap so nha: ");
			int soNha = scanner.nextInt();
			System.out.println("Nhap so thanh vien: ");
			int soThanhVien = scanner.nextInt();
			scanner.nextLine();
			HoGiaDinh hoGiaDinh= new HoGiaDinh(soThanhVien, soNha);
			for(int j = 0; j<soThanhVien; j++) {
				System.out.println("Nhap thong tin thanh vien thu " + (j+1) + ":");
				System.out.println("Nhap ten: ");
				String hoTen = scanner.nextLine();
				System.out.println("Nhap tuoi: ");
				int tuoi = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Nhap nghe nghiep: ");
				String ngheNghiep = scanner.nextLine();
				System.out.println("Nhap so CCCD: ");
				int soCCCD = scanner.nextInt();
				scanner.nextLine();
				Nguoi nguoi = new Nguoi(hoTen, tuoi, ngheNghiep, soCCCD);
				hoGiaDinh.themThanhVien(nguoi);
			}
			khuPho.themHoGiaDinh(hoGiaDinh);
		}
		System.out.println("Hien Thi Thong Tin Khu Pho: ");
		khuPho.hienThiThongTin();
	}

}
