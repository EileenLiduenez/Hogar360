package com.pragma.home360.home.infrastructure.mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HomeEntityMapper {
    CategoryEntity modelToEntity(CategoryModel categoryModel);
    CategoryModel entityToModel(CategoryEntity categoryEntity);
    List<CategoryModel> entityListToModelList(List<CategoryEntity> categories);
}
