package org.example.Subject;

import io.reactivex.rxjava3.subjects.AsyncSubject;
import io.reactivex.rxjava3.subjects.ReplaySubject;
import io.reactivex.rxjava3.subjects.Subject;

public class AsyncSubjectRunner {
    public static void main(String[] args) {
        Subject<String> subject = AsyncSubject.create();

        /// receive last emission

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
        subject.onComplete();  //for sure we should provide
    }
    }

