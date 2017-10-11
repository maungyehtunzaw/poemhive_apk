package poemhive.dream.yehtun.poemhive.data;

/**
 * Created by Ye Htun on 2017-09-01.
 */

public class PoemData {
    private int id;
    private int image;
    private String title;
    private String created;

    public PoemData(int id, int image, String title, String created) {
        this.id = id;
        this.image = image;
        this.title = title;
        this.created = created;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }
}
