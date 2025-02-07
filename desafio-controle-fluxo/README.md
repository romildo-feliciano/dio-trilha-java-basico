## 🏆 Desafio: Controle de Fluxo

Este projeto tem como objetivo praticar conceitos de controle de fluxo em Java. O desafio consiste em **criar um programa que receba dois números inteiros como entrada e realize uma contagem entre esses valores**. Se o primeiro número for **maior** que o segundo, uma **exceção customizada** será lançada.

## 📌 Regras do Desafio

1. O sistema recebe dois números inteiros como parâmetros.

2. O programa imprime uma sequência de números incrementais entre os dois valores informados.

3. Se o primeiro número for maior que o segundo, deve ser lançada a exceção personalizada ParametrosInvalidosException.

## 📂 Estrutura do Projeto

O projeto contém duas classes principais:

**1. Contador.java**

Esta classe é responsável por:

- Ler os números informados pelo usuário.

- Validar os valores recebidos.

- Chamar a função contar() para realizar a contagem.

- Lidar com exceções caso o primeiro número seja maior que o segundo.

[Código do contador](https://github.com/romildo-feliciano/dio-trilha-java-basico/blob/main/conta-banco/src/DesafioControleFluxo/Contador.java)

**2. ParametrosInvalidosException.java**

- Classe que define uma exceção personalizada para ser lançada quando o primeiro número for maior que o segundo.

[Código do exception](https://github.com/romildo-feliciano/dio-trilha-java-basico/blob/main/conta-banco/src/DesafioControleFluxo/ParametrosInvalidosException.java)