package ru.yamakassi.baseexamplek8sspring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.yamakassi.baseexamplek8sspring.dto.CatDto;
import ru.yamakassi.baseexamplek8sspring.entity.Cat;
import ru.yamakassi.baseexamplek8sspring.repository.CatRepository;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CatService {

    private final CatRepository catRepository;

    public Cat save(CatDto catDto) {
        Cat cat = new Cat()
            .setBirthDay(catDto.getBirthDay())
            .setId(UUID.randomUUID().toString())
            .setCreatedAt(LocalDateTime.now())
            .setName(catDto.getName());


        return catRepository.save(cat);
    }

    public Iterable<Cat> getAll() {
        return catRepository.findAll();
    }

}

