package tkt.cmu.vn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tkt.cmu.vn.converter.NewConverter;
import tkt.cmu.vn.dto.NewDTO;
import tkt.cmu.vn.entity.NewEntity;
import tkt.cmu.vn.repository.NewRepository;
import tkt.cmu.vn.repository.paging.Pageable;
import tkt.cmu.vn.service.INewService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class NewService implements INewService {

    @Autowired
    private NewRepository newRepository;
    @Autowired
    private NewConverter newConverter;
    @Override
    public void findAll(NewDTO model, Pageable pageable) {
        // java 7
//        List<NewEntity> newEntities = newRepository.findAll(pageable);
//        List<NewDTO> newDTOS = new ArrayList<>();
//        for (NewEntity item: newEntities){
//            NewDTO newDTO = newConverter.convertToDto(item);
//            newDTOS.add(newDTO);
//    }
        // java 8
        List<NewEntity> news = newRepository.findAll(pageable);
        model.setListResult(news.stream().map(item->newConverter.convertToDto(item)).collect(Collectors.toList()));
        model.setTotalItems(newRepository.getTotalItems().intValue());

    }
}
