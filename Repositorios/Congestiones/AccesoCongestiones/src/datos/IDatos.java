/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.List;
import objetos.Congestion;


/**
 *
 * @author Alejandro Galindo
 */
public interface IDatos {
    void crearCongestion(Congestion congestion) throws Exception;
    List<Congestion> obtenerCongestiones() throws Exception;
}