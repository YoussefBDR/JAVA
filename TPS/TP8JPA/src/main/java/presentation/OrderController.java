package presentation;

import model.Order;
import service.IOrderService;

public class OrderController {
    IOrderService service;

    public void setService(IOrderService service) {
        this.service = service;
    }

    public IOrderService getService() {
        return service;
    }

    public void save(Order o){
        service.save(o);
    }
}
