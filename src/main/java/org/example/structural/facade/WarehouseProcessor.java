package org.example.structural.facade;

import org.example.structural.facade.Service.InventoryService;
import org.example.structural.facade.Service.PaymentService;

//Additional facade class to further clean order processor class
public class WarehouseProcessor {
    private InventoryService inventoryService;
    private PaymentService paymentService;

    public void process() {
        inventoryService.checkStock();
        String id = paymentService.generateLink();
        paymentService.pay(id);
        inventoryService.updateStock();
    }
}
