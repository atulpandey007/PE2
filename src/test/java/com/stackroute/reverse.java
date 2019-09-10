package com.stackroute;

public class reverse {

    public int reverse1(int num)
    {

        int r;
        int sum= 0;
        int temp = num;


        while(num!=0)
        {
            r = num%10;
            sum = sum*10 + r;
            num = num/10;

        }

        if(sum==temp)
        {
            System.out.println("Palindrome");
        }else
        {
            System.out.println("Not Palindrome");
        }
        return 1;
    }

}
