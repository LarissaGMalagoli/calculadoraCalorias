package br.com.meli.calculadoracalorias.dto;

import br.com.meli.calculadoracalorias.entity.Ingrediente;

import java.util.List;
import java.util.stream.Collectors;

public class IngredienteDTO {
    private String name;
    private int calorie;

    public IngredienteDTO(String nome, int caloria) {
        this.name = nome;
        this.calorie = caloria;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public int getCaloria() {
        return calorie;
    }

    public void setCaloria(int caloria) {
        this.calorie = caloria;
    }

    public static List<IngredienteDTO> converteIngredientes(List<Ingrediente> ingredientes) {
        return ingredientes.stream().map(a -> new IngredienteDTO(a.getNome(), a.getCaloria())).collect(Collectors.toList());
    }

    public static Ingrediente converte(IngredienteDTO ingrediente) {
        return new Ingrediente(ingrediente.getNome(), ingrediente.getCaloria());
    }
}
