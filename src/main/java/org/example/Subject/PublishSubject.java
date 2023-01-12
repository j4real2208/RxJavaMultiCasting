package org.example.Subject;

import io.reactivex.rxjava3.subjects.Subject;

public class PublishSubject {
    public static void main(String[] args) {

        Subject<String> subject = io.reactivex.rxjava3.subjects.PublishSubject.create();

        subject.subscribe(s -> {
            System.out.println("Subscriber 1 : "+s);
        });

        subject.onNext("a");
        subject.onNext("b");
        subject.onNext("c");


        subject.subscribe(s -> {
            System.out.println("Subscriber 2 : "+s);
        });


        subject.onNext("d");
        subject.onNext("e");
        subject.onComplete();
    }
}
