package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class QuanLyDanhSach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] colors = {"red","blue","green","yellow"};
		String[] colors2 = {"pink","black","orange"};
		
		List<String> list = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		Collections.addAll(list, colors);
		Collections.addAll(list2, colors2);
		
		list.addAll(list2);
		
		list2.clear();
		System.out.println("list sau khi them cac phan tu cua list2 la: " + list);
		
		for(int i = 0;i<list.size();i++) {
			list.set(i, list.get(i).toUpperCase());
		}
		System.out.println("list sau khi chuyen cac phan tu thanh in hoa la: " + list);
		list.remove(3);
		list.remove(3);
		list.remove(3);
		System.out.println("list sau khi xoa phan tu 4-6 la: " + list);
		
		Collections.reverse(list);
		System.out.println("list sau khi dao nguoc la: " + list);
	}

}
