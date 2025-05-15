package com.student;

public class ScholarshipFee extends AbstractFee {
    double scholarshipAmount;

    public ScholarshipFee(double tuition, double additionalCharges, double scholarshipAmount) {
        super(tuition, additionalCharges);
        this.scholarshipAmount = scholarshipAmount;
    }

    @Override
    public double calculateFee() {
        return (getTuitionFee() + getAdditionalCharges()) - scholarshipAmount;
    }
}
