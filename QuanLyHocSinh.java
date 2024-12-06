package collections;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

//2.	Tạo 1 lớp sinh viên gồm các thuộc tính (RollNo, Name, Sex, Age, Email, Address). Tạo một HashMap quản lý danh sách sinh viên,
// dùng rollNo là key cho HashMap. Xây dựng menu chương trình:
//1, Nhập N sinh viên. 2, In thông tin sinh viên. 3, Tìm kiếm sinh viên (Yêu cầu nhập RollNo và hiển thị thông tin sinh viên đó)
class SinhVien{
	private String rollNo;
	private String name;
	private String sex;
	private int age;
	private String email;
	private String address;
	public SinhVien(String RollNo, String Name, String Sex, int Age, String Email, String Address) {
		this.rollNo = RollNo;
		this.name = Name;
		this.sex = Sex;
		this.age = Age;
		this.email = Email;
		this.address = Address;
	}
	public String getRollNo(){
		return rollNo;
	}
	public void hienThiThongTin() {
		System.out.println("Thong tin sinh vien: ");
		System.out.println("RollNo :" + rollNo);
		System.out.println("Name :" + name);
		System.out.println("Sex :" + sex);
		System.out.println("Age :" + age);
		System.out.println("Email :" + email);
		System.out.println("Address :" + address);
	}
}
public class QuanLyHocSinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, SinhVien> sinhVien = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		int chon;
		do {
			
			System.out.println("Menu");
			System.out.println("1. Nhap N sinh vien: ");
			System.out.println("2. In thong tin sinh vien: ");
			System.out.println("3. Tim kiem sinh vien: ");
			System.out.println("Chon");
			chon = scanner.nextInt();
			scanner.nextLine();
			switch(chon) {
			case 1:
				System.out.println("Nhap so luong sinh vien : ");
				int n = scanner.nextInt();
				scanner.nextLine();
				for(int i = 1; i <= n; i++) {
					System.out.println("Nhap thong tin sinh vien thu "+i+" :");
					System.out.println("Nhap RollNo: ");
					String rollNo = scanner.nextLine();
					System.out.println("Nhap Name: ");
					String name = scanner.nextLine();
					System.out.println("Nhap Sex: ");
					String sex = scanner.nextLine();
					System.out.println("Nhap Age: ");
					int age = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Nhap Email: ");
					String email = scanner.nextLine();
					System.out.println("Nhap Address: ");
					String address = scanner.nextLine();
					sinhVien.put(rollNo, new SinhVien(rollNo, name, sex, age, email, address));
				}
				break;
			case 2:
				Iterator<Map.Entry<String, SinhVien>> iterator = sinhVien.entrySet().iterator();
				while(iterator.hasNext()) {
					Map.Entry<String, SinhVien> entry = iterator.next();
					entry.getValue().hienThiThongTin();
				}
				break;
			case 3:
				System.out.println("Nhap RollNo sinh vien can tim: ");
				String rollNoCanTim = scanner.nextLine();
				SinhVien sinhVienCanTim = sinhVien.get(rollNoCanTim);
				if(sinhVien.containsKey(rollNoCanTim)) {
					System.out.println("Thong tin sinh vien can tim :");
					sinhVienCanTim.hienThiThongTin(); 
				}else {
					System.out.println("Khong tim thay thong tin sinh vien");
				}
				break;
			}
		}while(chon !=0);
	}
}
