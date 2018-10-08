package week5;

public class QuaCam extends HoaQua{
	protected int sokhohang;
	public QuaCam(int sokhohang, String ngaynhap) {
		super(ngaynhap);
		setSokhohang(sokhohang);	
	}
	public int getSokhohang() {
		return sokhohang;
	}
	public void setSokhohang(int sokhohang) {
		this.sokhohang = sokhohang;
	}
}
