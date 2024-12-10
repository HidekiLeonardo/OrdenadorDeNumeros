# Ordenador de Números em Java - **Selection Sort**

Este é um projeto simples em **Java** que implementa o algoritmo de ordenação **Selection Sort**. O programa recebe uma lista de números e os ordena em ordem crescente utilizando este algoritmo.

---

## Funcionalidades

- O programa solicita ao usuário que insira uma lista de números.
- A lista é convertida de uma `String` para uma `List<Integer>`.
- Em seguida, a lista é ordenada utilizando o algoritmo de **Selection Sort**.
- Por fim, o programa imprime a lista de números ordenada.

---

## Como Rodar o Projeto

### 1. **Pré-requisitos**:

Certifique-se de ter o **Java** instalado em seu computador. Você pode verificar a versão do Java com o seguinte comando:

```bash
java -version
```

### 2. **Passos para rodar o código**:

- Clone ou baixe este repositório.
- Abra o terminal/linha de comando no diretório do projeto.
- Compile o código com o comando:

    ```bash
    javac Main.java
    ```

- Execute o programa com o comando:

    ```bash
    java Main
    ```

### 3. **Entrada**:

O programa irá solicitar ao usuário que insira números separados por espaço. Exemplo:

```
34 12 56 5 23
```

### 4. **Saída**:

O programa irá exibir a lista de números ordenada:

```
[5, 12, 23, 34, 56]
```

---

## Como o Algoritmo Funciona

O **Selection Sort** é um algoritmo simples, mas eficiente para listas pequenas. Ele encontra o menor valor na lista e o coloca na posição correta repetidamente. Aqui estão os passos principais do algoritmo:

1. Comece no primeiro elemento da lista.
2. Encontre o menor número da lista.
3. Troque esse número com o número na posição inicial.
4. Repita o processo para a lista restante (ignorando o primeiro elemento já ordenado).

---

## Tecnologias Usadas

- **Java 8** ou superior
- Algoritmo de ordenação **Selection Sort**
