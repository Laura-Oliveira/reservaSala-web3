/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reserva.sala.entidade;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamedQueries(
        
        { @NamedQuery(name = "TodosProfessor",
                      query = "SELECT p FROM Professor p"),
            
          @NamedQuery(name = "ProfessorPorSIAPE",
                      query = "SELECT p FROM Professor p WHERE p.siape = :siape"),
          
          @NamedQuery(name = "ProfessoresPorNome",
                      query = "SELECT p FROM Professor p WHERE p.nome = :nome"),
          
          @NamedQuery(name = "ProfessoresPorSenha",
                      query = "SELECT p FROM Professor p WHERE p.senha = :senha"),
        }
)
@Entity
@Table(name = "tb_professor")
public class Professor extends AbstractEntity<Long>{

	
    @NotNull(message = "O professor deve ter um nome.")
    @Column(name = "nm_professor")
    private String nome;

    @NotNull(message = "O professor deve possuir um SIAP")
    @Column(name = "nr_siape")
    private Integer siape;

    @NotNull
    @Column(name = "senha")
    private String senha;
    
    @OneToMany(mappedBy = "professor")
    private List<Aula> aulas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getSiape() {
        return siape;
    }

    public void setSiape(Integer siape) {
        this.siape = siape;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }
	
}
