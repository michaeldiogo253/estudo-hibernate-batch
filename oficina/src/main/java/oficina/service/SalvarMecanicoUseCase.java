package oficina.service;

import lombok.RequiredArgsConstructor;
import oficina.domain.Mecanico;
import oficina.repository.MecanicoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
@Transactional
@RequiredArgsConstructor
public class SalvarMecanicoUseCase {

    private final MecanicoRepository repository;

    public void execute(String nome, Integer idade) {

        List<Mecanico> mecanicos = IntStream.range(0, 100000)
                                          .mapToObj(i -> new Mecanico(nome, idade))
                                          .collect(Collectors.toList());

        repository.saveAll(mecanicos);

    }

}
