package padroescriacao.unificados;

public class FabricaPosGraduacao implements FabricaAbstrata {
    public Diploma criarDiploma() { return new DiplomaPosGraduacao(); }
    public Historico criarHistorico() { return new HistoricoPosGraduacao(); }
}
