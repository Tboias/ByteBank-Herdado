public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Marco");
        g1.setCpf("123.568.123-88");
        g1.setSalario(5000.0);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());
        System.out.println(g1.getBonificacao());

        g1.setSenha(1144665533);
        boolean autenticou = g1.autentica(1144665533);
        System.out.println(autenticou);
    }
}