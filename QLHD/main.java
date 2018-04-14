package QLHD;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hoDan[] ds = null;
		int n;
		int luachon;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. Nhap thong tin :");
			System.out.println("2. hien thi thong tin");
			System.out.println("3. thoat chuong trinh");
			System.out.println(" moi ban nhap lua chon");
			luachon = Integer.parseInt(sc.nextLine());

			switch (luachon) {
			case 1: {
				System.out.println(" nhap vao so ho dan :");
				n =Integer.parseInt(sc.nextLine());
				ds = new hoDan[n];
				for(int i =0 ; i<ds.length;i++) {
					ds[i] = new hoDan();
 					ds[i].nhapTT();
				}
				
				break;
			}
			case 2: {
				for(int i = 0;i<ds.length;i++) {
					ds[i].hienthi();
				}
				break;

			}

			case 3: {
				break;
			}
			  }
		} while (luachon != 3);
	}

}
