package aula;

public class condicionaisternário {
    public static void main(String [] args){
        //var salario = 3000;
        //String doar = "Eu vou doar 500 pila pra Miguel";
        //String naodoar = "Infelizmente terei que deixar Miguel passando fome";
        //String resultado;
        //if (salario>5000){
        //    resultado = doar;
        //} else {
        //    resultado = naodoar;
        //}
        //System.out.println(resultado);
        //OPERADOR TERNÁRIO
        var salario = 6000;
        String doar = "Eu vou doar 500 pila pra Miguel";
        String naodoar = "Infelizmente terei que deixar Miguel passando fome";
        //(condicao) ? verdadeiro : falso
        String resultado = (salario>5000) ? doar : naodoar;
        System.out.println(resultado);
    }
}
