package rusio.pavlovsky.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rusio.pavlovsky.order.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
