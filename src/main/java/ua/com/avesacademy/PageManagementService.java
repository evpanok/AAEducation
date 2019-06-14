package ua.com.avesacademy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PageManagementService {

     @Autowired
     ManagementRepository managementRepository;

    @Transactional
    public void addPageManagement(PageManagement pageManagement){
        managementRepository.save(pageManagement);
    }

    @Transactional
    public void deleteManagement(long[] id){
        for (long idPage : id)
            managementRepository.delete(idPage);
    }
    @Transactional
    public PageManagement findByIdManagement(long id){
        return managementRepository.findByIdManagement(id);
    }

    @Transactional(readOnly = true)
    public List<PageManagement> findAll() {
        return managementRepository.findAll();
    }

    @Transactional
    public PageManagement findByNameManagement(String name) {
        return managementRepository.findByNameManagement(name);
    }


}
