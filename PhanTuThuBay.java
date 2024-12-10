package exception;
public class PhanTuThuBay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mang = {1,2,3,4,5};
		try {
			System.out.println(mang[6]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Trong mảng không có phần tử này");
			System.out.println("Chi tiết lỗi: " + e.getMessage());
		}
	}

}
