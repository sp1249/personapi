package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.PhoneType;
import org.springframework.validation.annotation.Validated;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

//Deu erro aqui inicialmente. Troquei o arquivo pom.xml por uma versão anterior gerada pelo professor
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Validated
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {

    private Long id;

    @Enumerated(EnumType.STRING)
    private PhoneType type;

    //Deu erro, mas corrigido. Ver nos imports
    @NotEmpty
    @Size(min = 13, max = 14)

    private String number;
}
