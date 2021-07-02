package br.com.meli.calculadoracalorias.entity;

public class Ingrediente {
    private String name;
    private int calories;

    public Ingrediente(String name, int caloria) {
        this.name = name;
        this.calories = caloria;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public int getCaloria() {
        return calories;
    }

    public void setCaloria(int caloria) {
        this.calories = caloria;
    }

}
