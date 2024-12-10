package exception;

import java.util.Scanner;
public class SoThuc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double so1, so2, kq;
		try {
			System.out.println("Nhập số thứ 1: ");
			so1 = Double.parseDouble(scanner.nextLine());
			System.out.println("Nhập số thứ 2: ");
			so2 = Double.parseDouble(scanner.nextLine());
			if(so2 == 0) {
				throw new ArithmeticException("Số chia không thể là số 0");
			}
			kq = so1/so2;
			System.out.println("Kết quả = "+kq);
		}
		catch(NumberFormatException e) {
			System.out.println("Lỗi: giá trị nhập vào không phải số");
		}
		catch(ArithmeticException e) {
			System.out.println("Lỗi : "+e.getMessage());
		}
	}

}
