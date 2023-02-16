/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.khoabd.mathutil.core.test;

import com.khoabd.mathuil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    
    // kiem thu ngoai le thi sao
    // tuc la ham getF dc thiet ke rang neu dua n ca chon thi ham phai nem ra ngoai le
    // getF(-5) thi expected == ngoai le illegal argument exception
    // thay ngoai le mung roi nuoc mat.
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        //  Test case #5: getF with a wrong arg: n = -5.
        //Expected result:an exception is thrown: Illegal Argument.
        MathUtility.getFactorial(-5);
        //neu chi go lenh tren thi bi mau do do lenh nay gay ra exception vs exception la mau do,
        // nhung ham nay minh ky vong ra exception, neu co exp thi ham dung nhu thiet ke,
        // thi phai
        //JUnit 4
    }


    @Test
    //trông hàm này chứa các test case để test getF();
    //với n hợp lệ trong khoảng 0...20
    public void testFactorialGivenRightArgumentReturnWell() {
        //test case 1 test getF() with n = 0
        //Expected Value = 1; //hy vong = 1
        int n = 0;
        long expectedValue = 1;
        int actualValue = MathUtility.getFactorial(n);
        Assert.assertEquals(expectedValue, actualValue);

        //test cas2 5! = 120  xem may co tinh dung nhu vay khong
        actualValue = MathUtility.getFactorial(5);
        Assert.assertEquals(120, actualValue);

        //test case 3
        actualValue = MathUtility.getFactorial(5);
        Assert.assertEquals(120, actualValue);

    }
}
