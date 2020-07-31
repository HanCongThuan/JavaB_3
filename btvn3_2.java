/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn;

import java.util.Scanner;

/**
 *
 * @author HCT
 */
public class btvn3_2 {
    public static void main(String[] args) {
        int soNhap1;
         Scanner sc1 = new Scanner(System.in);
         System.out.println("Moi ban nhap so thu nhat: ");
         soNhap1 = sc1.nextInt();
        int soNhap2;
         Scanner sc2 = new Scanner(System.in);
         System.out.println("Moi ban nhap so thu hai: ");
         soNhap2 = sc2.nextInt();
        int tich = soNhap1 * soNhap2;
        boolean bool = giaTriTruyenVao(tich);  
        System.out.println(bool);
        
    }
    public static boolean giaTriTruyenVao(int tich) {
        if (tich % 15 == 0){
            return true;
        } else {
            return false;
        }
    }
}
