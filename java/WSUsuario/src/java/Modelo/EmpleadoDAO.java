/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;
import java.sql.*;
/**
 *
 * @author Oscar
 */
public class EmpleadoDAO {
    Conexion conexion;
    
    public EmpleadoDAO(){
        conexion = new Conexion();
    }


    public Empleado verificaUsuario(String ci, String contraseña, String privilegio){
        Empleado empleado=null;
        Connection accesoDB = conexion.getConexion();
        try {
            
            PreparedStatement ps = accesoDB.prepareStatement("select * from empleado where ci=? and pass=? and privilegio=?");
            ps.setString(1, ci);
            ps.setString(2, contraseña);
            ps.setString(3, privilegio);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
               empleado = new Empleado();
               empleado.setCi(rs.getString(1));
               empleado.setContraseña(rs.getString(2));
               empleado.setApellidos(rs.getString(3));
               empleado.setNombres(rs.getString(4));
               empleado.setPrivilegio(rs.getString(5));
               return empleado;
            }
        } catch (Exception e) {
        }
        return empleado;
    }
    
    public String registraUsuario(String ci, String pass, String apellidos, String nombres, String privilegio){
        String respuesta=null;
        Connection accesoDB = conexion.getConexion();
        try {
            PreparedStatement ps = accesoDB.prepareStatement("insert into empleado(ci,pass,apellidos,nombres,privilegio) values (?,?,?,?,?)");
            ps.setString(1, ci);
            ps.setString(2, pass);
            ps.setString(3, apellidos);
            ps.setString(4, nombres);
            ps.setString(5, privilegio);
            
            int rs = ps.executeUpdate();
            
            if(rs>0){
                respuesta="Registro exitoso.";
            }
        } catch (Exception e) {
        }
        return respuesta;
    }
}
