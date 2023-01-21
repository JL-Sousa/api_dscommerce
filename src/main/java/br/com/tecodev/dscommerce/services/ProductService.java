package br.com.tecodev.dscommerce.services;

import br.com.tecodev.dscommerce.dto.ProductDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {

    ProductDto findById(Long id);

    Page<ProductDto> findAll(Pageable pageable);
}
