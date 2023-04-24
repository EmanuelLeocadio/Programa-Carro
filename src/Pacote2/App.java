package Pacote2;

import Pacote3.Carro;

public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro("ABC1234", 123456789);
        System.out.print("\033[H\033[2J");
         System.out.flush();
        
        System.out.printf("Carro contém a placa %s e o número do chassi %d", carro.getPlaca(), carro.getNumChassi());
        System.out.println("");
        System.out.println("Velocidade do Carro: " + carro.getVelocidadeAtual());;
        for (int i = 0; i < 10; i++ ){
            carro.acelerar();
        }
        System.out.println("Velocidade do carro: " + carro.getVelocidadeAtual());
        
        System.out.println("ACELERANDO ATÉ 50 KM/H");
        carro.acelerar(50);
        System.out.println("Velocidade do carro: " + carro.getVelocidadeAtual());
    }
}
