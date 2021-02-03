public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario nico = new Funcionario();
        nico.setNome("Nico Stepopot");
        nico.setCpf("523.456.214-99");
        nico.setSalario(2600.00);

        System.out.println(" ");
        System.out.println(" Seu nome : " + nico.getNome());
        System.out.println(" Seu cpf : " + nico.getCpf());
        System.out.println(" Seu salario : " + nico.getSalario());
        System.out.println(" Sua bonificação : " + nico.getBonificacao());
        System.out.println(" ");

    }

}