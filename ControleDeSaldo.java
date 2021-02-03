public class ControleDeSaldo {
    private double totalSalario;

    public void totalSalarios(Funcionario f) {
        this.totalSalario = f.getSalario();

        this.totalSalario = f.getBonificacao();
    }

    public double getTotalSalarioComBonificacao() {
        return totalSalario;
    }

}
