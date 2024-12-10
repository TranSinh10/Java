package exception;

public class EpKieuString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Xin chao";
		try {
			int a =Integer.parseInt(str);
			System.out.println(a);
		}
		catch(NumberFormatException e) {
			System.out.println("Không thể chuyển chuỗi sang kiểu số học");
			System.out.println("Chi tiết lỗi: " + e.getMessage());
		}	
	}

}
