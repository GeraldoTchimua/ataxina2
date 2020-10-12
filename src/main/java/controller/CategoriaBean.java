
package controller;

import dao.AssocTaxistaDAO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.model.SelectItem;
import modelo.AssocTaxist;


/**
 *
 * @author DGTALE
 */
@Named(value = "categoriaBean")
@RequestScoped
public class CategoriaBean {

    List<AssocTaxist> taxistas;
  
   

    AssocTaxistaDAO assocTaxistaDAO = new AssocTaxistaDAO();
    

    @PostConstruct
    public void inicizalizar() {
        taxistas = new ArrayList<>();
      }

    public List<AssocTaxist> getTaxistas() {
        return taxistas;
    }

    public void setTaxistas(List<AssocTaxist> taxistas) {
        this.taxistas = taxistas;
    }

   
    
    
    
    
    public List<SelectItem> getSelectTaxistas() {
        List<SelectItem> lista = new ArrayList<>();
        for (AssocTaxist a : assocTaxistaDAO.listaTodosAssicTaxista()) {
            lista.add(new SelectItem(a, a.getNome()));
        }
        return lista;
    }

  

   
}
