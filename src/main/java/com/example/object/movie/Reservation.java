package com.example.object.movie;

import com.example.object.util.Money;

/**
 * 예매 클래스
 *
 * Created by sthwin on 2020/12/21 10:15 오후
 */
public class Reservation {
    private Customer customer;
    private Screening screening;
    private Money fee;
    private int audienceCount;

    public Reservation(Customer customer, Screening screening, Money fee, int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }
}
