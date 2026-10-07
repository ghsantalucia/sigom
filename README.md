# 🛡️ SIGOM — Sistema de Gestão de Ocorrências de Mortes Violentas
<a href="https://java.com"><img src="https://img.shields.io/badge/Java-EE-orange?style=flat-square&logo=java" alt="Java"></a>
<a href="https://maven.apache.org"><img src="https://img.shields.io/badge/Apache%20Maven-C71A36?style=flat-square&logo=apache-maven&logoColor=white" alt="Maven"></a>
<a href="https://tomcat.apache.org"><img src="https://img.shields.io/badge/Apache%20Tomcat-F8DC75?style=flat-square&logo=apache-tomcat&logoColor=black" alt="Tomcat"></a>
<a href="https://www.eclipse.org"><img src="https://img.shields.io/badge/Eclipse%20IDE-2C2255?style=flat-square&logo=eclipse-ide&logoColor=white" alt="Eclipse"></a>
<a href="https://git-scm.com"><img src="https://img.shields.io/badge/Git-F05032?style=flat-square&logo=git&logoColor=white" alt="Git"></a>

O **SIGOM** é uma aplicação web desenvolvida em **Java EE** projetada para auxiliar órgãos de segurança pública, unidades periciais ou centros de atendimento médico-legal. O sistema centraliza o registro de ocorrências e introduz um **Diagrama Interativo de Lesões Corporais**, permitindo o mapeamento anatômico detalhado e preciso de traumas e ferimentos identificados em vítimas.

---

## Principais Funcionalidades

* **Diagrama Anatômico Interativo:** Mapeamento visual e numérico de lesões em múltiplas posições corporais (frente, costas, perfil esquerdo e direito, abrangendo corpos masculino e feminino).
* **Registro Detalhado de Ocorrências:** Associação direta entre as lesões mapeadas e o perfil/ID da vítima da ocorrência.
* **Gestão Estruturada de Casos:** Organização de dados periciais e clínicos com rastreabilidade e histórico centralizado.

---

## Arquitetura e Estrutura do Projeto

O projeto segue estritamente o padrão arquitetural em camadas **MVC (Model-View-Controller)** clássico, garantindo a separação de responsabilidades, alta testabilidade e legibilidade do código:

```text
sigom/
├── java/br/com/mic/
│   ├── bean/         # Modelos de dados e entidades de negócio (JavaBeans)
│   ├── controle/     # Classes de controle e lógica de fluxo
│   ├── dao/          # Camada de Acesso a Dados (Data Access Object)
│   ├── servlets/     # Controladores de requisições web (Java Servlets)
│   └── util/         # Classes utilitárias e ajudantes do sistema
├── src/main/webapp/  # Camada de Apresentação (JSPs, HTML, CSS, Scripts e Assets visuais)
└── pom.xml           # Configuração de dependências e build (Apache Maven)
```

## Stack Tecnológica

* Linguagem: Java (JDK padrão compatível com Servlets)
* Arquitetura Web: Java Servlets & JSP (Java EE)
* Gerenciador de Dependências & Build: Apache Maven (pom.xml)
* Servidor de Aplicação: Apache Tomcat
* Ambiente de Desenvolvimento: Eclipse IDE

## Como Executar o Projeto Localmente

Se você deseja clonar, configurar e rodar este projeto em sua máquina local para fins de portfólio ou estudo, siga os passos abaixo:

### Pré-requisitos

* Java Development Kit (JDK) instalado (versão compatível com Java EE).
* Apache Maven configurado em sua máquina.
* Uma IDE de sua preferência (como Eclipse IDE com suporte a Maven/WTP ou IntelliJ IDEA).
* Um servidor de aplicação compatível com Servlet (ex: Apache Tomcat 9+).

## Passos para Execução:

#### Clone o repositório:

```Bash
git clone [https://github.com/SEU_USUARIO/sigom.git](https://github.com/SEU_USUARIO/sigom.git)
```

#### Importe o projeto na IDE:

* No Eclipse: Vá em File > Import > Existing Maven Projects e selecione a pasta raiz do projeto.
* O Maven fará o download automático das dependências descritas no arquivo `pom.xml`.
* Configure o Servidor:
Adicione o servidor Apache Tomcat ao seu ambiente de desenvolvimento e vincule o projeto SIGOM como um módulo executável (Add and Remove...).

#### Execute a Aplicação:

* Inicie o servidor Tomcat através da IDE ou utilizando o arquivo de configuração de execução (`.launch`) presente no repositório.
* Acesse pelo navegador através de: `http://localhost:8080/sigom`

## Autor

Desenvolvido por @ghsantalucia. Sinta-se à vontade para entrar em contato ou abrir issues e pull requests para melhorias!
