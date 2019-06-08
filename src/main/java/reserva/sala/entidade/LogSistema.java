package reserva.sala.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LogSistema 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private String descricao;
    private String nomeAgente;
    private long dataHora;

    public int getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }

    public String getDescricao() 
    {
        return descricao;
    }

    public void setDescricao(String descricao) 
    {
        this.descricao = descricao;
    }

    public String getNomeAgente() 
    {
        return nomeAgente;
    }

    public void setNomeAgente(String nomeAgente) 
    {
        this.nomeAgente = nomeAgente;
    }

    public long getDataHora() 
    {
        return dataHora;
    }

    public void setDataHora(long dataHora) 
    {
        this.dataHora = dataHora;
    }
}
