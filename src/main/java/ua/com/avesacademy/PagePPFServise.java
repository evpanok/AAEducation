package ua.com.avesacademy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PagePPFServise {
    @Autowired
    PPFRepository ppfRepository;

    @Transactional
    public void addPage(PagePPF pagePPF){
        ppfRepository.save(pagePPF);
    }

    @Transactional
    public void deletePPF(long[] id){
        for (long idPage : id)
            ppfRepository.delete(idPage);
    }
    @Transactional
    public PagePPF findByIdPPF(long id){
        return ppfRepository.findByIdPPF(id);
    }

    @Transactional(readOnly = true)
    public List<PagePPF> findAllPPF() {
        return ppfRepository.findAll();
    }

    @Transactional
    public PagePPF findByNamePPF(String name) {
        return ppfRepository.findByNamePPF(name);
    }

}
