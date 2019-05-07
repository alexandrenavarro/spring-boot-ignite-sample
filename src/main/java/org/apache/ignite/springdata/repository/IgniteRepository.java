package org.apache.ignite.springdata.repository;

import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.Map;

public interface IgniteRepository<T, ID extends Serializable> extends CrudRepository<T, ID> {
    <S extends T> S save(ID var1, S var2);

    <S extends T> Iterable<S> save(Map<ID, S> var1);

 //   void deleteAll(Iterable<ID> var1);
}
