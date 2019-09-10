package com.stackroute;
import org.junit.*;
import static org.junit.Assert.*;
public class factorialTest {
    public static factorial factorial;
    @BeforeClass
    public static void setUp() throws Exception {
        factorial = new factorial();
    }
    @AfterClass
    public static void tearDown() throws Exception {
    }
    @Test
    public void UTC_01_validInput()
    {
        String expected = "120";
        String actual = factorial.fact(5);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void UTC_02_validInput()
    {
        String expected = "the value is out  of range.";
        String actual = factorial.fact(21);
        Assert.assertEquals(expected, actual);
    }
}

