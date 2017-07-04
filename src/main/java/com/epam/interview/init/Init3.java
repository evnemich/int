package com.epam.interview.init;

public class Init3 {
    private int a = 2;          //*/

    static {
        a = 5;                  //*/
    }

    {
        System.out.println(a);
        a = 1;                  //*/
    }

    public static void main(String[] args) {
        int a = 10;             //*/

        a = 0;                  //*/
        Init3 i = new Init3();  //*/
        this.a = 4;
        System.out.println(i.a);
    }
}
