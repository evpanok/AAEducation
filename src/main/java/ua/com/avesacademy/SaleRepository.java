package ua.com.avesacademy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SaleRepository extends JpaRepository<PageSale, Long> {

    @Query("SELECT c FROM PageSale c WHERE (c.name) =:pattern")
    PageSale findByNameSale(@Param("pattern") String pattern);

    @Query("SELECT c FROM PageSale c WHERE (c.id) =:pattern")
    PageSale findByISale(@Param("pattern") long pattern);

    List<PageSale> findAll();
}
