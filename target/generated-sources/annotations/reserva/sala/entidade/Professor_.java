package reserva.sala.entidade;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import reserva.sala.entidade.Aula;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-11T21:07:40")
@StaticMetamodel(Professor.class)
public class Professor_ extends AbstractEntity_ {

    public static volatile SingularAttribute<Professor, String> senha;
    public static volatile SingularAttribute<Professor, Integer> siape;
    public static volatile ListAttribute<Professor, Aula> aulas;
    public static volatile SingularAttribute<Professor, String> nome;

}