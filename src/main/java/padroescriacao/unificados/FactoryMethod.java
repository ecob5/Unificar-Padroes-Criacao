package padroescriacao.unificados;

public final class FactoryMethod {
    private static final FactoryMethod INSTANCE = new FactoryMethod();
    private FactoryMethod() {}
    public static FactoryMethod getInstance() { return INSTANCE; }

    public FabricaAbstrata criarFabrica(String tipo) {
        if (tipo == null) throw new IllegalArgumentException("Tipo de formação obrigatório");
        switch (tipo.trim().toLowerCase()) {
            case "graduacao": return new FabricaGraduacao();
            case "posgraduacao": return new FabricaPosGraduacao();
            default: throw new IllegalArgumentException("Formação não encontrada: " + tipo);
        }
    }
}
