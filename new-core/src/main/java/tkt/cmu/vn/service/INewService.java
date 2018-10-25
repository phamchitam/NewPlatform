package tkt.cmu.vn.service;

import tkt.cmu.vn.dto.NewDTO;
import tkt.cmu.vn.repository.paging.Pageable;

import java.util.List;

public interface INewService {
    void findAll(NewDTO model, Pageable pageable);
}
