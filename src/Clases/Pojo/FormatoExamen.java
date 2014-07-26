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
public class FormatoExamen {

    public FormatoExamen(int IdFormatoEx, String NombreFormatoEx, String TipoMuestra, double Precio) {
        this.IdFormatoEx = IdFormatoEx;
        this.NombreFormatoEx = NombreFormatoEx;
        this.TipoMuestra = TipoMuestra;
        this.Precio = Precio;
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
  
    
        private String NombreFormatoEx;

    /**
     * Get the value of NombreFormatoEx
     *
     * @return the value of NombreFormatoEx
     */
    public String getNombreFormatoEx() {
        return NombreFormatoEx;
    }

    /**
     * Set the value of NombreFormatoEx
     *
     * @param NombreFormatoEx new value of NombreFormatoEx
     */
    public void setNombreFormatoEx(String NombreFormatoEx) {
        this.NombreFormatoEx = NombreFormatoEx;
    }
    
        private String TipoMuestra;

    /**
     * Get the value of TipoMuestra
     *
     * @return the value of TipoMuestra
     */
    public String getTipoMuestra() {
        return TipoMuestra;
    }

    /**
     * Set the value of TipoMuestra
     *
     * @param TipoMuestra new value of TipoMuestra
     */
    public void setTipoMuestra(String TipoMuestra) {
        this.TipoMuestra = TipoMuestra;
    }

    private double Precio;

    /**
     * Get the value of Precio
     *
     * @return the value of Precio
     */
    public double getPrecio() {
        return Precio;
    }

    /**
     * Set the value of Precio
     *
     * @param Precio new value of Precio
     */
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

}
