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
public class OrdenExamen {

    public OrdenExamen(int IdOrden, String FechaOrden, String Medico, int IdPaciente, double Subtotal, double Total, double Iva) {
        this.IdOrden = IdOrden;
        this.FechaOrden = FechaOrden;
        this.Medico = Medico;
        this.IdPaciente = IdPaciente;
        this.Subtotal = Subtotal;
        this.Total = Total;
        this.Iva = Iva;
    }
  
    
    private int IdOrden;

    /**
     * Get the value of IdOrden
     *
     * @return the value of IdOrden
     */
    public int getIdOrden() {
        return IdOrden;
    }

    /**
     * Set the value of IdOrden
     *
     * @param IdOrden new value of IdOrden
     */
    public void setIdOrden(int IdOrden) {
        this.IdOrden = IdOrden;
    }
  
    private String FechaOrden;

    /**
     * Get the value of FechaOrden
     *
     * @return the value of FechaOrden
     */
    public String getFechaOrden() {
        return FechaOrden;
    }

    /**
     * Set the value of FechaOrden
     *
     * @param FechaOrden new value of FechaOrden
     */
    public void setFechaOrden(String FechaOrden) {
        this.FechaOrden = FechaOrden;
    }

    private String Medico;

    /**
     * Get the value of Medico
     *
     * @return the value of Medico
     */
    public String getMedico() {
        return Medico;
    }

    /**
     * Set the value of Medico
     *
     * @param Medico new value of Medico
     */
    public void setMedico(String Medico) {
        this.Medico = Medico;
    }

    private int IdPaciente;

    /**
     * Get the value of IdPaciente
     *
     * @return the value of IdPaciente
     */
    public int getIdPaciente() {
        return IdPaciente;
    }

    /**
     * Set the value of IdPaciente
     *
     * @param IdPaciente new value of IdPaciente
     */
    public void setIdPaciente(int IdPaciente) {
        this.IdPaciente = IdPaciente;
    }

        private double Subtotal;

    /**
     * Get the value of Subtotal
     *
     * @return the value of Subtotal
     */
    public double getSubtotal() {
        return Subtotal;
    }

    /**
     * Set the value of Subtotal
     *
     * @param Subtotal new value of Subtotal
     */
    public void setSubtotal(double Subtotal) {
        this.Subtotal = Subtotal;
    }

       private double Total;

    /**
     * Get the value of Total
     *
     * @return the value of Total
     */
    public double getTotal() {
        return Total;
    }

    /**
     * Set the value of Total
     *
     * @param Total new value of Total
     */
    public void setTotal(double Total) {
        this.Total = Total;
    }
 
    private double Iva;

    /**
     * Get the value of Iva
     *
     * @return the value of Iva
     */
    public double getIva() {
        return Iva;
    }

    /**
     * Set the value of Iva
     *
     * @param Iva new value of Iva
     */
    public void setIva(double Iva) {
        this.Iva = Iva;
    }

    
}
