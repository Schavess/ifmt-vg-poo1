# POO I (3º INF): código de referência

Consulta da turma de Programação Orientada a Objetos I, no IFMT Campus Várzea Grande. Java, do básico à prévia de herança.

## O que tem aqui

| Pasta | Para que serve |
|---|---|
| `base_conhecimento` | Exemplos comentados. Cada arquivo mostra um conceito e roda no terminal. |

## Ambiente

JDK 21. Abra a pasta `VG` no Cursor. O projeto Java desta pasta separa os exemplos para o editor não misturar classes de arquivos diferentes.

No terminal do Cursor:

```powershell
java -version
```

A linha deve citar a versão 21.

## Como rodar um exemplo

```powershell
cd base_conhecimento\01_java_basico
java Ex01TiposVariaveis.java
```

Quando o exemplo usa mais de uma classe pública, compile a partir da pasta pai:

```powershell
cd base_conhecimento\03_relacoes
javac associacao\*.java
java associacao.Ex02Associacao
```

A ordem de leitura está em `base_conhecimento/LEIAME.md`.
