package com.alexoliveira.helper;

import javax.persistence.Persistence;

public class CriarTabelas {
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("sistema-financeiro");
	}
}
