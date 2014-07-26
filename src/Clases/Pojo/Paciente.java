/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases.Pojo;

import java.util.List;
/**
 *
 * @author RamDel
 */
public class Paciente {
public Paciente(int Cedula, String Nombre, String Fecha, String Sexo
                , String Telefono, String Direccion) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Fecha = Fecha;
        this.Sexo = Sexo;
        this.Telefono = Telefono;
        this.Direccion = Direccion;

}
   
        public int Cedula; 

        public int getCedula(){
            return Cedula;
        }
     public void setCedula(int Cedula) {
     this.Cedula = Cedula;
    }
          public String Nombre; 
        public String getNombre(){
            return Nombre;
        }
     public void setNombre(String Nombre) {
     this.Nombre = Nombre;
    }
        
        public String Fecha; 
        public String getFecha(){
            return Fecha;
        }
        
     public void setFecha(String Fecha) {
     this.Fecha = Fecha;
    }
        
        public String Sexo; 
        public String getSexo(){
            return Sexo;
        }
        
     public void setSexo(String Sexo) {
     this.Sexo = Sexo;
    }
             
        public String Telefono; 
        public String getTelefono(){
            return Telefono;
        }
     public void setTelefono(String Telefono) {
     this.Telefono = Telefono;
    }
        
        public String Direccion; 
        public String getDireccion(){
            return Direccion;
        }
        
     public void setDireccion(String Direccion) {
     this.Direccion = Direccion;
    }
}