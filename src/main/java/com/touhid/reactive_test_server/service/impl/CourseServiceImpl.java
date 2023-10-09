package com.touhid.reactive_test_server.service.impl;

import com.touhid.reactive_test_server.model.Course;
import com.touhid.reactive_test_server.service.CourseService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

@Service
public class CourseServiceImpl implements CourseService {

    private final Sinks.Many<Course> courseMany;

    public CourseServiceImpl(Sinks.Many<Course> courseMany) {
        this.courseMany = courseMany;
    }

    @Override
    public Flux<Course> getCourses() {
        /*return Flux.create(courseFluxSink -> {
            List<Course> courseList = new ArrayList<>();
            courseList.add(new Course(1,
                    "Serverless Angular with Firebase Course",
                    "Serveless Angular with Firestore, Firebase Storage & Hosting, Firebase Cloud Functions & AngularFire",
                    "https://s3-us-west-1.amazonaws.com/angular-university/course-images/serverless-angular-small.png",
                    null,
                    10,
                    "BEGINNER",
                    6,
                    "serverless-angular",
                    null,
                    50));

            courseList.add(new Course(2,
                    "Angular Core Deep Dive",
                    "A detailed walk-through of the most important part of Angular - the Core and Common modules",
                    "https://s3-us-west-1.amazonaws.com/angular-university/course-images/angular-core-in-depth-small.png",
                    null,
                    10,
                    "BEGINNER",
                    3,
                    "angular-core-course",
                    null,
                    50));

            courseList.add(new Course(3,
                    "RxJs In Practice Course",
                    "Understand the RxJs Observable pattern, learn the RxJs Operators via practical examples",
                    "https://s3-us-west-1.amazonaws.com/angular-university/course-images/rxjs-in-practice-course.png",
                    "https://angular-academy.s3.amazonaws.com/main-logo/main-page-logo-small-hat.png",
                    10,
                    "BEGINNER",
                    2,
                    "rxjs-course",
                    null,
                    50));

            courseList.add(new Course(4,
                    "NgRx (with NgRx Data) - The Complete Guide",
                    "Learn the modern Ngrx Ecosystem, including NgRx Data, Store, Effects, Router Store, Ngrx Entity, and Dev Tools.",
                    "https://angular-university.s3-us-west-1.amazonaws.com/course-images/ngrx-v2.png",
                    null,
                    10,
                    "BEGINNER",
                    1,
                    "ngrx-course",
                    false,
                    50));

            for (Course course : courseList) {
                courseFluxSink.next(course);
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            courseFluxSink.complete();
        });*/

        return courseMany.asFlux();
    }
}
