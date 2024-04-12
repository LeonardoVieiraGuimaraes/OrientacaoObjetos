<!-- [MermaidChart: 1d069469-e558-4d56-b10a-c3f91b5dd4c8] -->
```mermaid
classDiagram
    class Pessoa {
        - String nome
        - Date dataNascimento
        - Endereco endereco
    }
    class Paciente {
        + void cadastrar(Paciente paciente)
        + void alterar(Paciente paciente)
        + void excluir(Paciente paciente)
        + Paciente consultar(String CPF)
        + Paciente[] consultar(String nome, Date dataNascimento)
        - String CPF
        - Plano plano
    }
    class Medico {
        + void cadastrar(Medico medico)
        + void alterar(Medico medico)
        + void excluir(Medico medico)
        + Medico consultar(int CRM)
        + Medico[] consultar(String nome)
        - int CRM
        - Especialidade[] especialidades
        - double valorHora
    }
    class Consulta {
        + void marcar(Medico medico, Paciente paciente, Date data)
        + void cancelar(Consulta consulta)
        + Consulta[] pesquisarPorPaciente(Paciente paciente)
        - Paciente paciente
        - Medico medico
        - Date data
        - String receituario
        - double valor
    }
    class Procedimento {
        + void marcar(Medico medico, Paciente paciente, Date data)
        + void cancelar(Procedimento procedimento)
        + Procedimento[] pesquisarPorMedico(Medico medico)
        + abstract double caucularTotal()
        - Paciente paciente
        - Medico[] medicos
        - Date data
        - Sala sala
        - String observacoes
        - double valor
        - int tempoDuracao
    }
    class Endereco {
        - String logradouro
        - int numero
        - String bairro
        - String CEP
    }
    class Plano {
        - String nome
        - double mensalidade
    }
    class Especialidade {
        - String nome
    }
    class Sala {
        - String nome
    }
    class ITransmissaoDadosMinisterioSaude {
        + void gerarDados()
    }
    Pessoa "1" -- "1" Endereco
    Paciente --|> Pessoa
    Consulta -- Paciente
    Consulta -- Medico
    Procedimento --|> Consulta
    Procedimento --|> Paciente
    Procedimento --|> Medico
    Procedimento --|> Sala
    Paciente -- Plano
    Medico -- Especialidade

    class ProcedimentoMedico {
        + void marcar(Medico medico, Paciente paciente, Date data)
        + void cancelar(Procedimento procedimento)
        + Procedimento[] pesquisarPorMedico(Medico medico)
        + abstract double caucularTotal()
        - Paciente paciente
        - Medico medico
        - Date data
        - Sala sala
        - String observacoes
        - double valor
        - int tempoDuracao
    }

    class ProcedimentoHospitalar {
        + void marcar(Medico medico, Paciente paciente, Date data)
        + void cancelar(Procedimento procedimento)
        + Procedimento[] pesquisarPorMedico(Medico medico)
        + abstract double caucularTotal()
        - Paciente paciente
        - Medico[] medicos
        - Date data
        - Sala sala
        - String observacoes
        - double valor
        - int tempoDuracao
    }
    Medico -- ProcedimentoMedico
    Medico -- ProcedimentoHospitalar
