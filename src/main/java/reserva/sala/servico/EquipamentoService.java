package reserva.sala.servico;

import reserva.sala.entidade.Equipamento;
import java.util.List;
import javax.ejb.Stateless;

@Stateless
public class EquipamentoService extends Service<Equipamento> 
{
    
    public List<Equipamento> listar() {
        return entityManager.createQuery("SELECT eq FROM Equipamento eq").getResultList();
    }
}
