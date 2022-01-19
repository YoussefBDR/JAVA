package service;

import dao.IOrderDao;
import model.Order;

public interface IOrderService {
    void save(Order o);
    public IOrderDao getDao();
}
