package com.henriquecpp.notification_api.dto.messaging.events;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public record NotificationMessageEvent(
        @JsonProperty String id,
        @JsonProperty String name,
        @JsonProperty String email,
        @JsonProperty String message,
        @JsonProperty LocalDateTime timestamp,
        @JsonProperty int retryCount
) {
}
