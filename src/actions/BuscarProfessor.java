package actions;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Professor;

public class BuscarProfessor {

	public static void main(String[] args) {
		
		//scanner para buscar
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o ID do Professor a ser buscado: ");
		int id = sc.nextInt();
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("escola");
		EntityManager manager = factory.createEntityManager();
		
		//procurar o professor no banco
		Professor prof = manager.find(Professor.class, id);
		
		//verificação da existência do professor
		
		if (prof == null) {
			System.out.println("Professor não encontrado no sistema!");
		} else {
			System.out.println("Nome: " + prof.getNome());
			System.out.println("E-mail: " + prof.getEmail());
			System.out.println("CPF: " + prof.getCpf());
			System.out.println("Data de Nascimento: " + prof.getDataNascimento());
			System.out.println("Naturalidade: " + prof.getNaturalidade());
			System.out.println("Endereco: " + prof.getEndereco());
		}
		
		manager.close();
		factory.close();
		sc.close();
		
	}

}
