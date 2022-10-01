package com.tecodev.sacola.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@AllArgsConstructor
@Builder
@Data
@Entity
@NoArgsConstructor
public class Endereco {

    private String cep;
    private String complemento;
}
