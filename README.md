# Orientação a Objetos em Java

Material didático de Programação Orientada a Objetos, usado em disciplinas de graduação
em Ciência da Computação, Engenharia de Software e Análise e Desenvolvimento de Sistemas.

[![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=flat&logo=openjdk&logoColor=white)](https://openjdk.org/)
[![PlantUML](https://img.shields.io/badge/UML-PlantUML-blue?style=flat)](https://plantuml.com/)
[![Licença MIT](https://img.shields.io/badge/licen%C3%A7a-MIT-green?style=flat)](./LICENSE)

**60 arquivos Java executáveis** e **34 diagramas UML** em PlantUML, organizados na ordem
em que os conceitos são apresentados em sala.

---

## Para quem é

Para quem está aprendendo orientação a objetos e quer ver o conceito rodando, não só
descrito. Cada pasta tem um `Main` que você compila e executa em segundos — sem framework,
sem build complicado, sem dependência externa.

Também serve para quem já programa mas nunca formalizou os conceitos: a pasta
[`BoasPraticas`](./BoasPraticas) mostra o mesmo problema modelado de duas formas, e a
diferença fica visível no código.

---

## Como rodar

Você precisa apenas do **JDK 17 ou superior**.

```bash
git clone https://github.com/LeonardoVieiraGuimaraes/OrientacaoObjetos.git
cd OrientacaoObjetos
```

Cada pasta é independente. Para executar os exemplos de herança, por exemplo:

```bash
cd Animal && javac *.java && java Main
```

A partir do **JDK 11** dá para rodar um arquivo único sem compilar antes:

```bash
java VisaoGeral/Java/Introducao.java
```

Para gerar as imagens dos diagramas, use a
[extensão PlantUML do VS Code](https://marketplace.visualstudio.com/items?itemName=jebbs.plantuml)
ou o `plantuml.jar`:

```bash
java -jar plantuml.jar UML/DiagramasEstruturais/Classes.puml
```

---

## Mapa do repositório

### 1. Ponto de partida — [`VisaoGeral`](./VisaoGeral)

O contraste que abre o curso: **o mesmo problema resolvido de forma estruturada e de forma
orientada a objetos**, lado a lado, nos arquivos `ProgramacaoEstruturada.java` e
`ProgramacaoOrientadaObjetos.java`.

Tem também a mesma ideia em **Java, Python e JavaScript**, para mostrar que orientação a
objetos é um paradigma — não uma característica de uma linguagem.

### 2. Conceitos fundamentais — [`Conceitos`](./Conceitos)

| Pasta | O que demonstra |
| :--- | :--- |
| `Estrutural` | Classes, atributos e métodos, no domínio Médico–Paciente |
| `Relacionais` | Herança, polimorfismo, classe abstrata e interface |
| `Pacote` | Organização em pacotes e controle de visibilidade |

### 3. Herança — [`Animal`](./Animal)

O exemplo clássico, deliberadamente: `Animal` → `Cachorro`, `Gato`. Serve para isolar a
sobrescrita de método antes de o domínio ficar complexo.

### 4. Polimorfismo — [`Polimorfismo`](./Polimorfismo)

Quatro contextos diferentes — `Pessoa`, `Funcionario`, `Calculadora` e `Caixa` — cobrindo
**sobrecarga** (mesmo nome, assinaturas diferentes) e **sobrescrita** (mesma assinatura,
comportamento diferente na subclasse). São confundidos com frequência, e ver os dois no
mesmo lugar resolve.

### 5. Boas práticas — [`BoasPraticas`](./BoasPraticas)

A parte mais útil para quem já programa.

Em `BP01` está o **mesmo sistema de vendas modelado de duas maneiras**:

- `NaoCoesa/` — poucas classes, cada uma fazendo coisa demais
- `Coesa/` — `Cliente`, `Produto`, `Vendedor`, `Venda`, `Debito`, `Endereco`, cada uma com
  uma responsabilidade

Rode os dois. A diferença entre "funciona" e "dá para manter" fica evidente sem precisar de
teoria.

Também há exemplos de `final`, encapsulamento e um carrinho de compras.

### 6. Modelagem de casos de uso — [`ModelagemCasoUso`](./ModelagemCasoUso)

14 diagramas PlantUML cobrindo os elementos um a um: atores, associações, fronteira do
sistema, `<<include>>`, `<<extend>>`, pontos de extensão, estereótipos, multiplicidade,
generalização.

Fecha com dois sistemas completos — **controle bancário** e **controle de clube** — para
ver os elementos combinados.

### 7. Diagramas UML — [`UML`](./UML)

| Estruturais | Comportamentais |
| :--- | :--- |
| Classes | Atividade |
| Objetos | Caso de Uso |
| Componentes | Sequência |
| Pacotes | Comunicação |
| Estrutura Composta | Máquina de Estado |
| Implantação | Tempo |
| Perfil | Visão Geral de Interação |

Todos em PlantUML: versionáveis, revisáveis em pull request e editáveis em texto — o que
uma imagem exportada não permite.

### 8. Projeto Maven — [`pacote`](./pacote)

Um projeto Spring Boot mínimo, para mostrar a estrutura de pacotes de um projeto Java real
(`com.oo.pacote.model`) depois que os conceitos foram vistos isoladamente.

---

## Sugestão de ordem de estudo

1. `VisaoGeral` — por que orientação a objetos existe
2. `Conceitos/Estrutural` — classe, atributo, método
3. `Animal` — herança
4. `Conceitos/Relacionais` — abstração, interface, relacionamentos
5. `Polimorfismo` — sobrecarga e sobrescrita
6. `BoasPraticas` — coesão e responsabilidade
7. `UML` e `ModelagemCasoUso` — documentar o que foi modelado
8. `pacote` — como isso aparece num projeto real

---

## Contribuindo

Correções e novos exemplos são bem-vindos. Abra uma issue descrevendo o conceito que ficou
confuso — retorno de quem está aprendendo é o que mais melhora material didático.

---

## Autor

**Leonardo Vieira Guimarães**

Desenvolvedor backend e Product Owner no Instituto Mineiro de Agropecuária (IMA).
Mestre em Modelagem Computacional e Sistemas (UNIMONTES) e doutorando em Modelagem
Matemática e Computacional (CEFET-MG), com pesquisa em inteligência computacional e
mineração de dados.

Ministrou Programação Orientada a Objetos, Programação Web, Programação Backend, Banco de
Dados e Arquitetura de Aplicações Web em cursos de graduação, além de Estatística e
Matemática Financeira.

[![Portfólio](https://img.shields.io/badge/Portf%C3%B3lio-leoproti.com.br-0A0A0A?style=flat)](https://leoproti.com.br)
[![ORCID](https://img.shields.io/badge/ORCID-0009--0000--3118--4664-A6CE39?style=flat&logo=orcid&logoColor=white)](https://orcid.org/0009-0000-3118-4664)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-perfil-0A66C2?style=flat&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/leonardo-vieira-guimaraes/)

### Outros repositórios de material didático

- [`ProgramacaoWebSpringBoot`](https://github.com/LeonardoVieiraGuimaraes/ProgramacaoWebSpringBoot) — API REST com Spring Boot, JPA e Docker
- [`LinguagensProgramaEstruturasDados`](https://github.com/LeonardoVieiraGuimaraes/LinguagensProgramaEstruturasDados) — listas, pilhas, filas e árvores em Java
- [`TeoriaGrafos`](https://github.com/LeonardoVieiraGuimaraes/TeoriaGrafos) — grafos, árvore geradora mínima e caminho mínimo
- [`InteligenciaComputacional`](https://github.com/LeonardoVieiraGuimaraes/InteligenciaComputacional) — sistemas fuzzy e agrupamento

---

## Licença

[MIT](./LICENSE) — use, adapte e distribua livremente, inclusive em sala de aula.
Se este material te ajudou, uma ⭐ ajuda outras pessoas a encontrá-lo.
