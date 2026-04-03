package heranca.teste;

import heranca.dominio.Endereco;
import heranca.dominio.Pessoa;
import heranca.dominio.Funcionario;
public class herancateste1 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Barão de Laugh Tale");
        endereco.setCep(12590);
        Pessoa pessoa = new Pessoa("Monkey D. Luffy");
        pessoa.setCpf("14483148443");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        System.out.println("-----------------------------");
        Funcionario funcionario = new Funcionario("Cachorro Caramelo");
        funcionario.setCpf("14467204932");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(5000);
        funcionario.imprime();
        funcionario.relatorioPagamento();
        //if (funcionario.getCpf().length() == pessoa.getCpf().length()){
            //System.out.println("CPF Válido");
        //}

    }
}
