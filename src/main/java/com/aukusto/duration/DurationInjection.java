package com.aukusto.duration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Duration;

@Service
public class DurationInjection {

    @Value("${com.aukustomx.duration}")
    private Duration duration;

    void printDurationInjected() {
        System.out.println("Duration millis " + duration.toMillis());
        System.out.println("Duration minutes " + duration.toMinutes());
        System.out.println("Duration seconds " + duration.toSeconds());
        System.out.println("Duration hours " + duration.toHours());
    }
}
