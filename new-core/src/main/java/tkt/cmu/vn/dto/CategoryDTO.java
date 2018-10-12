package tkt.cmu.vn.dto;

public class CategoryDTO extends AbstractDTO {
    private static final long serialVersionUID = 1176684400332617620L;
    private String name;
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}