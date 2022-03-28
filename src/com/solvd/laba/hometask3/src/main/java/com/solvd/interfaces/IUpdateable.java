package com.solvd.interfaces;

import com.solvd.exceptions.InvalidValue;

public interface IUpdateable<T> {

    T update() throws InvalidValue;
}
