package com.example.ai.client;

public interface LlmClient {

    String complete(String prompt);

    String modelName();
}
