package com.touhid.reactive_test_server.controller;

import com.touhid.reactive_test_server.model.Course;
import com.touhid.reactive_test_server.service.CourseService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @RequestMapping(value = "/courses", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Course> getCourses() {
        return courseService.getCourses();
    }
}
