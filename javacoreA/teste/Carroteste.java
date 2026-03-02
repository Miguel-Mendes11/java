package javacoreA.teste;

import javacoreA.dominio.Carro;

public class Carroteste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        carro1.marca = "Jetour";
        carro1.modelo = "T2";
        carro1.ano = 2025;
        carro2.marca = "Toyota";
        carro2.modelo = "Yaris Cross";
        carro2.ano = 2025;

        //carro1 = carro2; serve para apontar o carro1 para o mesmo endereço de memória do carro2, ou seja, ambos os objetos passam a ser o mesmo objeto(carro2), e as alterações feitas em um deles afetarão o outro.

        System.out.println("O carro 1 é um "+carro1.marca+" do modelo "+carro1.modelo+" lançado no ano de "+carro1.ano);
        System.out.println("\nO carro 2 é um "+carro2.marca+" do modelo "+carro2.modelo+" lançado no ano de "+carro2.ano+"\n");
    }

}
