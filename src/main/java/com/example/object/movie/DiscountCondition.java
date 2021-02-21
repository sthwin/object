package com.example.object.movie;

/**
 * 할인 조건 클래스
 *
 * Created by sthwin on 2020/12/21 10:43 오후
 */
public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
