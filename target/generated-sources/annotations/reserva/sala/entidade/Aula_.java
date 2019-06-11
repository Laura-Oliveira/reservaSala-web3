package reserva.sala.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import reserva.sala.entidade.ItemEquipamento;
import reserva.sala.entidade.Professor;
import reserva.sala.entidade.Sala;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-11T20:13:40")
@StaticMetamodel(Aula.class)
public class Aula_ extends AbstractEntity_ {

    public static volatile ListAttribute<Aula, ItemEquipamento> itens;
    public static volatile SingularAttribute<Aula, Professor> professor;
    public static volatile SingularAttribute<Aula, Date> data;
    public static volatile SingularAttribute<Aula, Integer> hora;
    public static volatile SingularAttribute<Aula, Sala> sala;
    public static volatile SingularAttribute<Aula, Integer> duracao;

}