package tkt.cmu.vn.repository.custom;


import tkt.cmu.vn.entity.NewEntity;
import tkt.cmu.vn.repository.paging.Pageable;

import java.util.List;

public interface NewRepositoryCustom  {
    List<NewEntity> findAll(Pageable pageable);
    Long getTotalItems();
}
