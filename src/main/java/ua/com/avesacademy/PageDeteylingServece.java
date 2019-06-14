package ua.com.avesacademy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PageDeteylingServece {
    @Autowired
    DeteylingRepository deteylingRepository;

    @Transactional
    public void addPageDeteyling(PageDeteyling pageDeteyling){
        deteylingRepository.save(pageDeteyling);
    }

    @Transactional
    public void deleteDeteyling(long[] id){
        for (long idPage : id)
            deteylingRepository.delete(idPage);
    }
    @Transactional
    public PageDeteyling findByIdDeteyling(long id){
        return deteylingRepository.findByIdDeteyling(id);
    }

    @Transactional(readOnly = true)
    public List<PageDeteyling> findAllDeteyling() {
        return deteylingRepository.findAll();
    }

    @Transactional
    public PageDeteyling findByNameDeteyling(String name) {
        return deteylingRepository.findByNameDeteyling(name);
    }

}
