package com.blz;

public class EmpWages {
    public static void main(String[] args) {

        System.out.println("Welcome to EmpWages Program");

        int empCheck = (int) Math.floor(Math.random() * 10) % 2;
        System.out.println(empCheck);

        if (empCheck == 1) {
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is Absent");
        }

    }
}

