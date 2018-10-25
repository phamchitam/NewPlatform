package tkt.cmu.vn.repository.paging;

public interface Pageable {
    Integer getOffset();
    Integer getPageSize();
    Integer getPageNumber();
}
