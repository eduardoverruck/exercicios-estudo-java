package com.mycompany.exercicioclassesabstratas.entities;

public class EspadaFabricante {
    
    private String name;
    private double bonus;

    public EspadaFabricante(String name, double bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "EspadaFabricante{" + "name=" + name + ", bonus=" + bonus + '}';
    }
    
}
