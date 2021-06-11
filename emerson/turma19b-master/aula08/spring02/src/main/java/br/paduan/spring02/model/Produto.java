package br.paduan.spring02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // será armazenado no BD
@Table(name = "produto")
public class Produto {

    @Id // chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto numerado no BD com 1, 2, 3 ...
    @Column(name = "cod")
    private long codigo;

    @Column(name = "nome", length = 200, nullable = false)
    private String nome;

    @Column(name = "valor")
    private double valor;

    @OneToOne
    @JoinColumn(name = "id_fornecedor")
    @JsonIgnoreProperties("produtos")
    private Fornecedor fornecedor;

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
}
