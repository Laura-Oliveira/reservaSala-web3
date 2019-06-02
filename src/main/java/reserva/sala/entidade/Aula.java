/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reserva.sala.entidade;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author lucas
 */


@NamedQueries(
        
        { @NamedQuery(name = "TodasAulas",
                      query = "SELECT a FROM Aula a"),
          
          @NamedQuery(name = "AulasPorSala",
                      query = "SELECT a FROM Aula a WHERE a.sala = :aula"),
          
          @NamedQuery(name = "AulasPorDuracao",
                      query = "SELECT a FROM Aula a WHERE a.duracao = :duracao"),
          
          @NamedQuery(name = "AulasPorHora",
                      query = "SELECT a FROM Aula a WHERE a.hora = :hora"),
          
          @NamedQuery(name = "AulasPorData",
                      query = "SELECT a FROM Aula a WHERE a.data = :data"),
          
          @NamedQuery(name = "AulasPorProfessor",
                      query = "SELECT a FROM Aula a WHERE a.professor = :professor")
          
        }
)
@Entity
@Table(name = "tb_aula")
public class Aula extends AbstractEntity<Long> {
    
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    
    @Column(name = "hora")
    private Integer hora;
    
    @Column(name = "duracao")
    private Integer duracao;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "sala_aula")
    private Sala sala;
    
    @OneToMany(mappedBy = "aula")
    private List<ItemEquipamento> itens;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "professor_aula")
    private Professor professor;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public List<ItemEquipamento> getItens() {
        return itens;
    }

    public void setItens(List<ItemEquipamento> itens) {
        this.itens = itens;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    
    
}
