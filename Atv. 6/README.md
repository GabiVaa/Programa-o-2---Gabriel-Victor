# 📦 Exercício 1: Sistema de Gestão de Produtos

Este projeto faz parte da disciplina de **Programação 2** da Universidade Federal Rural de Pernambuco (UFRPE). O objetivo é aplicar conceitos fundamentais de Orientação a Objetos na linguagem Java, como criação de classes, atributos, métodos e manipulação de estado de objetos.

## 📝 Descrição da Atividade

A atividade consiste no desenvolvimento de uma aplicação Java que represente um produto de uma loja. O sistema deve ser capaz de:
- Armazenar nome, preço e quantidade em estoque.
- Exibir informações detalhadas do produto.
- Calcular o valor total investido no estoque de um produto.
- Realizar a atualização da quantidade em estoque (entrada de mercadoria).

---

## 🛠️ Tecnologias e Ferramentas

As ferramentas utilizadas para a resolução deste exercício foram:
- **Linguagem Base:** Java ☕
- **IDE de Desenvolvimento:** IntelliJ IDEA (ou sua IDE de preferência)
- **Versionamento:** Git e GitHub

---

## 🏗️ Estrutura do Código

O projeto está dividido em duas partes principais:

1.  **`Produto.java`**: Classe de modelo que contém:
    - Atributos: `nome`, `preco` e `quantidadeEstoque`.
    - Construtor para inicialização dos dados.
    - Método `exibirInfo()` para imprimir os dados no console.
    - Método `calcularValorTotalEmEstoque()` para lógica de negócio.
    - Método `adicionarEstoque(int quantidade)` para atualização de dados.

2.  **`TesteProduto.java`**: Classe principal (main) utilizada para instanciar os objetos, realizar os testes de lógica e validar os resultados no console.
