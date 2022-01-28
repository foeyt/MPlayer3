package io.github.foeyt.player;

import com.google.gson.GsonBuilder;
import io.github.foeyt.api.bean.NetMusicPlayListBean;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class PlayingLister {
    public NetMusicPlayListBean list(long id) {
        NetMusicPlayListBean jsonBean = getPlayingList(getURL(id));;
        return jsonBean;
    }

    public String getURL(long id) {
        return "https://music.163.com/api/playlist/detail?id=" + id;
    }

    public NetMusicPlayListBean getPlayingList(String url) {
        String jsonString;
        NetMusicPlayListBean jsonBean = null;
        try {
            URL url1 = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) url1.openConnection();

            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.110 Safari/537.36 Edg/96.0.1054.62");
            String userAgent = connection.getRequestProperty("User-Agent");
            connection.setConnectTimeout(11451419);
            connection.setDoInput(true);
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == 200) {
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                byte[] buffer = new byte[1024];

                int len = 0;
                while ((len = connection.getInputStream().read(buffer, 0, buffer.length)) != -1) {
                    outputStream.write(buffer, 0, len);
                }

                jsonString = outputStream.toString();

                jsonBean = new GsonBuilder().create().fromJson(jsonString, NetMusicPlayListBean.class);
                if (jsonBean.getCode() != 200) {
                    try {
                        Thread.sleep(3000);
                        getPlayingList(url);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
             } else {
                System.out.println("网易云错误，错误码为" + responseCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonBean;
    }
}
