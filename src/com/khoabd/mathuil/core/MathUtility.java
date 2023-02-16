/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khoabd.mathuil.core;

/**
 *
 * @author Admin
 */
public class MathUtility {

    public static final double PI = 3.1415;

//    ham tinh n giai thua N! = 1 * 2 * 3 *... * N;
//    Khong co gia thua amm
//    0! = 1 
//     vi gia thua tang gia tri rat nhanh, 20! vua du 18 so 0
//     quy uoc : ham nay8 chi tinh tu 0 ... 20!
//        co 2 cach viet ham này: for truyền thống và đệ quy - recursion
//    
    public static int getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0 .. 20");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        //sống sót đến giai đoạn này , n từ 2...20 rồi !!!, for mà chơi
        int product = 1; // biến khởi động cho mục đích nhân dồn
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
