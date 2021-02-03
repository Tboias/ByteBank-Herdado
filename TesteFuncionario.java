public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario nico = new Funcionario();
        nico.setNome("Nico Stepopot");
        nico.setCpf("523.456.214-99");
        nico.setSalario(2600.00);

        System.out.println(nico.getNome());
        System.out.println(nico.getCpf());
        System.out.println(nico.getSalario());
        System.out.println(nico.getBonificacao());
    }

}