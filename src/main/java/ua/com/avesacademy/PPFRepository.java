package ua.com.avesacademy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PPFRepository extends JpaRepository<PagePPF, Long> {
    @Query("SELECT c FROM PagePPF c WHERE (c.name) =:pattern")
    PagePPF findByNamePPF(@Param("pattern") String pattern);

    @Query("SELECT c FROM PagePPF c WHERE (c.id) =:pattern")
    PagePPF findByIdPPF(@Param("pattern") long pattern);

    List<PagePPF> findAll();
}
