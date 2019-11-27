package f.nouar.tourguideapp.adapters;

public class Monument {
    private String Title;
    private String Description;
    private int imgId;

    public Monument(String title, String description, int imgId) {
        Title = title;
        Description = description;
        this.imgId = imgId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
