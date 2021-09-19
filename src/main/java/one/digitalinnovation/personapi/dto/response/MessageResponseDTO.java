package one.digitalinnovation.personapi.dto.response;


import lombok.Builder;
import lombok.Data;

//DTO = Data Transfer Object

@Data
@Builder
public class MessageResponseDTO {

    private String message;
}
