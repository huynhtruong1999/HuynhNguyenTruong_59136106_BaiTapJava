/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import Bai1.NhanVien;
import java.util.ArrayList;
/**
 *
 * @author Huynh Nguyen Truong
 */
public class QuanLyNhanVien implements IQuanLy{
    // danh sach nhan vien
    ArrayList<NhanVien> DanhSachNhanVien = new ArrayList<>();
    
    //Them nhan vien
    @Override
    public void them(NhanVien nv) {
        DanhSachNhanVien.add(nv);
    }
    
    //Xuat thong tin nhan vien
    @Override
    public void inDS() {
        DanhSachNhanVien.forEach(nv -> System.out.println(nv.getThongTin()));
    };  
}
