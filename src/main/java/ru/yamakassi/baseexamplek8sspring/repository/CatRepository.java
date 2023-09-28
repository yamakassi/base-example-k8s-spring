package ru.yamakassi.baseexamplek8sspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.yamakassi.baseexamplek8sspring.entity.Cat;

public interface CatRepository extends JpaRepository<Cat, String> {

}
