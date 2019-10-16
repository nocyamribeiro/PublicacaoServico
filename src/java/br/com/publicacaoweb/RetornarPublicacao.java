/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.publicacaoweb;

import java.util.Arrays;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


/**
 *
 * @author maycon
 */
@WebService(serviceName = "RetornarPublicacao")
public class RetornarPublicacao {

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "pesquisa")
    public List<Publicacao> pesquisa(
            @WebParam(name = "codigo") Integer codigo, 
            @WebParam(name = "titulo") String titulo, 
            @WebParam(name = "paginaInicial") Integer paginaInicial, 
            @WebParam(name = "paginaFinal") Integer paginaFinal, 
            @WebParam(name = "anoPublicacao") Integer anoPublicacao) {
        PUblicacaoDao dao = new PUblicacaoDao();
        return dao.pesquisaPublicacao(codigo, titulo, paginaInicial, paginaFinal, anoPublicacao);
        
    }
}
