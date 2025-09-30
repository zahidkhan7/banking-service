package com.zad.eng.excellence.poc.model;

public class SuccessResponse {
    private int oprstatus;
    private String returnCode;
    private CustomerPayload dataResponse;
    private int opstatus;
    private int httpStatusCode;

    public SuccessResponse() {}

    public SuccessResponse(CustomerPayload response) {
        this.oprstatus = 0;
        this.returnCode = "0";
        this.dataResponse = response;
        this.opstatus = 0;
        this.httpStatusCode = 0;
    }

    public int getOprstatus() {
        return oprstatus;
    }

    public void setOprstatus(int oprstatus) {
        this.oprstatus = oprstatus;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }


    public int getOpstatus() {
        return opstatus;
    }

    public void setOpstatus(int opstatus) {
        this.opstatus = opstatus;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }


    public CustomerPayload getDataResponse() {
        return dataResponse;
    }

    public void setDataResponse(CustomerPayload dataResponse) {
        this.dataResponse = dataResponse;
    }

}
