/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestion.Paciente.Pojo;

import java.sql.SQLDataException;

/**
 *
 * @author isaccandres
 */
public interface IGestion 
{
    public  void insertar() throws SQLDataException;
    public  void eliminar() throws SQLDataException; 
    public  void actualizar()   throws SQLDataException;
    public  void consultar() throws SQLDataException;
}
