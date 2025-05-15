package com.student;

public class RegularFee extends AbstractFee{
    public RegularFee(double tutionFee, double additionalCharges) {
        super(tutionFee, additionalCharges);
    }
    @Override
    public double calculateFee() {
        return getTuitionFee() + getAdditionalCharges();
    }

}
