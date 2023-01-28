package com.Bvss.BvssDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Bvss.BvssDetails.entity.Bvss;
import com.Bvss.BvssDetails.service.BvssService;

@RestController
public class BvvsController {

    @Autowired
    private BvssService service;

    //@PostMapping("/addProduct")
    @RequestMapping(method = RequestMethod.POST , path = "/addproduct")
    public Bvss addProduct(@RequestBody Bvss product) {
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Bvss> addProducts(@RequestBody List<Bvss> products) {
        return service.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Bvss> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/productById/{id}")
    public Bvss findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @GetMapping("/product/{name}")
    public Bvss findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    @PutMapping("/update")
    public Bvss updateProduct(@RequestBody Bvss product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }
}