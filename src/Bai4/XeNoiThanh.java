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
public class XeNoiThanh extends ChuyenXe{
    // thuoc tinh
    public String soTuyen;
    public double soKm;

    public XeNoiThanh(String maChuyen, String tenTaiXe, String soXe, double doanhThu, String soTuyen, double soKm) {
      super(maChuyen, tenTaiXe, soXe, doanhThu);
      this.soTuyen = soTuyen;
      this.soKm = soKm;
    }

    @Override
    public void xuatThongTin() {
      super.xuatThongTin();
      System.out.println("Tuyen: " + this.soTuyen);
      System.out.println("So km di duoc: " + this.soKm);
    }
}