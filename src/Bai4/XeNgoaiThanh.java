/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

/**
 *
 * @author ASUS
 */
public class XeNgoaiThanh extends ChuyenXe{
    // thuoc tinh
    public String noiDen;
    public int soNgay;
  
    public XeNgoaiThanh(String maChuyen, String tenTaiXe, String soXe, double doanhThu, String noiDen, int soNgay) {
    super(maChuyen, tenTaiXe, soXe, doanhThu);
    this.noiDen = noiDen;
    this.soNgay = soNgay;
    }
    
    @Override
    public void xuatThongTin() {
      super.xuatThongTin();
      System.out.println("Noi den: " + this.noiDen);
      System.out.println("So ngay: " + this.soNgay);
    }  
}
