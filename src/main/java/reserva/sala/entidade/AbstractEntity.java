/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reserva.sala.entidade;

import java.io.Serializable;

import javax.persistence.*;
/**
 *
 * @author lucas
 */

@MappedSuperclass
public abstract class AbstractEntity<ID extends Serializable> implements Serializable {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private ID id;

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		//Adicionar o <?> para evitar o lançamento de exceção (a exclamação>
		AbstractEntity<?> other = (AbstractEntity<?>) obj;
		
		if (id == null) {
			
			if (other.id != null)
				return false;
			
		} else if (!id.equals(other.id))
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		return "id=" + id;
	}

}
