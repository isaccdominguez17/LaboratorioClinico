/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestion.Paciente.Pojo;

import CapaDatos.Conexion;
import Clases.Pojo.FormatoExamen;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Chris
 */
public class GestionFormatoEx implements IGestion{
    
     ResultSet rs= null;
    
    private FormatoExamen objFormato;
    public FormatoExamen getObjFormato() {
        return objFormato;
    }
    public void setObjFormato(FormatoExamen objFormato) {
        this.objFormato = objFormato;
    }

    public GestionFormatoEx() {
        objFormato =new FormatoExamen(0,"","",0);
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
                    "INSERT INTO FORMATO_EXAMEN(ID_FORMATO"
                            + ", NOMBRE_FORMATO, TIPO_MUESTRA,PRECIO)"
                    + " VALUES ("+objFormato.getIdFormatoEx()+",'"+objFormato.getNombreFormatoEx()+
                    "','"+objFormato.getTipoMuestra()+"',"+objFormato.getPrecio()+")");
            
            
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
            Conexion.GetInstancia().ejecutar("DELETE FROM FORMATO_EXAMEN WHERE ID_FORMATO="+objFormato.getIdFormatoEx());
            Conexion.GetInstancia().ejecutar("DELETE FROM EXAMEN_PARAMETROS WHERE ID_FORMATO="+objFormato.getIdFormatoEx());
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
            Conexion.GetInstancia().ejecutar("UPDATE FORMATO_EXAMEN SET "
                    + "NOMBRE_FORMATO='"+objFormato.getNombreFormatoEx()+"',TIPO_MUESTRA='"+objFormato.getTipoMuestra()+"',PRECIO="+objFormato.getPrecio()+" WHERE ID_FORMATO="+objFormato.getIdFormatoEx());
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
            rs = Conexion.GetInstancia().consultar("SELECT * FROM FORMATO_EXAMEN where ID_FORMATO="+objFormato.getIdFormatoEx());
            rs.next();
            //while(rs.next())
            //{
                this.objFormato.setIdFormatoEx(Integer.parseInt(rs.getString(1)));
                this.objFormato.setNombreFormatoEx(rs.getString(2));
                this.objFormato.setTipoMuestra(rs.getString(3));
                this.objFormato.setPrecio(Double.parseDouble(rs.getString(4)));
            //}
        }
        catch(SQLException ex){
            throw ex;
        }
        finally{Conexion.GetInstancia().desconectar();}
    }
    
}
