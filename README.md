# Projeto Back-End: Gerenciamento de Usuários

## 📚 Contexto

Este projeto tem como objetivo a criação de uma API Back-End para gerenciar usuários, com base nos conceitos estudados em sala de aula. O Front-End está previamente estruturado e fornecido pelo professor, cabendo ao aluno ajustar a integração via JSON conforme o modelo de Back-End desenvolvido.

---

## 📝 Atividade

### 🔧 Entidade: Usuário

Crie uma entidade chamada `Usuário` com os seguintes atributos, definindo corretamente os tipos de dados e aplicando validações conforme necessário:

- `id` (identificador único)
- `nome`
- `sobrenome`
- `cpf`
- `email`
- `username`
- `senha`
- `dataNascimento`

---

### 🔁 Funcionalidades da API (Rotas)

Implemente as seguintes rotas para a manipulação da entidade Usuário:

1. **GET** `/usuarios`  
   Buscar todos os usuários.

2. **GET** `/usuarios/:id`  
   Buscar um usuário com base no seu ID.

3. **POST** `/usuarios`  
   Cadastrar um novo usuário com todos os dados obrigatórios.

4. **PUT** `/usuarios/:id`  
   Atualizar os dados de um usuário, **exceto** `username` e `senha`.

5. **DELETE** `/usuarios/:id`  
   Deletar um usuário.

6. **PATCH** `/usuarios/:id/senha`  
   Atualizar apenas a senha do usuário.

7. **GET** `/usuarios/nome/:nome`  
   Buscar usuários com base no nome.

8. **GET** `/usuarios/cpf/:cpf`  
   Buscar usuários com base no CPF.

---

## 🖥️ Integração com Front-End

O professor disponibilizou três telas HTML:

- `usuario.html`  
  Cadastro e listagem de usuários.

- `usuarioEdit.html`  
  Edição de dados do usuário.

- `usuarioEditSenha.html`  
  Edição apenas da senha do usuário.

### ⚠️ Ajustes necessários no Front-End

- Estruture os objetos no formato JSON correto conforme os comentários `//ESTRUTURE O OBJETO NO FORMATO JSON` presentes nos arquivos HTML.
- Ajuste as rotas utilizadas pelo Front-End para que correspondam às rotas da API Back-End criada.
- É permitido modificar o Front-End, se necessário, incluindo novos campos de busca ou criação de novas funcionalidades.

---

## ✅ Objetivo

O projeto busca avaliar a capacidade do aluno em:

- Estruturar entidades com tipos e validações.
- Criar rotas RESTful com diferentes verbos HTTP.
- Integrar corretamente com o Front-End.
- Entender e aplicar boas práticas de desenvolvimento de APIs.
