package padroescriacao.unificados;

public class FabricaGraduacao implements FabricaAbstrata {
    public Diploma criarDiploma() { return new DiplomaGraduacao(); }
    public Historico criarHistorico() { return new HistoricoGraduacao(); }
}
