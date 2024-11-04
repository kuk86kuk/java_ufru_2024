    package ru.example.MyThirdTestAppSpringBoot.model;

    import lombok.Builder;
    import lombok.Data;

    @Data
    @Builder
    public class Response {
        private String uid;
        private String operationUid;
        private String systemTime;
        //    private String code;
        private Codes code;
        //    private String errorCode;
        private ErrorCodes errorCode;
        //    private String errorMessage;
        private ErrorMessages errorMessage;
    }