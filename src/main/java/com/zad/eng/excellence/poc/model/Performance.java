package com.zad.eng.excellence.poc.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Performance {
    private Integer executionTimeMs;
    private Integer downstreamCallTimeMs;
    private Integer transformationTimeMs;
    private Integer authenticationTimeMs;
    private Integer retryAttempts;
    private String circuitBreakerState;
    private Boolean cacheHit;
    private Integer queueWaitTimeMs;

    // --- Getters & Setters ---
    public Integer getExecutionTimeMs() {
        return executionTimeMs;
    }

    public void setExecutionTimeMs(Integer executionTimeMs) {
        this.executionTimeMs = executionTimeMs;
    }

    public Integer getDownstreamCallTimeMs() {
        return downstreamCallTimeMs;
    }

    public void setDownstreamCallTimeMs(Integer downstreamCallTimeMs) {
        this.downstreamCallTimeMs = downstreamCallTimeMs;
    }

    public Integer getTransformationTimeMs() {
        return transformationTimeMs;
    }

    public void setTransformationTimeMs(Integer transformationTimeMs) {
        this.transformationTimeMs = transformationTimeMs;
    }

    public Integer getAuthenticationTimeMs() {
        return authenticationTimeMs;
    }

    public void setAuthenticationTimeMs(Integer authenticationTimeMs) {
        this.authenticationTimeMs = authenticationTimeMs;
    }

    public Integer getRetryAttempts() {
        return retryAttempts;
    }

    public void setRetryAttempts(Integer retryAttempts) {
        this.retryAttempts = retryAttempts;
    }

    public String getCircuitBreakerState() {
        return circuitBreakerState;
    }

    public void setCircuitBreakerState(String circuitBreakerState) {
        this.circuitBreakerState = circuitBreakerState;
    }

    public Boolean getCacheHit() {
        return cacheHit;
    }

    public void setCacheHit(Boolean cacheHit) {
        this.cacheHit = cacheHit;
    }

    public Integer getQueueWaitTimeMs() {
        return queueWaitTimeMs;
    }

    public void setQueueWaitTimeMs(Integer queueWaitTimeMs) {
        this.queueWaitTimeMs = queueWaitTimeMs;
    }

    // --- toString() ---
    @Override
    public String toString() {
        return "Performance{" +
                "executionTimeMs=" + executionTimeMs +
                ", downstreamCallTimeMs=" + downstreamCallTimeMs +
                ", transformationTimeMs=" + transformationTimeMs +
                ", authenticationTimeMs=" + authenticationTimeMs +
                ", retryAttempts=" + retryAttempts +
                ", circuitBreakerState='" + circuitBreakerState + '\'' +
                ", cacheHit=" + cacheHit +
                ", queueWaitTimeMs=" + queueWaitTimeMs +
                '}';
    }
}
