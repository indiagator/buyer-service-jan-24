package com.cbt.buyerservicejan24;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentViewService
{
    @Autowired
    PaymentRepository paymentRepository;
    @Autowired
    ProductofferRepository productofferRepository;
    @Autowired
    PaymentwalletlinkRepository paymentwalletlinkRepository;

    public PaymentView createPaymentView(String paymentid, String offerid)
    {
        PaymentView view = new PaymentView();
        view.setPaymentid(paymentid);
        view.setAmnt( paymentwalletlinkRepository.
                findById(paymentRepository.
                        findById(paymentid).get().getPaymentwalletlink()).get().getAmount() );
        view.setCurrency(productofferRepository.findById(offerid).get().getCurrency());
        view.setSellername(productofferRepository.findById(offerid).get().getSellername());
        view.setOffername(productofferRepository.findById(offerid).orElseThrow().getOffername());

        return view;

    }

}
