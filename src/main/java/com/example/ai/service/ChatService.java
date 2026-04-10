package com.example.ai.service;

import com.example.ai.client.LlmClient;
import com.example.ai.dto.ChatResponse;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    private final LlmClient llmClient;

    public ChatService(LlmClient llmClient) {
        this.llmClient = llmClient;
    }

    public ChatResponse chat(String message) {
        long start = System.currentTimeMillis();
        String answer = llmClient.complete(message);
        long latency = System.currentTimeMillis() - start;
        return new ChatResponse(answer, llmClient.modelName(), latency);
    }
}
