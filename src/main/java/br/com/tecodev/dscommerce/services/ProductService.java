package br.com.tecodev.dscommerce.services;

import br.com.tecodev.dscommerce.dto.ProductDto;

public interface ProductService {

    ProductDto findById(Long id);
}
