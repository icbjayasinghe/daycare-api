package com.skyhigh.daycareapi.service.impl;

import com.skyhigh.daycareapi.repository.DaycareConfigRepository;
import com.skyhigh.daycareapi.service.PaymentFeatureService;
import com.skyhigh.domainmodule.model.DaycareConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentFeatureServiceImpl implements PaymentFeatureService {

    @Autowired
    DaycareConfigRepository daycareConfigRepository;

    @Override
    public boolean isPaymentEnabled(Long daycareId) {
        return daycareConfigRepository
                .findDaycareConfigByDayCareId(daycareId)
                .getPaymentsEnabled();
    }

    @Override
    public void validatePaymentEnabled(Long daycareId) {
        if (!isPaymentEnabled(daycareId)) {
            throw new IllegalStateException("Payments are not enabled for daycare ID: " + daycareId);
        }
    }
}
