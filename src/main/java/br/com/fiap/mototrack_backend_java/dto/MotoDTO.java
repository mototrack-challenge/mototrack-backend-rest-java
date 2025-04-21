package br.com.fiap.mototrack_backend_java.dto;

public class MotoDTO {
    private Long id;
    private String placa;
    private String modelo;
    private StatusDTO status;
    private List<MovimentacaoDTO> movimentacoes;
    private List<AlertaDTO> alertas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public StatusDTO getStatus() {
        return status;
    }

    public void setStatus(StatusDTO status) {
        this.status = status;
    }

    public List<MovimentacaoDTO> getMovimentacoes() {
        return movimentacoes;
    }

    public void setMovimentacoes(List<MovimentacaoDTO> movimentacoes) {
        this.movimentacoes = movimentacoes;
    }

    public List<AlertaDTO> getAlertas() {
        return alertas;
    }

    public void setAlertas(List<AlertaDTO> alertas) {
        this.alertas = alertas;
    }
}
