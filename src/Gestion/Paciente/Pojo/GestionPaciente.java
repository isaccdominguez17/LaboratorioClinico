/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestion.Paciente.Pojo;

import java.sql.SQLDataException;
import Clases.Pojo.Paciente;
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
public class GestionPaciente implements IGestion {
    //
    ResultSet rs= null;
    
    private Paciente objPaciente;
    public Paciente getObjPaciente() {
        return objPaciente;
    }
    public void setObjPaciente(Paciente objPaciente) {
        this.objPaciente = objPaciente;
    }

    public GestionPaciente() {
        objPaciente = new Paciente(0, "", "","","","");
//        Conexion.setUsuario(" ");
//        Conexion.setClave(" ");
        Conexion.setCadenaConexion("jdbc:derby://localhost:1527/Laboratorio");
    }
    //
    @Override
    public void insertar() throws SQLException {
     try
        {
            Conexion.GetInstancia().conectar();
            Conexion.GetInstancia().ejecutar(
                    "INSERT INTO PACIENTE(CEDULA, NOMBRE, FECHA_NACIMIENTO, SEXO, TELEFONO, DIRECCION)"
                    + " VALUES ("+objPaciente.getCedula()+",'"+objPaciente.getNombre()+"','"+objPaciente.getFecha()+"','"+objPaciente.getSexo()+"','"+objPaciente.getTelefono()+"','"+objPaciente.getDireccion()+"')");
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
            Conexion.GetInstancia().ejecutar("DELETE FROM PACIENTE WHERE CEDULA="+objPaciente.getCedula());
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
            Conexion.GetInstancia().ejecutar("UPDATE PACIENTE SET "
                    + "NOMBRE='"+objPaciente.getNombre()+"',FECHA_NACIMIENTO='"+objPaciente.getFecha()+"', SEXO='"+objPaciente.getSexo()+"', TELEFONO='"+objPaciente.getTelefono()+"', DIRECCION='"+objPaciente.getDireccion()+"'    WHERE CEDULA="+objPaciente.getCedula());
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
            rs = Conexion.GetInstancia().consultar("SELECT * FROM PACIENTE where CEDULA="+objPaciente.getCedula());
            rs.next();
            //while(rs.next())
            //{
                this.objPaciente.setCedula(Integer.parseInt(rs.getString(1)));
                this.objPaciente.setNombre(rs.getString(2));
                this.objPaciente.setFecha(rs.getString(3));
                this.objPaciente.setSexo(rs.getString(4));
                this.objPaciente.setTelefono(rs.getString(5));
                this.objPaciente.setDireccion(rs.getString(6));
                
            //}
        }
        catch(SQLException ex){
            throw ex;
        }
        finally{Conexion.GetInstancia().desconectar();}
    }
    
}
