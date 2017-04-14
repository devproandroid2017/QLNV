package NhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	ArrayList<NhanVien> arr = new ArrayList<>();
	
	public void addNv(int n){
		for(int i = 0; i<n;i++){
			NhanVien nv = new NhanVien();
			System.out.println("Nhập thông tin nhân viên : "+(i+1));
			System.out.println("Nhập tên nhân viên : ");
			nv.setmName(AddNV.nhapString());
			System.out.println("Nhập số điện thoại nhân viên :");
			nv.setmSdt(AddNV.nhapSo());
			System.out.println("Nhập địa chỉ nhân viên :");
			nv.setmAdr(AddNV.nhapString());
			System.out.println("Nhập số ngày làm nhân viên :");
			nv.setmNgay(AddNV.nhapSo());
			System.out.println("Nhập luong tháng này của nhân viên :");
			nv.setmSal(AddNV.nhapFloat());
			arr.add(nv);
		}
	}
	
	public void show(){
		for(int i =0; i <arr.size();i++){
			arr.get(i).Intro();
		}
	}
	
	public void search(){
		String name ;
		System.out.println("Hãy nhập vào tên nv bạn muốn tìm : ");
		name = AddNV.nhapString();
		int j =0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getmName().indexOf(name)>=0) {
				System.out.println("Nhân viên bạn muốn tìm là : ");
				arr.get(i).Intro();
				j=1;
			}
		}if (j==0) {
			System.out.println("Không tìm thấy nhân viên");
		}
	}
	public static void main(String[] args) {
		Main m = new Main();
		int nhap;
		do {
			System.out.println("-----------Menu-----------");
			System.out.println("1 --- Thêm");
			System.out.println("2 --- Hiển Thị");
			System.out.println("3 --- Tìm Kiếm");
			System.out.println("4 --- Thoát");
			nhap= AddNV.nhapSo();
			switch (nhap) {
			case 1:
				int n = 0;
				while (n<1) {
					System.out.println("Nhập số nhân viên");
					n= AddNV.nhapSo();
				}
				m.addNv(n);
				break;
			case 2:
				m.show();
				break;
			case 3:
				m.search();
				break;
			case 4:
				break;
			default:
				break;
			}
		} while (nhap !=4);
	}
}
