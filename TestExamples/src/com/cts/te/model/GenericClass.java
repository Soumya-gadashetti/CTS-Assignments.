package com.cts.te.model;

public class GenericClass<T> {
	T obj;
	public void add(T obj) {
		this.obj=obj;
	}
	public T get() {
		return obj;
	}
}
