/**
 * Copyright (C) 2012-2013 Risco-Software - All rights reserved.
 */

package pl.java.scalatech.service.common;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import pl.java.scalatech.domain.PKNature;


public interface PaginationService<T extends PKNature<K>, K extends Serializable> {

    Page<T> findPageByCondition(Pageable pageable);

    String convert2Json(Object object);

    List<T> getAll();

    Page<T> getPage();

    T persist(T t);

    void delete(T t);

    T update(T t);

    T findById(K id);
    

    long count();

    boolean isLazy(T t);

}
