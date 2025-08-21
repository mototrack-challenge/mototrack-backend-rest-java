package br.com.fiap.mototrack_backend_java.dto;

import br.com.fiap.mototrack_backend_java.model.Departamento;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovimentacaoRequestDTO {

    @JsonProperty("moto_id")
    @NotNull(message = "O id da moto é obrigatório")
    private Long idMoto;

    @NotNull(message = "O departamento da moto é obrigatório")
    private Departamento departamento;
}
