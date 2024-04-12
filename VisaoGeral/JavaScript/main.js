// Classe Autor representa o conceito de um autor de livro (Abstração)
class Autor {
  constructor(nome, nacionalidade) {
    this.nome = nome;
    this.nacionalidade = nacionalidade;
  }
}

// Classe Livro representa o conceito de um livro (Abstração)
class Livro {
  constructor(titulo, autor, numero_paginas) {
    this.titulo = titulo;
    this.autor = autor;
    this.numero_paginas = numero_paginas;
  }
}

// Classe Cliente representa o conceito de um cliente de biblioteca (Abstração)
class Cliente {
  constructor(nome, endereco) {
    this.nome = nome;
    this.endereco = endereco;
  }
}

// Classe Biblioteca representa o conceito de uma biblioteca (Abstração)
class Biblioteca {
  constructor(livro, cliente) {
    this.livro = livro;
    this.cliente = cliente;
  }

  exibir_informacoes() {
    console.log("Livro: ", this.livro.titulo);
    console.log("Autor: ", this.livro.autor.nome);
    console.log("Nacionalidade do Autor: ", this.livro.autor.nacionalidade);
    console.log("Número de páginas: ", this.livro.numero_paginas);
    console.log("Cliente: ", this.cliente.nome);
    console.log("Endereço do Cliente: ", this.cliente.endereco);
  }
}

// Teste
let autor = new Autor("George Orwell", "Britânico");
let livro = new Livro("1984", autor, 328);
let cliente = new Cliente("João", "Rua Principal, 123");
let biblioteca = new Biblioteca(livro, cliente);

biblioteca.exibir_informacoes();
