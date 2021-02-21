package com.example.object.movie;

import com.example.object.util.Money;

/**
 * 금액 할인 정책
 * <p>
 * Created by sthwin on 2021/01/24 6:59 오후
 */
public class AmountDiscountPolicy extends DiscountPolicy {

    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }


    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
