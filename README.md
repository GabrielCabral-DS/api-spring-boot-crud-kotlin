###  📝 CartCheck

API REST desenvolvida com Kotlin e Spring Boot para cadastro e gerenciamento de produtos. O sistema possui dois perfis de usuários:

ADMIN: Acesso total (CRUD completo)
FUNCIONÁRIO: Acesso somente leitura (listar e buscar produtos)

:large_blue_circle: [Linkedin](https://www.linkedin.com/in/gabriel-cabral-878482262/)

### ⚙️ Funcionalidades

- [x] Cadastro de produtos (nome, preço, quantidade, categoria)
- [x] Cadastro de usuarios (nome, email, senha, telefone, endereço, cidade, estado e roles[ADMIN, USER])
- [x] Atualização de produtos (apenas ADMIN)
- [x] Exclusão de produtos (apenas ADMIN)
- [X] Listagem de todos os produtos (admin e funcionário)
- [X] Busca de produto por ID ou nome (admin e funcionário)
- [X] Controle de acesso com Spring Security (roles ADMIN e FUNCIONARIO)
- [X] Documentação da API com Swagger/OpenAPI
- [X] Validações de entrada
- [X] Conversão entre entidade e DTO
---
### 🧱 Arquitetura do Projeto
- Arquitetura em camadas
- Controller: Recebe e responde requisições HTTP
- Service: Regras de negócio
- Repository: Acesso ao banco de dados
- Entity/DTO: Estrutura de dados
- Segurança baseada em roles (ADMIN, FUNCIONARIO)
- Injeção de dependência com Spring
---
### ⚙️ Tecnologias Utilizadas
- Linguagem: Kotlin
- Framework: Spring Boot
- Banco de dados: MySQL
- ORM: Spring Data JPA
- Segurança: Spring Security
- Mapeamento DTO: Request, Response
- Build: Maven
- Testes: JUnit 5, Mockito
- Documentação: Swagger/OpenAPI
- Controle de Versão: Git + GitHub

### 🗃️ Arquitetura do Banco de Dados
[<img alt="Modelo-ER" src="https://lh3.googleusercontent.com/pw/AP1GczOJ0Yh48RvyFyPTkmmgRv3qPRlQAL6WNPotdmBe8lxCQTjVjFhXnQ2jthnu80_pycT1rPeYt4E3MHWMCXkn5wYLrU3pGGqLYJc9GEmgB2ca5M9sp-XNXPwpKQWinqCvOJADCGdVz6NFOlqW7xBPJUYf=w945-h945-s-no-gm?authuser=0"/>](SpringBoot)

---
### ✅ Testes Automatizados CI/CD GitHub Actions!

#### 📸 Resultado dos testes executados com sucesso:

[<img alt="CI/CD" src=""/>](SpringBoot)


---
[<img alt="CI/CD" src=""/>](SpringBoot)
