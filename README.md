# ELP Project — Javardair

Este projeto disponibiliza um motor de templates HTML com a linguagem **Javardair** embutida. O template contém blocos `{{ ... }}` com código Javardair, e o motor combina esse template com um ficheiro JSON para gerar o HTML final.

## Requisitos

- JDK 25 (o projeto usa `jvmToolchain(25)` no Gradle)
- Gradle Wrapper (`./gradlew`)

## Como gerar HTML (linha de comandos)

1. Compilar o projeto:

```bash
./gradlew build
```

2. Executar o motor com template e JSON:

```bash
# localizar o jar do runtime do ANTLR no cache do Gradle
ANTLR_JAR=$(find ~/.gradle/caches -name "antlr4-runtime-4.13.2.jar" | head -n 1)

java -cp "build/classes/kotlin/main:build/resources/main:build/libs/project-1.0-SNAPSHOT.jar:${ANTLR_JAR}" \
  org.example.MainKt \
  -f src/test/testFiles/template1.html \
  -i src/test/testFiles/input1.json \
  -o /tmp/output.html
```

> O executável espera **sempre** os argumentos `-f`, `-i` e `-o` (template, input JSON e ficheiro de saída).

## Tutorial rápido de Javardair

### 1) Onde escrever Javardair

Dentro de um template HTML, os blocos `{{ ... }}` são interpretados como Javardair. O HTML fora destes blocos é copiado tal como está.

```html
<h1>{{ print(titulo). }}</h1>
```

### 2) Variáveis e tipos

- `const` cria constantes (não podem ser redefinidas).
- `mut` cria variáveis mutáveis.
- Atribuição usa `:=`.
- Cada instrução termina com `.` (ponto).

```text
const nome := "Ana".
mut total := 0.
```

### 3) Expressões e operadores

Operadores suportados: `+ - * / % == != < <= > >=`

```text
const soma := 2 + 3.
const igual := 5 == 5.
```

### 4) Impressão de resultados

O output final do template é construído com `print(...)`.

```text
print("Olá " + nome).
```

### 5) Acesso a dados JSON

As chaves de topo do JSON são injetadas como constantes. Para aceder a propriedades/índices usa-se `..`:

```text
const valores := objeto_json..valores_array.
const primeiro := valores..0.
```

### 6) Condicionais

```text
if (total > 10) << 
    print("Grande").
>>
else <<
    print("Pequeno").
>>
```

### 7) Ciclos e `break`

```text
for (i >>> valores) <<
    const v := valores..i.
    if (v > 5) << break. >>
    print("Valor: " + v).
>>
```

### 8) Comentários

```text
### Comentário de linha
```

---

Se precisares de mais exemplos, consulta os ficheiros em `src/test/testFiles/`.
