package com.example.ai.dto;

public record ChatResponse(
        String answer,
        String model,
        long latencyMs
) {
}
