package io.github.foeyt.api.bean;

public class ListBean {
    private String songName;
    private int id;
    private String singerName;
    private String albumName;

    public String getSongName() {
        return songName;
    }

    public int getId() {
        return id;
    }

    public String getSingerName() {
        return singerName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    @Override
    public String toString() {
        return songName + " - " + singerName + " | " + albumName;
    }
}
