package actions;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Professor;

public class RemoverProfessor {
	public static void main(String[] args) {
		
		//scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o ID do Professor a ser removido: ");
		int id = sc.nextInt();
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("escola");
		EntityManager manager = factory.createEntityManager();
		
		//procurar o professor no banco
		Professor prof = manager.find(Professor.class, id);
		
		//verificação de existência de professor 
		
		if (prof == null) {
			System.out.println("Professor não encontrado no sistema!");
		} else {
			manager.getTransaction().begin();
			manager.remove(prof);
			manager.getTransaction().commit();
			System.out.println("Professor removido do sistema!");
		}
		
		manager.close();
		factory.close();
		sc.close();
	}

}
