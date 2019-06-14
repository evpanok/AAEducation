package ua.com.avesacademy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OneCRepository extends JpaRepository<PageOneC, Long> {

    @Query("SELECT c FROM PageOneC c WHERE (c.name) =:pattern")
    PageOneC findByNameOneC(@Param("pattern") String pattern);

    @Query("SELECT c FROM PageOneC c WHERE (c.id) =:pattern")
    PageOneC findByIdPageOneC(@Param("pattern") long pattern);

    List<PageOneC> findAll();
}
