package ru.example.MySecondTestAppSpringBoot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {
    @NotBlank
    @Size(max = 32)
    private String uid;

    @NotBlank
    @Size(max = 32)
    private String operationUid;

    private Systems systemName;

    @NotBlank
    private String systemTime;

    private String source;

    private Positions position;
    private Double salary;
    private Double bonus;
    private Integer workDays;

    @Min(1)
    @Max(100000)
    private int communicationId;

    private int templateId;

    private int productCode;

    private int smsCode;

    @Override
    public String toString() {
        return "{" +
                "uid='" + uid + '\'' +
                ", opertionUid='" + operationUid + '\'' +
                ", systemName='" + systemName + '\'' +
                ", systemTime='" + systemTime + '\'' +
                ", source='" + source + '\'' +
                ", communicationId=" + communicationId +
                ", templateId=" + templateId +
                ", productCode=" + productCode +
                ", smsCode=" + smsCode +
                '}';
    }
}
