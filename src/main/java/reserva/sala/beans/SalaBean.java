/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reserva.sala.beans;

import reserva.sala.entidade.Sala;
import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;


@ManagedBean
@ApplicationScoped
public class SalaBean 
{
    
 //   @EJB
 //   private SalaService salaService;
    
    private Sala salaBean;
    
    public SalaBean() 
    {
        salaBean = new Sala();
    }
    
 /*   public void adicionar() {
        salaService.add(sala);
    } */

    public Sala getSala() 
    {
        return salaBean;
    }

    public void setSala(Sala sala) 
    {
        this.salaBean = sala;
    }
    
    public void adicionar()
    {
        //
    }
}
