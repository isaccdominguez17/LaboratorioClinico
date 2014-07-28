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
public class Examen {

    public Examen(int IdExamen, int IdFormatoExamen) {
        this.IdExamen = IdExamen;
        this.IdFormatoExamen = IdFormatoExamen;
    }
    
    
    
    
    
    private int IdExamen;

    /**
     * Get the value of IdExamen
     *
     * @return the value of IdExamen
     */
    public int getIdExamen() {
        return IdExamen;
    }

    /**
     * Set the value of IdExamen
     *
     * @param IdExamen new value of IdExamen
     */
    public void setIdExamen(int IdExamen) {
        this.IdExamen = IdExamen;
    }

    private int IdFormatoExamen;

    /**
     * Get the value of IdFormatoExamen
     *
     * @return the value of IdFormatoExamen
     */
    public int getIdFormatoExamen() {
        return IdFormatoExamen;
    }

    /**
     * Set the value of IdFormatoExamen
     *
     * @param IdFormatoExamen new value of IdFormatoExamen
     */
    public void setIdFormatoExamen(int IdFormatoExamen) {
        this.IdFormatoExamen = IdFormatoExamen;
    }

}
