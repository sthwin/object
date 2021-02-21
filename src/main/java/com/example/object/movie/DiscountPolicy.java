package com.example.object.movie;

import com.example.object.util.Money;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 할인 정책 클래스
 *
 * Created by sthwin on 2020/12/21 10:34 오후
 */
public abstract class DiscountPolicy {

    private List<DiscountCondition> conditions = new ArrayList<>();

    public DiscountPolicy(DiscountCondition ... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    public Money calculateDiscountAmount(Screening screening) {
        for(DiscountCondition each: conditions) {
            if(each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }
        return Money.ZERO;
    }

    protected abstract Money getDiscountAmount(Screening screening);
}
