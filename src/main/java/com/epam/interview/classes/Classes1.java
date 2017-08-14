//package com.epam.interview.classes;
//
//public class Classes1 {
//    interface I {
//        private Integer i = 0;
//    }
//
//    abstract class A implements I {
//        public int i = 2;
//    }
//
//    static private class B extends A {
//        {
//            public int i = 5;
//        }
//        {
//            i++;
//        }
//    }
//
//    public static void main(String[] args) {
//        A a = new B();
//        B b = new B();
//        I c = new B();
//        B d = new A();
//        I e = new I();
//        System.out.println(
//                a.i + "+" + b.i + "+" + c.i + "+" + d.i + "+" + e.i + "=" +
//                        (a.i + b.i + c.i + d.i + e.i));
//    }
//}
