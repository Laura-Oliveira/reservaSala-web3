package reserva.sala.servico;

import java.util.List;
import javax.ejb.TransactionAttribute;
import static javax.ejb.TransactionAttributeType.SUPPORTS;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import reserva.sala.entidade.Professor;

@Transactional
public class Service<T> {

    @PersistenceContext
    protected EntityManager entityManager;

    /* Valida se já existe uma instancia dessa entidade */
    @TransactionAttribute(SUPPORTS)
    public boolean dontExist(@NotNull T entidade) {
        return true;
    }

    public void persistence(@Valid T entidade) {
        if (dontExist(entidade)) {
            entityManager.persist(entidade);
        }
    }

    public void remover(@Valid T entidade) {
        if ((dontExist(entidade))) {
            entityManager.merge(entidade);
            entityManager.remove(entidade);
            entityManager.flush();
        }

    }

    public void atualizar(@Valid T entidade) {
        entityManager.merge(entidade);
    }
}
