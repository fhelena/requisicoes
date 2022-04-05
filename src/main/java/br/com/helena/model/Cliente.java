package br.com.helena.model;

import lombok.Data;

import javax.persistence.*;

@Data //implementa os getters and setters
@Entity //informa que é uma entidade, mapeando os atributos da tabela
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//o banco quem ficará responsável por incrementar o id
    private Long id;

    @Column(nullable = false)
    private String nome;
}
