package com.stackroute;
import org.junit.*;
import static org.junit.Assert.*;
public class userTest {
    private static user user;
    @BeforeClass
    public static void setUp() throws Exception {
        user = new user();
    }
    @AfterClass
    public static void tearDown() throws Exception {
    }
    @Test
    public void test_01()
     {
        String expected = "Tathagat Kumar";
        String actual = user.getFullName("Tathagat" , "Kumar");
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test_02()
    {
        String expected = "Atul Pandey";
        String actual = user.getFullName("Atul" , "Pandey");
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void test_03()
    {
        String expected = "Deepesh Kumar";
        String actual = user.getFullName("Deepesh" , "Kumar");
        Assert.assertEquals(actual,expected);
    }
}