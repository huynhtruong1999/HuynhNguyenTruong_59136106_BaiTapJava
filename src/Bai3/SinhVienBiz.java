/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author ASUS
 */
public class SinhVienBiz extends SinhVienPoly {
    // thuoc tinh
    public double diemMarketing;
    public double diemSales;
    
    public SinhVienBiz(String hoTen, String nganhHoc, double diemMarketing, double diemSales){
    super(hoTen, nganhHoc);
    this.diemMarketing = diemMarketing;
    this.diemSales = diemSales;
    }

}
