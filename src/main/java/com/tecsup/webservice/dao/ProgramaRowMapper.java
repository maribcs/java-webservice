/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.webservice.dao;

/**
 *
 * @author alumno
 */
import com.tecsup.webservice.model.Programa;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class ProgramaRowMapper implements RowMapper<Programa> {
    @Override
    public Programa mapRow(ResultSet rs, int i) throws SQLException {
        Programa programa = new Programa();
        programa.setId(rs.getLong(1));
        programa.setNombre(rs.getNString(2));
        programa.setDescripcion(rs.getString(3));
        return programa;
    }
    
}
