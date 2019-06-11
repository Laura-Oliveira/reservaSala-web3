package reserva.sala.entidade;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import reserva.sala.entidade.Aula;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-11T20:13:40")
@StaticMetamodel(Sala.class)
public class Sala_ extends AbstractEntity_ {

    public static volatile SingularAttribute<Sala, String> localizacao;
    public static volatile ListAttribute<Sala, Aula> aulas;
    public static volatile SingularAttribute<Sala, Integer> capacidade;
    public static volatile SingularAttribute<Sala, String> nome;
    public static volatile SingularAttribute<Sala, String> tipoSala;

}