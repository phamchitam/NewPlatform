package tkt.cmu.vn.dto;



public class RoleDTO extends AbstractDTO {
    private static final long serialVersionUID = 5000233675425114294L;
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
