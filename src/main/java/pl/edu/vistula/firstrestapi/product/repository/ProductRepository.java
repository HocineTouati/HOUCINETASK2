package pl.edu.vistula.firstrestapi.product.repository;

import pl.edu.vistula.firstrestapi.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}