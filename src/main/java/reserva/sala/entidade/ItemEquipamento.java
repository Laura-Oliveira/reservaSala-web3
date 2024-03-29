package reserva.sala.entidade;

import javax.persistence.*;

@Entity
@Table(name = "tb_item_quantidade")
public class ItemEquipamento extends AbstractEntity<Long> {
    
    @OneToOne(mappedBy = "item")
    private Equipamento equipamento;
    
    @Column(name = "quantidade_usada")
    private Integer quantidadeUsada;
    
    @ManyToOne
    @JoinColumn(name = "item_aula")
    private Aula aula;

    public Integer getQuantidadeUsada() {
        return quantidadeUsada;
    }

    public void setQuantidadeUsada(Integer quantidadeUsada) {
        this.quantidadeUsada = quantidadeUsada;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }
    
    
}
