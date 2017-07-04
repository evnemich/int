package com.epam.interview.classes;

public class Classes1 {
    interface I {
        static int i = 0;
    }

    static class A implements I {
        int i = 1;
    }

    static class B extends A {
        int i = 5;
    }

    public static void main(String[] args) {
        A a = new B();
        B b = new B();
        B c = new A();
        A d = new A();
        System.out.println(a.i + "+" + b.i + "+" + c.i + "+" + d.i + "=" + (a.i + b.i + c.i + d.i));
    }
}
