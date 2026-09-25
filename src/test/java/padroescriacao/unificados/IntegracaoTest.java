package padroescriacao.unificados;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntegracaoTest {
    @Test void escolheFamiliaGraduacao() {
        Aluno aluno = new Aluno("graduacao");
        assertEquals("Diploma de Graduação", aluno.emitirDiploma());
        assertEquals("Histórico de Graduação", aluno.emitirHistorico());
    }
    @Test void escolheFamiliaPosGraduacao() {
        Aluno aluno = new Aluno("posgraduacao");
        assertEquals("Diploma de Pós-graduação", aluno.emitirDiploma());
        assertEquals("Histórico de Pós-graduação", aluno.emitirHistorico());
    }
    @Test void fabricaEUnica() {
        assertSame(FactoryMethod.getInstance(), FactoryMethod.getInstance());
    }
    @Test void rejeitaFormacaoDesconhecida() {
        assertThrows(IllegalArgumentException.class, () -> new Aluno("outro"));
    }
}
