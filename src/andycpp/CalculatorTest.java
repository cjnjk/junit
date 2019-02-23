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
        System.out.println("2");
    }
    @After
    public void release(){
        System.out.println("3");
    }
    
    @BeforeClass
    public static void loadClass(){
//      calculator = new Calculator();
        System.out.println("1");
    }
    @AfterClass
    public static void releaseClass(){
        System.out.println("4");
    }
    
    @Test
    public void testAdd() throws Exception {
        System.out.println("testAdd  running ......");
//      Calculator calculator = new Calculator();
        int sum = calculator.add(1, 2);
        Assert.assertEquals(3, sum);
        
    }
    @Test
    public void testMultiply() throws Exception {
        System.out.println("testMultiply  running ......");
//        Calculator calculator = new Calculator();
        int product = calculator.multiply(2, 4);
        Assert.assertEquals(8, product);
    }
}