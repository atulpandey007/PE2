package com.stackroute;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class reverseTest extends AppTest {
    private static  reverse reverse;
    @Before
    public void setUp() throws Exception {
        reverse = new reverse();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test_01()
    {
        int expected = 54321;
        int actual = reverse.reverse1(12345);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test_02()
    {
        int expected = 12321;
        int actual = reverse.reverse1(12321);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void test_03()
    {
        int expected = 123456;
        int actual = reverse.reverse1(654322);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void test_04()
    {
        int expected = 123456;
        int actual = reverse.reverse1(654321);
        Assert.assertEquals(expected,actual);

    }
}