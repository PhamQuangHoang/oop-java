package QLTD;

import java.util.Scanner;

public class KhachHang {
public String hoTen;
public int soNha;
public int soCongTo;
public KhachHang() {
	
}
public KhachHang(String hoTen, int soNha, int soCongTo) {
	super();
	this.hoTen = hoTen;
	this.soNha = soNha;
	this.soCongTo = soCongTo;
} 

public void nhapTT() {
  Scanner sc = new Scanner(System.in);
  System.out.println(" Ho ten : ");
  hoTen=sc.nextLine();
  System.out.println(" so nha :");
  soNha=Integer.parseInt(sc.nextLine());
  System.out.println(" So cong to :");
  soCongTo = Integer.parseInt(sc.nextLine());
}

public void Hienthi() {
	System.out.println(" Ho ten :" +hoTen);
	System.out.println(" So Nha :" +soNha);
	System.out.println(" So cong to :" +soCongTo);
	
}


}
