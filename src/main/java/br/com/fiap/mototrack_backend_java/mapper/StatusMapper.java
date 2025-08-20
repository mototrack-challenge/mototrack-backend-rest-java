package br.com.fiap.mototrack_backend_java.mapper;

import br.com.fiap.mototrack_backend_java.dto.StatusDTO;

public class StatusMapper {

    public static StatusDTO toDTO(Status status) {
        if (status == null) return null;

        return new StatusDTO(
                status.getId(),
                status.getDescricao(),
                status.getTipo()
        );
    }

    public static Status toEntity(StatusDTO dto) {
        if (dto == null) return null;

        Status status = new Status();
        status.setDescricao(dto.getDescricao());
        status.setTipo(dto.getTipo());

        return status;
    }
}
