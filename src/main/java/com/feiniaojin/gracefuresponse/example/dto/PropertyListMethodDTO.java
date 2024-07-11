package com.feiniaojin.gracefuresponse.example.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.feiniaojin.gracefulresponse.api.ValidationStatusCode;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;


@Data
public class PropertyListMethodDTO {

    @NotNull(message = "uid is null !")
    @Length(min = 6, max = 12)
    @ValidationStatusCode(code = "520")
    private String uid;

    @NotNull(message = "innerDTO is null")
//    @ValidationStatusCode(code = "521")
    @Valid
    private List<InnerDto> innerDto;

    public static void main(String[] args) throws JsonProcessingException {
        String input = "{\n" +
                "    \"uid\": \"123456\",\n" +
                "    \"inner\": {\n" +
                "        \"innerProperty\": null\n" +
                "    }\n" +
                "}";

        ObjectMapper mapper = new ObjectMapper();
        PropertyListMethodDTO methodDTO = mapper.readValue(input, PropertyListMethodDTO.class);
        System.out.println("");
    }
}
