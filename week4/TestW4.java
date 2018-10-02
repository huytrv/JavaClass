/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CCNE
 */
public class TestW4 {
    
    public BMITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testMax1() {
        int result1 = W4.Max(12, 8);
        assertEquals(result1, 12);            
    }
    @Test
    public void testMax2() {
        int result2 = W4.Max(0, -1);
        assertEquals(result2, 0);
    }
    @Test
    public void testMax3() {
        int result3 = W4.Max(0, 0);
        assertEquals(result3, 0);
    }
    @Test
    public void testMax4(){
        int result4 = W4.Max(1, -1);
        assertEquals(result4, 1);
    }
    @Test
    public void testMax5(){
        int result5 = W4.Max(43534534, 234234823);
        assertEquals(result5, 234234823);
    }
    @Test
    public void testMinArr1() {
        int[] a1 = new int[] {5, 6, 2, 8, 1};
        int result1 = W4.MinArr(a1);
        assertEquals(result1, 1);     
    }
    @Test
    public void testMinArr2(){
        int[] a2 = new int[] {-4, -12, 23, 8, 1, 6, 9, 23, 45};
        int result2 = W4.MinArr(a2);
        assertEquals(result2, -12);
    }
    @Test
    public void testMinArr3(){
        int[] a3 = new int[] {5, 6, 2, -8, 1, 23, 123, -123, 3};
        int result3 = W4.MinArr(a3);
        assertEquals(result3, -123);
    }
    @Test
    public void testMinArr4(){
        int[] a4 = new int[] {-15, 6, 0, -20, 8, 1};
        int result4 = W4.MinArr(a4);
        assertEquals(result4, -20);
    }
    @Test
    public void testMinArr5(){
        int[] a5 = new int[] {80, -123, -234, -453, -23, -289, 234, -3, -45, 34};
        int result5 = W4.MinArr(a5);
        assertEquals(result5, -453);
    }
    @Test 
    public void testBMI1(){
        String result1 = BMI.evaluateBmi(50, 1.87);
        assertEquals(result1, "Thiếu cân");
    }
    @Test 
    public void testBMI2(){
        String result2 = BMI.evaluateBmi(80, 1.67);
        assertEquals(result2, "Béo phì");
    }
    @Test 
    public void testBMI3(){
        String result3 = BMI.evaluateBmi(63, 1.67);
        assertEquals(result3, "Bình thường");
    }
    @Test 
    public void testBMI4(){
        String result4 = BMI.evaluateBmi(50, 1.67);
        assertEquals(result4, "Thiếu cân");
    }
    @Test 
    public void testBMI5(){
        String result5 = BMI.evaluateBmi(75, 1.77);
        assertEquals(result5, "Thừa cân");
    }
}
