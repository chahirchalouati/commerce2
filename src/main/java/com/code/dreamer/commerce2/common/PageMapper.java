package com.code.dreamer.commerce2.common;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public interface PageMapper<T, D> extends ListMapper<T, D> {
    default Page<D> toPage(Page<T> all , Pageable pageable) {
        return new PageImpl<>(map(all.getContent()) , pageable , all.getSize());
    }
}
