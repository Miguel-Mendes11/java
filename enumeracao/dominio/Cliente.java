package enumeracao.dominio;

public class Cliente {
    private String nome;
    private TipoCliente tipocliente;
    private TipoPagamento tipopagamento;

    public Cliente(String nome, TipoCliente tipocliente, TipoPagamento tipopagamento){
        this.nome = nome;
        this.tipocliente = tipocliente;
        this.tipopagamento = tipopagamento;
    }

    public String toString(){
        return "Cliente: " + nome + " Tipo Cliente: " + tipocliente.getNomeRelatorio() + " Tipo Cliente Valor:" + tipocliente.valor + " Tipo Pagamento: " + tipopagamento;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public TipoCliente getTipoCliente(){
        return tipocliente;
    }

    public void setTipoCliente(TipoCliente tipocliente){
        this.tipocliente = tipocliente;
    }

    public TipoPagamento getTipoPagamento(){
        return tipopagamento;
    }

    public void setTipoPagamento(TipoPagamento tipopagamento){
        this.tipopagamento = tipopagamento;
    }

}