package com.sample.jenkins.upper.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

/**
 * @author adeyi.adebolu
 * created on 16/04/2019
 */

@RestController
@RequestMapping("/api/test")
public class TestController {

    private Set<String> customerNames = new HashSet<>();

    @PostConstruct
    public void InitSet() {
        customerNames.add("Customer 1");
        customerNames.add("Customer 2");
    }

    @PostMapping("/add/{name}")
    public ResponseEntity AddCustomer(@PathVariable String name) {
        customerNames.add(name);
        return ResponseEntity.ok(name);
    }

    @GetMapping("/all")
    public ResponseEntity AllCustomers() {
        return ResponseEntity.ok(customerNames);
    }

    @DeleteMapping("/delete/{name}")
    public ResponseEntity AllCustomers(@PathVariable String name) {
        customerNames.remove(name);
        //comment1
        return ResponseEntity.ok(customerNames);
    }
}
