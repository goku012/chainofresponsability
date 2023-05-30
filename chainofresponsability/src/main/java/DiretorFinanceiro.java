public class DiretorFinanceiro extends Funcionario {

    public DiretorFinanceiro(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoRelatorio.getTipoDocumentoRelatorio());
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Diretor Financeiro";
    }
}