/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reserva.sala.entidade;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author laura
 */

@NamedQueries(
        
        { @NamedQuery(name = "TodasSalas",
                      query = "SELECT s FROM Sala s"),
          
          @NamedQuery(name = "SalasPorLocalizacao",
                      query = "SELECT s FROM Sala s WHERE s.localizacao = :localizacao"),
          
          @NamedQuery(name = "SalasPorCapacidade",
                      query = "SELECT s FROM Sala s WHERE s.capacidade = :capacidade"),
          
          @NamedQuery(name = "SalasPorTipo",
                      query = "SELECT s FROM Sala s WHERE s.tipo = :tipo"),
          
          @NamedQuery(name = "SalasPorNome",
                      query = "SELECT s FROM Sala s WHERE s.nome = :nome"),
          
        }
)
@Entity
@Table(name = "tb_sala")
public class Sala extends AbstractEntity<Long> {
    
    @NotNull(message = "A sala deve ter nome")
    @Column(name = "nome")
    private String nome;
    
    @NotNull(message = "Informar localização")
    @Column(name = "localizacao")
    private String localizacao;
    
    @NotNull(message = "A sala deve ter uma capacidade")
    @Column(name = "capacidade")
    private Integer capacidade;
    
    @NotNull(message = "Informar o tipo da sala")
    @Column(name = "tipo")
    private String tipo;
    
    @OneToMany(mappedBy = "sala")
    private List<Aula> aulas;
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }
    
}
