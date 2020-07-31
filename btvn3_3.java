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
public class btvn3_3 {
    public static void main(String[] args) {
        int[] A = {9, 6, 6, 2, 8, 0};
        int ham = giaTriTruyenVao(A);
        System.out.println(ham);
    }
    public static void giaTriTruyenVao(int[] A) {
        for (int i=0; i<A.length; i++) {
            if (A[i] <= A[i+1]){ 
                System.out.println("1");
        } else if (A[i]>= A[i+1]) {
                System.out.println("-1");
        } else { 
                System.out.println("0");
        }
        }
    }
}

