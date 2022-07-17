package com.collie.api.dtos;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.collie.api.constants.ErrorMessages;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class ScheduleDTO {
    @NotNull(message = ErrorMessages.MISSING_DATE)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date date;

    @NotBlank(message = ErrorMessages.MISSING_NAME)
    private String name;

    @NotBlank(message = ErrorMessages.MISSING_PHONE)
    private String phone;

    @NotNull(message = ErrorMessages.MISSING_PRICE)
    private Double price;

    @NotBlank(message = ErrorMessages.MISSING_SERVICE)
    private String service;

    @NotNull(message = ErrorMessages.MISSING_STATUS)
    private Integer status;
}
