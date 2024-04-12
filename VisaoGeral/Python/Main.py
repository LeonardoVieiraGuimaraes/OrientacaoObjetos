# Classe Autor representa o conceito de um autor de livro (Abstração)
class Autor:
    def __init__(self, nome, nacionalidade):
        self.nome = nome
        self.nacionalidade = nacionalidade

# Classe Livro representa o conceito de um livro (Abstração)
class Livro:
    def __init__(self, titulo, autor, numero_paginas):
        self.titulo = titulo
        self.autor = autor
        self.numero_paginas = numero_paginas

# Classe Cliente representa o conceito de um cliente de biblioteca (Abstração)
class Cliente:
    def __init__(self, nome, endereco):
        self.nome = nome
        self.endereco = endereco

# Classe Biblioteca representa o conceito de uma biblioteca (Abstração)
class Biblioteca:
    def __init__(self, livro, cliente):
        self.livro = livro
        self.cliente = cliente

    def exibir_informacoes(self):
        print("Livro: ", self.livro.titulo)
        print("Autor: ", self.livro.autor.nome)
        print("Nacionalidade do Autor: ", self.livro.autor.nacionalidade)
        print("Número de páginas: ", self.livro.numero_paginas)
        print("Cliente: ", self.cliente.nome)
        print("Endereço do Cliente: ", self.cliente.endereco)

# Teste
autor = Autor("George Orwell", "Britânico")
livro = Livro("1984", autor, 328)
cliente = Cliente("João", "Rua Principal, 123")
biblioteca = Biblioteca(livro, cliente)

biblioteca.exibir_informacoes()