package ua.com.avesacademy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ManagementRepository extends JpaRepository<PageManagement, Long> {

    @Query("SELECT c FROM PageManagement c WHERE (c.name) =:pattern")
    PageManagement findByNameManagement(@Param("pattern") String pattern);

    @Query("SELECT c FROM PageManagement c WHERE (c.id) =:pattern")
    PageManagement findByIdManagement(@Param("pattern") long pattern);

    List<PageManagement> findAll();
}
