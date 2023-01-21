package br.com.tecodev.dscommerce.repositories;

import br.com.tecodev.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
