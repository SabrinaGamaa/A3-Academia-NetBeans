# 💪 Sistema de Gerenciamento de Academia - A3 (Java + SQLite)

Este projeto foi desenvolvido como parte da **Avaliação A3** da disciplina de Programação, com o objetivo de criar um sistema completo de gerenciamento de alunos e seus treinos em uma academia.

> ⚠️ Trabalho em grupo com 5 integrantes.

> 📦 Este repositório corresponde à **versão final estruturada no NetBeans**, com suporte total a Maven, GUI (Swing), e imagens organizadas corretamente em `resources`.

> 🔗 Também está disponível a versão inicial criada no IntelliJ:
> [A3-Academia (IntelliJ)](https://github.com/SabrinaGamaa/A3-Academia)

---

## 🧠 Objetivo

Desenvolver um sistema com as funcionalidades de **cadastro, visualização, edição e exclusão (CRUD)** de alunos e treinos, com interface gráfica amigável e persistência de dados em banco de dados SQLite.

---

## ✅ Funcionalidades Implementadas

### 👤 Módulo de Alunos

| Requisito | Descrição |
|----------|-----------|
| RF01 | Cadastrar novo aluno (nome, CPF, data de nascimento, telefone, e-mail) |
| RF02 | Listar todos os alunos |
| RF03 | Editar informações de um aluno |
| RF04 | Excluir um aluno |
| RF05 | Buscar aluno por nome ou ID |

### 🏋️‍♀️ Módulo de Treinos

| Requisito | Descrição |
|----------|-----------|
| RF06 | Cadastrar treino (tipo, descrição, duração, data início, aluno vinculado) |
| RF07 | Listar todos os treinos de um aluno |
| RF08 | Editar treino |
| RF09 | Excluir treino |

### ⚙️ Funcionalidades Gerais

| Requisito | Descrição |
|----------|-----------|
| RF10 | Persistência com SQLite usando JDBC |
| RF11 | Interface gráfica com Swing construída no NetBeans |
| RF12 | Tratamento de erros com `JOptionPane` |

---

## 🛠 Tecnologias Utilizadas

- **Java JDK 21**
- **NetBeans 20** (GUI via Swing Designer)
- **SQLite JDBC 3.43.2.2** (banco de dados local)
- **JDBC** (Java Database Connectivity)
- **Maven** (gerenciador de dependências)
- **Git & GitHub** (versionamento)

---

## 📁 Estrutura do Projeto

```bash
A3AcademiaNetBeans/
├── src/
│   └── main/
│       ├── java/
│       │   ├── database/        # Arquivo SQLite e conexão
│       │   ├── modelos/         # Classes modelo (Aluno, Treino)
│       │   ├── repositorio/     # Classes DAO (persistência)
│       │   ├── servicos/        # Regras de negócio
│       │   ├── telas/           # Interfaces gráficas (Swing)
│       │   └── util/            # Utilitários e renderizadores
│       └── resources/
│           └── imagens/         # Ícones usados no GUI
├── pom.xml                      # Configuração do Maven (dependências)
└── README.md
```

---

## ⚙️ Detalhes do `pom.xml`

O arquivo `pom.xml` contém a configuração do projeto Maven, incluindo:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>java</groupId>
    <artifactId>A3Academia</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>jar</packaging>
    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.release>21</maven.compiler.release>
        <exec.mainClass>Programa</exec.mainClass>
    </properties>
    
    <dependencies>
        <dependency>
            <groupId>org.xerial</groupId>
            <artifactId>sqlite-jdbc</artifactId>
            <version>3.43.2.2</version>
        </dependency>
        <dependency>
            <groupId>org.netbeans.external</groupId>
            <artifactId>AbsoluteLayout</artifactId>
            <version>RELEASE250</version>
        </dependency>
    </dependencies>
    <name>A3AcademiaNetBeans</name>
</project>
```

- A dependência acima permite que o sistema se conecte ao banco de dados SQLite com suporte completo.
- O Maven também gerencia o build, o classpath e garante que o projeto seja portável entre máquinas.
- Nenhuma configuração adicional é necessária: o banco é criado automaticamente.

---

## 📸 Prints do Sistema

![Tela Inicial](https://github.com/SabrinaGamaa/A3-Academia/blob/main/imagens/telaInicial.PNG)
> Tela inicial do sistema



![Excluir Aluno](https://github.com/SabrinaGamaa/A3-Academia/blob/main/imagens/deletarAluno.PNG)
> Excluir aluno com confirmação

---

## 📌 Dificuldades e Soluções

### 💡 Migração IntelliJ → NetBeans
Projeto iniciado no IntelliJ, mas migrado para o NetBeans para facilitar o uso de componentes gráficos com o GUI Builder. Essa migração exigiu a adaptação para Maven, além de reestruturação dos diretórios para seguir o padrão `src/main/java`.

### 🧩 Organização em Camadas
Separação em `modelo`, `repositório`, `serviços` e `telas` deixou o sistema mais organizado, facilitando futuras manutenções e reuso de lógica.

### 🚫 Tratamento de Erros
Todas as entradas do usuário e exceções críticas estão tratadas com `JOptionPane`, fornecendo mensagens amigáveis. Não há risco de erros em tempo de execução sem aviso ao usuário.


---

## ▶️ Como Executar

1. Clone o projeto:
```bash
git clone https://github.com/SabrinaGamaa/A3-Academia-NetBeans.git
```

2. Abra o projeto no **NetBeans 20** como um projeto Maven.

3. Execute a classe `TelaInicial.java`.

4. O banco será criado automaticamente no diretório `src/main/java/database/`.

---

## 🔧 Pré-requisitos

- Java JDK 21 instalado
- NetBeans 20
- Maven configurado (já incluso no NetBeans)
- Git (opcional)

---

## 👩‍💻 Autoria

Projeto desenvolvido por 
 - [**Sabrina Gama**](https://github.com/SabrinaGamaa)
 - [**Vicenzzo Palma**](https://github.com/vicenzzopalma)
 - [**Raquel Silva**](https://github.com/RaquelSillva)
 - [**Paulo H. Oliveira**](https://github.com/PauloHOC818)
 - **Kauan**

> como parte da disciplina A3 - 1º semestre de Programação de Soluções Computacionais.

---

## 📝 Licença

Este projeto foi desenvolvido **exclusivamente para fins educacionais** e **não possui fins comerciais**.
