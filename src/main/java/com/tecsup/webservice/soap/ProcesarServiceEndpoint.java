/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.webservice.soap;
import javax.jws.WebMethod;
import javax.jws.WebService;
import org.springframework.stereotype.Component;
/**
 *
 * @author alumno
 */
@Component
@WebService(serviceName = "procesarService")
public class ProcesarServiceEndpoint {

    @WebMethod
    public String doObservacion(String observacion) {
        return "Recibido: " + observacion;
    }

    @WebMethod
    public String sumar(int x, int y) {        
        return Integer.toString(x+y);
    }
}
