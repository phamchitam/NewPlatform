package tkt.cmu.vn.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import tkt.cmu.vn.dto.CategoryDTO;
import tkt.cmu.vn.dto.UserDTO;
import tkt.cmu.vn.entity.CategoryEntity;
import tkt.cmu.vn.entity.UserEntity;

public class CategoryConverter {
    @Autowired
    private ModelMapper modelMapper;

    public CategoryDTO convertToDto(CategoryEntity entity) {
        CategoryDTO result = modelMapper.map(entity, CategoryDTO.class);
        return result;
    }

    public CategoryEntity convertToEntity(UserDTO categoryDTO) {
        CategoryEntity result = modelMapper.map(categoryDTO, CategoryEntity.class);
        return result;
    }
}