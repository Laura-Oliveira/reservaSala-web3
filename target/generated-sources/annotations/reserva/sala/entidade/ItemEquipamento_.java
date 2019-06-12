package reserva.sala.entidade;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import reserva.sala.entidade.Aula;
import reserva.sala.entidade.Equipamento;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-11T21:07:40")
@StaticMetamodel(ItemEquipamento.class)
public class ItemEquipamento_ extends AbstractEntity_ {

    public static volatile SingularAttribute<ItemEquipamento, Aula> aula;
    public static volatile SingularAttribute<ItemEquipamento, Equipamento> equipamento;
    public static volatile SingularAttribute<ItemEquipamento, Integer> quantidadeUsada;

}