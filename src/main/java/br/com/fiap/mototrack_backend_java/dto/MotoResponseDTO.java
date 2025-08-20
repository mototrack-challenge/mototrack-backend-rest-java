package br.com.fiap.mototrack_backend_java.dto;

import br.com.fiap.mototrack_backend_java.model.Alerta;
import br.com.fiap.mototrack_backend_java.model.Movimentacao;
import br.com.fiap.mototrack_backend_java.model.enums.ModeloMoto;
import br.com.fiap.mototrack_backend_java.model.enums.Status;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MotoResponseDTO extends RepresentationModel<MotoResponseDTO> {

    @JsonProperty("id_moto")
    private Long id;

    private String placa;

    private String chassi;

    private ModeloMoto modelo;

    private Status status;

    private List<Movimentacao> movimentacoes;

    private List<Alerta> alertas;
}
