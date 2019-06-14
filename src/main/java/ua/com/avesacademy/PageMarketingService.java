package ua.com.avesacademy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PageMarketingService {
    @Autowired
    MarketingRepository marketingRepository;

    @Transactional
    public void addPageMarketing(PageMarketing pageMarketing){
        marketingRepository.save(pageMarketing);
    }

    @Transactional
    public void deleteMarketing(long[] id){
        for (long idPage : id)
            marketingRepository.delete(idPage);
    }
    @Transactional
    public PageMarketing findByIdMarketing(long id){
        return marketingRepository.findByIdMarketing(id);
    }

    @Transactional(readOnly = true)
    public List<PageMarketing> findAllMarketing() {
        return marketingRepository.findAll();
    }

    @Transactional
    public PageMarketing findByNameMarketing(String name) {
        return marketingRepository.findByNameMarketing(name);
    }

}
