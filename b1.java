package com.company;

class Outer {
    int Local=10;
    public int Public=20;
    private int Private=30;
    protected int Protected=40;
    class Inner{
        int LocalIn=5;
        public int publiC=15;
        private int privatE=25;
        protected int protecteD=35;
        void diplay()
        {
            System.out.println("Inner class");
            System.out.println("Value of a="+Local);
            System.out.println("Value of public variable"+Public);
            System.out.println("Value of private variable"+ Private);
            System.out.println("Value of protected variable"+Protected);
        }
    }
    void outermet()
    {
        Inner in=new Inner();
        in.diplay();
        System.out.println("Outer class");
        System.out.println("Value of p="+in.LocalIn);
        System.out.println("Value of public variable"+in.publiC);
        System.out.println("Value of private variable"+in.privatE);
        System.out.println("Value of protected variable"+in.protecteD);
    }
}

public class b1 {
    public static void main(String[] args) {
//        b. Write a Java Program to implement Inner class and demonstrate its Access Protections.
        Outer ot=new Outer();
        ot.outermet();

    }
}
