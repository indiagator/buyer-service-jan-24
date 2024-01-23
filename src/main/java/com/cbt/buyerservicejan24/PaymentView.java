package com.cbt.buyerservicejan24;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentView
{
    String paymentid;
    Integer amnt;
    String currency;
    String offername;
    String sellername;
}
