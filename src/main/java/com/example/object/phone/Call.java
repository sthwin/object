package com.example.object.phone;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * Created by sthwin on 2021/02/21 1:20 오후
 */
public class Call {
    private LocalDateTime from;
    private LocalDateTime to;

    public Call(LocalDateTime from, LocalDateTime to) {
        this.from = from;
        this.to = to;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public Duration getDuration() {
        return Duration.between(from, to);
    }
}
