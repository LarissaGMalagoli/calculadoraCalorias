package br.com.meli.calculadoracalorias.entity;



import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;

import java.util.List;

public class FoodDTO {

        private String name;
        private List<Ingrediente> ingredientes;

        public void setName(String name) {
            this.name = name;
        }

        public void setIngredientes(List<Ingrediente> ingredients) {
            this.ingredientes = ingredientes;
        }

        private int totalCaloria(){
            return ingredientes.stream().mapToInt(Ingrediente::getCaloria).sum();
        }

        public Food convert(){
            return new Food(name, totalCaloria(), ingredientes);
        }

    }
