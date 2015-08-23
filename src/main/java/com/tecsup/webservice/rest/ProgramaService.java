/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.webservice.rest;

import com.tecsup.webservice.model.Programa;
import java.util.List;

/**
 *
 * @author alumno
 */
public interface ProgramaService {
    List<Programa> listPrograma();
    Programa get(Long id);
    void save(Programa programa);
    void delete(Programa programa);
}
