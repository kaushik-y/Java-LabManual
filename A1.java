package com.company;

class Employee{
    int Eid;
    String Ename;
    int Salary;
    Employee(){
        System.out.println("I am Non Parameterize constructor....");
    }
    Employee(int Eid){
        System.out.println("I am 1 Parameterize constructor....");
        System.out.println(Eid);
    }
    Employee(int id, String ename){
        System.out.println("I am 2 Parameterize Constructor....");
        System.out.println("Id : "+id);
        System.out.println("Employee Name : "+id);
    }
    Employee(int id, String ename,int sal){
        System.out.println("I am 3 Parameterize Constructor.....");
        System.out.println("Id : "+id);
        System.out.println("Employee Name : "+ename);
        System.out.println("Salary : "+sal);
    }

    public  void addition(int x){
        System.out.println("I am First Method...");
        int ans=x+10;
        System.out.println("Add "+ ans);
    }
    public void addition(int x,int y){
        System.out.println("I am Second Method...");
        System.out.println("Add "+x+y);
    }
    public void addition(int x,int y,int z){
        System.out.println("I am Third Method...");
        System.out.println("Add "+x+y+z);
    }
}

public class A1 {
    public static void main(String[] args) {
//        A. Write a Java Program to demonstrate Constructor Overloading and Method overloading.
//          Employee e= new Employee(1);
//          Employee e= new Employee(1,"kaushik");
            Employee e = new Employee(1, "kaushik", 98000);

            e.addition(5);
            e.addition(5,8);
            e.addition(5,8,9);
    }
}
