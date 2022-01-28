package io.github.foeyt.api.list;

import io.github.foeyt.api.bean.ListBean;

import java.util.ArrayList;
import java.util.List;

public class PlayingList {
    private static List<ListBean> songs = new ArrayList<>();

    public void printPlayingList() {
        for (ListBean song : songs) {
            System.out.println(song);
        }
    }

    public ListBean getPrev(ListBean current) {
        ListBean prev = null;
        for (int i = 0; i < songs.size(); i++) {
            if ((songs.get(i).equals(current)) && (i != 0)) {
                prev = songs.get(i - 1);
            }
        }
        return prev;
    }

    public ListBean getNext(ListBean current) {
        ListBean next = null;
        for (int i = 0; i < songs.size(); i++) {
            if ((songs.get(i).equals(current)) && (i + 1 <= songs.size())) {
                next = songs.get(i + 1);
            }
        }
        return next;
    }

    public List<ListBean> getSongs() {
        return songs;
    }

    public static void setSongs(List<ListBean> songs) {
        PlayingList.songs = songs;
    }
}
