package br.com.fiap.mototrack_backend_java.dto;

import java.time.LocalDateTime;

public class AlertaDTO {
    private Long id;
    private String mensagem;
    private LocalDateTime dataAlerta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public LocalDateTime getDataAlerta() {
        return dataAlerta;
    }

    public void setDataAlerta(LocalDateTime dataAlerta) {
        this.dataAlerta = dataAlerta;
    }
}
