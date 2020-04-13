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
public class Main4 {
     public static void main(String[] args) {
        QuanLyChuyenXe qLyChuyenXe = new QuanLyChuyenXe();

        ChuyenXe xeNoiThanh1 = new XeNoiThanh("T1", "Nguyen A", "78A-73659", 300000, "Tuy Hòa - Phú Yên", 32);
        ChuyenXe xeNoiThanh2 = new XeNoiThanh("T2", "Nguyen B", "78G-56789", 400000, "Đông Hòa - Phú Yên", 35);
        ChuyenXe xeNoiThanh3 = new XeNoiThanh("T3", "Nguyen C", "78A-55555", 500000, "Tuy Hòa - Phú Yên", 37);

        qLyChuyenXe.themChuyenXe(xeNoiThanh1);
        qLyChuyenXe.themChuyenXe(xeNoiThanh2);
        qLyChuyenXe.themChuyenXe(xeNoiThanh3);

        ChuyenXe xeNgoaiThanh1 = new XeNgoaiThanh("T4", "Huynh A", "78A-65234", 600000, "Tuy Hòa - Phú Yên", 1);
        ChuyenXe xeNgoaiThanh2 = new XeNgoaiThanh("T5", "Huynh B", "78G-67890", 700000, "Đông Hòa - Phú Yên", 1);
        ChuyenXe xeNgoaiThanh3 = new XeNgoaiThanh("T6", "Huynh C", "78A-66666", 800000, "Tuy Hòa - Phú Yên", 1);

        qLyChuyenXe.themChuyenXe(xeNgoaiThanh1);
        qLyChuyenXe.themChuyenXe(xeNgoaiThanh2);
        qLyChuyenXe.themChuyenXe(xeNgoaiThanh3);

        qLyChuyenXe.inThongTin();

        System.out.printf("\nTong doanh thu xe noi thanh: %.00f" , qLyChuyenXe.tongDoanhThuNoiThanh());        
        System.out.printf("\nTong doanh thu xe ngoai thanh: %.00f", qLyChuyenXe.tongDoanhThuNgoaiThanh());  
        System.out.printf("\nTong doanh thu: %.00f\n", qLyChuyenXe.tongDoanhThu());   
    }
}
