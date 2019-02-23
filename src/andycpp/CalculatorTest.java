package andycpp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class CalculatorTest {
    
    private Calculator calculator; 
    @Before
    public void setup(){
        
        calculator = new Calculator();
        System.out.println("每个测试方法执行之前都会被调用......");
    }
    @After
    public void release(){
        System.out.println("每个测试方法执行之后都会被调用......");
    }
    
    @BeforeClass
    public static void loadClass(){
//      calculator = new Calculator();
        System.out.println("跑此测试类所有方法前调用......");
    }
    @AfterClass
    public static void releaseClass(){
        System.out.println("跑此测试类所有方法之后调用......");
    }
    
    @Test
    public void testAdd() throws Exception {
        System.out.println("testAdd  running ......");
//      Calculator calculator = new Calculator();
        int sum = calculator.add(1, 2);
        Assert.assertEquals(31, sum);
        
    }
    @Test
    public void testMultiply() throws Exception {
        System.out.println("testMultiply  running ......");
//        Calculator calculator = new Calculator();
        int product = calculator.multiply(2, 4);
        Assert.assertEquals(8, product);
    }
}