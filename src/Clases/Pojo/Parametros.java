/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases.Pojo;

import java.util.List;

/**
 *
 * @author isaccandres
 */
public class Parametros {

    public Parametros(int IdParametros, String Descripcion, String Unidad) {
        this.IdParametros = IdParametros;
        this.Descripcion = Descripcion;
        this.Unidad = Unidad;
        
    }
    
    
    
    
        public int IdParametros;

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

        public String Descripcion;

    /**
     * Get the value of Descripcion
     *
     * @return the value of Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * Set the value of Descripcion
     *
     * @param Descripcion new value of Descripcion
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

        private String Unidad;

    /**
     * Get the value of Unidad
     *
     * @return the value of Unidad
     */
    public String getUnidad() {
        return Unidad;
    }

    /**
     * Set the value of Unidad
     *
     * @param Unidad new value of Unidad
     */
    public void setUnidad(String Unidad) {
        this.Unidad = Unidad;
    }

    public List<Rangos> ListaRangos;

    /**
     * Get the value of ListaRangos
     *
     * @return the value of ListaRangos
     */
    public List<Rangos> getListaRangos() {
        return ListaRangos;
    }

    /**
     * Set the value of ListaRangos
     *
     * @param ListaRangos new value of ListaRangos
     */
    public void setListaRangos(List ListaRangos) {
        this.ListaRangos = ListaRangos;
    }

    
}
