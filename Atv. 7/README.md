# UFRPE - Programação 2
## Aula 12 - Prática 07 (Exercício 1)

Este repositório contém a resolução do Exercício 1 proposto na Prática 07 da disciplina de Programação 2 da UFRPE (Prof. Anderson Cavalcanti).

### 📝 Enunciado do Exercício

1. Criar uma classe para representar um aluno e suas notas. Atributos: `nome`, `matrícula`, `nota1`, `nota2`, `notaTrabalho`.
2. Crie um construtor que receba todos os dados (nome, matrícula e as três notas) para inicializar um objeto `Aluno`.
3. Crie um método `calcularMedia()` que retorna um `double` com a média aritmética das notas.
4. Crie um método `verificarSituacao()` que não retorna nada. Este método deve chamar o `calcularMedia()` e, com base no resultado, imprimir **"APROVADO"** se a média for 7 ou superior, e **"REPROVADO"** caso contrário.
5. Em outra classe Java, instancie dois objetos `Aluno` com notas diferentes. Para cada aluno, chame o método `verificarSituacao()` para ver se ele foi aprovado ou reprovado.

### 🛠️ Estrutura do Projeto

O projeto está dividido em duas classes dentro do pacote `praticasete`:

* **`Aluno.java`**: Classe de modelo que contém os atributos, construtor, métodos de cálculo de média e de impressão do status do aluno.
* **`Principal.java`**: Classe executável (`main`) utilizada para instanciar os objetos de teste e exibir os resultados no console.

   javac -d . Aluno.java Principal.java
