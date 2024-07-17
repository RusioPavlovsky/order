package rusio.pavlovsky.order.controller.response;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class ErrorDto {
    int code;
    String message;
}
