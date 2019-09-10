package com.stackroute;

public class power4 {


    public static int pow4(int num) {

        while (num != 1) {

            if (num % 4 == 0)
                return 1;
                num = num/4;
        }

            return 0;
    }
}
