package br.com.fiap.mototrack_backend_java.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "mt_motos")
public class Moto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 7)
    private String placa;

    @Column(nullable = false, length = 100)
    private String modelo;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;

    @OneToMany(mappedBy = "moto")
    private List<Movimentacao> movimentacoes;

    @OneToMany(mappedBy = "moto")
    private List<Alerta> alertas;

    public Moto() {
    }

    public Moto(String placa, String modelo, Status status) {
        this.placa = placa;
        this.modelo = modelo;
        this.status = status;
    }

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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Movimentacao> getMovimentacoes() {
        return movimentacoes;
    }

    public List<Alerta> getAlertas() {
        return alertas;
    }
}
