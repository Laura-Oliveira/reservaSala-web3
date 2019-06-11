package reserva.sala.entidade;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

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
