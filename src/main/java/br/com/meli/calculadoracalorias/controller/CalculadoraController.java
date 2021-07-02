package br.com.meli.calculadoracalorias.controller;

import java.net.URI;
import java.util.List;

import br.com.meli.calculadoracalorias.dao.CalculadoraRepository;
import br.com.meli.calculadoracalorias.entity.Food;
import br.com.meli.calculadoracalorias.entity.FoodDTO;
import br.com.meli.calculadoracalorias.entity.Ingrediente;
import br.com.meli.calculadoracalorias.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;



@RestController
@RequestMapping("/produto")
public class CalculadoraController {


    CalculadoraService foodService;

    public CalculadoraController(CalculadoraService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public List<Food> produtos(){
        return foodService.findAll();
    }

    @GetMapping("/{id}")
    public Food produto(@PathVariable int id){
        return foodService.findById(id);
    }

    @PostMapping
    public ResponseEntity<Food> add(@RequestBody FoodDTO form, UriComponentsBuilder uriBuilder){
        return foodService.add(form, uriBuilder);
    }

  /*  @GetMapping
    @RequestMapping("/ed6")
    public AnuncioDTO endPoint6() {
        Anuncio anuncio = new Anuncio(1, "MLB019182", "Chuteira Adidas Messi 2021");
        return AnuncioDTO.converte(anuncio);
    }

    @GetMapping
    @RequestMapping("/ed7")
    @ResponseStatus(code = HttpStatus.OK)
    public ResponseEntity<AnuncioDTO> endPoint7() {
        Anuncio anuncio = new Anuncio(1, "MLB019182", "Chuteira Adidas Messi 2021");
        return new ResponseEntity<AnuncioDTO>(AnuncioDTO.converte(anuncio), HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity<AnuncioDTO> cadastra(@RequestBody AnuncioDTO anuncioDTO, UriComponentsBuilder uriBuilder) {
        Anuncio anuncio = AnuncioDTO.converte(anuncioDTO, dao);
        dao.adicionar(anuncio);
        URI uri = uriBuilder.path("/anuncios/{id}").buildAndExpand(anuncio.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping
    @RequestMapping("/{id}")
    public AnuncioDTO obterAnuncio(@PathVariable long id) {
        Anuncio anuncio = dao.get(id);
        AnuncioDTO anuncioDTO = AnuncioDTO.converte(anuncio);
        return anuncioDTO;
    }

    @GetMapping
    public List<AnuncioDTO> obterAnuncios() {
        List<Anuncio> anuncios = anuncioService.listar();
        List<AnuncioDTO> dtos = AnuncioDTO.converte(anuncios);
        return dtos;
    }


    @PostMapping
    @RequestMapping("/cadastra")
    public void cadastraAnuncio(@RequestBody AnuncioDTO dto) {
        Anuncio anuncio = AnuncioDTO.converte(dto);
        anuncioService.cadastra(anuncio);
    } */
}
