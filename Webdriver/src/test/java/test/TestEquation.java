package test;

import manager.Equation;
import org.junit.Assert;
import org.junit.Test;

public class TestEquation {
    @Test
    public void test0(){
        Equation e = new Equation(1,1,1);
        Assert.assertEquals(e.RootNumber(), 0);
    }
    @Test
    public void test1(){
        Equation e = new Equation(1,2,1);
        Assert.assertEquals(e.RootNumber(), 1);
    }
    @Test
    public void test2(){
        Equation e = new Equation(1,5,6);
        Assert.assertEquals(e.RootNumber(), 2);
    }
}
