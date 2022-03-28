package com.solvd.interfaces;

import com.solvd.exceptions.InvalidValueException;

public interface IUpdateable<T> {

    T update() throws InvalidValueException;
}
