package com.example.orderRestfulServer.controllers;

import com.example.orderRestfulServer.models.CheckOrderStatus;
import com.example.orderRestfulServer.services.CheckOrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/api")
public class OrderStatusController {

    @Autowired
    private CheckOrderStatusService checkOrderStatusService;

    /*@GetMapping("/")
    public ResponseEntity<ArrayList<CheckOrderStatus>> getAllCheckOrderStatus() {
        return new ResponseEntity<>(checkOrderStatusService.getAll(), HttpStatus.OK);
    }*/

//    @PostMapping("/check-order-status")
//    public ResponseEntity<String> checkOrder(@RequestParam("order_number") String orderNumber, @RequestParam("company_id") String companyID){
//        return new ResponseEntity<>(checkOrderStatusService.check(orderNumber, companyID), HttpStatus.OK);
//    }
    @PostMapping("/check_order_status")
    public ResponseEntity<String> checkOrder(@RequestBody CheckOrderStatus checkOrderStatus){
        String order_number = checkOrderStatus.getOrder_number();
        String company_id = checkOrderStatus.getCompany_id();
        return new ResponseEntity<>(checkOrderStatusService.check(order_number, company_id), HttpStatus.OK);
    }
}
