package Buoi4;


public class SDDiemMau {
	public static void main(String[] args) {
		DiemMau a = new DiemMau(5, 10, "Trang");
		a.hienThi();
		DiemMau b = new DiemMau();
		b.nhap();
		b.hienThi();
		b.doiDiem(10, 8);
		b.hienThi();
		b.ganMau("Vang");
		b.hienThi();
	}
}
