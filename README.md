# Calculadora de IMC em Java

Projeto acadêmico desenvolvido para demonstrar os conceitos fundamentais da **Programação Orientada a Objetos (POO)** em Java, como encapsulamento, classes, métodos e atributos.

## 🚀 Funcionalidades

- **Cadastro de Pessoa:** Armazena dados como nome, sobrenome, idade, altura e peso.
- **Cálculo do IMC:** Aplica a fórmula $IMC = \frac{peso}{altura^2}$.
- **Classificação Corporal:** Retorna a faixa correspondente de massa corporal de acordo com os critérios da Organização Mundial da Saúde (OMS).

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java (JDK 8 ou superior)
- **Paradigma:** Programação Orientada a Objetos (POO)

## 📁 Estrutura do Código

O projeto é composto por duas classes principais:

1. **`Pessoa`**:
   - Atributos privados: `nome`, `sobrenome`, `idade`, `altura`, `peso` e `imc`.
   - Métodos Getters e Setters para manipulação dos dados.
   - `calculaIMC()`: Método responsável pelo cálculo aritmético.
   - `informaObesidade()`: Método responsável por definir a faixa de massa corporal.

2. **`Principal`**:
   - Contém o método `main`, gerenciando a entrada de dados via `Scanner` e a exibição do resultado final no console.

## 📊 Tabela de Classificação do IMC

| Faixa de IMC | Classificação |
| :--- | :--- |
| **Menor que 18,5** | Abaixo do peso |
| **18,5 – 24,9** | Peso normal |
| **25,0 – 29,9** | Sobrepeso |
| **30,0 – 34,9** | Obesidade Grau I |
| **35,0 – 39,9** | Obesidade Grau II |
| **40,0 ou mais** | Obesidade Grau III |

## ⚙️ Como Executar

1. **Clone o repositório ou baixe os arquivos fonte.**

2. **Compile as classes:**
   ```bash
   javac Principal.java Pessoa.java
   ```

3. **Execute a aplicação:**
   ```bash
   java Principal
   ```

4. **Interaja pelo terminal:**
   Informe os dados solicitados quando solicitado no console:
   ```text
   Nome: João
   Sobrenome: Silva
   Idade: 25
   Altura (m): 1.75
   Peso (kg): 70
   
   IMC: 22.86
   Classificação: Peso normal
   ```
