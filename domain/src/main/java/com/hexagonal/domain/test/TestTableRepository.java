package com.hexagonal.domain.test;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TestTableRepository extends CrudRepository<TestTable, Long> {
}
