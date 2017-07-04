package com.epam.interview.init;

public class Init2 {
    private int a = 2;          //*/
    public static int a = 3;    //*/

    static {
        a = 5;                  //*/
    }

    {
        System.out.println(a);
        a = 1;                  //*/
    }

    public static void main(String[] args) {
        System.out.println(a);
    }
}
