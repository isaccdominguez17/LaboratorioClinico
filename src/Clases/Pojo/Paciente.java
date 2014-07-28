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

        public int getCedula()
        {
            return Cedula;
        }
    
         public void setCedula(int Cedula) 
        {
                this.Cedula = Cedula;
        try
        {
            this.Cedula = Cedula;
        }
        catch(NumberFormatException ex)
                {
                   System.out.println("No Es Numero de Cedula"); 
                }
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
     
     public boolean validadorDeCedula(String cedula) 
     {
        boolean cedulaCorrecta = false;
        try {

        if (cedula.length() == 10) // ConstantesApp.LongitudCedula
        {
        int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
        if (tercerDigito < 6) {
        // Coeficientes de validación cédula
        // El decimo digito se lo considera dígito verificador
         int[] coefValCedula = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };
         int verificador = Integer.parseInt(cedula.substring(9,10));
         int suma = 0;
         int digito = 0;
        for (int i = 0; i < (cedula.length() - 1); i++) {
         digito = Integer.parseInt(cedula.substring(i, i + 1))* coefValCedula[i];
         suma += ((digito % 10) + (digito / 10));
        }

        if ((suma % 10 == 0) && (suma % 10 == verificador)) {
         cedulaCorrecta = true;
        }
        else if ((10 - (suma % 10)) == verificador) {
         cedulaCorrecta = true;
        } else {
         cedulaCorrecta = false;
        }
        } else {
        cedulaCorrecta = false;
        }
        } else {
        cedulaCorrecta = false;
        }
        } 
        catch (NumberFormatException nfe) 
        {
        cedulaCorrecta = false;
        } 
        
        catch (Exception err) 
        {
        System.out.println("Una excepcion ocurrio en el proceso de validadcion");
        cedulaCorrecta = false;
        }

        if (!cedulaCorrecta) 
        {
        System.out.println("La Cédula ingresada es Incorrecta");
        }
        return cedulaCorrecta;
    }
}