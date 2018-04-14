package QLHD;

import java.util.Scanner;

public class nhanSu {
	public String hoTen;
	public int tuoi;
	public int namSinh;
	public String ngheNghiep;

	public nhanSu() {

	}

	public nhanSu(String hoTen, int tuoi, int namSinh, String ngheNghiep) {
		super();
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.namSinh = namSinh;
		this.ngheNghiep = ngheNghiep;
	}

	public void nhapTT() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhap ten: ");
		hoTen = sc.nextLine();
		System.out.println(" nhap tuoi:");
		tuoi = Integer.parseInt(sc.nextLine());
		System.out.println(" nhap nam sinh :");
		namSinh = Integer.parseInt(sc.nextLine());
		System.out.println(" nhap nghe nghiep :");
		ngheNghiep = sc.nextLine();

	}
	public void hienthi() {
		System.out.println(" Ho ten :"+hoTen);
        System.out.println(" tuoi :"+tuoi);
        System.out.println("Nam sinh :"+namSinh);
        System.out.println("Nghe nghiep :"+ngheNghiep);
	}

}
