package br.com.fiap.mototrack_backend_java.model.enums;

public enum Status {
    EM_MANUTENCAO("Em Manutenção"),
    PRONTA_PARA_USO("Pronta para Uso"),
    AVALIACAO("Em Avaliação");

    private String descricao;

    Status(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
