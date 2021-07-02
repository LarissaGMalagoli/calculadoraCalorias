package br.com.meli.calculadoracalorias.entity;

import java.util.ArrayList;
import java.util.List;

public class Food {

    private String name;
    private int calories;
    private List<Ingrediente> ingredientes = new ArrayList<>();



    public Food(){

    }

    public Food(String name, int calories, List<Ingrediente> ingredientes) {
        this.name = name;
        this.calories = calories;
        this.ingredientes = ingredientes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngrediente(Ingrediente i) {
        ingredientes.add(i);
        //System.out.println(comodos.get(0).getNome());
    }

}
