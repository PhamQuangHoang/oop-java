package QLTD;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int luachon,n;
		bienLai[] danhsachKH = null ;
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1. Nhap thong tin khach hang");
		System.out.println(" 2. Hien thi thong tin khach hang ");
	    System.out.println( " 3. thoat chuong tring");
		do {
			
			System.out.println("Moi ban Nhap lua chon");
			luachon=Integer.parseInt(sc.nextLine());
			if(luachon<1||luachon>2) {
				System.out.println(" khong hop le");
			}
			switch (luachon) {
			case 1:{
				System.out.println(" nhap vao so luong ho dan :");
				n = Integer.parseInt(sc.nextLine());
                danhsachKH = new bienLai[n];          
                for(int i=0;i<danhsachKH.length;i++) {
                	danhsachKH[i]=new bienLai();
                	danhsachKH[i].nhapTT();
                }
				break;
			}
			case 2:{
				for(int i=0;i<danhsachKH.length;i++) {
					danhsachKH[i].Hienthi();
				}
				
				break;
			}
			case 3: {
				
				break;
			}
			}
			
			
		}while(luachon!=3);

	}

}
