package actions;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Professor;

public class InserirProfessor {
	public static void main(String[] args) {
		
		//scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("E-mail: ");
		String email = sc.nextLine();
		
		System.out.print("CPF: ");
		String cpf = sc.nextLine();
		
		System.out.print("Data de Nascimento: ");
		String data = sc.nextLine();
		
		System.out.print("Naturalidade: ");
		String natu = sc.nextLine();
		
		System.out.print("Endereco: ");
		String end = sc.nextLine();
		
		Professor prof = new Professor(nome, email, cpf, data, natu, end);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("escola");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(prof);
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
		sc.close();
		
		//confimação de cadastro
		System.out.println("Professor cadastrado com sucesso!");
	}
}
