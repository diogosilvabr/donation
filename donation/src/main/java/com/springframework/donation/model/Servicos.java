package com.springframework.donation.model;

import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;

@Node("Servicos") // especifica que a classe Servicos é um nó
public class Servicos {

    @Id // define o atributo idServico como chave primária
    @GeneratedValue //  indica que o valor é gerado automaticamente
    private Long idServico;
    private String nomeServico;
    private String diaDispServico;
    private String horarioDispServico;
    private String descricaoServico;
    private String fotoServico;
    private String filaEsperaServico;
    private String statusServico;

    public Long getIdServico() {
        return idServico;
    }
    public void setIdServico(Long idServico) {
        this.idServico = idServico;
    }
    public String getNomeServico() {
        return nomeServico;
    }
    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }
    public String getDiaDispServico() {
        return diaDispServico;
    }
    public void setDiaDispServico(String diaDispServico) {
        this.diaDispServico = diaDispServico;
    }
    public String getHorarioDispServico() {
        return horarioDispServico;
    }
    public void setHorarioDispServico(String horarioDispServico) {
        this.horarioDispServico = horarioDispServico;
    }
    public String getDescricaoServico() {
        return descricaoServico;
    }
    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }
    public String getFotoServico() {
        return fotoServico;
    }
    public void setFotoServico(String fotoServico) {
        this.fotoServico = fotoServico;
    }
    public String getFilaEsperaServico() {
        return filaEsperaServico;
    }
    public void setFilaEsperaServico(String filaEsperaServico) {
        this.filaEsperaServico = filaEsperaServico;
    }
    public String getStatusServico() {
        return statusServico;
    }
    public void setStatusServico(String statusServico) {
        this.statusServico = statusServico;
    }
    
    
}
