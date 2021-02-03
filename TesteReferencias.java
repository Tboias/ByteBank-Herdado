public class TesteReferencias {
    public static void main(String[] args) {
        EditorDeVideo editor = new EditorDeVideo();
        Funcionario f = new Funcionario();
        Gerente g1 = new Gerente();
        editor.setSalario(2500.0);
        f.setSalario(2500.0);
        g1.setSalario(5000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registraBonificacao(g1, f, editor);

        System.out.println(" ");
        System.out.println(controle.getSoma());
        System.out.println(" ");
    }
}