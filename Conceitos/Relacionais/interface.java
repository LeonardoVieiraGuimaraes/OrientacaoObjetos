package Relacionais;

// Interface fornecida pelo Ministério da Saúde
interface RelatorioMinisterioSaude {
    void enviarFaturamentoMensal(double faturamento);

    void enviarProcedimentosRealizados(int procedimentos);
}

// Implementação da interface no Hospital
class Hospital implements RelatorioMinisterioSaude {
    @Override
    public void enviarFaturamentoMensal(double faturamento) {
        // Implementação específica para o Hospital
        System.out.println("Enviando faturamento mensal para o Ministério da Saúde: R$" + faturamento);
    }

    @Override
    public void enviarProcedimentosRealizados(int procedimentos) {
        // Implementação específica para o Hospital
        System.out.println("Enviando procedimentos realizados para o Ministério da Saúde: " + procedimentos);
    }
}

// Outro Hospital implementando a mesma interface
class OutroHospital implements RelatorioMinisterioSaude {
    @Override
    public void enviarFaturamentoMensal(double faturamento) {
        // Implementação específica para o Outro Hospital
        System.out.println("Enviando relatório financeiro para o Ministério da Saúde: R$" + faturamento);
    }

    @Override
    public void enviarProcedimentosRealizados(int procedimentos) {
        // Implementação específica para o Outro Hospital
        System.out.println("Enviando estatísticas de procedimentos para o Ministério da Saúde: " + procedimentos);
    }
}
