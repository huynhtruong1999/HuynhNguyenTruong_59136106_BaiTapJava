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
public abstract class ChuyenXe {
    // thuoc tinh
    public String maChuyen;
    public String tenTaiXe;
    public String soXe;
    public double doanhThu;
    
    public ChuyenXe(String maChuyen, String tenTaiXe, String soXe, double doanhThu){
        this.maChuyen = maChuyen;
        this.tenTaiXe = tenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }
    
    public void xuatThongTin(){
        System.out.println("Ma chuyen xe: " + this.maChuyen);
        System.out.println("Ho ten tai xe: " + this.tenTaiXe);
        System.out.println("So xe: " + this.soXe);
        System.out.printf("Doanh thu: %.00f\n", this.doanhThu);
    };
}