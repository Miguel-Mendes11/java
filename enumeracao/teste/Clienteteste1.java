package enumeracao.teste;
import enumeracao.dominio.Cliente;
import enumeracao.dominio.TipoCliente;
import enumeracao.dominio.TipoPagamento;
public class Clienteteste1 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ana Júlia", TipoCliente.PESSOA_FISICA, TipoPagamento.CARTAO_DEBITO);
        Cliente cliente2 = new Cliente("Miguel Mendes", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CARTAO_CREDITO);
        //ou eu uso cliente.tipopagamento.cartao..., ou eu puxo o import Cliente.TipoPagamento e apenas uso TipoPagamento.carto...

        System.out.println(cliente1);
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println(cliente2);
        System.out.println(TipoPagamento.CARTAO_DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CARTAO_CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCLiente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física56");
        System.out.println(tipoCLiente2);

        
    }
}
