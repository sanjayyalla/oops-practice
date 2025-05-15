package com.student;

public abstract class AbstractFee implements Fee {
    private double tuitionFee;
    private double additionalCharges;
    public AbstractFee(double tuitionFee, double additionalCharges) {
        this.tuitionFee = tuitionFee;
        this.additionalCharges = additionalCharges;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }
    public double getAdditionalCharges() {
        return additionalCharges;
    }
    @Override
    public void displayFeeDetails(Student s) {
        System.out.println("Student ID: "+s.getStudentId());
        System.out.println("Student Name: "+s.getStudentName());
        System.out.println("Student Email: "+s.getStudentEmail());
        System.out.println("Student Phone: "+s.getStudentPhone());
        System.out.println("Tuition Fee: " + tuitionFee);
        System.out.println("Additional Charges: " + additionalCharges);
    }
}
