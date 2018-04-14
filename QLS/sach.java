package QLS;

import java.util.Scanner;

public class sach {
	public String tenSach;
	public String tenTacGia;
	public int namXB;

	public sach() {

	}

	public sach(String tenSach, String tenTacGia, int namXB) {
		this.tenSach = tenSach;
		this.tenTacGia = tenTacGia;
		this.namXB = namXB;
	}

	public int getNamXB() {
		return namXB;
	}

	public void setNamXB(int namXB) {
		this.namXB = namXB;
	}

	public void nhapTT() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" ten sach");
		tenSach = sc.nextLine();
		System.out.println("Ten tac gia :");
		tenTacGia = sc.nextLine();
		System.out.println(" nam xuat ban :");
		namXB = Integer.parseInt(sc.nextLine());
	}
	public void hienthi() {
		System.out.printf("\n\t\t%-20s %-20s%-10d",tenSach,tenTacGia,namXB);
	}

}
