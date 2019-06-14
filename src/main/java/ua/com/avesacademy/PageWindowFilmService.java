package ua.com.avesacademy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PageWindowFilmService {

    @Autowired
    private WindowFilmRepository windowFilmRepository;

    @Transactional
    public void addPageWindowFilm(PageWindowFilm windowFilm){
        windowFilmRepository.save(windowFilm);
    }

    @Transactional
    public void deleteWindowFilm(long[] id){
        for (long idPage : id)
            windowFilmRepository.delete(idPage);
    }

    @Transactional
    public PageWindowFilm findByIdWindowFilm(long id){
        return windowFilmRepository.findByIdWindowFilm(id);
    }

    @Transactional(readOnly = true)
    public List<PageWindowFilm> findAllWindowFilm() {
        return windowFilmRepository.findAll();
    }

    @Transactional
    public PageWindowFilm findByNameWindowFilm(String name) {
        return windowFilmRepository.findByNameWindowFilm(name);
    }
}
