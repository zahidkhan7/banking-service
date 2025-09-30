package com.zad.eng.excellence.poc.model;

import java.time.LocalDateTime;

public class CustomerPayload {
    private Customer customer;
    private Metadata metadata;

    // --- Getters & Setters ---
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Metadata getMetadata() {
        return metadata;
    }
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    // =============================
    // Nested Customer DTO
    // =============================
    public static class Customer {
        private String customerId;
        private String firstName;
        private String lastName;
        private LocalDateTime dateOfBirth;
        private String gender;
        private String nationalId;
        private String customerType;
        private String status;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        // --- Getters & Setters ---
        public String getCustomerId() {
            return customerId;
        }
        public void setCustomerId(String customerId) {
            this.customerId = customerId;
        }

        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public LocalDateTime getDateOfBirth() {
            return dateOfBirth;
        }
        public void setDateOfBirth(LocalDateTime dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public String getGender() {
            return gender;
        }
        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getNationalId() {
            return nationalId;
        }
        public void setNationalId(String nationalId) {
            this.nationalId = nationalId;
        }

        public String getCustomerType() {
            return customerType;
        }
        public void setCustomerType(String customerType) {
            this.customerType = customerType;
        }

        public String getStatus() {
            return status;
        }
        public void setStatus(String status) {
            this.status = status;
        }

        public LocalDateTime getCreatedAt() {
            return createdAt;
        }
        public void setCreatedAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
        }

        public LocalDateTime getUpdatedAt() {
            return updatedAt;
        }
        public void setUpdatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
        }
    }

    // =============================
    // Nested Metadata DTO
    // =============================
    public static class Metadata {
        private LocalDateTime retrievedAt;
        private String source;

        // --- Getters & Setters ---
        public LocalDateTime getRetrievedAt() {
            return retrievedAt;
        }
        public void setRetrievedAt(LocalDateTime retrievedAt) {
            this.retrievedAt = retrievedAt;
        }

        public String getSource() {
            return source;
        }
        public void setSource(String source) {
            this.source = source;
        }
    }
}
