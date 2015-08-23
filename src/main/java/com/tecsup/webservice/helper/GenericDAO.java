/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.webservice.helper;

/**
 *
 * @author alumno
 */
import java.util.List;

public interface GenericDAO<T> {
public List<T> list();
public T get(Long id);
public void save(T t);
public void update(T t);
public void delete(T t);
}
