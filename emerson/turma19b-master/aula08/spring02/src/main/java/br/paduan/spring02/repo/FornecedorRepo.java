package br.paduan.spring02.repo;

import org.springframework.data.repository.CrudRepository;

import br.paduan.spring02.model.Fornecedor;

public interface FornecedorRepo extends CrudRepository<Fornecedor, Long> {

}
