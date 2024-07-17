package rusio.pavlovsky.order.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rusio.pavlovsky.order.controller.request.OrderRequest;
import rusio.pavlovsky.order.model.Order;
import rusio.pavlovsky.order.service.OrderService;

import static rusio.pavlovsky.order.controller.ControllerConstant.API;

@RestController
@RequestMapping(API + "/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @PostMapping(headers = {"Content-Type=application/json", "Accept=application/json"})
    public ResponseEntity<Order> createOrder(@RequestBody OrderRequest request) {
        return ResponseEntity.ok(service.create(request));
    }

}
