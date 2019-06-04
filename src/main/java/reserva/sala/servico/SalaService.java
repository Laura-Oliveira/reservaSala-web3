package reserva.sala.servico;

import reserva.sala.entidade.Sala;
import java.util.List;
import javax.ejb.Stateless;

@Stateless
public class SalaService extends Service<Sala> 
{
    
    public List<Sala> listar() 
    {
        return entityManager.createQuery("SELECT s FROM Sala s").getResultList();
    }
}
