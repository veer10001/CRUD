package com.Bvss.BvssDetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bvss.BvssDetails.entity.Bvss;
import com.Bvss.BvssDetails.repository.BvssRepository;

@Service
public class BvssService {

    @Autowired
    private BvssRepository repository;

    public BvssService(BvssRepository bvssrepository) {
        super();
        this.repository = bvssrepository;
    }

    public Bvss saveProduct(Bvss product) {
        return repository.save(product);
    }

    public List<Bvss> saveProducts(List<Bvss> products) {
        return repository.saveAll(products);
    }

    public List<Bvss> getProducts() {
        return repository.findAll();
    }

    public Bvss getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Bvss getProductByName(String name) {
        return repository.findByName(name);
    }

    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

    public Bvss updateProduct(Bvss product) {
        Bvss existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }


}
