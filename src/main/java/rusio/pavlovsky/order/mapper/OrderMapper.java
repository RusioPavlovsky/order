package rusio.pavlovsky.order.mapper;

import org.mapstruct.Mapper;
import rusio.pavlovsky.order.controller.request.OrderRequest;
import rusio.pavlovsky.order.model.Order;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    Order toOrder (OrderRequest orderRequest);
}
