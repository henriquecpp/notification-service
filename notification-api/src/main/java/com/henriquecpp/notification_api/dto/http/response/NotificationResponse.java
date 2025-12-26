package com.henriquecpp.notification_api.dto.http.response;

import java.time.LocalDateTime;

public record NotificationResponse(
        String messageId,
        String message,
        LocalDateTime timestamp
) {
}
