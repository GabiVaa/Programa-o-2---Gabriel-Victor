# Atividade 8 - Projeto de Programação em Java

Este repositório contém as resoluções da **Atividade 8**, composta por programas desenvolvidos em Java que exercitam conceitos práticos de estruturas de dados básicas (`ArrayList`), manipulação de console, Programação Orientada a Objetos (POO), encapsulamento e validação de dados.

---

## 📁 Estrutura dos Arquivos

A atividade é dividida em três arquivos principais de código-fonte:

1. **`ListaDeCompras.java`**: Um programa de console interativo que usa `ArrayList<String>` para gerenciar uma lista de compras dinâmica.
2. **`Retangulo.java`**: Uma classe que modela um retângulo geométrico encapsulado, aplicando regras de validação rígidas para suas dimensões.
3. **`TesteRetangulo.java`**: Um programa executável para testar o comportamento da classe `Retangulo` sob condições ideais e cenários de erro.

---

## 🛠️ Detalhes dos Programas

### 1. Gerenciador de Lista de Compras (`ListaDeCompras.java`)
Este programa simula um terminal de gerenciamento de compras através de um menu numérico em loop.
* **Adicionar:** Permite que o usuário insira uma `String` correspondente ao produto, inserindo-a sempre ao final da lista.
* **Listar:** Percorre a `ArrayList` usando uma estrutura `for` tradicional para exibir cada item acompanhado do seu respectivo índice numérico (ex: `0. Maçã`).
* **Remover:** Solicita ao usuário o índice do item e realiza a exclusão com segurança caso a posição informada seja válida.
* **Sair:** Finaliza de forma limpa a execução do loop e fecha o leitor do console.

### 2. Classe Retângulo (`Retangulo.java` e `TesteRetangulo.java`)
Uma representação em POO para cálculo de propriedades geométricas básicas de um retângulo, focada em segurança de dados.
* **Encapsulamento:** Os atributos de `altura` e `largura` são definidos como privados (`private`).
* **Valores Padrão:** O construtor implícito define as dimensões padrão do retângulo como `1.0` por `1.0`.
* **Regras de Negócio (Validação):** Os métodos modificadores `setAltura` e `setLargura` implementam a seguinte validação lógica:
  $$0.0 < \text{dimensão} < 20.0$$
  Caso um valor fora desse intervalo (valores negativos, zero ou maiores/iguais a 20) seja fornecido, o sistema emite um alerta e ignora a alteração.
* **Métodos de Cálculo:** * Área = $\text{altura} \times \text{largura}$
  * Perímetro = $2 \times (\text{altura} + \text{largura})$
