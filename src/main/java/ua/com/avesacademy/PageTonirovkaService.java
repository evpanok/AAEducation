package ua.com.avesacademy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PageTonirovkaService {
    @Autowired
    private PageRepository pageRepository;

    @Transactional
    public void addPage(PageTonirovka pageTonirovka){
        pageRepository.save(pageTonirovka);
    }

    @Transactional
    public void deletePage(long[] id){
        for (long idPage : id)
            pageRepository.delete(idPage);
    }
    @Transactional
    public PageTonirovka findById(long id){
       return pageRepository.findByIdTonirovka(id);
    }

    @Transactional(readOnly = true)
    public List<PageTonirovka> findAllTonirovka() {
        return pageRepository.findAll();
    }

    @Transactional
    public PageTonirovka findByName(String name) {
        return pageRepository.findByNameTonirovka(name);
    }


}
