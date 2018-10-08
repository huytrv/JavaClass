package week5;

public class CamCaoPhong extends QuaCam{
	protected String nguongoc, mausac;
	protected double giaban, soluong;
	public CamCaoPhong(String nguongoc, String mausac, double giaban, double soluong, int sokhohang, String ngaynhap) {
		super(sokhohang, ngaynhap);
		setNguongoc(nguongoc);
		setMausac(mausac);
		setGiaban(giaban);
		setSoluong(soluong);
	}
	public String getMausac() {
		return mausac;
	}
	public void setMausac(String mausac) {
		this.mausac = mausac;
	}
	public String getNguongoc() {
		return nguongoc;
	}
	public void setNguongoc(String nguongoc) {
		this.nguongoc = nguongoc;
	}
	public double getGiaban() {
		return giaban;
	}
	public void setGiaban(double giaban) {
		this.giaban = giaban;
	}
	public double getSoluong() {
		return soluong;
	}
	public void setSoluong(double soluong) {
		this.soluong = soluong;
	}
	public double doanhthu() {
		return giaban * soluong;
	}
	public static void main(String[] args) {
		CamCaoPhong camcaophong = new CamCaoPhong("Ha Noi", "Vang", 5500, 80, 2, "11/08/2018");
		System.out.print(camcaophong.doanhthu());
	}
}
