public class TipoDocumentoNotaFiscal implements TipoDocumento {

    private static TipoDocumentoNotaFiscal tipoDocumentoNotaFiscal = new TipoDocumentoNotaFiscal();

    private TipoDocumentoNotaFiscal() {
    }

    public static TipoDocumentoNotaFiscal getTipoDocumentoNotaFiscal() {
        return tipoDocumentoNotaFiscal;
    }
}