package com.weine.services;

import com.weine.entities.Product;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class TestService extends DbConnection{
    public TestService() {
    }

    public List<Product> getProducts(){
        //Initializing the query
        Class<Product> entity = Product.class;
        CriteriaQuery<Product> criteriaQuery = this.getEntityManager().getCriteriaBuilder().createQuery(entity);
        Root<Product> entityRoot = criteriaQuery.from(entity);
        criteriaQuery.select(entityRoot).where();
        return getEntityManager().createQuery(criteriaQuery).getResultList();
    }
}
