package reserva.sala.beans;

import reserva.sala.entidade.Equipamento;
import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import reserva.sala.servico.EquipamentoService;

@ManagedBean
@ApplicationScoped
public class EquipamentoBean 
{
    
    @EJB
    private EquipamentoService equipamentoService;
    
    private Equipamento equipamentoBean;
    
    public EquipamentoBean() 
    {
        equipamentoBean = new Equipamento();
    }
    
    public void adicionar() 
    {
        equipamentoService.persistence(equipamentoBean);
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
        this.equipamentoService.persistence(this.equipamentoBean);
        this.equipamentoBean = new Equipamento();
        this.equipamentoBean = null; 
    } 
    
}
