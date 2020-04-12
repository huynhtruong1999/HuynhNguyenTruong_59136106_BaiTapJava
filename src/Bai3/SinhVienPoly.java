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
public abstract class SinhVienPoly {
    // thuoc tinh
    public String hoTen;
    public String nganhHoc;
    
    public SinhVienPoly(String hoTen, String nganhHoc){
    this.hoTen = hoTen;
    this.nganhHoc = nganhHoc;
    }
    
    //truu tuong get diem
    public abstract double getDiem();
    

}
