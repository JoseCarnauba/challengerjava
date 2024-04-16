package br.com.fiap.challenger.produto;

import br.com.fiap.challenger.produto.CadastroProduto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "produtos")
@Entity(name = "Produto")
@Getter
@NoArgsConstructor @AllArgsConstructor @EqualsAndHashCode(of= "id")
public class Produto {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int quantidade;

    //Construtores
    public Produto(CadastroProduto dados) {
        this.id = dados.id();
        this.nome = dados.nome();
        this.quantidade = dados.quantidade();
    }
}