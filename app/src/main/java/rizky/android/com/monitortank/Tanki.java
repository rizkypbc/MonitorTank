package rizky.android.com.monitortank;

import android.graphics.drawable.Drawable;

public class Tanki {

    private String lokasi;
    private int image;

    public Tanki(String lokasi, int image) {
        this.lokasi = lokasi;
        this.image = image;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
