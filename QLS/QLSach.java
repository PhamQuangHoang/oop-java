package QLS;

import java.util.ArrayList;
import java.util.Scanner;

public class QLSach {
  public static void main(String[] args) {
	ArrayList<sach> ds = new ArrayList<>();
	int n,luachon;
	int[] array = null;
	Scanner sc = new Scanner(System.in);
	System.out.println( " 1 .Nhap  ");
	System.out.println(" 2.Hien thi toan bo sach");
	System.out.println(" 3.Liet ke cac sach XB truoc nam n");
	System.out.println(" 4. thoat chuong trinh");
	do {
		System.out.println();
		System.out.println(" moi ban nhap vao lua chon ");
		luachon= Integer.parseInt(sc.nextLine());
		switch(luachon) {
		case 1: {
			System.out.println(" nhap vao so luong sach ");
			n = Integer.parseInt(sc.nextLine());
			array =new int[n];
			for(int i=0;i<array.length;i++) {
				sach s = new sach();
				s.nhapTT();
				ds.add(s);
			}
			break;
			
		}
		case 2: {
			System.out.printf("\t\t%-20s%-20s%-10s","Ten Sach ","Ten Tac Gia","Nam Xuat Ban");
			for(int i=0;i<array.length;i++) {
				ds.get(i).hienthi();
				
			}
			
			break;
			
		}
		case 3: {
			int nam;
			int dem=0;
			System.out.println(" nhap vao nam thu n :");
			nam =Integer.parseInt(sc.nextLine());
			for(int i =0;i<array.length;i++) {
				if(nam>ds.get(i).namXB) {
					dem++;
					ds.get(i).hienthi();
				}
			}
			if(dem==0) {
				System.out.println("khong co sach nao xuat ban truoc nam "+ nam);
			}
			break;
		}
		case 4:{ 
			break;
		}
		}
		
		
	}while(luachon!=4);
}
}
