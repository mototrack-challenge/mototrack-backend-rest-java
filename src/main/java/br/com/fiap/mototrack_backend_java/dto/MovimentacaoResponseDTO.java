package br.com.fiap.mototrack_backend_java.dto;

import br.com.fiap.mototrack_backend_java.model.Departamento;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovimentacaoResponseDTO {

    @JsonProperty("id_movimentacao")
    private Long id;

    @JsonProperty("data_movimentacao")
    private LocalDateTime dataMovimentacao;

    @JsonProperty("moto_id")
    private Long idMoto;

    private Departamento departamento;

}
