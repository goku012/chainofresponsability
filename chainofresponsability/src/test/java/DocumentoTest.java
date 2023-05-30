import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DocumentoTest {

    CEO ceo;
    DiretorFinanceiro diretorFinanceiro;
    GerenteFinanceiro gerenteFinanceiro;

    @BeforeEach
    void setUp() {
        ceo = new CEO(null);
        diretorFinanceiro = new DiretorFinanceiro(ceo);
        gerenteFinanceiro = new GerenteFinanceiro(diretorFinanceiro);
    }

    @Test
    void deveRetornarGerenteFinanceiroParaAprovacaoNotaFiscal() {
        assertEquals("Gerente Financeiro aprovou a despesa.", gerenteFinanceiro.aprovarDespesa(new Documento(TipoDocumentoNotaFiscal.getTipoDocumentoNotaFiscal())));
    }

    @Test
    void deveRetornarDiretorFinanceiroParaAprovacaoRelatorio() {
        assertEquals("Diretor Financeiro aprovou a despesa.", gerenteFinanceiro.aprovarDespesa(new Documento(TipoDocumentoRelatorio.getTipoDocumentoRelatorio())));
    }

    @Test
    void deveRetornarCEOParaAprovacaoProposta() {
        assertEquals("CEO aprovou a despesa.", gerenteFinanceiro.aprovarDespesa(new Documento(TipoDocumentoProposta.getTipoDocumentoProposta())));
    }

    @Test
    void deveRetornarDespesaNaoAprovadaParaDocumentoDesconhecido() {
        assertEquals("Despesa não aprovada.", gerenteFinanceiro.aprovarDespesa(new Documento(new TipoDocumento() {
        })));
    }
}