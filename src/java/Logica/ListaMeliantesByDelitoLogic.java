/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Negocios.Meliante;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistencia.MelianteDao;

/**
 *
 * @author alunos
 */
public class ListaMeliantesByDelitoLogic implements Logica{

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        // Monta a lista de meliantes
        List<Meliante> meliantes =MelianteDao.getListaOrderByDelito(); // Guarda a lista no request
        req.setAttribute("meliantes", meliantes);
        return "lista-meliantes-scriptlet.jsp";
    }
    
    
}
