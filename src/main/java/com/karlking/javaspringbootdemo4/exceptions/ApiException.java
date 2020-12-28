package com.karlking.javaspringbootdemo4.exceptions;

import org.springframework.http.HttpStatus;
import java.time.ZonedDateTime;
import java.util.Date;

public class ApiException {
    //private final String message;
    //private final HttpStatus httpStatus;
    //private final ZonedDateTime timestamp;

    private Date timestamp;
    private String message;
    private String details;

    public ApiException(Date timestamp,
                        String message,
                        String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
