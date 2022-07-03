package com.code.dreamer.commerce2.common;

import java.util.List;

public interface ListMapper<T,D> {
    List<D> map(List<T> brands);
}
