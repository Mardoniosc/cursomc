package com.nelioalves.cursomc.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.nelioalves.cursomc.domain.Estado;

public class EstadoDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	
	@NotEmpty(message = "Preenchimento Obrigatório")
	@Length(min = 5, max = 40, message = "Tamanho deve ser entre 5 e 40 caracteres")
	private String nome;
	
	public EstadoDTO() {}

	
	
	public EstadoDTO(Estado obj) {
		super();
		id = obj.getId();
		nome = obj.getNome();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
