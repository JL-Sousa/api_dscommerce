package br.com.tecodev.dscommerce.controllers;

import br.com.tecodev.dscommerce.dto.ProductDto;
import br.com.tecodev.dscommerce.repositories.ProductRepository;
import br.com.tecodev.dscommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping(value = "/{id}")
    public ProductDto findById(@PathVariable Long id) {
        return service.findById(id);
    }
}
