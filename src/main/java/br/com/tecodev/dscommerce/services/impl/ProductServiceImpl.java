package br.com.tecodev.dscommerce.services.impl;

import br.com.tecodev.dscommerce.dto.ProductDto;
import br.com.tecodev.dscommerce.entities.Product;
import br.com.tecodev.dscommerce.repositories.ProductRepository;
import br.com.tecodev.dscommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
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

    @Override
    public Page<ProductDto> findAll(Pageable pageable) {
        Page<Product> products = repository.findAll(pageable);
        return products.map(ProductDto::new);
    }
}
