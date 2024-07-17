package rusio.pavlovsky.order.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rusio.pavlovsky.order.controller.request.OrderRequest;
import rusio.pavlovsky.order.mapper.OrderMapper;
import rusio.pavlovsky.order.model.Order;
import rusio.pavlovsky.order.repository.OrderRepository;
import rusio.pavlovsky.order.service.OrderService;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository repository;
    private final OrderMapper mapper;

    @Override
    public Order create(OrderRequest request) {
        return repository.save(mapper.toOrder(request));
    }

}
