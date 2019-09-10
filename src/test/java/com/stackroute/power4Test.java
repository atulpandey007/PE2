package com.stackroute;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class power4Test extends AppTest {

    @Test
    public void test_01()
    {
        int expected = 1;
        int actual = power4.pow4(64);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test_02()
    {
        int expected = 1;
        int actual = power4.pow4(16);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test_03()
    {
        int expected = 1;
        int actual = power4.pow4(25);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test_04()
    {
        int expected = 1;
        int actual = power4.pow4(256);
        Assert.assertEquals(expected,actual);
    }

}