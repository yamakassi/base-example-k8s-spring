package ru.yamakassi.baseexamplek8sspring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.yamakassi.baseexamplek8sspring.dto.CatDto;
import ru.yamakassi.baseexamplek8sspring.entity.Cat;
import ru.yamakassi.baseexamplek8sspring.service.CatService;

@RestController
@RequestMapping("/cats")
@RequiredArgsConstructor
public class CatController {

    private final CatService service;

    @PostMapping
    public Cat save(@RequestBody CatDto cat) {
        return service.save(cat);
    }

    @GetMapping
    public Iterable<Cat> getAll() {
        return service.getAll();
    }

}
