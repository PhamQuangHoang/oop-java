package QLTD;

import java.util.Scanner;

public class bienLai extends KhachHang {
	private int soMoi;
	private int soCu;
	private int soTienTra;

	public bienLai() {

	}

	public bienLai(String hoTen, int soNha, int soCongTo,int soMoi, int soCu, int soTienTra) {
		super(hoTen,soNha,soCongTo);
		this.soMoi = soMoi;
		this.soCu = soCu;
		this.soTienTra = soTienTra;
	}
	@Override
	public void nhapTT() {
		super.nhapTT();
        System.out.println(" chi so moi: ");		
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhap chi so moi");
		soMoi=Integer.parseInt(sc.nextLine());
		System.out.println(" chi so cu :");
		soCu = Integer.parseInt(sc.nextLine());
		
	}
	@Override
	public void Hienthi() {
		super.Hienthi();
		System.out.println(" chi so moi "+soMoi);
		System.out.println(" chi so cu "+ soCu);
		System.out.println(" so tien phai tra :"+Tinhtien());
	}
	public int Tinhtien() {
		soTienTra = (soMoi-soCu)*850000	;
		return soTienTra;
	}
	
	
	
	
	

}
