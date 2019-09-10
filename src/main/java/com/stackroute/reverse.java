package com.stackroute;

public class reverse {

   public int  reverse1(int num)
   {
       int r,sum = 0;
     while (num!=0)
     {
         r = num %10;
         sum = sum*10 + r;
         num = num/10;
     }
     return sum;
   }



    }






