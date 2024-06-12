@startuml
class Pessoa {
    - String nome
    - int idade
    + Pessoa(String nome, int idade)
}

class Paciente {
    - String historicoMedico
    + Paciente(String nome, int idade, String historicoMedico)
}

class Funcionario {
    - double salario
    - String cargo
    + Funcionario(String nome, int idade, double salario, String cargo)
}

class Medico {
    - String especialidade
    - String crm
    + Medico(String nome, int idade, double salario, String cargo, String especialidade, String crm)
}

Pessoa <|-- Paciente
Pessoa <|-- Funcionario
Funcionario <|-- Medico
@enduml
