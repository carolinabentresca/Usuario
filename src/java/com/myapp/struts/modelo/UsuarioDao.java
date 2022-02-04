package com.myapp.struts.modelo;

import com.myapp.struts.form.UsuarioForm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDao extends Conexion {

    PreparedStatement ps;
    ResultSet rs;
    Connection con = null;

    //Registrar Usuario
    public UsuarioForm registrar(UsuarioForm obj) {
        UsuarioForm bean = null;
        String sql = "insert into usuario(usuario,email,password)values(?,?,?)";
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, obj.getUsuario());
            ps.setString(2, obj.getEmail());
            ps.setString(3, obj.getPassword());
            bean = new UsuarioForm();
            ps.executeUpdate();
            con.close();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return bean;
    }

    //Validar Usuario
    public UsuarioForm validar(UsuarioForm obj) {
        UsuarioForm bean = null;
        String sql = "select * from usuario where usuario = ? and password = ?";
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, obj.getUsuario());
            ps.setString(2, obj.getPassword());
            rs = ps.executeQuery();
            if (rs.next()) {
                bean = new UsuarioForm();
                bean.setUsuario(rs.getString("usuario"));
                bean.setPassword(rs.getString("password"));
            }
            ps.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return bean;
    }

}
