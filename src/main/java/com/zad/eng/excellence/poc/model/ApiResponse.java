package com.zad.eng.excellence.poc.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL) // exclude nulls from JSON
public class ApiResponse<T> {

    private boolean success;           // true / false
    private String status;             // SUCCESS / ERROR
    private String correlationId;      // unique request trace ID
    private LocalDateTime timestamp;   // response time
    private String serviceName;        // service identifier
    private String protocol;           // REST_JSON, GRPC, etc.
    private Performance performance;   // performance metrics
    private ErrorDetail error;         // error details (only when failed)
    private T payload;                 // business data (only when success)

    // --- Getters & Setters ---
    public boolean isSuccess() { return success; }
    public void setSuccess(boolean success) { this.success = success; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getCorrelationId() { return correlationId; }
    public void setCorrelationId(String correlationId) { this.correlationId = correlationId; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }

    public String getServiceName() { return serviceName; }
    public void setServiceName(String serviceName) { this.serviceName = serviceName; }

    public String getProtocol() { return protocol; }
    public void setProtocol(String protocol) { this.protocol = protocol; }

    public Performance getPerformance() { return performance; }
    public void setPerformance(Performance performance) { this.performance = performance; }

    public ErrorDetail getError() { return error; }
    public void setError(ErrorDetail error) { this.error = error; }

    public T getPayload() { return payload; }
    public void setPayload(T payload) { this.payload = payload; }


}
