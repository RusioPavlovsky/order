package rusio.pavlovsky.order.controller.request;

import lombok.Data;

import java.util.Set;
import java.util.UUID;

@Data
public class OrderRequest {

    UUID orderId;
    UUID customerId;
    UUID operatorId;
    UUID restaurantId;
    Set<UUID> mealIds;

}
