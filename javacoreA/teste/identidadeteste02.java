package javacoreA.teste;
import javacoreA.dominio.Estudante;        
public class identidadeteste02 {
    public static void main(String [] args){
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        estudante2.nome = "Sasuke";
        estudante2.idade = 17;
        estudante2.altura = 1.80;
        estudante2.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.altura);
        System.out.println(estudante.sexo);
        System.out.println("-----------------------------");
        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.altura);
        System.out.println(estudante2.sexo);
        //Cada objeto tem seus próprios atributos, ou seja, cada um tem seu nome, idade, altura e sexo. O estudante2 tem os mesmos atributos do estudante, mas com valores diferentes. O estudante tem os valores padrão definidos na classe identidade, enquanto o estudante2 tem os valores definidos no código.




    }
}
