package io.github.foeyt.api;

import io.github.foeyt.api.bean.SearchJsonBean;

public class SearchResultFormat {
    private SearchJsonBean jsonBean;

    public SearchResultFormat(SearchJsonBean jsonBean) {
        this.jsonBean = jsonBean;
    }

    public String[] getSingleName() {
        String[] names = new String[10];
        for (int i = 0; i < jsonBean.getResult().getSongs().size(); i++) {
            names[i] = jsonBean.getResult().getSongs().get(i).getName();
        }
        return names;
    }

    public int[] getSingleID() {
        int[] ids = new int[10];
        for (int i = 0; i < jsonBean.getResult().getSongs().size(); i++) {
            ids[i] = jsonBean.getResult().getSongs().get(i).getId();
        }
        return ids;
    }

    public String[] getSingleSinger() {
        String[] singers = new String[10];
        for (int i = 0; i < jsonBean.getResult().getSongs().size(); i++) {
            for (int j = 0; j < jsonBean.getResult().getSongs().get(i).getArtists().size(); j++) {
                singers[i] = jsonBean.getResult().getSongs().get(i).getArtists().get(j).getName();
            }
        }
        return singers;
    }

    public String[] getSingleAlbumName() {
        String[] albumNames = new String[10];
        for (int i = 0; i < jsonBean.getResult().getSongs().size(); i++) {
            albumNames[i] = jsonBean.getResult().getSongs().get(i).getAlbum().getName();
        }
        return albumNames;
    }

    public void formatSearchResult() {
        for (int i = 0; i < jsonBean.getResult().getSongs().size(); i++) {
            System.out.println(i + 1 + ". " + getSingleName()[i] + " - " + getSingleSinger()[i] + " | " + getSingleAlbumName()[i]);
        }
    }
}
