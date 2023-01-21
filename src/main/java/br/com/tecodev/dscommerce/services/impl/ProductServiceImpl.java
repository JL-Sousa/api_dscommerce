package br.com.tecodev.dscommerce.services.impl;

import br.com.tecodev.dscommerce.dto.ProductDto;
import br.com.tecodev.dscommerce.entities.Product;
import br.com.tecodev.dscommerce.repositories.ProductRepository;
import br.com.tecodev.dscommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    @Override
    @Transactional(readOnly = true)
    public ProductDto findById(Long id) {
        Product product =  repository.findById(id).get();
        return new ProductDto(product);
    }
}
