public class TesteReferencias {
    public static void main(String[] args) {
        EditorDeVideo editor = new EditorDeVideo();
        Funcionario f = new Funcionario();
        Gerente g1 = new Gerente();
        Cordenador cordenante = new Cordenador();

        editor.setSalario(2500);
        f.setSalario(2500);
        g1.setSalario(5000);
        cordenante.setSalario(6000);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registraBonificacao(f);
        controle.registraBonificacao(g1);
        controle.registraBonificacao(editor);
        controle.registraBonificacao(cordenante);

        ControleDeSaldo controleSalario = new ControleDeSaldo();
        controleSalario.totalSalarios(f);
        controleSalario.totalSalarios(g1);
        controleSalario.totalSalarios(editor);
        controleSalario.totalSalarios(cordenante);

        System.out.println(" ");
        System.out.println(controle.getSomaBonificacao());
        System.out.println(controleSalario.getTotalSalarioComBonificacao());
        System.out.println(" ");
    }
}