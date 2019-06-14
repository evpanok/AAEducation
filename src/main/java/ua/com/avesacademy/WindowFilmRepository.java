package ua.com.avesacademy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface WindowFilmRepository extends JpaRepository<PageWindowFilm, Long> {

    @Query("SELECT c FROM PageWindowFilm c WHERE (c.name) =:pattern")
    PageWindowFilm findByNameWindowFilm(@Param("pattern") String pattern);

    @Query("SELECT c FROM PageWindowFilm c WHERE (c.id) =:pattern")
    PageWindowFilm findByIdWindowFilm(@Param("pattern") long pattern);

    List<PageWindowFilm> findAll();



}
