package com.example.ai.client;

import org.springframework.stereotype.Component;

@Component
public class MockLlmClient implements LlmClient {

    @Override
    public String complete(String prompt) {
        return "[Mock回答] 你问的是：" + prompt + "。建议下一步接入真实模型 API。";
    }

    @Override
    public String modelName() {
        return "mock-llm";
    }
}
