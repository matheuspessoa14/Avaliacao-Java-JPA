# 📘 Sistema de Gerenciamento de Professores - Avaliação

Projeto desenvolvido como avaliação acadêmica na disciplina **Programação II** para prática de **Java**, **JPA**, **Hibernate** e **MariaDB**.  
O sistema permite realizar operações CRUD na entidade **Professor**, utilizando persistência com JPA e um modelo de pacotes organizado.

---

## 🧩 Tecnologias Utilizadas

- **Java 8+**
- **JPA - Hibernate**
- **XAMPP - MariaDB**
- **Maven** (se aplicável)
- **Eclipse**
- **JDBC MariaDB Driver**

---

## 📝 Descrição do Sistema

O projeto implementa um CRUD completo para gerenciamento da entidade **Professor**, com as seguintes funcionalidades:

| Funcionalidade | Classe |
|----------------|--------|
| Criar tabelas no banco | `GeraTabelas` |
| Inserir professor | `InserirProfessor` |
| Buscar professor por ID | `BuscarProfessor` |
| Atualizar dados | `AtualizarProfessor` |
| Remover professor | `RemoverProfessor` |

O sistema utiliza **EntityManager**, transações e mapeamento via anotações JPA.

---

## ▶️ Como Executar

- Configure o banco no MariaDB
- Ajuste o persistence.xml com usuário e senha
- **Execute:** apps/GeraTabelas.java
- Teste as operações CRUD usando as classes do pacote actions.

---

## 💡Possíveis Melhorias Futuras

- Interface gráfica (Swing/JavaFX)
- Validações e tratamento de exceções
- Logs com SLF4J
- Service Layer para separar regras de negócio
- Interface Web com Spring Boot

---

## 👤 Autor
**Matheus Pessoa Telles de Oliveira**

Projeto desenvolvido para fins acadêmicos
