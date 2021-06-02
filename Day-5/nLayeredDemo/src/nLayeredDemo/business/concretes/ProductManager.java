package nLayeredDemo.business.concretes;

import nLayeredDemo.JLogger.JLoggerManager;
import nLayeredDemo.business.abstracts.IProductService;
import nLayeredDemo.core.ILoggerService;
import nLayeredDemo.dataAccess.abstracts.IProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

import java.util.List;

public class ProductManager implements IProductService {

    private IProductDao productDao;
    private ILoggerService loggerService;

    public ProductManager(IProductDao productDao, ILoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService = loggerService;
    }

    @Override
    public void add(Product product) {

        if(product.getCategoryId() == 1)
        {
            System.out.println("Bu kategoride ürün kabul edilmiyor...");
            return;
        }

        this.productDao.add(product);
        this.loggerService.logToSystem("Ürün eklendi: " + product.getName());
    }

    @Override
    public List<Product> getAll() {
        return null;
    }


}
