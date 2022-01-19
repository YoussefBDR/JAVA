package dao;

import model.Order;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OrderDaoImpl implements IOrderDao{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_Orders");
    EntityManager em = emf.createEntityManager();
    @Override
    public void save(Order o) {
        em.getTransaction().begin();
        em.persist(o);
        em.getTransaction().commit();
    }

}
