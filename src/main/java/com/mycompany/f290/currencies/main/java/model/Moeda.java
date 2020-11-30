package com.mycompany.f290.currencies.main.java.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Moeda {
    @JsonProperty("name")
    public String nome;
    
    @JsonProperty("buy")
    public Double compra;
    
    @JsonProperty("sell")
    public Double venda;
    
    @JsonProperty("variation")
    public Double variacao;

    @Override
    public String toString() {
        return "Moeda{" + "name=" + nome + ", buy=" + compra + ", sell=" + venda + ", variation=" + variacao + '}';
    }        
}

