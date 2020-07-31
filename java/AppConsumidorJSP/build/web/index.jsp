<%-- 
    Document   : index
    Created on : 10/11/2014, 02:26:12 AM
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
        <h1 style="text-align: center;">LOGIN USUARIO</h1>
        <form action="SAutentificacion" method="POST">
            <table border="0" style="margin-left: 38%;">
                <tbody>
                    <tr>
                        <td>CI:</td>
                        <td><input type="text" name="txtCi" value="" /></td>
                    </tr>
                    <tr>
                        <td>CONTRASEÑA:</td>
                        <td><input type="password" name="txtPass" value="" /></td>
                    </tr>
                    <tr>
                        <td>PRIVILEGIO:</td>
                        <td><select name="cboPrivilegio">
                                <option value="Gerente">GERENTE</option>
                                <option value="Recepcion">RECEPCIÓN</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="INGRESAR" name="btnIngresar" /></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
