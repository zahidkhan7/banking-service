package com.zad.eng.excellence.poc.model;

public class FailureResponse {
    private int oprstatus;
    private String returnCode;
    private ErrorMessage errmsg;

    public FailureResponse() {}

    public FailureResponse(int oprstatus, String returnCode, ErrorMessage errmsg) {
        this.oprstatus = oprstatus;
        this.returnCode = returnCode;
        this.errmsg = errmsg;
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

    public ErrorMessage getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(ErrorMessage errmsg) {
        this.errmsg = errmsg;
    }

    public static class ErrorMessage {
        private String errMsg_AR;
        private String errMsg_EN;

        public ErrorMessage() {}

        public ErrorMessage(String errMsg_AR, String errMsg_EN) {
            this.errMsg_AR = errMsg_AR;
            this.errMsg_EN = errMsg_EN;
        }

        public String getErrMsg_AR() {
            return errMsg_AR;
        }

        public void setErrMsg_AR(String errMsg_AR) {
            this.errMsg_AR = errMsg_AR;
        }

        public String getErrMsg_EN() {
            return errMsg_EN;
        }

        public void setErrMsg_EN(String errMsg_EN) {
            this.errMsg_EN = errMsg_EN;
        }
    }
}
