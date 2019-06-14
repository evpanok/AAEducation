package ua.com.avesacademy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PageSaleService {

    @Autowired
    private SaleRepository saleRepository;
    @Transactional
    public void addPageSale(PageSale pageSale){
        saleRepository.save(pageSale);
    }

    @Transactional
    public void deletePageSale(long[] id){
        for (long idPage : id)
            saleRepository.delete(idPage);
    }
    @Transactional
    public PageSale findByIdSale(long id){
        return saleRepository.findByISale(id);
    }

    @Transactional(readOnly = true)
    public List<PageSale> findAllSale() {
        return saleRepository.findAll();
    }

    @Transactional
    public PageSale findByNameSale(String name) {
        return saleRepository.findByNameSale(name);
    }

}
