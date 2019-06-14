package ua.com.avesacademy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MarketingRepository extends JpaRepository<PageMarketing, Long>{

    @Query("SELECT c FROM PageMarketing c WHERE (c.name) =:pattern")
    PageMarketing findByNameMarketing(@Param("pattern") String pattern);

    @Query("SELECT c FROM PageMarketing c WHERE (c.id) =:pattern")
    PageMarketing findByIdMarketing(@Param("pattern") long pattern);

    List<PageMarketing> findAll();

}
