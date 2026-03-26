package org.example.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComplaintDto {
    private Long userIdentification;
    private String complaintType;
    private String detail;
}
