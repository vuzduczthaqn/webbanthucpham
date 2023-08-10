package com.welcome.Service;

import com.welcome.DAO.IMethodDAO;
import com.welcome.DAO.IProductDAO;
import com.welcome.DAO.Impl.ProductDAO;
import com.welcome.Model.Product;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.Optional;

public class ProductService {
    @Inject
    private IProductDAO productDAO;
    public Optional<Product> getProduct(List<Product> productList, String idProduct){
        return productList.stream().filter(e->idProduct.equalsIgnoreCase(e.getProductId()+"")).findFirst();
    }
    public List<Product> getListProduct(){
        return productDAO.getList();
    }
    public Product getProductFromList(List<Product> list,String id){
        Optional<Product> optional=list.stream().filter(e->id.equalsIgnoreCase(e.getProductId()+"")).findFirst();
        return optional.get();
    }
}
