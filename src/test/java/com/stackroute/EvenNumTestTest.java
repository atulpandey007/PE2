package com.stackroute;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest extends AppTest {

    @Test
    public void test_01()
    {
        boolean expected = true;
        boolean actual = EvenNumTest.isEven(64);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test_02()
    {
        boolean expected = true;
        boolean actual = EvenNumTest.isEven(31);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test_03()
    {
        boolean expected = true;
        boolean actual = EvenNumTest.isEven(16);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test_04()
    {
        boolean expected = true;
        boolean actual = EvenNumTest.isEven(128);
        Assert.assertEquals(expected,actual);
    }


}