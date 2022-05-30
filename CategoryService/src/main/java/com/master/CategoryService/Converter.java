package com.master.CategoryService;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;

public interface Converter<E, D> {

	public default D toDto(E entity, Class<D> dto) {
		return (D) new ModelMapper().map(entity, dto);
	}

	public default E fromDto(D dto, Class<E> entity) {
		return (E) new ModelMapper().map(dto, entity);
	}

	public default List<D> toDtoLst(final Collection<E> entityList, Class<D> outCLass) {
		ModelMapper mp = new ModelMapper();
		return entityList.stream().map(entity -> mp.map(entity, outCLass)).collect(Collectors.toList());
	}

}
