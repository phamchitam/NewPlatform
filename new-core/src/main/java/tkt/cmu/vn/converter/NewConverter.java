package tkt.cmu.vn.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import tkt.cmu.vn.dto.NewDTO;
import tkt.cmu.vn.entity.NewEntity;


public class NewConverter {
    @Autowired
    private ModelMapper modelMapper;

    public NewDTO convertToDto(NewEntity entity) {
        NewDTO result = modelMapper.map(entity, NewDTO.class);
        return result;
    }

    public NewEntity convertToEntity(NewDTO newDTO) {
        NewEntity result = modelMapper.map(newDTO, NewEntity.class);
        return result;
    }
}