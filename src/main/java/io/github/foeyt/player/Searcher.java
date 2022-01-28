package io.github.foeyt.player;

import com.google.gson.GsonBuilder;
import io.github.foeyt.api.bean.SearchJsonBean;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.net.URLCodec;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Searcher {
    public SearchJsonBean search(String songName) {
        SearchJsonBean jsonBean = null;
        try {
            jsonBean = getSearchResult(getSearchURL(songName));
        } catch (UnsupportedEncodingException | EncoderException e) {
            e.printStackTrace();
        }
        return jsonBean;
    }

    private String getSearchURL(String songName) throws UnsupportedEncodingException, EncoderException {
        URLCodec codec = new URLCodec();
        String encode = codec.encode(songName);

        return "http://music.163.com/api/search/get/web?csrf_token=hlpretag=&hlposttag=&s=" + encode + "&type=1&offset=0&total=true&limit=10";
    }

    private SearchJsonBean getSearchResult(String url) {
        String jsonString;
        SearchJsonBean jsonBean = null;

        try {
            URL url1 = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) url1.openConnection();

            connection.setConnectTimeout(3000);
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

                jsonBean = new GsonBuilder().create().fromJson(jsonString, SearchJsonBean.class);
            } else {
                System.out.println("网易云错误，错误码为" + responseCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonBean;
    }
}
