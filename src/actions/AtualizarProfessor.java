package actions;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Professor;

public class AtualizarProfessor {
	public static void main(String[] args) {
		
		//scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o ID do Professor a ser atualizado: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("escola");
		EntityManager manager = factory.createEntityManager();
		
		//procurar o professor no banco
		Professor prof = manager.find(Professor.class, id);
		
		//verificação da existência do professor
		if (prof == null) {
			System.out.println("Professor não encontrado no sistema!");
		} else {
			System.out.println("Novo nome: ");
			prof.setNome(sc.nextLine());
			
			System.out.println("Novo E-mail: ");
			prof.setEmail(sc.nextLine());
			
			System.out.println("Novo CPF: ");
			prof.setCpf(sc.nextLine());
			
			System.out.println("Nova Data de Nascimento: ");
			prof.setDataNascimento(sc.nextLine());;
			
			System.out.println("Novo Naturalidade: ");
			prof.setNaturalidade(sc.nextLine());;
			
			System.out.println("Novo Endereco: ");
			prof.setEndereco(sc.nextLine());;
			
			manager.getTransaction().begin();
			manager.merge(prof);
			manager.getTransaction().commit();
			
			System.out.println("Professor Alterado!");
		}
		manager.close();
		factory.close();
		sc.close();
		
	}

}
