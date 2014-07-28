/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestion.Paciente.Pojo;

import CapaDatos.Conexion;
import Clases.Pojo.Rangos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Chris
 */
public class GestionRangos implements IGestion {
    
    ResultSet rs= null;
    
    private Rangos objRangos;
    public Rangos getObjRangos() {
        return objRangos;
    }
    public void setObjRangos(Rangos objRangos) {
        this.objRangos = objRangos;
    }

    public GestionRangos() {
         objRangos = new Rangos(0, "",0,0,0,0,0);
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
                    "INSERT INTO RANGOS(ID_RANGO, SEXO, EDAD_MIN, EDAD_MAX, LIM_MIN,LIM_MAX,ID_PARAMETRO)"
                    + " VALUES ("+objRangos.getIdRango()+",'"+objRangos.getSexo()+
                    "',"+objRangos.getEdadMin()+","+objRangos.getEdadMax()+","+objRangos.getLimMin()+","+objRangos.getLimMax()+","+objRangos.getIdParametro()+")");
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
            Conexion.GetInstancia().ejecutar("DELETE FROM RANGOS WHERE ID_RANGO="+objRangos.getIdRango());
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
            Conexion.GetInstancia().ejecutar("UPDATE RANGOS SET "
                    + "SEXO='"+objRangos.getSexo()+"',EDAD_MIN="+objRangos.getEdadMin()+",EDAD_MAX="+objRangos.getEdadMax()+",LIM_MIN="+objRangos.getLimMin()+",LIM_MAX="+objRangos.getLimMax()+",ID_PARAMETRO="+objRangos.getIdParametro()+" WHERE ID_RANGO="+objRangos.getIdRango());
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
            rs = Conexion.GetInstancia().consultar("SELECT * FROM RANGOS where ID_RANGO="+objRangos.getIdRango());
            rs.next();
            //while(rs.next())
            //{
                this.objRangos.setIdRango(Integer.parseInt(rs.getString(1)));
                this.objRangos.setSexo(rs.getString(2));
                this.objRangos.setEdadMin(Integer.parseInt(rs.getString(3)));
                this.objRangos.setEdadMax(Integer.parseInt(rs.getString(4)));
                this.objRangos.setLimMin(Double.parseDouble(rs.getString(5)));
                this.objRangos.setLimMax(Double.parseDouble(rs.getString(6)));
                this.objRangos.setIdParametro(Integer.parseInt(rs.getString(7)));
               
            //}
        }
        
        
        catch(SQLException ex){
            throw ex;
        }
        finally{Conexion.GetInstancia().desconectar();}
     }
    
    
    List<Integer> ListaId = new ArrayList<Integer>();
    List<String> ListaNombres = new ArrayList<String>();
    
    
    
    public void ListaParametros()
        {
            
        try
        {
           
            
            Conexion.GetInstancia().conectar();
            rs = Conexion.GetInstancia().consultar("SELECT IDPARAMETROS, DESCRIPCION FROM  PARAMETROS" );
            rs.next();
            while(rs.next())
            {
                ListaId.add(Integer.parseInt(rs.getString(1)));
                ListaNombres.add(rs.getString(2));
                
               
            }
            
        }
        
        
        catch(SQLException ex){
            //throw ex;
        }
        finally{Conexion.GetInstancia().desconectar();}
        
        }
    
        private ArrayList<Integer> listaIds;

    /**
     * Get the value of listaIds
     *
     * @return the value of listaIds
     */
    public ArrayList<Integer> getListaIds() {
        return listaIds;
    }

    /**
     * Set the value of listaIds
     *
     * @param listaIds new value of listaIds
     */
    public void setListaIds() {
        try
        {
           
            
            Conexion.GetInstancia().conectar();
            rs = Conexion.GetInstancia().consultar("SELECT IDPARAMETROS FROM  PARAMETROS" );
            rs.next();
            int cont=0;
            while(rs.next())
            {
                
                //listaIds.add(Integer.parseInt(rs.getString(cont++)));
                listaIds.add(Integer.parseInt(rs.getString(cont++)));
                
                
                
               
            }
            
        }
        
        
        catch(SQLException ex){
            //throw ex;
        }
        finally{Conexion.GetInstancia().desconectar();}
        //this.listaIds = listaIds;
    }

}
