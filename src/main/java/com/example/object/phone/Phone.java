package com.example.object.phone;

import com.example.object.util.Money;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sthwin on 2021/02/21 1:19 오후
 */
public abstract class Phone {
    private List<Call> calls = new ArrayList<>();

    public Money calculateFee() {
        Money result = Money.ZERO;

        for (Call call : calls) {
            result = result.plus(calculateCallFee(call));
        }

        return result;
    }

    abstract protected Money calculateCallFee(Call call);
}
