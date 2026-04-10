# AI + Java Demo (Spring Boot)

这是一个可直接扩展的 AI + Java 项目骨架，包含：

- Spring Boot 3 + Java 17
- `/api/v1/chat` 对话接口
- `LlmClient` 抽象层（当前默认 `MockLlmClient`）
- 便于后续接入 OpenAI / Azure / 私有模型网关

## 快速启动

```bash
mvn spring-boot:run
```

启动后请求示例：

```bash
curl -X POST http://localhost:8080/api/v1/chat \
  -H "Content-Type: application/json" \
  -d '{"message":"给我一份 AI + Java 架构建议","userId":"u001"}'
```

## 目录结构

```text
src/main/java/com/example/ai
  ├─ controller  # API 层
  ├─ service     # 业务层
  ├─ client      # 模型调用抽象
  ├─ dto         # 请求响应对象
  └─ config      # 配置
```

## 下一步建议

1. 将 `MockLlmClient` 替换成真实模型调用。
2. 增加 SSE 流式输出接口。
3. 新增知识库上传与向量检索（RAG）。
4. 增加鉴权、限流、审计日志。
