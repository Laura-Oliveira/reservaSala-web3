/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reserva.sala.entidade;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


/*@NamedQueries(
        
        { @NamedQuery(name = "TodosEquipamentos",
                    query = "SELECT e FROM Equipamento e"),
        
          @NamedQuery(name = "EquipamentosPorTipo",
                    query = "SELECT e FROM Equipamento e WHERE e.tipo = :tipo"),
          
          @NamedQuery(name = "EquipamentosPorMarca",
                    query = "SELECT e FROM Equipamento e WHERE e.marca = :marca"),
          
          @NamedQuery(name = "EquipamentosPorNome",
                    query = "SELECT e FROM Equipamento e WHERE e.nome = :nome"),
        
        }
) */
@Entity
@Table(name = "tb_equipamento")
public class Equipamento extends AbstractEntity<Long>{
    
    @NotNull(message = "O equipamento deve ter nome")
    @Column(name = "nome")
    private String nome;
    
    @NotNull(message = "Informar marca do equipamento")
    @Column(name = "marca")
    private String marca;
    
    @NotNull(message = "O equipamento deve ter quantidade")
    @Column(name = "quantidadeEquipamento")
    private Integer quantidadeEquipamento;
    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "item_equipamento")
    private ItemEquipamento item;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public ItemEquipamento getItem() {
        return item;
    }

    public void setItem(ItemEquipamento item) {
        this.item = item;
    }
        
    public Integer getQuantidadeEquipamento() {
        return quantidadeEquipamento;
    }

    public void setQuantidadeEquipamento(Integer quantidadeEquipamento) {
        this.quantidadeEquipamento = quantidadeEquipamento;
    }
}