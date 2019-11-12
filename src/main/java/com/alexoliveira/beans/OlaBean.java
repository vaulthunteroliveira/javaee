package com.alexoliveira.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputText;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.alexoliveira.model.Cidades;

@Named
@ViewScoped
public class OlaBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<String> arr = Arrays.asList("Real Madrid", "Barcelona", "Milan");
	private String nome;
	private List<String> nomes = new ArrayList<>(); 
	
	private HtmlInputText inputNome;
	private HtmlCommandButton btnAdicionar;
	private String timeFavorito;
	
	
	public void adicionar() {
		this.nomes.add(nome);
		
		if(this.nomes.size() > 3) {
			this.inputNome.setDisabled(true);
			this.btnAdicionar.setDisabled(true);
			this.btnAdicionar.setValue("limite de nomes atingido.");
		}
	}
	
	public String irParaTelaSobre() {
		return "sobre";
	}
	
	public String irParaTelaFormulario() {
		return "formulario";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void teste() {
		System.out.println(this.nome);
	}

	public List<String> getArr() {
		return arr;
	}

	public void setArr(List<String> arr) {
		this.arr = arr;
	}

	public List<String> getNomes() {
		return nomes;
	}

	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}

	public HtmlInputText getInputNome() {
		return inputNome;
	}

	public void setInputNome(HtmlInputText inputNome) {
		this.inputNome = inputNome;
	}

	public HtmlCommandButton getBtnAdicionar() {
		return btnAdicionar;
	}

	public void setBtnAdicionar(HtmlCommandButton btnAdicionar) {
		this.btnAdicionar = btnAdicionar;
	}

	public String getTimeFavorito() {
		return timeFavorito;
	}

	public void setTimeFavorito(String timeFavorito) {
		this.timeFavorito = timeFavorito;
	}
	

	
	
	
	
//	ed tome de souza em frente hiperposto 109 anderson ou andre amanhã 9
	
	

}
