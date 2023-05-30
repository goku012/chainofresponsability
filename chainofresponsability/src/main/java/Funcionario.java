import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList<TipoDocumento> listaDocumentos = new ArrayList<>();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getDescricaoCargo();

    public String aprovarDespesa(Documento documento) {
        if (listaDocumentos.contains(documento.getTipoDocumento())) {
            return getDescricaoCargo() + " aprovou a despesa.";
        } else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.aprovarDespesa(documento);
            } else {
                return "Despesa não aprovada.";
            }
        }
    }
}