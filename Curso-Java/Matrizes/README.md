# Matrizes — Exercícios em Java

Exercícios de matrizes feitos ao longo do curso. Cada um foi feito em um commit separado.

---

## 01 — EntradaUsuario.java
Exercício introdutório: declarar uma matriz, percorrê-la com laços aninhados (`for` dentro de `for`) e ler os valores digitados pelo usuário via `JOptionPane`, preenchendo cada posição `[linha][coluna]`.

## 02 — SomaMatrizes.java
Soma de duas matrizes de mesma dimensão. O tamanho é definido dinamicamente pelo usuário, então funciona para matrizes de qualquer tamanho. `resultado[i][j] = A[i][j] + B[i][j]`, com o resultado exibido formatado em linhas.

## 03 — SomaOuSubtracaoMatrizes.java
Evolução do anterior: o programa pergunta se o usuário quer somar ou subtrair, valida a resposta (`equalsIgnoreCase`) e trata entrada inválida encerrando o programa com uma mensagem de erro.

## 04 — MultiplicacaoEscalar.java
*(em desenvolvimento)*
Multiplica cada elemento de uma matriz por um número (escalar) digitado pelo usuário. Usa apenas uma matriz de entrada, sem necessidade de uma segunda.

---

**Nota sobre nomes:** classes públicas em Java exigem que o nome do arquivo seja igual ao da classe, e classes não podem começar com número. Por isso os arquivos seguem PascalCase sem prefixo numérico, e a ordem fica registrada aqui neste índice.