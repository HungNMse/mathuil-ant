/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.khoabd.mathutil.core.test;

import com.khoabd.mathuil.core.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author JinerGenkai
 */
@RunWith(value = Parameterized.class)
public class MathUtilityAdvancedTest {
    
    // DATA driven testing
    // tach co ki thuat nhoi/fill data tro lai lenh so sanh, fill tro lai thong qua bien so.
    // DDT co anh em nuong tua voi Parameterized - tham so hoa data.
    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Object[][] {
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 720},
            {7, 5040},
            {8, 40320},
            {9, 362880}
        };
        
    }

    @Parameterized.Parameter(value = 0) // lay cot 0 cua mang gan vao bien n
    public int n;
    @Parameterized.Parameter(value = 1) // lay cot 0 cua mang gan vao bien n
    public long expected;
    
    @Test
    public void testFactorialGivenRightArgumentReturnWell() {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
