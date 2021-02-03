public class ControleBonificacao {

    private double soma;

    public void registraBonificacao(Gerente g, Funcionario f, EditorDeVideo editor) {

        double boni = g.getBonificacao();
        this.soma = this.soma + boni;

        double boniF = f.getBonificacao();
        this.soma = this.soma + boniF;

        double boniEditor = f.getBonificacao();
        this.soma = this.soma + boniEditor;
    }

    public double getSoma() {
        return soma;
    }
}
