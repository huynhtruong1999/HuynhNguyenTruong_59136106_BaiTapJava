/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author Huynh Nguyen Truong
 */
public class Main3 {
    public static void main(String[] args) {
        // tao ten sinh vien it
        SinhVienIT it = new SinhVienIT("Nguyen A", "CNTT", 8, 10, 10);
        // tao ten sinh vien biz
        SinhVienBiz biz = new SinhVienBiz("Nguyen B", "Biz", 6, 7);
        // create sinh vien poly tu sinh vien IT
        SinhVienPoly poly = new SinhVienIT("Nguyen C", "CNTT",  5, 7, 9);

}
