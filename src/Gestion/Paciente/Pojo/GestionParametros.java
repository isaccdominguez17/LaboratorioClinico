/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestion.Paciente.Pojo;

import java.sql.SQLDataException;
import Clases.Pojo.Parametros;
import CapaDatos.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLDataException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author isaccandres
 */
public class GestionParametros  implements IGestion
{

    ResultSet rs= null;
    
    private Parametros objParametros;
    public Parametros getObjParametros() {
        return objParametros;
    }
    public void setObjCalzado(Parametros objParametros) {
        this.objParametros = objParametros;
    }

    public GestionParametros() {
        objParametros = new Parametros(0, "", "");
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
                    "INSERT INTO PARAMETROS(IDPARAMETROS, DESCRIPCION, UNIDAD)"
                    + " VALUES ("+objParametros.getIdParametros()+",'"+objParametros.getDescripcion()+
                    "','"+objParametros.getUnidad()+"')");
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
            Conexion.GetInstancia().ejecutar("DELETE FROM PARAMETROS WHERE IDPARAMETROS="+objParametros.getIdParametros());
        }
        catch(SQLException ex){
            throw ex;
        }
        finally{Conexion.GetInstancia().desconectar();}
    }

    @Override
    public void actualizar() throws SQLException {
        try
        {
            Conexion.GetInstancia().conectar();
            Conexion.GetInstancia().ejecutar("UPDATE PARAMETROS SET "
                    + "DESCRIPCION='"+objParametros.getDescripcion()+"',UNIDAD='"+objParametros.getUnidad()+"' WHERE IDPARAMETROS="+objParametros.getIdParametros());
        }
        catch(SQLException ex){
           throw ex;
        }
        finally{Conexion.GetInstancia().desconectar();}
    }

    @Override
    public void consultar() throws SQLException {
        try
        {
            Conexion.GetInstancia().conectar();
            rs = Conexion.GetInstancia().consultar("SELECT * FROM PARAMETROS where IDPARAMETROS="+objParametros.getIdParametros());
            rs.next();
            //while(rs.next())
            //{
                this.objParametros.setIdParametros(Integer.parseInt(rs.getString(1)));
                this.objParametros.setDescripcion(rs.getString(2));
                this.objParametros.setUnidad(rs.getString(3));
                
            //}
        }
        catch(SQLException ex){
            throw ex;
        }
        finally{Conexion.GetInstancia().desconectar();}
    }
    
    
    
}
