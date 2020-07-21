/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import fu.util.MathUtil;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ACER
 */
public class MathUtilTest {
    //@Test biến mỗi hàm thành hàm main riêng biệt
    @Test
    public void testSuccessfulCases(){
        Assert.assertEquals(5, 5);
        Assert.assertEquals(1, MathUtil.computeFactorial(0));
        Assert.assertEquals(1, MathUtil.computeFactorial(1));
        Assert.assertEquals(2, MathUtil.computeFactorial(2));
        Assert.assertEquals(6, MathUtil.computeFactorial(3));
        Assert.assertEquals(24, MathUtil.computeFactorial(4));
        Assert.assertEquals(120, MathUtil.computeFactorial(5));
    }
    
    @Test(expected = NumberFormatException.class)
    public void testFailedCases(){
        MathUtil.computeFactorial(-5);
    }
    
}
