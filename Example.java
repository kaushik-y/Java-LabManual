package com.company;

import java.io.*;
import java.util.Scanner;

class abc{
    public void abs(){
        System.out.println("Hello Started");
    }
}
public class Example {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);

        Console in = System.console();
        StringBuffer sb=new StringBuffer();
        System.out.println("Capacity  of StringBuffer object " + sb.capacity());

        System.out.println("Enter name to reverse");
        String s=sc.next();
        String r=new String();

       for(int i=s.length()-1;i>-1;i--)
           r = r+s.charAt(i);
        System.out.println("Revers String of "+s + " is "+ r);

        System.out.println("Its Uppercase " + r.toUpperCase());

        System.out.println("Enter String to Append");
        String a=sc.next();
        System.out.println("Appending String " + r  +  "  with " + a + " is " + r.concat(a));

        sb=new StringBuffer(s);

        System.out.println("Append using StringBuffer "+sb.append(a));
        System.out.println("Reverse using StringBuffer "+ sb.reverse());

    }
}
