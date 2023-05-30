public class TipoDocumentoProposta implements TipoDocumento {

    private static TipoDocumentoProposta tipoDocumentoProposta = new TipoDocumentoProposta();

    private TipoDocumentoProposta() {
    }

    public static TipoDocumentoProposta getTipoDocumentoProposta() {
        return tipoDocumentoProposta;
    }
}