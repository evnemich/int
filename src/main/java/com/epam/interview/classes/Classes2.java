//package com.epam.interview.classes;
//
//public class Classes2 {
//    private static class A {
//        int i = 1;
//
//        public A() {
//            doWrite();
//        }
//
//        protected void doWrite() {
//            System.out.println("I'm user " + i);
//        }
//    }
//
//    private interface I {
//        int i = 5;
//    }
//
//    public static class B extends A implements I {
//        Integer i = 2;
//
//        public B() {
//            doWrite();
//        }
//
//        @Override
//        public void doWrite() {
//            System.out.println("You're user " + i);
//        }
//    }
//
//    public static void main(String[] args) {
//        A a = new B();
//        I i = new A();
//
//        System.out.println(a.i + i.i);
//    }
//}
