package com.example.object.movie;

import com.example.object.util.Money;

/**
 * Created by sthwin on 2021/01/30 5:29 오후
 */
public class NoneDiscountPolicy extends DiscountPolicy {

    @Override
    public Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
