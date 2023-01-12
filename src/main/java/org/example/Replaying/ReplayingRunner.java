package org.example.Replaying;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class ReplayingRunner {

    public static void main(String[] args) throws InterruptedException {
    // Basic example
        //        var src = Observable.interval(1, TimeUnit.SECONDS)
//                .replay()
//                .autoConnect();
//        src.subscribe(e -> System.out.println("Observer 1 : "+e));
//
//        Thread.sleep(5000);
//
//        src.subscribe(e -> System.out.println("Observer 2 : "+e));
//
//        Thread.sleep(5000);


//Buffer size example
//        var CacheSrc = Observable.interval(1, TimeUnit.SECONDS)
//                .replay(2) // Number of value to cache
//                .autoConnect();
//
//        CacheSrc.subscribe(e -> System.out.println("Observer 1.1 : "+e));
//
//        Thread.sleep(5000);
//
//        CacheSrc.subscribe(e -> System.out.println("Observer 2.1 : "+e));
//
//        Thread.sleep(3000);


       var replayTime =  Observable.interval(1, TimeUnit.SECONDS)
                .replay(1,TimeUnit.SECONDS)
                .autoConnect();
       replayTime.subscribe(e -> System.out.println("Observer 1.2: "+e));
        Thread.sleep(5000);

        replayTime.subscribe(e -> System.out.println("Observer 2.2: "+e));

        Thread.sleep(5000);

    }

}
