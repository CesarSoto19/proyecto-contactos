
package ModeloDAO;

import Config.Conexion;
import Intefaces.CRUD;
import Modelo.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO implements CRUD{
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Persona p=new Persona();
    
    @Override
    public List listar() {
        ArrayList<Persona>list=new ArrayList<>();
        String sql="select * from persona";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Persona per=new Persona();
                per.setId(rs.getInt("Id"));
                per.setNom(rs.getString("Nombre"));
                per.setTelo(rs.getString("Telefono personal"));
                per.setTelo(rs.getString("Telefono oficina"));
                per.setCp(rs.getString("Correo personal"));
                per.setCo(rs.getString("Correo oficina"));
                per.setFecha(rs.getString("Fecha de nacimiento"));
                list.add(per);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Persona list(int id) {
        String sql="select * from persona where Id="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                p.setId(rs.getInt("Id"));
                p.setNom(rs.getString("Nombre"));
                p.setTelp(rs.getString("Telefono personal"));
                p.setTelo(rs.getString("Telefono oficina"));
                p.setCp(rs.getString("Correo personal"));
                p.setCo(rs.getString("Correo oficina"));
                p.setFecha(rs.getString("Fecha de nacimiento"));
                
            }
        } catch (Exception e) {
        }
        return p;
    }

    @Override
    public boolean add(Persona per) {
       String sql="insert into persona(Nombre, Telefono personal, Telefono oficina, Correo personal, Correo oficina, Fecha de nacimiento )values('"+per.getNom()+"','"+per.getTelp()+"','"+per.getTelo()+"','"+per.getCp()+"','"+per.getCo()+"','"+per.getFecha();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
    }

    @Override
    public boolean edit(Persona per) {
        String sql="update persona set Nombre='"+per.getNom()+"',Nombres='"+per.getTelp()+"'where Id="+per.getTelo()+"','"+per.getCp()+"','"+per.getCo()+"','"+per.getFecha();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql="delete from persona where Id="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    
}
