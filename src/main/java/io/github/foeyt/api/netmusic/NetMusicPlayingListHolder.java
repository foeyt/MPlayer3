package io.github.foeyt.api.netmusic;

import io.github.foeyt.api.bean.ListBean;
import io.github.foeyt.api.bean.NetMusicPlayListBean;
import io.github.foeyt.api.list.PlayingList;

import java.util.ArrayList;
import java.util.List;

public class NetMusicPlayingListHolder {
    private static List<ListBean> songs = new ArrayList<>();

    private String listName;

    public void setBeanToList(NetMusicPlayListBean netMusicPlayListBean) {
        if (netMusicPlayListBean.getCode() == 200) {
            for (int i = 0; i < netMusicPlayListBean.getResult().getTracks().size(); i++) {
                ListBean bean = new ListBean();
                bean.setSongName(netMusicPlayListBean.getResult().getTracks().get(i).getName());
                bean.setId(netMusicPlayListBean.getResult().getTracks().get(i).getId());
                for (int j = 0; j < netMusicPlayListBean.getResult().getTracks().get(i).getArtists().size(); j++) {
                    bean.setSingerName(netMusicPlayListBean.getResult().getTracks().get(i).getArtists().get(j).getName());
                }
                bean.setAlbumName(netMusicPlayListBean.getResult().getTracks().get(i).getAlbum().getName());

                songs.add(bean);
            }
            listName = netMusicPlayListBean.getResult().getName();
        }
    }

    public void setNetMusicPlayingListToPlayingList(NetMusicPlayListBean netMusicPlayListBean) {
        setBeanToList(netMusicPlayListBean);
        PlayingList.setSongs(songs);
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    @Override
    public String toString() {
        return "歌单：" + listName;
    }
}
