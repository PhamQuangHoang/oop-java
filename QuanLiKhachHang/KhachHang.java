package QuanLiKhachHang;

import java.util.Scanner;

public class KhachHang {
	private String MaKH;
	private String HoTen;
	private int NamSinh;
	private int tongluong;

	public KhachHang() {
		// TODO Auto-generated constructor stub
	}

	public KhachHang(String maKH) {
		super();
		MaKH = maKH;
	}

	public KhachHang(String maKH, String hoTen, int namSinh, int tongluong) {
		super();
		//MaKH = maKH;
		this.setMaKH(maKH);
		HoTen = hoTen;
		NamSinh = namSinh;
		this.tongluong = tongluong;
	}

	public String getMaKH() {
		return MaKH;
	}

	public void setMaKH(String maKH) {
		MaKH = maKH;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public int getNamSinh() {
		return NamSinh;
	}

	public void setNamSinh(int namSinh) {
		NamSinh = namSinh;
	}

	public int getTongluong() {
		return tongluong;
	}

	public void setTongluong(int tongluong) {
		this.tongluong = tongluong;
	}

	public void NhapTT() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Ma Khach Hang :");
		MaKH = sc.nextLine();
		System.out.println(" Ten khach hang");
		HoTen = sc.nextLine();
		System.out.println(" Nam sinh ");
		NamSinh = Integer.parseInt(sc.nextLine());
		System.out.println(" Tong luonh ");
		tongluong = Integer.parseInt(sc.nextLine());
	}
	public void hienthi() {
		System.out.println("Ma khach hang : "+MaKH);
		System.out.println("Ten khach hang :"+HoTen);
		System.out.println(" Nam sinh :"+NamSinh);
		System.out.println("Tong luong :"+tongluong);
		
		
	}
}
