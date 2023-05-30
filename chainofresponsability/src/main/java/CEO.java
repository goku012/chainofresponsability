public class CEO extends Funcionario {

    public CEO(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoProposta.getTipoDocumentoProposta());
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "CEO";
    }
}