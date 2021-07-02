package br.com.meli.calculadoracalorias.service;

import java.util.List;

import br.com.meli.calculadoracalorias.dao.CalculadoraRepository;
import br.com.meli.calculadoracalorias.entity.Food;
import br.com.meli.calculadoracalorias.entity.FoodDTO;
import br.com.meli.calculadoracalorias.entity.Ingrediente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;


@Service
public class CalculadoraService {

    CalculadoraRepository foodRepository;

    public CalculadoraService(CalculadoraRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public List<Food> findAll() {
        return foodRepository.findAll();
    }

    public Food findById(int id){
        return foodRepository.findById(id);
    }


    public ResponseEntity<Food> add(FoodDTO form, UriComponentsBuilder uriBuilder) {
        Food food = form.convert();
        foodRepository.add(food);

        return ResponseEntity.ok().body(food);
    }

}
