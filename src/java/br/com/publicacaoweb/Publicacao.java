/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.publicacaoweb;

import java.io.Serializable;

/**
 *
 * @author maycon
 */
public class Publicacao implements Serializable {
    
    private Long id;
    
    private String titulo;
    
    private String descricao;
    
    private Integer paginaInicial;
    
    private Integer paginaFinal;
    
    private Integer anoPublicacao;

    public Publicacao(Long id, String titulo, String descricao, Integer paginaInicial, Integer paginaFinal, Integer anoPublicacao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.paginaInicial = paginaInicial;
        this.paginaFinal = paginaFinal;
        this.anoPublicacao = anoPublicacao;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getPaginaInicial() {
        return paginaInicial;
    }

    public void setPaginaInicial(Integer paginaInicial) {
        this.paginaInicial = paginaInicial;
    }

    public Integer getPaginaFinal() {
        return paginaFinal;
    }

    public void setPaginaFinal(Integer paginaFinal) {
        this.paginaFinal = paginaFinal;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
    

    
    
    
}
