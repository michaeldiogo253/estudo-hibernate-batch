package oficina.controller;

import lombok.RequiredArgsConstructor;
import oficina.service.SalvarMecanicoUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oficina-api/persistir-1000-mecanicos")
@RequiredArgsConstructor
public class Perisistir1000MecanicosController {

    private final SalvarMecanicoUseCase useCase;

    @PostMapping
    public ResponseEntity<Void> salvarMecanicos(@RequestBody SalvarMecanicoRequest request) {

        useCase.execute(request.getNome(), request.getIdade());

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
