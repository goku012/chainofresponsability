public class GerenteFinanceiro extends Funcionario {

    public GerenteFinanceiro(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoNotaFiscal.getTipoDocumentoNotaFiscal());
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Gerente Financeiro";
    }
}