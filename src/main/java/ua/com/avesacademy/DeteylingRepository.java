package ua.com.avesacademy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DeteylingRepository extends JpaRepository<PageDeteyling, Long> {
    @Query("SELECT c FROM PageDeteyling c WHERE (c.name) =:pattern")
    PageDeteyling findByNameDeteyling(@Param("pattern") String pattern);

    @Query("SELECT c FROM PageDeteyling c WHERE (c.id) =:pattern")
    PageDeteyling findByIdDeteyling(@Param("pattern") long pattern);

    List<PageDeteyling> findAll();
}
