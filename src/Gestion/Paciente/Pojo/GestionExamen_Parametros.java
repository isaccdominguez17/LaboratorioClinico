/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestion.Paciente.Pojo;

import CapaDatos.Conexion;
import Clases.Pojo.Examen_Parametros;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Chris
 */
public class GestionExamen_Parametros implements IGestion {

    ResultSet rs= null;
    
    private Examen_Parametros objExamen_Parametros;

    /**
     * Get the value of objExamen_Parametros
     *
     * @return the value of objExamen_Parametros
     */
    public Examen_Parametros getObjExamen_Parametros() {
        return objExamen_Parametros;
    }

    /**
     * Set the value of objExamen_Parametros
     *
     * @param objExamen_Parametros new value of objExamen_Parametros
     */
    public void setObjExamen_Parametros(Examen_Parametros objExamen_Parametros) {
        this.objExamen_Parametros = objExamen_Parametros;
    }

    public GestionExamen_Parametros() {
        
        objExamen_Parametros= new Examen_Parametros(0,0);
        //        Conexion.setUsuario(" ");
//        Conexion.setClave(" ");
        Conexion.setCadenaConexion("jdbc:derby://localhost:1527/Laboratorio");
    }

    
    
    @Override
    public void insertar() throws SQLException {
        try
        {
            Conexion.GetInstancia().conectar();
            Conexion.GetInstancia().ejecutar(
                    "INSERT INTO EXAMEN_PARAMETROS(ID_FORMATO, ID_PARAMETROS)"
                    + " VALUES ("+objExamen_Parametros.getIdFormatoEx()+","+objExamen_Parametros.getIdParametros()+")");
        }
        catch(SQLException ex)
        {
           
         throw ex;
        }
        finally{Conexion.GetInstancia().desconectar();
    }
    }

    @Override
    public void eliminar() throws SQLException {
        try
        {
            Conexion.GetInstancia().conectar();
            Conexion.GetInstancia().ejecutar("DELETE FROM EXAMEN_PARAMETROS WHERE ID_FORMATO="+objExamen_Parametros.getIdFormatoEx());
        }
        catch(SQLException ex){
            throw ex;
        }
        finally{Conexion.GetInstancia().desconectar();}
    }

    @Override
    public void actualizar() throws SQLException {
       
    }

    @Override
    public void consultar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
