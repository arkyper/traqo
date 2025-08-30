package com.arkyper.traqo.domain.dto;

public record ErrorResponse(
        int status,
        String message,
        String details
) {
}
