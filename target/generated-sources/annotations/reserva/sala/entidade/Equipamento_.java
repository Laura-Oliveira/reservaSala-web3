package reserva.sala.entidade;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import reserva.sala.entidade.ItemEquipamento;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-11T20:13:40")
@StaticMetamodel(Equipamento.class)
public class Equipamento_ extends AbstractEntity_ {

    public static volatile SingularAttribute<Equipamento, String> marca;
    public static volatile SingularAttribute<Equipamento, ItemEquipamento> item;
    public static volatile SingularAttribute<Equipamento, Integer> quantidadeEquipamento;
    public static volatile SingularAttribute<Equipamento, String> nome;

}