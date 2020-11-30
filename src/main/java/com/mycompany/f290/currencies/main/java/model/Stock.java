/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.f290.currencies.main.java.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Eduardo Rocha
 */
public class Stock {
    
    @JsonProperty("name")
    public String nome;
    
    @JsonProperty("location")
    public Double localizacao;
    
    @JsonProperty("points")
    public Double pontos;
    
    @JsonProperty("variation")
    public Double varicao;

    @Override
    public String toString() {
        return "Stock{" + "nome=" + nome + ", localizacao=" + localizacao + ", pontos=" + pontos + ", varicao=" + varicao + '}';
    }
    
    

}
