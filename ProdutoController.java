package br.com.fiap.challenger.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController<CadastroProduto> {

    @Autowired //Ingestão de dependencias
    private final ProdutoRepository repository;
    private Object DadosListaProduto;

    public ProdutoController(ProdutoRepository repository) {
        this.repository = repository;
    }

    //Método para cadastrar médico, Pega as informações noa corpo da requsição
    @PostMapping
    @Transactional //Metodo de transição com o Banco de dados, @Valid solicita a integração do Spring e validação em cima desse Dto.
    public void cadastrar(@RequestBody @Valid CadastroProduto dados) {

    }

}
