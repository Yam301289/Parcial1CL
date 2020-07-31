<%-- 
    Document   : ventanaUsuario
    Created on : 10/11/2014, 02:36:00 AM
    Author     : Oscar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido
            <jsp:useBean id="validUsuario" scope="session" class="webservices.Empleado" />
            <jsp:getProperty name="validUsuario" property="nombres" />
        </h1>
        
        REGISTRAR USUARIO
        <form action="SRegistrar" method="POST">
            <table border="0">

                <tbody>
                    <tr>
                        <td>DNI:</td>
                        <td><input type="text" name="txtDni" value="" /></td>
                    </tr>
                    <tr>
                        <td>CONTRASEÑA:</td>
                        <td><input type="password" name="txtPass" value="" /></td>
                    </tr>
                    <tr>
                        <td>APELLIDOS</td>
                        <td><input type="text" name="txtApellidos" value="" /></td>
                    </tr>
                    <tr>
                        <td>NOMBRES:</td>
                        <td><input type="text" name="txtNombres" value="" /></td>
                    </tr>
                    <tr>
                        <td>PRIVILEGIO</td>
                        <td><select name="cboPrivilegio">
                                <option value="Gerente">GERENTE</option>
                                <option value="Recepcion">RECEPCIÓN</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center"><input type="submit" value="REGISTRAR" name="btnRegistrar" /></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
