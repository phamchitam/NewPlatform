package tkt.cmu.vn.dto;

public class NewDTO extends AbstractDTO<NewDTO> {

    private static final long serialVersionUID = -4814087466778053355L;
    private String title;
    private String thumbnail;
    private String shortDescripion;
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getShortDescripion() {
        return shortDescripion;
    }

    public void setShortDescripion(String shortDescripion) {
        this.shortDescripion = shortDescripion;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }



}
