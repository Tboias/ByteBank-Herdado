public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Marco");
        g1.setCpf("123.568.123-88");
        g1.setSalario(5000.0);
        g1.setSenha(1144665533);
        boolean autenticou = g1.autentica(1144665533);

        System.out.println(" ");
        System.out.println(" Seu nome : " + g1.getNome());
        System.out.println(" Seu CPF : " + g1.getCpf());
        System.out.println(" Seu Salario : " + g1.getSalario());
        System.out.println(" Sua bonificação : " + g1.getBonificacao());
        System.out.println(" Autenticação : " + autenticou);
        System.out.println(" ");
    }
}