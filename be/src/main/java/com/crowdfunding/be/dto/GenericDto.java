package com.crowdfunding.be.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class GenericDto<DATA> {
    private int resultCode = 200;
    private String result = "OK";
    private String errorMessage = "Success";

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private DATA data;

    public GenericDto(DATA data) {
        this.data = data;
    }

    public GenericDto() {}

    public static GenericDto ok() {
        return new GenericDto();
    }

}
