package io.github.foeyt.api.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchJsonBean {

    @SerializedName("result")
    private ResultDTO result;
    @SerializedName("code")
    private int code;

    public ResultDTO getResult() {
        return result;
    }

    public void setResult(ResultDTO result) {
        this.result = result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static class ResultDTO {
        @SerializedName("songs")
        private List<SongsDTO> songs;
        @SerializedName("songCount")
        private int songCount;

        public List<SongsDTO> getSongs() {
            return songs;
        }

        public void setSongs(List<SongsDTO> songs) {
            this.songs = songs;
        }

        public int getSongCount() {
            return songCount;
        }

        public void setSongCount(int songCount) {
            this.songCount = songCount;
        }

        public static class SongsDTO {
            @SerializedName("id")
            private int id;
            @SerializedName("name")
            private String name;
            @SerializedName("artists")
            private List<ArtistsDTO> artists;
            @SerializedName("album")
            private AlbumDTO album;
            @SerializedName("duration")
            private int duration;
            @SerializedName("copyrightId")
            private int copyrightId;
            @SerializedName("status")
            private int status;
            @SerializedName("alias")
            private List<?> alias;
            @SerializedName("rtype")
            private int rtype;
            @SerializedName("ftype")
            private int ftype;
            @SerializedName("mvid")
            private int mvid;
            @SerializedName("fee")
            private int fee;
            @SerializedName("rUrl")
            private Object rUrl;
            @SerializedName("mark")
            private long mark;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<ArtistsDTO> getArtists() {
                return artists;
            }

            public void setArtists(List<ArtistsDTO> artists) {
                this.artists = artists;
            }

            public AlbumDTO getAlbum() {
                return album;
            }

            public void setAlbum(AlbumDTO album) {
                this.album = album;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public int getCopyrightId() {
                return copyrightId;
            }

            public void setCopyrightId(int copyrightId) {
                this.copyrightId = copyrightId;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public List<?> getAlias() {
                return alias;
            }

            public void setAlias(List<?> alias) {
                this.alias = alias;
            }

            public int getRtype() {
                return rtype;
            }

            public void setRtype(int rtype) {
                this.rtype = rtype;
            }

            public int getFtype() {
                return ftype;
            }

            public void setFtype(int ftype) {
                this.ftype = ftype;
            }

            public int getMvid() {
                return mvid;
            }

            public void setMvid(int mvid) {
                this.mvid = mvid;
            }

            public int getFee() {
                return fee;
            }

            public void setFee(int fee) {
                this.fee = fee;
            }

            public Object getRUrl() {
                return rUrl;
            }

            public void setRUrl(Object rUrl) {
                this.rUrl = rUrl;
            }

            public long getMark() {
                return mark;
            }

            public void setMark(int mark) {
                this.mark = mark;
            }

            public static class AlbumDTO {
                @SerializedName("id")
                private int id;
                @SerializedName("name")
                private String name;
                @SerializedName("artist")
                private ArtistDTO artist;
                @SerializedName("publishTime")
                private long publishTime;
                @SerializedName("size")
                private int size;
                @SerializedName("copyrightId")
                private int copyrightId;
                @SerializedName("status")
                private int status;
                @SerializedName("picId")
                private long picId;
                @SerializedName("mark")
                private int mark;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public ArtistDTO getArtist() {
                    return artist;
                }

                public void setArtist(ArtistDTO artist) {
                    this.artist = artist;
                }

                public long getPublishTime() {
                    return publishTime;
                }

                public void setPublishTime(long publishTime) {
                    this.publishTime = publishTime;
                }

                public int getSize() {
                    return size;
                }

                public void setSize(int size) {
                    this.size = size;
                }

                public int getCopyrightId() {
                    return copyrightId;
                }

                public void setCopyrightId(int copyrightId) {
                    this.copyrightId = copyrightId;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public long getPicId() {
                    return picId;
                }

                public void setPicId(long picId) {
                    this.picId = picId;
                }

                public int getMark() {
                    return mark;
                }

                public void setMark(int mark) {
                    this.mark = mark;
                }

                public static class ArtistDTO {
                    @SerializedName("id")
                    private int id;
                    @SerializedName("name")
                    private String name;
                    @SerializedName("picUrl")
                    private Object picUrl;
                    @SerializedName("alias")
                    private List<?> alias;
                    @SerializedName("albumSize")
                    private int albumSize;
                    @SerializedName("picId")
                    private int picId;
                    @SerializedName("img1v1Url")
                    private String img1v1Url;
                    @SerializedName("img1v1")
                    private int img1v1;
                    @SerializedName("trans")
                    private Object trans;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public Object getPicUrl() {
                        return picUrl;
                    }

                    public void setPicUrl(Object picUrl) {
                        this.picUrl = picUrl;
                    }

                    public List<?> getAlias() {
                        return alias;
                    }

                    public void setAlias(List<?> alias) {
                        this.alias = alias;
                    }

                    public int getAlbumSize() {
                        return albumSize;
                    }

                    public void setAlbumSize(int albumSize) {
                        this.albumSize = albumSize;
                    }

                    public int getPicId() {
                        return picId;
                    }

                    public void setPicId(int picId) {
                        this.picId = picId;
                    }

                    public String getImg1v1Url() {
                        return img1v1Url;
                    }

                    public void setImg1v1Url(String img1v1Url) {
                        this.img1v1Url = img1v1Url;
                    }

                    public int getImg1v1() {
                        return img1v1;
                    }

                    public void setImg1v1(int img1v1) {
                        this.img1v1 = img1v1;
                    }

                    public Object getTrans() {
                        return trans;
                    }

                    public void setTrans(Object trans) {
                        this.trans = trans;
                    }
                }
            }

            public static class ArtistsDTO {
                @SerializedName("id")
                private int id;
                @SerializedName("name")
                private String name;
                @SerializedName("picUrl")
                private Object picUrl;
                @SerializedName("alias")
                private List<?> alias;
                @SerializedName("albumSize")
                private int albumSize;
                @SerializedName("picId")
                private int picId;
                @SerializedName("img1v1Url")
                private String img1v1Url;
                @SerializedName("img1v1")
                private int img1v1;
                @SerializedName("trans")
                private Object trans;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public Object getPicUrl() {
                    return picUrl;
                }

                public void setPicUrl(Object picUrl) {
                    this.picUrl = picUrl;
                }

                public List<?> getAlias() {
                    return alias;
                }

                public void setAlias(List<?> alias) {
                    this.alias = alias;
                }

                public int getAlbumSize() {
                    return albumSize;
                }

                public void setAlbumSize(int albumSize) {
                    this.albumSize = albumSize;
                }

                public int getPicId() {
                    return picId;
                }

                public void setPicId(int picId) {
                    this.picId = picId;
                }

                public String getImg1v1Url() {
                    return img1v1Url;
                }

                public void setImg1v1Url(String img1v1Url) {
                    this.img1v1Url = img1v1Url;
                }

                public int getImg1v1() {
                    return img1v1;
                }

                public void setImg1v1(int img1v1) {
                    this.img1v1 = img1v1;
                }

                public Object getTrans() {
                    return trans;
                }

                public void setTrans(Object trans) {
                    this.trans = trans;
                }
            }
        }
    }
}
