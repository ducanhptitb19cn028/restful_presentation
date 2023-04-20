package com.example.orderRestfulServer.controllers;

import com.example.orderRestfulServer.models.CheckOrderStatus;
import com.example.orderRestfulServer.models.fake;
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
    @PostMapping("/check_status")
    public ResponseEntity<String> checkOrder(@RequestBody fake fakea){
        fake a = new fake();
        Integer number = fakea.getNumber();
        String product_id = fakea.getProduct_id();
        return new ResponseEntity<>(checkOrderStatusService.check(number, product_id), HttpStatus.OK);
    }
}
