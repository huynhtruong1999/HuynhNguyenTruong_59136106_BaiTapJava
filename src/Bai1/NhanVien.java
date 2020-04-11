/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author HuynhNguyenTruong
 */
public class NhanVien {
    public class NhanVien {
    public String ten;
    public int tuoi;
    public String diachi;
    public double tienluong;
    public int tongsogiolam;
    
    public NhanVien(String ten,int tuoi,String diachi,double tienluong,int tongsogiolam){
    this.ten=ten;
    this.tuoi=tuoi;
    this.diachi=diachi;
    this.tienluong=tienluong;
    this.tongsogiolam=tongsogiolam;
    this.getThongTin();
    }
    
  public void setTen(String ten) {
    this.ten = ten;
  }
  public String getTen() {
    return this.ten;
  }
  public void setTuoi(int tuoi) {
    this.tuoi = tuoi;
  }
  public int gettuoi() {
    return this.tuoi;
  }
  public void setDiaChi(String diachi) {
    this.diachi = diachi;
  }
  public String getDiaChi() {
    return this.diachi;
  }
  public void setTienLuong(double tienluong) {
    this.tienluong = tienluong;
  }
  public double getTienLuong() {
    return this.tienluong;
  }
  public void setTongSoGioLam(int tongsogiolam) {
    this.tongsogiolam = tongsogiolam;
  }
  public int getTongSGioLam() {
    return this.tongsogiolam;
  }
}
