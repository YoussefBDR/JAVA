package service;

import dao.IOrderDao;
import model.Order;

public class IOrderServiceImpl implements IOrderService{
    IOrderDao Dao;

    public IOrderServiceImpl(IOrderDao dao) {
        Dao = dao;
    }

    public IOrderDao getDao() {
        return Dao;
    }

    public void setDao(IOrderDao dao) {
        Dao = dao;
    }

    @Override
    public void save(Order o) {
        Dao.save(o);
    }

    public IOrderServiceImpl() {
    }
}
