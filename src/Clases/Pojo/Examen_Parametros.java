/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases.Pojo;

/**
 *
 * @author Chris
 */
public class Examen_Parametros {

    public Examen_Parametros(int IdFormatoEx, int IdParametros) {
        this.IdFormatoEx = IdFormatoEx;
        this.IdParametros = IdParametros;
    }
    
    
    
    
    
    
    private int IdFormatoEx;

    /**
     * Get the value of IdFormatoEx
     *
     * @return the value of IdFormatoEx
     */
    public int getIdFormatoEx() {
        return IdFormatoEx;
    }

    /**
     * Set the value of IdFormatoEx
     *
     * @param IdFormatoEx new value of IdFormatoEx
     */
    public void setIdFormatoEx(int IdFormatoEx) {
        this.IdFormatoEx = IdFormatoEx;
    }

    private int IdParametros;

    /**
     * Get the value of IdParametros
     *
     * @return the value of IdParametros
     */
    public int getIdParametros() {
        return IdParametros;
    }

    /**
     * Set the value of IdParametros
     *
     * @param IdParametros new value of IdParametros
     */
    public void setIdParametros(int IdParametros) {
        this.IdParametros = IdParametros;
    }

}
