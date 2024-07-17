package rusio.pavlovsky.order.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.ZonedDateTime;
import java.util.UUID;

@Entity
@Table(name = "order_order")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_order_id_sequence")
    @SequenceGenerator(name = "order_order_id_sequence", sequenceName = "order_order_id_sequence", allocationSize = 1)
    Long id;
    UUID orderId;
    UUID customerId;
    UUID operatorId;
    @CreationTimestamp
    ZonedDateTime createdAt;
    @UpdateTimestamp
    ZonedDateTime updatedAt;

}
