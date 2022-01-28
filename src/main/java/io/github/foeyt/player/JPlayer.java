package io.github.foeyt.player;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class JPlayer {
    public void play(int id) {
        try {
            playMusic(getSongURL(id));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public String getSongURL(int id) {
        return "http://music.163.com/song/media/outer/url?id=" + id + ".mp3";
    }


    public boolean playMusic(String url) throws MalformedURLException {
        URL url1 = new URL(url);
        BufferedInputStream inputStream = null;
        try {
            URLConnection connection = url1.openConnection();
            inputStream = new BufferedInputStream(connection.getInputStream());
            if (inputStream.read() == -1) {
                System.out.println("不可用的url:" + url);
                return false;
            }
            Player player = new Player(inputStream);
            player.play();
            if (player.isComplete()) {
                player.close();
            }

            return true;
        } catch (IOException | JavaLayerException e) {
            e.printStackTrace();
        }
        return true;
    }
}
