package QLHD;

import java.util.Scanner;

public class hoDan extends nhanSu {
	private int soThanhVien;
	private String soNha;

	public hoDan() {

	}

	
	public hoDan(String hoTen, int tuoi, int namSinh, String ngheNghiep, int soThanhVien, String soNha) {
		super(hoTen, tuoi, namSinh, ngheNghiep);
		this.soThanhVien=soThanhVien;
		this.soNha=soNha;
		// TODO Auto-generated constructor stub
	}


	nhanSu[] ns = null;
	@Override
   public void nhapTT() {
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println(" so thanh vien: ");
	   soThanhVien = Integer.parseInt(sc.nextLine());
	   	ns = new nhanSu[soThanhVien];
	   System.out.println(" So nha");
	   soNha = sc.nextLine();
	   for(int i=0;i<ns.length;i++) {
		   ns[i] = new nhanSu();
		   super.nhapTT();
	   }
   }
	@Override
	public void hienthi() {
		System.out.println("so thanh vien"+soThanhVien);
		System.out.println(" so nha "+ soNha);
		for(int i=0;i<ns.length;i++) {
			super.hienthi();
		}
	}
}
