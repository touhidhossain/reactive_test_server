package com.touhid.reactive_test_server.service;

import com.touhid.reactive_test_server.model.Course;
import reactor.core.publisher.Flux;

public interface CourseService {
    Flux<Course> getCourses();
}
