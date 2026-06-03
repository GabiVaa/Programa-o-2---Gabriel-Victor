# Sistema de Gerenciamento de Funcionários

Este repositório contém uma aplicação simples em Java desenvolvida como exercício prático de **Programação Orientada a Objetos (POO)**. O objetivo principal do projeto é demonstrar a aplicação de conceitos fundamentais da orientação a objetos, como Herança e Polimorfismo.

## 📚 Conceitos Aplicados

* **Herança:** Criação das subclasses `Gerente` e `Atendente` que herdam atributos e métodos da superclasse `Funcionario`.
* **Polimorfismo:** Sobrescrita do método `getSalario()` nas subclasses para aplicar regras de negócio específicas (bonificação para gerentes e comissão para atendentes), permitindo que o sistema calcule o salário corretamente em tempo de execução.
* **Encapsulamento e Modificadores de Acesso:** Uso do modificador `protected` para permitir o acesso aos atributos pelas subclasses.
* **Estruturas de Dados:** Utilização de `ArrayList` para armazenar e gerenciar a lista de funcionários em memória.

## ⚙️ Funcionalidades

O sistema roda no terminal e apresenta um menu interativo com as seguintes opções:

1. **Adicionar gerente:** Cadastra um novo gerente informando nome, CPF, data de nascimento e salário base.
2. **Adicionar atendente:** Cadastra um novo atendente informando nome, CPF, data de nascimento, salário base e comissão.
3. **Listar todos os funcionários:** Exibe os dados de todos os funcionários cadastrados no sistema.
4. **Mostrar salário de funcionário:** Busca um funcionário pelo CPF e exibe seu salário final calculado (salário base + bonificações/comissões).
5. **Sair:** Encerra a aplicação.

## 🚀 Como Executar o Projeto

Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado na sua máquina. 

1. Clone este repositório ou baixe o arquivo `TesteFuncionario.java`.
2. Abra o terminal e navegue até a pasta onde o arquivo está salvo.
3. Compile o código com o comando:
   ```bash
   javac TesteFuncionario.java
