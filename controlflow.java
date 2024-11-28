package javabasic1;
import java.util.Scanner;

public class hello {
	/*Hằng số
	public static final int a = 24;
	public static final String abc = "Hello";
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bai1 Viết chương trình cho phép nhập vào một điểm Trung bình [0…10],. 
		//Điểm Trung bình >=5 thì ghi đậu, <5 thì ghi rớt. Kiểm tra điểm này đậu hay rớt
		System.out.println("Bài 1");
		int diemTrungBinh;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập điểm : ");
		diemTrungBinh = scanner.nextInt();
		if(diemTrungBinh>=5) {
			System.out.println("Thi đậu");
		}else {
			System.out.println("Thi trượt");
		}
		//Bai2 Viết chương trình cho phép nhập vào 2 số a và b, tìm số lớn nhất.
		System.out.println("Bài 2");
		System.out.println("Nhập a = ");
		int a = scanner.nextInt();
		System.out.println("Nhập b = ");
		int b = scanner.nextInt();
		if(a>b) {
			System.out.println("a là số lớn nhất");
		}
		else if(b>a) {
			System.out.println("b là số lớn nhất");
		}
		else {
			System.out.println("a và b bằng nhau");
		}
		//Bai3 Viết chương trình cho phép nhập vào 2 số a , b và 1 phép toán +,-,*,/. Xuất kết quả tương ứng
		System.out.println("Bài 3");
		int so1, so2;
		System.out.println("Nhập số thứ nhất : ");
		so1 = scanner.nextInt();
		System.out.println("Nhập số thứ hai : ");
		so2 = scanner.nextInt();
		System.out.print("Nhập phép toán (+, -, *, /): ");
        char phepTinh = scanner.next().charAt(0);
        int ketqua = 0;
        switch (phepTinh) {
            case '+':
            	ketqua = so1 + so2;
                break;
            case '-':
            	ketqua = so1 - so2;
                break;
            case '*':
            	ketqua = so1 * so2;
                break;
            case '/':
            	ketqua = so1 / so2;
                break;
        }
		System.out.println("Kết quả của phép tính trên là : "+ ketqua);
		//Bai4 Viết chương trình cho phép nhập vào một tháng bất kỳ, hỏi tháng này thuộc quý mấy trong năm.
		// Biết rằng tháng 1,2,3 là quý 1; tháng 4,5,6 là quý 2; tháng 7,8,9 là quý 3; tháng 10,11,12 là quý 4.
		System.out.println("Bài 4");
		System.out.println("Nhập tháng : ");
		int month = scanner.nextInt();
		switch(month) {
			case 1:
			case 2:
			case 3:
				System.out.println("Tháng "+ month +" thuộc quý 1");
				break;
			case 4:
			case 5:
			case 6:
				System.out.println("Tháng "+ month +" thuộc quý 2");
				break;
			case 7:
			case 8:
			case 9:
				System.out.println("Tháng "+ month +" thuộc quý 3");
				break;
			case 10:
			case 11:
			case 12:
				System.out.println("Tháng "+ month +" thuộc quý 4");
				break;
		}
		//Bai5 Viết chương trình cho phép nhập vào và tính giai thừa của một số nguyên dương.
		System.out.println("Bài 5");
		System.out.println("Nhập 1 số nguyên dương: ");
		int soNguyenDuong = scanner.nextInt();
		int giaiThua = 1,i;
		for(i = 1;i<=soNguyenDuong;i++) {
			giaiThua *= i;
		}
		System.out.println("Kết quả " + soNguyenDuong + "! là : " + giaiThua);
		//Bai6 Viết chương trình cho phép nhập vào số nguyên dương n và tính tổng từ 1 tới gần n
		System.out.println("Bài 6");
		System.out.println("Nhập số nguyên dương n : ");
		int n = scanner.nextInt(),s=0;
		
		for(i = 0;i<n;i++) {
			s+=i;
		}
		System.out.println("Tổng các số nguyên dương từ 1 đến gần "+n+" là "+s);
		//Bai7 Viết chương trình cho phép nhập vào số nguyên dương n và tính tổng các số chẵn nhỏ hơn hoặc bằng n
		System.out.println("Bài 7");
		int tongChan = 0;
		for(i = 0;i<=n;i++) {
			if(i%2==0) {
				tongChan+=i;
			}
		}
		System.out.println("Tổng các số chẵn từ 1 đến "+n+" là : "+tongChan);
		//Bai9 Viết chương trình cho phép nhập vào và kiểm tra một số có phải là số nguyên tố hay không.
		System.out.println("Bài 9");
		System.out.println("Nhập vào 1 số bất kỳ : ");
		int soBatKy = scanner.nextInt();
		if(soBatKy >= 2) {
			boolean laSoNguyenTo = true;
			for (i = 2; i <= Math.sqrt(soBatKy); i++) {
		            if (soBatKy % i == 0) {
		            	laSoNguyenTo = false;
		            	break;
		            }
		        }
				if (laSoNguyenTo) {
	                System.out.println(soBatKy + " là số nguyên tố");
	            } else {
	                System.out.println(soBatKy + " không phải số nguyên tố");
	            }
		}
		else {
			System.out.println(soBatKy + " không phải số nguyên tố");
		}
		//Bai10 Viết chương trình kiểm tra 1 năm bất kỳ có phải năm nhuận hay không (Năm nhuận là năm chia hết cho 4 nhưng không chia hết cho 100 
		//hoặc chia hết cho 400). Chương trình bắt buộc phải nhập năm >=0, nếu nhập sai bắt nhập lại cho tới khi nào nhập đúng.
		System.out.println("Bài 10");
		int namBatKy;
		while (true) {
	            System.out.print("Nhập một năm (>= 0): ");
	            namBatKy = scanner.nextInt();
	            if (namBatKy >= 0) {
	                break;
	            } else {
	                System.out.println("Năm không hợp lệ. Vui lòng nhập lại.");
	            }
	        }
	        if ((namBatKy % 4 == 0 && namBatKy % 100 != 0) || (namBatKy % 400 == 0)) {
	            System.out.println(namBatKy + " là năm nhuận.");
	        } else {
	            System.out.println(namBatKy + " không phải là năm nhuận.");
	        }
		}
		
}
