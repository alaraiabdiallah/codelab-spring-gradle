package id.gits.codelabspringgradle.ProductModule.Repositories;

import id.gits.codelabspringgradle.ProductModule.Models.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product,Long> {

    @Query(value = "SELECT * FROM product WHERE name LIKE %?1% ",
            nativeQuery = true)
    List<Product> searchProductByName(String name);
}
