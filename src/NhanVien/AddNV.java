package NhanVien;

import java.util.Scanner;

public class AddNV {
	static Scanner sc = new Scanner(System.in);
	public static int nhapSo(){
		int i = 0;
		do {
			try {
				i = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Mời bạn nhập vào 1 Số");
				i = 0;
				sc.nextLine();
			}
		} while (true);
		return i;
	}
	public static float nhapFloat(){
		float i = 0;
		do {
			try {
				i = sc.nextFloat();
				break;
			} catch (Exception e) {
				System.out.println("Mời bạn nhập vào 1 Số");
				i = 0;
				sc.nextLine();
			}
		} while (true);
		return i;
	}
	public static String nhapString() {
		String i;
		i = sc.nextLine();
		return sc.nextLine();
	}
}
