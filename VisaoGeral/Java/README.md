# Exemplo de Orientação a Objetos em Java

## Visão Geral em Orientação a Objetos

## Autor
Me. Leonardo Vieira Guimarães

## Licença
Este projeto está sob a licença [MIT](./LICENSE).

Este projeto é um exemplo prático que ilustra os conceitos de orientação a objetos, implementando um sistema de gerenciamento de uma biblioteca em Java. Temos as classes Livro, Autor, Cliente e Biblioteca.

A classe Livro tem atributos como título, autor e número de páginas, enquanto a classe Autor tem atributos como nome e nacionalidade. A associação entre Livro e Autor mostra um relacionamento de composição, onde um livro é composto por um autor.

O encapsulamento é aplicado em cada classe para ocultar seus detalhes internos e proteger seus dados.

Para explorar os conceitos da orientação a objetos em Java, é necessário instalar o Java e um editor de código. Recomenda-se o uso do Visual Studio Code, um editor leve e versátil.

É fundamental compreender a instalação do Java e a configuração do ambiente de desenvolvimento com o Visual Studio Code. Um tutorial explicativo sobre esses procedimentos é fornecido para facilitar o processo de aprendizado e desenvolvimento em Java.

## Tutorial de Instalação do Java e Configuração do Visual Studio Code:
- [Historia_Java](https://www.youtube.com/watch?v=sTX0UEplF54)
- [Tutorial](https://www.youtube.com/watch?v=UZX5kH72Yx4)

## Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
- [JDK](https://download.oracle.com/java/22/latest/jdk-22_windows-x64_bin.msi) (versão 11 ou superior)
- [Git](https://git-scm.com)

## Instalando o Visual Studio Code

O Visual Studio Code é um editor de código-fonte desenvolvido pela Microsoft que é muito útil para escrever e debugar código. Para instalar o Visual Studio Code, siga os passos abaixo:

1. Acesse o site oficial do [Visual Studio Code](https://code.visualstudio.com/Download).
2. Clique no botão de download para o Windows.
3. Após o download, execute o arquivo e siga as instruções do instalador.

Depois de instalado, você pode abrir o Visual Studio Code e começar a trabalhar no seu projeto.

## Verificando a versão do Java

Para verificar a versão do Java instalada na sua máquina, você pode executar o seguinte comando no terminal:

```bash
java -version
```
## Como executar o projeto

### Clone este repositório
```bash
git clone https://github.com/LeonardoVieiraGuimaraes/OrientacaoObjetos
```
### Acesse a pasta do projeto no terminal/cmd
```bash
cd OrientacaoObjetos/VisaoGeral/Java
```
### Compile o projeto
```bash
javac Main.java
```
### Execute a aplicação
```bash
java Main
```