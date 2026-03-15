package com.henriquecpp.notification_worker.dto;

import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

public record NotificationMessageEvent(
        @JsonProperty String id,
        @JsonProperty String name,
        @JsonProperty String email,
        @JsonProperty String message,
        @JsonProperty LocalDateTime timestamp,
        @JsonProperty int retryCount
) {
}