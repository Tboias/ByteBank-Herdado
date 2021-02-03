public class Cordenador extends Funcionario {
    public double getBonificacao() {
        return super.getBonificacao() + getSalario() + 1000;
    }
}
