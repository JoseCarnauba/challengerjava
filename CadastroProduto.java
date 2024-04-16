package br.com.fiap.challenger.produto;

import jakarta.validation.constraints.NotBlank;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;


public final class CadastroProduto {
    @NotBlank 
    String nome;
        final AtomicInteger quantidade = new AtomicInteger();

    public CadastroProduto() {
    }

    public @NotBlank String nome() {
        return nome;
    }

    public @NotBlank @NotBlank int quantidade() {
        return quantidade.get();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (CadastroProduto) obj;
        return Objects.equals(this.nome, that.nome) &&
                this.quantidade == that.quantidade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, quantidade);
    }

    @Override
    public String toString() {
        return "CadastroProduto[" +
                "nome=" + nome + ", " +
                "quantidade=" + quantidade.get() + ']';
    }

        public Long id() {
            return null;
        }
}

