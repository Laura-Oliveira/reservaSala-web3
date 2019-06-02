/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reserva.sala.beans;

import reserva.sala.entidade.Equipamento;
import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class EquipamentoBean 
{
    
 //   @EJB
  //  private EquipamentoService equipamentoService;
    
    private Equipamento equipamentoBean;
    
    public EquipamentoBean() 
    {
        equipamentoBean = new Equipamento();
    }
    
    public void adicionar() 
    {
        //equipamentoService.add(equipamento);
    } 

    public Equipamento getEquipamento() 
    {
        return equipamentoBean;
    }

    public void setEquipamento(Equipamento equipamento) 
    {
        this.equipamentoBean = equipamento;
    }
    
    public void salvar()
    {
        
    }
    
}
