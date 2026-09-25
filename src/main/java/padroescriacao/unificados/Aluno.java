package padroescriacao.unificados;

public class Aluno {
    private final Diploma diploma;
    private final Historico historico;

    public Aluno(String tipoFormacao) {
        FabricaAbstrata fabrica = FactoryMethod.getInstance().criarFabrica(tipoFormacao);
        this.diploma = fabrica.criarDiploma();
        this.historico = fabrica.criarHistorico();
    }
    public String emitirDiploma() { return diploma.emitir(); }
    public String emitirHistorico() { return historico.emitir(); }
}
