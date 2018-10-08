package week5;

public class QuaTao extends HoaQua{
	protected int sokhohang;
	public QuaTao(int sokhohang, String ngaynhap) {
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
