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
    @Column(name = "tipoSala")
    private String tipoSala;
    
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
    
    public String getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    }
}
