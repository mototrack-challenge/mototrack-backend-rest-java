package br.com.fiap.mototrack_backend_java.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "mt_status")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String descricao;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 30)
    private StatusType tipo;

    @OneToMany(mappedBy = "status")
    @JsonIgnore
    private List<Moto> motos;

    public Status() {
    }

    public Status(StatusType tipo, String descricao) {
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public StatusType getTipo() {
        return tipo;
    }

    public void setTipo(StatusType tipo) {
        this.tipo = tipo;
    }

    public List<Moto> getMotos() {
        return motos;
    }

    public void setMotos(List<Moto> motos) {
        this.motos = motos;
    }
}
