package exception;
import java.util.Scanner;
public class NhapMang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số lượng phần tử cho mảng: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		int[] mang = new int[n];
		try {
			for(int i = 0; i<n; i++) {
				System.out.println("Nhập phần từ thứ "+(i+1));
				mang[i] = scanner.nextInt();
				scanner.nextLine();
				if(mang[i] == 100) {
					throw new ArrayIndexOutOfBoundsException("Đã nhập phần tử có giá trị là 100");
				}
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("Các phần tử trong mảng là: ");
			for(int value : mang) {
				System.out.println(value + " ");
			}
		}
	}

}
