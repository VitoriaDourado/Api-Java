package br.com.project.api.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.project.api.modelo.Pessoa;

@Repository
public interface Repositorio extends CrudRepository<Pessoa, Integer>{

    List<Pessoa> findAll();

    Pessoa findByCodigo(int codigo);

    List<Pessoa> findByOrderByNome();

    List<Pessoa> findByNomeOrderByIdadeDesc(String nome);

    List<Pessoa> findByNomeContaining(String termo);

    List<Pessoa> findByNomeStartsWith(String termo);

    List<Pessoa> findByNomeEndsWith(String termo);

}
