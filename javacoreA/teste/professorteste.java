package javacoreA.teste;

import javacoreA.dominio.Professor;

public class professorteste {
    public static void main(String[] args){
        Professor professor = new Professor();
        professor.nome = "Kakashi";
        professor.idade = 31;
        professor.altura = 1.79;
        professor.sexo = 'M';
        System.out.println(professor.nome);
        System.out.println(professor.idade);
        System.out.println(professor.altura);
        System.out.println(professor.sexo);
    }
    
}
    
