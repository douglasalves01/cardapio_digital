package com.example.cardapio.food;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

//@Table indica que é uma tabela/entidade do banco de dados
@Table(name="foods")
@Entity(name="foods")
@Getter //gera todos os metodos de get da classe toda
@NoArgsConstructor // declara um constructor que nao recebe nenhum argumento
@AllArgsConstructor // declara um constructor que recebe todos os argumentos
@EqualsAndHashCode(of="id") //id como representacao
public class Food {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;
}
