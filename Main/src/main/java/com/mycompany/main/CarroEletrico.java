/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author gustawz
 */
public class CarroEletrico extends Carro {
    private int capacidadeBateria;

    public CarroEletrico(String marca, String modelo, int ano, String tipoDeCombustivel, int capacidadeBateria) {
        super(marca, modelo, ano, tipoDeCombustivel);
        this.capacidadeBateria = capacidadeBateria;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Capacidade da Bateria: " + capacidadeBateria + " kWh");
    }
}

