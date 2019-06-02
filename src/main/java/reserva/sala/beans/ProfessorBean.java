/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reserva.sala.beans;

import reserva.sala.entidade.Professor;
import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class ProfessorBean 
{
    
   // @EJB
  //  private ProfessorService professorService;
    
    private Professor professorBean;
    
    public ProfessorBean() 
    {
        professorBean = new Professor();
    }
    
    public void adicionar() 
    {
       // professorService.add(professor);
    } 

    public Professor getProfessor() 
    {
        return professorBean;
    }

    public void setProfessor(Professor professor)
    {
        this.professorBean = professor;
    }
    
    public void salvar()
    {
       /* this.professorService.persistence(this.professorBean);
        this.professorBean = new Professor();
        addMessage("Usuario cadastrado com sucesso!");
        this.professorBean = null; */
    } 
    
}
