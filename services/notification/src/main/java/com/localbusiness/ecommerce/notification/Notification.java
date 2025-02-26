package com.localbusiness.ecommerce.notification;

import com.localbusiness.ecommerce.kafka.order.OrderConfirmation;
import com.localbusiness.ecommerce.kafka.payment.PaymentConfirmation;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Document
public class Notification {
    private String id;
    private NotificationType type;
    private LocalDateTime notificationDate;
    private OrderConfirmation orderConfirmation;
    private PaymentConfirmation paymentConfirmation;

}
