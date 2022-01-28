package io.github.foeyt;

import io.github.foeyt.api.list.PlayingList;
import io.github.foeyt.api.SearchResultFormat;
import io.github.foeyt.api.bean.ListBean;
import io.github.foeyt.api.bean.SearchJsonBean;
import io.github.foeyt.api.netmusic.NetMusicPlayingListHolder;
import io.github.foeyt.player.JPlayer;
import io.github.foeyt.player.PlayingLister;
import io.github.foeyt.player.Searcher;

import java.util.List;

public class MPlayer3 {
    private static List<ListBean> musicList;

    public static void printSearchResult(String songName) {
        SearchJsonBean jsonBean = new Searcher().search(songName);
        SearchResultFormat format = new SearchResultFormat(jsonBean);
        format.formatSearchResult();
    }

    public static void printNetMusicPlayingList(long id) {
        PlayingList list = new PlayingList();
        NetMusicPlayingListHolder holder = new NetMusicPlayingListHolder();
        holder.setNetMusicPlayingListToPlayingList(new PlayingLister().list(id));

        System.out.println(holder);
        musicList = list.getSongs();
    }

    public static void playMusicList() {
        JPlayer player = new JPlayer();
        List<ListBean> list = musicList;

        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                ListBean current = list.get(i);
//                if (playingList.getNext(current) != null) {
//                    System.out.println(playingList.getNext(current));
//                }
                player.play(current.getId());
            }
        }
    }

    public static void addToList(String songName, int userChoice) {
        SearchJsonBean jsonBean = new Searcher().search(songName);
        SearchResultFormat format = new SearchResultFormat(jsonBean);

        ListBean listBean = new ListBean();
        PlayingList list = new PlayingList();
        listBean.setSongName(format.getSingleName()[userChoice - 1]);
        listBean.setId(format.getSingleID()[userChoice - 1]);
        listBean.setSingerName(format.getSingleSinger()[userChoice - 1]);
        listBean.setAlbumName(format.getSingleAlbumName()[userChoice - 1]);

        list.getSongs().add(listBean);

        musicList = list.getSongs();
    }

    public static void printPlayingList() {
        PlayingList list = new PlayingList();
        list.printPlayingList();
    }
}
