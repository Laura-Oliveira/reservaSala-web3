package reserva.sala.servico;

import reserva.sala.entidade.Professor;
import java.util.List;
import javax.ejb.Stateless;

@Stateless
public class ProfessorService extends Service<Professor> {
    
    public List<Professor> listar() 
    {
        return entityManager.createQuery("SELECT p FROM Professor p").getResultList();
    }
           
}
