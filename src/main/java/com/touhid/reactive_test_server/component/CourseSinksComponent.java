package com.touhid.reactive_test_server.component;

import com.touhid.reactive_test_server.model.Course;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Sinks;

@Component
public class CourseSinksComponent {
    @Bean
    public Sinks.Many<Course> courseSink() {
        return Sinks.many().multicast().directBestEffort();
    }
}
