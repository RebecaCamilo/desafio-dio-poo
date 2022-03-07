package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Java");
		curso1.setDescricao("Descri��o curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("JavaScript");
		curso2.setDescricao("Descri��o curso js");
		curso2.setCargaHoraria(10);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria java");
		mentoria.setDescricao("Descri��o mentoria Java");
		mentoria.setData(LocalDate.now());
		
		/*
		 * System.out.println(curso1); 
		 * System.out.println(curso2);
		 * System.out.println(mentoria);
		 */
		
		Bootcamp bootcampJava = new Bootcamp();
		bootcampJava.setNome("Bootcamp Java Developer");
		bootcampJava.setDescricao("Descri��o do Bootcamp Java Developer");
		bootcampJava.getConteudos().add(curso1);
		bootcampJava.getConteudos().add(curso2);
		bootcampJava.getConteudos().add(mentoria);
		
		Dev dev1 = new Dev();
		dev1.setNome("Maria");
		dev1.inscreverBootcamp(bootcampJava);
		System.out.println("Conteudos inscritos Maria: " + dev1.getConteudosInscritos());
		dev1.progredir();
		System.out.println("Conteudos inscritos Maria: " + dev1.getConteudosInscritos());
		System.out.println("Conteudos inscritos Maria: " + dev1.getConteudosConcluidos());
		System.out.println("XP: " + dev1.calcularTotalXp());
		
		Dev dev2 = new Dev();
		dev2.setNome("Jos�");
		dev2.inscreverBootcamp(bootcampJava);
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();
		System.out.println("Conteudos inscritos Jos�: " + dev2.getConteudosInscritos());
		System.out.println("XP: " + dev2.calcularTotalXp());
		
		
		

	}

}
