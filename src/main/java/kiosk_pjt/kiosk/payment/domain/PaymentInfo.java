package kiosk_pjt.kiosk.payment.domain;

import kiosk_pjt.kiosk.Item.domain.Item;

import java.time.LocalDateTime;

public class PaymentInfo {

    private String barcode;
    private String name;
    private String phoneNumber;
    private LocalDateTime paymentTime;
    private Item item;


    public PaymentInfo(String name, String phoneNumber, LocalDateTime paymentTime,Item item) {

        this.name = name;
        this.phoneNumber = phoneNumber;
        this.paymentTime = paymentTime;
        this.item  = item;
        //바코드는 상품종류, 이름,번호,결제시각의 조합
        this.barcode = item.getKind()+"_"+name+"_"+phoneNumber+"_"+paymentTime;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(LocalDateTime paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
