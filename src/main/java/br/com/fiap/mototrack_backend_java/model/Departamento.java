package br.com.fiap.mototrack_backend_java.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "mt_departamentos")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 30)
    private DepartamentoType tipo;

    @OneToMany(mappedBy = "departamento")
    private List<Movimentacao> movimentacoes;

    public Departamento() {
    }

    public Departamento(String nome, DepartamentoType tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DepartamentoType getTipo() {
        return tipo;
    }

    public void setTipo(DepartamentoType tipo) {
        this.tipo = tipo;
    }

    public List<Movimentacao> getMovimentacoes() {
        return movimentacoes;
    }
}
