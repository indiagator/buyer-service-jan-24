package com.cbt.buyerservicejan24;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/buyer")
public class BuyerController
{
    @Autowired
    PaymentRepository paymentRepository;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    PaymentViewService paymentViewService;

    @GetMapping("get/payment/{buyername}/{status}")
    public ResponseEntity<List<PaymentView>> getPayments(
            @PathVariable String buyername,
            @PathVariable String status)
    {
        List<Order> orders = orderRepository.findByBuyername(buyername);
        List<Order> filteredOrders =  orders.stream().
                filter(order -> paymentRepository.findByOrderid(order.getOrderid()).isPresent()).
                collect(Collectors.toList());
        List<Optional<Payment>> payments =  filteredOrders.
                stream().map(order -> paymentRepository.findByOrderid(order.getOrderid())).collect(Collectors.toList());


        List<PaymentView> views = payments.stream().
                map(payment -> paymentViewService.createPaymentView(payment.get().getId(),payment.get().getOfferid() ) ).
                collect(Collectors.toList());

        return ResponseEntity.ok(views);

    }

}
