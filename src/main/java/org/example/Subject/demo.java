package org.example.Subject;

import io.reactivex.rxjava3.subjects.PublishSubject;

public class demo {

    public static void main(String[] args) {
    PublishSubject<String> subject = PublishSubject.create();
    subject = (PublishSubject<String>) subject.toSerialized();
    subject.subscribe(System.out::println);
    subject.subscribe(s -> {
        System.out.println("Observer 2 : "+s);
    });

    subject.onNext("Hello");
    subject.onNext("Basics Strong");
    subject.onComplete();
    subject.onNext("Basics Strong");


    }
}
