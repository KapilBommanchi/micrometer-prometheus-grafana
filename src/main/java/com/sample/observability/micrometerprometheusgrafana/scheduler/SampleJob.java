package com.sample.observability.micrometerprometheusgrafana.scheduler;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class SampleJob {
    private final AtomicInteger testGauge;
    private final Counter testCounter;

    public SampleJob(MeterRegistry meterRegistry) {
        testGauge = meterRegistry.gauge("custom_gauge", new AtomicInteger(0));
        testCounter = meterRegistry.counter("custom_counter");
    }

    @Scheduled(fixedDelay = 1000) // delay per 1 seconds
    public void schedulingTask() {
        testGauge.set(SampleJob.getRandomNumberInRange(0, 100));
        testCounter.increment();
    }

    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
