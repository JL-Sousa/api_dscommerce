package br.com.tecodev.dscommerce.dto;

import br.com.tecodev.dscommerce.entities.Product;

public record ProductDto(String name, String description, Double price, String imgUrl) {

    public ProductDto(Product product) {
        this(product.getName(), product.getDescription(), product.getPrice(), product.getImgUrl());
    }
}
