package br.paduan.spring02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.paduan.spring02.model.Fornecedor;
import br.paduan.spring02.repo.FornecedorRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/fornecedor")
public class FornecedorController {
    
    @Autowired
    private FornecedorRepo repo;

    @GetMapping("/todos")
    public List<Fornecedor> listarTodos() {
        List<Fornecedor> lista = (List<Fornecedor>) repo.findAll();

        return lista;        
    }

    @PostMapping("/novo")
    public ResponseEntity<Fornecedor> cadastrar(@RequestBody Fornecedor novoFornecedor) {

        Fornecedor fornecedorCadastrado = repo.save(novoFornecedor);

        return ResponseEntity.ok(fornecedorCadastrado);
    }
    
}
