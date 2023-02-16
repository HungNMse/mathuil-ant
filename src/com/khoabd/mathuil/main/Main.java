/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khoabd.mathuil.main;

import com.khoabd.mathuil.core.MathUtility;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
//        testFactorialGivenRightArgumentRunsWell();
//            testFactorialGivenWrongArgumentThrowsException();
    }
    
//    thiet ke ham getF() la chi tinhs n! tu 0..20
//    neu dua n < 0 or n > 20 thi ham se khong tinh va nem ra ngoai le
//    thuc te ham getF khi chay co lam dc nhu thiet ke khong
    public static void testFactorialGivenWrongArgumentThrowsException() {
//        test case 4 : test getF() with n = -5, wrong arguument
//          excepted value : an exceptions is thrown
         System.out.println("Test -5! : expected = Illegel Argument Excepttionn is thrown | actual: " 
                 + MathUtility.getFactorial(-5) );
    }
        
//        co nhieu quy tac dat ten ham cho viec kiem thu
//        thuong ten ham se co y nghia cuar vc kiem thu
       

    public static void testFactorialGivenRightArgumentRunsWell() {
        //Test Case #1 Test getFactorial with n = 0
        //Expected value : 1 - hy vọng đưa n = 0 vào thì hàm trả về 1
        int n = 0;
        long expectedValue = 1;
        long actualValue = (long) MathUtility.getFactorial(n);
        
//        test case 1
        System.out.println("Test " + n +"!: expected = " + expectedValue 
                + " | actual: " + actualValue );
    
        //test case 2
        n = 2;
        expectedValue = 1;
        actualValue = (long) MathUtility.getFactorial(n); 
        System.out.println("Test " + n +"!: expected = "+ expectedValue 
                + " | actual: " + actualValue );
        
//        test case 3: Test getFactorial(3)
        expectedValue = 6;
        n = 3;
        actualValue = (long) MathUtility.getFactorial(n);
        System.out.println("Test " + n +"!: expected = "+ expectedValue 
                + " | actual: " + actualValue );
        
        

    }
}
