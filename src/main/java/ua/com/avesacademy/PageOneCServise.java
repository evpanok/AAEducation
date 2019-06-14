package ua.com.avesacademy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PageOneCServise {

    @Autowired
    OneCRepository oneCRepository;

    @Transactional
    public void addPageOneC(PageOneC pageOneC){
        oneCRepository.save(pageOneC);
    }

    @Transactional
    public void deleteOneC(long[] id){
        for (long idPage : id)
            oneCRepository.delete(idPage);
    }
    @Transactional
    public PageOneC findByIdOneC(long id){
        return oneCRepository.findByIdPageOneC(id);
    }

    @Transactional(readOnly = true)
    public List<PageOneC> findAllOneC() {
        return oneCRepository.findAll();
    }

    @Transactional
    public PageOneC findByNameOneC(String name) {
        return oneCRepository.findByNameOneC(name);
    }

}
