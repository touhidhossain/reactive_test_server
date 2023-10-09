package com.touhid.reactive_test_server.model;

public record Course(int id,
                     String description,
                     String longDescription,
                     String iconUrl,
                     String courseListIcon,
                     int lessonsCount,
                     String category,
                     int seqNo,
                     String url,
                     Boolean promo,
                     int price) {
}
