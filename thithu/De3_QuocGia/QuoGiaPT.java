package De3_QuocGia;

import java.util.Scanner;

public class QuoGiaPT extends QuocGia{
	private float ttho;
	private char chluc;
	private float dtich;
	
	public QuoGiaPT() {
		super();
		ttho = 1.0f;
		chluc = 'A';
		dtich = 100.1f;
	}
	public QuoGiaPT(QuoGiaPT qg) {
		super(qg);
		ttho = qg.ttho;
		chluc = qg.chluc;
		dtich = qg.dtich;
	}
	public char getChLuc() {
		return chluc;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Thong tin quoc gia: ");
		super.nhap();
		System.out.print("Nhap tuoi tho: ");
		ttho = sc.nextFloat();
		System.out.print("Nhap chau luc (A: A, W: Au, M: My, U: Uc, P: Phi): ");
		chluc = sc.next().charAt(0);
		System.out.print("Nhap dien tich: ");
		dtich = sc.nextFloat();
	}
	public void in() {
		super.in();
		System.out.println("Tuoi tho: "+ttho);
		if(chluc == 'A')
			System.out.print("Chau luc: chau A");
		else
			if(chluc == 'W')
				System.out.print("Chau luc: chau Au");
			else
				if(chluc == 'M')
					System.out.print("Chau luc: chau My");
				else
					if(chluc == 'U')
						System.out.print("Chau luc: chau Uc");
					else
						if(chluc == 'P')
							System.out.print("Chau luc: chau Phi");
		System.out.print("\nDien tich: "+dtich);
	}
	public String toString() {
		String kq = super.toString()+("Tuoi tho: "+ttho);
		if(chluc =='A')
			kq += ("Chau luc: chau A");
		else
			if(chluc == 'W')
				kq += ("Chau luc: chau Au");
			else
				if(chluc == 'M')
					kq += ("Chau luc: chau My");
				else
					if(chluc == 'U')
						kq += ("Chau luc: chau Uc");
					else
						if(chluc == 'P')
							kq += ("Chau luc: chau Phi");
		kq += ("\nDien tich: "+dtich);
		return kq;
	}
	public float getTTho() {
		return ttho;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so quoc gia: ");
		int n = sc.nextInt();
		QuocGia ds[] = new QuocGia[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Thong tin quoc gia thu "+(i+1)+": ");
			System.out.println("Chon quoc gia(0) hay quoc gia PT(1): ");
			int c = sc.nextInt();
			if(c == 0)
				ds[i] = new QuocGia();
			else
				ds[i] = new QuoGiaPT();
			ds[i].nhap();
		}
		System.out.println("Danh sach ca quoc qua: ");
		for(int i = 0; i < n; i++) {
			System.out.print("Thong tin quoc gia thu "+(i+1)+": \n");
			ds[i].in();
		}
		System.out.println("\nTen cac quoc gia GDP > 500 o chau Phi: ");
		for(int i = 0; i < n; i++) {
			if(ds[i].getGDP() > 500  && ds[i].getChLuc() == 'P') {
				System.out.println("Ten quoc gia: "+ds[i].getTenqg()+"\n");
			}
		}
		float sum = 0.0f, sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;
		int t=0, t1 = 0, t2 = 0, t3 = 0, t4 = 0;
		for(int i = 0; i < n; i++) {
			if(ds[i].getTTho() > 0) {
				if(ds[i].getChLuc() == 'A') {
					sum += ds[i].getGDP();
					t++;
				}
				else
					if(ds[i].getChLuc() == 'W'){
						sum1 += ds[i].getGDP();
						t1++;
					}
					else
						if(ds[i].getChLuc() == 'M'){
							sum2 += ds[i].getGDP();
							t2++;
						}
						else
							if(ds[i].getChLuc() == 'U'){
								sum3 += ds[i].getGDP();
								t3++;
							}
							else
								if(ds[i].getChLuc() == 'P'){
									sum4 += ds[i].getGDP();
									t4++;
								}
			}
		}
		for(int i = 0; i < n; i++) {
			if(ds[i].getTTho() > 0) {
				if(ds[i].getChLuc() == 'A') {
					System.out.println("Tong GDP cua chau A: "+(float)(sum/t));
				}
				else
					if(ds[i].getChLuc() == 'W'){
						System.out.println("Tong GDP cua chau Au: "+(float)(sum1/t1));
					}
					else
						if(ds[i].getChLuc() == 'M'){
							System.out.println("Tong GDP cua chau My: "+(float)(sum2/t2));
						}
						else
							if(ds[i].getChLuc() == 'U'){
								System.out.println("Tong GDP cua chau Uc: "+(float)(sum3/t3));
							}
							else
								if(ds[i].getChLuc() == 'P'){
									System.out.println("Tong GDP cua chau Phi: "+(float)(sum4/t4));
								}
			}
		}
	}
}
