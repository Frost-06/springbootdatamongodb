package com.teamf4.springbootdatamongodb.controller;

import java.util.List;

import com.teamf4.springbootdatamongodb.model.Billing;
import com.teamf4.springbootdatamongodb.service.BillingService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class BillingController {
    @PostMapping("/billing")
    public ResponseEntity insertBilling(@RequestBody Billing billing) {
        BillingService.addBilling(billing);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/billings")
    public ResponseEntity<List<Billing>> getBills() {
        return ResponseEntity.ok(BillingService.getAllBills());
    }

    @GetMapping("/billing/{menu}")
   public ResponseEntity<Billing> searchBillMenu(@PathVariable int menu) {
        return ResponseEntity.ok(BillingService.searchMenu(menu));
   }


   @PutMapping("/billing/{id}")
   public ResponseEntity updateBilling(@RequestBody Billing billing) {
       BillingService.updateBilling(billing);
       return ResponseEntity.ok().build();
   }
   
   @DeleteMapping("/billing/{id}")
   public ResponseEntity deleteBilling(@PathVariable String id) {
        BillingService.deleteBilling(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
   }
}
