package tkt.cmu.vn.repository.custom.impl;

import org.springframework.stereotype.Repository;
import tkt.cmu.vn.entity.NewEntity;
import tkt.cmu.vn.repository.custom.NewRepositoryCustom;
import tkt.cmu.vn.repository.paging.Pageable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.math.BigInteger;
import java.util.List;

@Repository
public class NewRepositoryImpl implements NewRepositoryCustom {

    @PersistenceContext
   private EntityManager entityManager;
    @Override
    public List<NewEntity> findAll(Pageable pageable) {
        StringBuilder sql = new StringBuilder("SELECT * FROM new as n");
        Query query = entityManager.createNativeQuery(sql.toString(),NewEntity.class);
        if (pageable.getOffset() != null){
            query.setFirstResult(pageable.getOffset());
        }
        if (pageable.getPageSize() != null){
            query.setMaxResults(pageable.getPageSize());
        }
        return query.getResultList();
    }

    @Override
    public Long getTotalItems() {
        StringBuilder sql = new StringBuilder("SELECT COUNT(*) FROM new");
        Query query = entityManager.createNativeQuery(sql.toString());
        List<BigInteger> bigIntegers = query.getResultList();
        return Long.parseLong(bigIntegers.get(0).toString(), 10);
    }
}
