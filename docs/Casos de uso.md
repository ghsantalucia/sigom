**Atores:**

* **Administrador**

O Administrador é o responsável pela manutenção do sistema, ele tem acesso á todas as funcionalidades.Este ator também deve inserir os colaboradores.

* **Colaborador/Moderador**

O Colaborador tem acesso à todos os casos de uso do Usuário, ele é responsável por inserir novo conteúdo, cadastrar novos diagramas e novos usuários. O colaborador também tem poder de moderação (excluir, modificar e advertir usuários)

* **Usuário**

É o ator responsável por criar novos registros, preencher as informações e gerar os laudos, eles são adicionados por um colaborador do sistema e utilizam diagramas já cadastrados para registrar lesões e outros.  
Um usuário não tem poder sobre outros usuários, ele terá um cargo e pode ser alocado em algum grupo pelo colaborador.

**Casos de Uso:**

**CDU01: CRUD Ocorrência**  
**CDU02: Marcar Lesões**  
**CDU03: CRUD Diagrama**  
**CDU04: Gerar Laudo**  
**CDU05: Login**  
**CDU06: Gerenciar Usuários**  
**CDU07: Gerenciar Grupos**

**CDU01: CRUD Ocorrência**  
O usuário deverá ser capaz de criar, modificar e excluir uma ocorrência composta pelos seguintes formulários, e salva-la mesmo com campos em branco ou incompletos:

1. Ocorrência  
2. Vítima(s)  
3. Equipe de Socorro  
4. Endereço(s)  
5. Lesões  
6. Isolamento  
7. Pessoas  
8. Vestígios  
9. Observações  
10. Pertences

**CDU01.1: Navegar por Tabelas**  
O usuário poderá visualizar todas as tabelas da ocorrência atual a qualquer momento, e partir desta interface escolher uma delas para editar.

**CDU02: Marcar Lesões**  
O sistema deve permitir ao usuário selecionar um ou mais diagramas para a marcação de lesões, onde ele poderá adicionar novas lesões e salvar o diagrama.

**CDU03: CRUD Diagrama**  
O ator colaborador poderá visualizar todos os diagramas cadastrados, modificar e excluir qualquer um deles ou criar um novo diagrama de acordo com os seguintes parâmetros:

1. Imagem;  
2. Posição do ponto;  
3. Nome do ponto;  
4. Dimensões do ponto;  
5. Enumeração dos pontos;  
6. Dimensões do diagrama.

**CDU04: Gerar Laudo**  
O usuário poderá, a partir de qualquer ocorrência cadastrada por ele mesmo, gerar um documento de laudo editável e posteriormente exportá-lo em formatos de texto e/ou imprimí-lo.

**CDU05: Login**  
O usuário deverá submeter seu nome de login e senha previamente cadastrados pelo Administrador ou Colaborador antes de usar o SIGOM.

**CDU06: Gerenciar Usuários**  
O ator Colaborador poderá acessar uma lista com todos os usuários ativos e inativos, editar seus dados como:

1. Login;  
2. Senha;  
3. Nome;  
4. Cargo;  
5. E-mail;  
6. Status (ativo/inativo).

E também criar e excluir (desativar) usuários.

**CDU07: Gerenciar Grupos**  
O ator Colaborador poderá criar, editar e desativar grupos de usuários, dando-lhe um nome e descrição (opcional) e associando usuários existentes ao grupo, incluindo ele próprio.  
Um usuário pode fazer parte de mais de um grupo.

