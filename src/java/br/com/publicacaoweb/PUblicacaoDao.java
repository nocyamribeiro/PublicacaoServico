/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.publicacaoweb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author maycon
 */
public class PUblicacaoDao {
    
    private static String dbURL = "jdbc:postgresql://localhost:5432/pub";
    
    private static Connection conn = null;
    
    private static void abrirConexao() {
        try{
            Class.forName("org.postgresql.Driver").newInstance();
            conn = DriverManager.getConnection(dbURL, "postgres", "123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void fecharConexao() {
        try{
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<Publicacao> pesquisaPublicacao(Integer codigo, String titulo, Integer paginaInicial, Integer paginaFinal, Integer anoPublicacao) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Publicacao> lista = new ArrayList<>();
        
        try {
            abrirConexao();
            StringBuilder sql = new StringBuilder("select * from publicacao where 1 = 1 ");
            boolean temCodigo = ObjectUtil.isNotNullOrEmpty(codigo);
            boolean temTitulo = ObjectUtil.isNotNullOrEmpty(titulo);
            boolean temPaginaInicial = ObjectUtil.isNotNullOrEmpty(paginaInicial);
            boolean temPaginaFinal = ObjectUtil.isNotNullOrEmpty(paginaFinal);
            boolean temAnoPublicacao = ObjectUtil.isNotNullOrEmpty(anoPublicacao);
            
            if(temCodigo) {
                sql.append(" and id = ? ");
            }
            
            if(temTitulo) {
                sql.append(" and upper(titulo) like ? ");
            }
            
            if(temPaginaInicial) {
                sql.append(" and pagina_inicial = ? ");
            }
            
            if(temPaginaFinal) {
                sql.append(" and pagina_final = ? ");
            }
            
            if(temAnoPublicacao) {
                sql.append(" and ano_publicacao = ? ");
            }
            
            int i = 1;         
            stmt = conn.prepareStatement(sql.toString());
            
            if(temCodigo) {
                stmt.setLong(i++, codigo);
            }
            
            if(temTitulo) {
               stmt.setString(i++, "%" + titulo.toUpperCase() +"%");
            }
            
            if(temPaginaInicial) {
                stmt.setInt(i++, paginaInicial);
            }
            
            if(temPaginaFinal) {
                stmt.setInt(i++, paginaFinal);
            }
            
            if(temAnoPublicacao) {
                stmt.setInt(i++, anoPublicacao);
            }
            
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                Publicacao p = new Publicacao(rs.getLong("id"),
                        rs.getString("titulo"), 
                        rs.getString("descricao"), 
                        rs.getInt("pagina_inicial"), 
                        rs.getInt("pagina_final"), 
                        rs.getInt("ano_publicacao"));
                
                lista.add(p);
            }
                        
        } catch (Exception ex) {
            Logger.getLogger(PUblicacaoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            fecharConexao();
        }
        
        return lista;
    }

  }
