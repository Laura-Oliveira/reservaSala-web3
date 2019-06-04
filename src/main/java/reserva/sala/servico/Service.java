package reserva.sala.servico;

import javax.ejb.TransactionAttribute;
import static javax.ejb.TransactionAttributeType.SUPPORTS;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Transactional
public class Service<T> 
{

    @PersistenceContext
    protected EntityManager entityManager;

    /* Valida se já existe uma instancia dessa entidade */
    @TransactionAttribute(SUPPORTS)
    public boolean exist(@NotNull T entidade) 
    {
        return true;
    }

    public void persistence(@Valid T entidade) 
    {
        if(!(exist(entidade)))
        entityManager.persist(entidade);
    }

    public void remover(@Valid T entidade) 
    {
        if(!(exist(entidade)))
        {
            entityManager.merge(entidade);
            entityManager.remove(entidade);
            entityManager.flush();
        }
        
    }

    public void atualizar(@Valid T entidade) 
    {
       entityManager.merge(entidade);
    }
}
