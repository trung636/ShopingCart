package IModel;

import Model.SanPham;

public interface IGioHang {
	SanPham tim(int ma);
	void them(SanPham sp, int sl);
	String xoa(SanPham sp, int sl);
	double tongTien();
	int tongsoSanPham();
	int tongsoMatHang();
	
	

}
