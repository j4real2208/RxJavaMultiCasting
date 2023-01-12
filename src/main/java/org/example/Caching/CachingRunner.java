package org.example.Caching;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class CachingRunner {
    public static void main(String[] args) throws InterruptedException {
        var replayTime =  Observable.interval(1, TimeUnit.SECONDS)
                .cache(); // cache all the output till the end

        replayTime.subscribe(e -> System.out.println("Observer 1: "+e));
        Thread.sleep(5000);

        replayTime.subscribe(e -> System.out.println("Observer 2: "+e));

        Thread.sleep(5000);
    }
}
