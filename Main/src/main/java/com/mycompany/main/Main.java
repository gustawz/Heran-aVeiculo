/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author gustawz
 */
public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Toyota", "Corolla", 2020);
        Carro carro = new Carro("Ford", "Fiesta", 2019, "Gasolina");
        CarroEletrico carroEletrico = new CarroEletrico("Tesla", "Model S", 2022, "Elétrico", 100);

        System.out.println("Informações do Veículo:");
        veiculo.exibirInformacoes();

        System.out.println("\nInformações do Carro:");
        carro.exibirInformacoes();

        System.out.println("\nInformações do Carro Elétrico:");
        carroEletrico.exibirInformacoes();
    }
}

