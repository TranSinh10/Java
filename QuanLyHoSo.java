package oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class HoSoHocSinh{
	String lop;
	String hoTen;
	int tuoi;
	String queQuan;
	public HoSoHocSinh(String lop,String hoTen,int tuoi,String queQuan){
		this.lop = lop;
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.queQuan = queQuan;
	}
	public int getTuoi(){
		return tuoi;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void hienThiThongTin(){
		System.out.println("Lop : " + lop);
		System.out.println("Ho Ten : " + hoTen);
		System.out.println("Tuoi : " + tuoi);
		System.out.println("Que : " + queQuan);
		System.out.println("---------");
	}
}
public class QuanLyHoSo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		List<HoSoHocSinh> hoSoHocSinh = new ArrayList<>();
		System.out.println("Nhap so luong hoc sinh");
		int n = scanner.nextInt();
		scanner.nextLine();
		for(int i = 0; i<n; i++) {
			System.out.println("Nhap thong tin hoc sinh thu " + (i + 1) + ":");
			System.out.println("Nhap Lop: ");
			String lop = scanner.nextLine();
			System.out.println("Nhap Ho Ten: ");
			String hoTen = scanner.nextLine();
			System.out.println("Nhap Tuoi: ");
			int tuoi = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Nhap Que Quan: ");
			String queQuan = scanner.nextLine();
			hoSoHocSinh.add(new HoSoHocSinh(lop, hoTen, tuoi, queQuan));
		}
		System.out.println("---------");
		System.out.println("Danh sach hoc sinh co tuoi 20 la: ");
		for(HoSoHocSinh hshs : hoSoHocSinh) {
			if(hshs.getTuoi() == 20) {
				hshs.hienThiThongTin();
			}
		}
		int count = 0;
		for(HoSoHocSinh hshs : hoSoHocSinh) {
			if(hshs.getTuoi() == 23 && hshs.getQueQuan().equalsIgnoreCase("Hà Nội")) {
				count++;
			}
		}
		System.out.println("So luong hoc sinh 23 tuoi va que o Ha Noi la: " + count);
	}
}
