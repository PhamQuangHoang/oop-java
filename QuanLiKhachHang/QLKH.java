package QuanLiKhachHang;

import java.util.ArrayList;
import java.util.Scanner;

public class QLKH {
	public static void main(String[] args) {
		int n;
		int[] array;
		Scanner sc = new Scanner(System.in);
		ArrayList<KhachHang> danhsach = new ArrayList();
		System.out.println(" choose one :");
		System.out.println("1. nhap vao n khach hang ");
		System.out.println("2. Hien thi thong tin khach hang ");
		System.out.println("3.Hien thi khach hang co tong luong lon hon x");
		System.out.println("4.Thoat khoi chuong trinh ");
		do {
			System.out.println(" moi ban nhap vao lua chon:");

			try {
				n = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				n = 0;
				System.out.println(" nam ngoai lua chon .");
			}
			switch (n) {
			case 1: {
				array = new int[n];
				for (int i = 0; i < array.length; i++) {
                      KhachHang kh = new KhachHang();
                      kh.NhapTT();
                      danhsach.add(kh);
				}
				break;
			}
			case 2: {
				System.out.println(" hien thi thong tin khach hang :");
				for(int i=0;i<danhsach.size();i++) {
				  danhsach.get(i).hienthi();
				}
				break;
			}
			case 3: {
				int x ;
				System.out.println(" nhap tong luong");
				x = Integer.parseInt(sc.nextLine());
				for(int i =0; i<danhsach.size();i++) {
					if(x>=danhsach.get(i).getTongluong()) {
						danhsach.get(i).hienthi();
					}
				}
				break;
			}
			case 4: {
				break;
			}

			}
		} while (n != 4);
	}
}
