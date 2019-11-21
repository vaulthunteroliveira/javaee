package com.alexoliveira.beans;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.alexoliveira.model.Pessoa;

@Named
@ViewScoped
public class ValidatorBean implements Serializable {
	
	private Pessoa pessoa = new Pessoa();
	
	public void save() {
		System.out.println("salvando...");
		System.out.println(pessoa.getEmail());
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
	
}
