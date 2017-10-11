package poemhive.dream.yehtun.poemhive.data;

/**
 * Created by Ye Htun on 2017-10-04.
 */

public class PoetData {
    int poetId;
    int poetImage;
    String poetName;
    int poemCount;

    public PoetData(int poetId, int poetImage, String poetName, int poemCount) {
        this.poetId = poetId;
        this.poetImage = poetImage;
        this.poetName = poetName;
        this.poemCount = poemCount;
    }

    public void setPoetId(int poetId) {
        this.poetId = poetId;
    }

    public void setPoetImage(int poetImage) {
        this.poetImage = poetImage;
    }

    public void setPoetName(String poetName) {
        this.poetName = poetName;
    }

    public void setPoemCount(int poemCount) {
        this.poemCount = poemCount;
    }

    public int getPoetId() {
        return poetId;
    }

    public int getPoetImage() {
        return poetImage;
    }

    public String getPoetName() {
        return poetName;
    }

    public int getPoemCount() {
        return poemCount;
    }
}
