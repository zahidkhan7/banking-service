package com.zad.eng.excellence.poc.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorDetail {

    private String errorCode;
    private String errorMessage;
    private String errorDescription;
    private String category;
    private String severity;
    private String source;
    private String technicalMessage;
    private String exceptionClass;
    private String businessRuleViolated;
    private Object validationErrors;
    private Boolean retryable;
    private Integer retryAfterSeconds;
    private String downstreamService;
    private Integer httpStatusCode;
    private String originalErrorCode;
    private String additionalContext;
    private String resolutionSteps;
    private String supportReferenceId;

    // Getter and Setter for errorCode
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    // Getter and Setter for errorMessage
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    // Getter and Setter for errorDescription
    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    // Getter and Setter for category
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Getter and Setter for severity
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    // Getter and Setter for source
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    // Getter and Setter for technicalMessage
    public String getTechnicalMessage() {
        return technicalMessage;
    }

    public void setTechnicalMessage(String technicalMessage) {
        this.technicalMessage = technicalMessage;
    }

    // Getter and Setter for exceptionClass
    public String getExceptionClass() {
        return exceptionClass;
    }

    public void setExceptionClass(String exceptionClass) {
        this.exceptionClass = exceptionClass;
    }

    // Getter and Setter for businessRuleViolated
    public String getBusinessRuleViolated() {
        return businessRuleViolated;
    }

    public void setBusinessRuleViolated(String businessRuleViolated) {
        this.businessRuleViolated = businessRuleViolated;
    }

    // Getter and Setter for validationErrors
    public Object getValidationErrors() {
        return validationErrors;
    }

    public void setValidationErrors(Object validationErrors) {
        this.validationErrors = validationErrors;
    }

    // Getter and Setter for retryable
    public Boolean getRetryable() {
        return retryable;
    }

    public void setRetryable(Boolean retryable) {
        this.retryable = retryable;
    }

    // Getter and Setter for retryAfterSeconds
    public Integer getRetryAfterSeconds() {
        return retryAfterSeconds;
    }

    public void setRetryAfterSeconds(Integer retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
    }

    // Getter and Setter for downstreamService
    public String getDownstreamService() {
        return downstreamService;
    }

    public void setDownstreamService(String downstreamService) {
        this.downstreamService = downstreamService;
    }

    // Getter and Setter for httpStatusCode
    public Integer getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    // Getter and Setter for originalErrorCode
    public String getOriginalErrorCode() {
        return originalErrorCode;
    }

    public void setOriginalErrorCode(String originalErrorCode) {
        this.originalErrorCode = originalErrorCode;
    }

    // Getter and Setter for additionalContext
    public String getAdditionalContext() {
        return additionalContext;
    }

    public void setAdditionalContext(String additionalContext) {
        this.additionalContext = additionalContext;
    }

    // Getter and Setter for resolutionSteps
    public String getResolutionSteps() {
        return resolutionSteps;
    }

    public void setResolutionSteps(String resolutionSteps) {
        this.resolutionSteps = resolutionSteps;
    }

    // Getter and Setter for supportReferenceId
    public String getSupportReferenceId() {
        return supportReferenceId;
    }

    public void setSupportReferenceId(String supportReferenceId) {
        this.supportReferenceId = supportReferenceId;
    }
}
