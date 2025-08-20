package br.com.fiap.mototrack_backend_java.mapper;

import br.com.fiap.mototrack_backend_java.dto.MotoRequestDTO;
import br.com.fiap.mototrack_backend_java.dto.MotoResponseDTO;
import br.com.fiap.mototrack_backend_java.model.Moto;

public class MotoMapper {
    public static MotoResponseDTO toResponseDTO(Moto moto) {
        if (moto == null) return null;

        return new MotoResponseDTO(
                moto.getId(),
                moto.getPlaca(),
                moto.getChassi(),
                moto.getModelo(),
                moto.getStatus(),
                moto.getMovimentacoes(),
                moto.getAlertas()
        );
    }

    public static Moto toEntity(MotoRequestDTO dto) {
        if (dto == null) return null;

        Moto moto = new Moto();
        moto.setPlaca(dto.getPlaca());
        moto.setChassi(dto.getChassi());
        moto.setModelo(dto.getModelo());
        moto.setStatus(dto.getStatus());

        return moto;
    }
}
