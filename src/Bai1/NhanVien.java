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
    //Khai bao
    public String ten;
    public int tuoi;
    public String diachi;
    public double tienluong;
    public int tongsogiolam;
    
    //Gan thong tin
    public NhanVien(String ten,int tuoi,String diachi,double tienluong,int tongsogiolam){
    this.ten=ten;
    this.tuoi=tuoi;
    this.diachi=diachi;
    this.tienluong=tienluong;
    this.tongsogiolam=tongsogiolam;
    this.getThongTin();
    }
    
    // getter, setter
  public void setTen(String ten) {
    this.ten = ten;
  }
  public String getTen() {
    return this.ten;
  }
  public void setTuoi(int tuoi) {
    this.tuoi = tuoi;
  }
  public int getTuoi() {
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
  public int getTongSoGioLam() {
    return this.tongsogiolam;
  }
  
  //Cac phuong thuc
    //get thong tin nhan vien
    public void getThongTin(){
        System.out.println("Ten : "+ ten);
        System.out.println("Tuoi : "+ tuoi);
        System.out.println("Dia chi : "+ diachi);
        System.out.println("Tien luong : "+ tienluong);
        System.out.println("Tong so gio lam : "+ tongsogiolam);
        System.out.println("Thuong : "+ tinhThuong());
        System.out.println("Tong luong : "+ (tienluong + tinhThuong()));
    }
    
    //Tinh luong nhan vien
    public double tinhThuong(){
    double tienthuong;
    if(tongsogiolam >= 200){
        return tienthuong = tienluong * 0.2;
    }else if (tongsogiolam >= 100){
        return tienthuong = tienluong * 0.1;
    }else tienthuong = 0;
    return tienthuong;
    }
}    
