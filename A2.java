package com.company;
import java.util.*;

public class A2 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        System.out.println(str.capacity());

        String st = new String();

        st = "KaushikRadadiya";
        int s = st.length();
        System.out.println(s);
        for (int i = s - 1; i >= 0; i--) {
            System.out.print(st.charAt(i));
        }
    }
}
