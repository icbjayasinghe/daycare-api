package com.skyhigh.daycareapi.service;

public interface PaymentFeatureService {

    public boolean isPaymentEnabled(Long daycareId);

    public void validatePaymentEnabled(Long daycareId);
}
