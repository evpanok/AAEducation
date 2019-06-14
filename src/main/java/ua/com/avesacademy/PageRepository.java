package ua.com.avesacademy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PageRepository extends JpaRepository<PageTonirovka, Long> {
    @Query("SELECT c FROM PageTonirovka c WHERE (c.name) =:pattern")
    PageTonirovka findByNameTonirovka(@Param("pattern") String pattern);

    @Query("SELECT c FROM PageTonirovka c WHERE (c.id) =:pattern")
    PageTonirovka findByIdTonirovka(@Param("pattern") long pattern);

    List<PageTonirovka> findAll();


}
