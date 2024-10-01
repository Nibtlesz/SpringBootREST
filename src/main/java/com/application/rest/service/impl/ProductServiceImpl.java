package com.application.rest.service.impl;

import com.application.rest.entities.Product;
import com.application.rest.persistence.IProductoDAO;
import com.application.rest.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductoDAO productoDAO;

    @Override
    public List<Product> findAll() {
        return productoDAO.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productoDAO.findById(id);
    }

    @Override
    public List<Product> findByPriceInRange(BigDecimal min, BigDecimal max) {
        return productoDAO.findByPriceInRange(min, max);
    }

    @Override
    public void save(Product product) {
        productoDAO.save(product);
    }

    @Override
    public void deleteById(Long id) {
        productoDAO.deleteById(id);
    }
}
