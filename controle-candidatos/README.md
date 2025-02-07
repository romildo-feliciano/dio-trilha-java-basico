## 🏆 Desafio: Processo Seletivo de Candidatos  

Este desafio tem como objetivo simular um processo seletivo para uma vaga de emprego, onde candidatos são analisados com base em sua **pretensão salarial**, são **selecionados**, e depois recebem **tentativas de contato** para confirmar o interesse na vaga.

## 📌 Funcionalidades do Código  

O código realiza as seguintes etapas:  

1️⃣ **Selecionar candidatos:**  
   - Um conjunto de candidatos é analisado.  
   - Apenas **5 candidatos** são selecionados, considerando um **salário base de R$ 2000,00**.  
   - Candidatos que pedem um salário abaixo ou igual ao base são aprovados.  

2️⃣ **Analisar o salário pretendido:**  
   - Se o salário pretendido for **menor que o salário base**, o candidato recebe uma **ligação direta**.  
   - Se for **igual ao salário base**, o candidato recebe uma **contraproposta**.  
   - Caso contrário, o candidato fica **em espera** até que todos os outros candidatos sejam analisados.  

3️⃣ **Registrar e imprimir os candidatos selecionados.**  

4️⃣ **Tentar entrar em contato com cada candidato selecionado:**  
   - São feitas até **3 tentativas de ligação**.  
   - Cada tentativa tem uma **chance aleatória** de ser atendida.  
   - Se o candidato atender, o contato é concluído.  
   - Caso contrário, o processo encerra após 3 tentativas sem sucesso.  

---

## 🛠 Tecnologias Utilizadas  

- **Java** (linguagem principal)  
- **Random e ThreadLocalRandom** (geração de valores aleatórios para simular comportamento real)  
- **Estruturas de controle** (loops e condicionais para seleção e contato)  
- **Listas (`ArrayList`)** (armazenamento dinâmico dos candidatos selecionados)  

---

## 📂 Estrutura do Código  

```java
public class ProcessoSeletivoCustomizado {
    public static void main(String[] args) { ... } 

    static List<String> selecaoCandidatos(String[] candidatos) { ... }  // Seleciona até 5 candidatos

    static void analisarCandidato(double salarioPretendido) { ... }  // Analisa se um candidato pode ser selecionado

    static void imprimirSelecionados(List<String> selecionados) { ... }  // Exibe a lista de candidatos aprovados

    static void entrandoEmContato(String candidato) { ... }  // Simula as tentativas de contato

    static double valorPretendido() { ... }  // Gera um salário pretendido aleatório

    static boolean atender() { ... }  // Simula a probabilidade de um candidato atender a ligação
}
```

## ▶ Como Executar o Código  

1️⃣ Certifique-se de ter o **Java instalado** na máquina.  
2️⃣ Clone este repositório ou copie o arquivo `ProcessoSeletivoCustomizado.java` para sua máquina.  
3️⃣ Compile o código com o seguinte comando no terminal:  

```sh
javac ProcessoSeletivoCustomizado.java
```

4️⃣ Execute o programa com:  

```sh
java ProcessoSeletivoCustomizado
```

---

## 📝 Exemplo de Saída  

```sh
Iniciando Processo Seletivo...

O candidato FELIPE solicitou um salário de R$1900.50
Ligar para o candidato.
Candidato FELIPE selecionado para a vaga.

O candidato MARCIA solicitou um salário de R$2100.00
Aguardando resultado dos demais candidatos.

O candidato JULIA solicitou um salário de R$1950.75
Ligar para o candidato.
Candidato JULIA selecionado para a vaga.

Lista de candidatos selecionados:
1 - FELIPE
2 - JULIA

Tentando contato com FELIPE...
Conseguimos contato com FELIPE após 2 tentativas.

Tentando contato com JULIA...
Não conseguimos contato com JULIA após 3 tentativas.
```

---

## 📢 Conclusão  

Este código simula um **processo seletivo simplificado**, demonstrando conceitos de **estruturas de repetição, listas, geração aleatória de valores e lógica condicional** no Java.