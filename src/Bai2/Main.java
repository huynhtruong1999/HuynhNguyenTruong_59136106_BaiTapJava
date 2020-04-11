/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import Bai1.NhanVien;
/**
 *
 * @author Huynh Nguyen Truong
 */
public class Main {
        public static void main(String[] args) {
        
        //Tao quan ly nhan vien
        QuanLyNhanVien qlNhanVien = new QuanLyNhanVien();
        
        //Khoi tao 5 nhan vien
        NhanVien nv1 = new NhanVien("Nguyen A", 24, "Phu Yen", 5000000, 100);
        NhanVien nv2 = new NhanVien("Nguyen B", 27, "Nha Trang", 7000000, 200);
        NhanVien nv3 = new NhanVien("Nguyen C", 35, "Ha Noi", 9000000, 220);
        NhanVien nv4 = new NhanVien("Nguyen D", 61, "Ho Chi Minh", 6000000, 210);
        NhanVien nv5 = new NhanVien("Nguyen E", 55, "Da Nang", 10000000, 90);
        
        // Them nhan vien vao quan ly nhan vien
        qlNhanVien.them(nv1);
        qlNhanVien.them(nv2);
        qlNhanVien.them(nv3);
        qlNhanVien.them(nv4);
        qlNhanVien.them(nv5);
        
        // In danh sach
        qlNhanVien.inDS();
    }
}
