package com.student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentId(1);
        s1.setStudentName("Jocata");
        s1.setStudentEmail("jocata@jocata.in");
        s1.setStudentPhone("123456789");
        Fee f1 = new RegularFee(1000,10000);
        f1.displayFeeDetails(s1);
        System.out.println("Total Fee: " + f1.calculateFee());
        Fee f2 = new ScholarshipFee(1000,10000,5000);
        f2.displayFeeDetails(s1);
        System.out.println("Total Fee: " + f2.calculateFee());
    }
}
