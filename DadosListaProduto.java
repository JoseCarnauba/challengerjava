package br.com.fiap.challenger.produto;

import java.util.Objects;

public final class DadosListaProduto {
    private String nome;
    private int quantidade;

    public DadosListaProduto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public <Produto> DadosListaProduto(Produto produto, String nome, int quantidade) {
        this.nome = nome;
    }

    public String nome() {
        return nome;
    }

    public int quantidade() {
        return quantidade;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (DadosListaProduto) obj;
        return Objects.equals(this.nome, that.nome) &&
                Objects.equals(this.quantidade, that.quantidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, quantidade);
    }

    @Override
    public String toString() {
        return new StringBuilder().append("DadosListaProduto[").append("nome=").append(nome).append(", ").append("nquantidade=").append(quantidade).append(", ").toString();

    }

}
