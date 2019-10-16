/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.publicacaoweb;

import java.util.Collection;

/**
 *
 * @author maycon
 */
public class ObjectUtil {
    /**
     * Verifica se objeto é nulo. Caso o objeto seja uma coleção ou uma String, verficiará ainda se
     * está vazio.
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static boolean isNullOrEmpty(final Object objeto) {

        if (isNull(objeto)) {
            
            return true;
            
        } else if (objeto instanceof String) {
            
            boolean preenchido = objeto instanceof String && (ObjectUtil.isNotNullOrEmpty((String) objeto));
            
            return !preenchido;
            
        } else {
            
            return false;
        }
    }
    
    /**
     * Verifica se objeto é nulo. Caso o objeto seja uma coleção ou uma String, verficiará ainda se
     * está vazio.
     */
    public static boolean isNotNullOrEmpty(final Object objeto) {

        return !isNullOrEmpty(objeto);
    }
    
    public static boolean isNotNullOrEmpty(final String s) {

        return isNotNull(s) && !s.trim().isEmpty();
    }
    
    public static boolean isNull(final Object objeto) {

        return !isNotNull(objeto);
    }
    
    public static boolean isNotNull(final Object objeto) {

        return null != objeto;
    }
    
}
