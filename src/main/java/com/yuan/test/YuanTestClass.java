package com.yuan.test;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.BeanUtils;

public class YuanTestClass<T extends DataSource> {
	private final List<Class<?>> classes;

	private Class<T> type;


	public YuanTestClass(List<Class<?>> classes) {
		this.classes = classes;
	}

	public T build() {

		T dataSource = BeanUtils.instantiateClass(type);

		return dataSource;
	}

}
