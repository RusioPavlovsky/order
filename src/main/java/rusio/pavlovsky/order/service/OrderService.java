package rusio.pavlovsky.order.service;

import rusio.pavlovsky.order.controller.request.OrderRequest;
import rusio.pavlovsky.order.model.Order;

public interface OrderService {

    Order create(OrderRequest request);

}
