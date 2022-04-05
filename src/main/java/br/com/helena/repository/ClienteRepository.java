package br.com.helena.repository;

import br.com.helena.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //componente do tipo repository, interaje com bd
public interface ClienteRepository extends JpaRepository<Cliente, Long> {



}
