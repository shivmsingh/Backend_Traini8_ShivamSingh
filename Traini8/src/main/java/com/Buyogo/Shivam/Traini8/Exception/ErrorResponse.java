package com.Buyogo.Shivam.Traini8.Exception;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Map;

@Data
public class ErrorResponse {
    private final LocalDateTime timestamp;
    private final String message;
    private final String service;
    private final int status;
    private final Map<String, String> errors;

    public ErrorResponse(LocalDateTime timestamp, String message, String service, int status, Map<String, String> errors) {
        this.timestamp = timestamp;
        this.message = message;
        this.service = service;
        this.status = status;
        this.errors = errors;
    }

}