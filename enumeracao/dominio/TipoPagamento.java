package enumeracao.dominio;

public enum TipoPagamento {
    CARTAO_CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CARTAO_DEBITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    
    public abstract double calcularDesconto(double valor);
    //método abstrato é o método que foi criado somente para ser sobrescrito
    
}
