# ELP Project — Javardair

Este projeto é **open source** e disponibiliza um motor de templates HTML com a linguagem **Javardair** embutida. O template contém blocos `{{ ... }}` com código Javardair, e o motor combina esse template com um ficheiro JSON para gerar o HTML final.

## Requisitos

- JDK 25 (o projeto usa `jvmToolchain(25)` no Gradle)
- Gradle Wrapper (`./gradlew`)

## Tutorial de utilização

1. Crie um ficheiro de template com blocos Javardair dentro de `{{ ... }}`.
2. Crie um ficheiro JSON com as variáveis de entrada.
3. Execute a classe `org.example.MainKt` com os argumentos:
   - `-f` caminho do template
   - `-i` caminho do JSON
   - `-o` caminho do ficheiro de saída

### Exemplo rápido

**Template (`template1.html`):**

```html
<html>
<h1>
    {{ print(hello). }}
</h1>
<h2>
    {{ print(world). }}
</h2>
</html>
```

**JSON de entrada (`input1.json`):**

```json
{
  "hello": "olá",
  "world": "mundo"
}
```

**Execução (em IDE ou via linha de comando com argumentos):**

```text
org.example.MainKt -f src/test/testFiles/template1.html -i src/test/testFiles/input1.json -o /tmp/output1.html
```

**Resultado esperado (`/tmp/output1.html`):**

```html
<html>
<h1>
    olá

</h1>
<h2>
    mundo

</h2>
</html>
```
Nota:
> O executável espera **sempre** os argumentos `-f`, `-i` e `-o` (template, input JSON e ficheiro de saída).


## Tutorial de Javardair

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

### 4) Prints

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
### Comentário
```

---
Para mais exemplos consultar os ficheiros em `src/test/testFiles/`.
