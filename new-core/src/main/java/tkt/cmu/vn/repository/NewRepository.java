package tkt.cmu.vn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tkt.cmu.vn.entity.NewEntity;
import tkt.cmu.vn.repository.custom.NewRepositoryCustom;

public interface  NewRepository  extends  JpaRepository<NewEntity,Long>, NewRepositoryCustom {
}
