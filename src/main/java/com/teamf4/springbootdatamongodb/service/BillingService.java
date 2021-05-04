package com.teamf4.springbootdatamongodb.service;

import java.util.List;

import com.teamf4.springbootdatamongodb.model.Billing;
import com.teamf4.springbootdatamongodb.repository.BillingRepository;

import org.springframework.stereotype.Service;

@Service
public class BillingService {
    private static BillingRepository billingrepo;

    public BillingService(BillingRepository billingrepo) {
        BillingService.billingrepo = billingrepo;
    }

    public static void addBilling(Billing billing) {
        billingrepo.insert(billing);
    }
    
    public static List<Billing> getAllBills() {
        return billingrepo.findAll();
    }

    //update
    public static void updateBilling(Billing billing) {
        Billing update_billing = billingrepo.findById(billing.getBillingID())
        .orElseThrow(()-> new RuntimeException
        (String.format("Cannot find ID %s", billing.getBillingID())));

        update_billing.setMenu(billing.getMenu());
        update_billing.setDescription(billing.getDescription());
        update_billing.setPrice(billing.getPrice());

        billingrepo.save(billing);
    }

    public static Billing searchMenu(int  menu) {
        return billingrepo.findByMenu(menu)
        .orElseThrow(()->new RuntimeException
        (String.format("Cannot find value %s",menu)));
    }

    public static void deleteBilling(String billingID) {
        billingrepo.deleteById(billingID);
    }



}