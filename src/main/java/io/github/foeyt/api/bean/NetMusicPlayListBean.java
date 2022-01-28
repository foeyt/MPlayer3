package io.github.foeyt.api.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NetMusicPlayListBean {

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
        @SerializedName("subscribers")
        private List<?> subscribers;
        @SerializedName("subscribed")
        private boolean subscribed;
        @SerializedName("creator")
        private CreatorDTO creator;
        @SerializedName("artists")
        private Object artists;
        @SerializedName("tracks")
        private List<TracksDTO> tracks;
        @SerializedName("updateFrequency")
        private Object updateFrequency;
        @SerializedName("backgroundCoverId")
        private int backgroundCoverId;
        @SerializedName("backgroundCoverUrl")
        private Object backgroundCoverUrl;
        @SerializedName("titleImage")
        private int titleImage;
        @SerializedName("titleImageUrl")
        private Object titleImageUrl;
        @SerializedName("englishTitle")
        private Object englishTitle;
        @SerializedName("opRecommend")
        private boolean opRecommend;
        @SerializedName("recommendInfo")
        private Object recommendInfo;
        @SerializedName("description")
        private Object description;
        @SerializedName("userId")
        private int userId;
        @SerializedName("ordered")
        private boolean ordered;
        @SerializedName("coverImgUrl")
        private String coverImgUrl;
        @SerializedName("coverImgId")
        private long coverImgId;
        @SerializedName("updateTime")
        private long updateTime;
        @SerializedName("trackCount")
        private int trackCount;
        @SerializedName("commentThreadId")
        private String commentThreadId;
        @SerializedName("trackUpdateTime")
        private long trackUpdateTime;
        @SerializedName("tags")
        private List<?> tags;
        @SerializedName("createTime")
        private long createTime;
        @SerializedName("highQuality")
        private boolean highQuality;
        @SerializedName("totalDuration")
        private int totalDuration;
        @SerializedName("privacy")
        private int privacy;
        @SerializedName("specialType")
        private int specialType;
        @SerializedName("newImported")
        private boolean newImported;
        @SerializedName("anonimous")
        private boolean anonimous;
        @SerializedName("playCount")
        private int playCount;
        @SerializedName("trackNumberUpdateTime")
        private long trackNumberUpdateTime;
        @SerializedName("subscribedCount")
        private int subscribedCount;
        @SerializedName("cloudTrackCount")
        private int cloudTrackCount;
        @SerializedName("status")
        private int status;
        @SerializedName("adType")
        private int adType;
        @SerializedName("name")
        private String name;
        @SerializedName("id")
        private long id;
        @SerializedName("shareCount")
        private int shareCount;
        @SerializedName("coverImgId_str")
        private String coverimgidStr;
        @SerializedName("commentCount")
        private int commentCount;

        public List<?> getSubscribers() {
            return subscribers;
        }

        public void setSubscribers(List<?> subscribers) {
            this.subscribers = subscribers;
        }

        public boolean isSubscribed() {
            return subscribed;
        }

        public void setSubscribed(boolean subscribed) {
            this.subscribed = subscribed;
        }

        public CreatorDTO getCreator() {
            return creator;
        }

        public void setCreator(CreatorDTO creator) {
            this.creator = creator;
        }

        public Object getArtists() {
            return artists;
        }

        public void setArtists(Object artists) {
            this.artists = artists;
        }

        public List<TracksDTO> getTracks() {
            return tracks;
        }

        public void setTracks(List<TracksDTO> tracks) {
            this.tracks = tracks;
        }

        public Object getUpdateFrequency() {
            return updateFrequency;
        }

        public void setUpdateFrequency(Object updateFrequency) {
            this.updateFrequency = updateFrequency;
        }

        public int getBackgroundCoverId() {
            return backgroundCoverId;
        }

        public void setBackgroundCoverId(int backgroundCoverId) {
            this.backgroundCoverId = backgroundCoverId;
        }

        public Object getBackgroundCoverUrl() {
            return backgroundCoverUrl;
        }

        public void setBackgroundCoverUrl(Object backgroundCoverUrl) {
            this.backgroundCoverUrl = backgroundCoverUrl;
        }

        public int getTitleImage() {
            return titleImage;
        }

        public void setTitleImage(int titleImage) {
            this.titleImage = titleImage;
        }

        public Object getTitleImageUrl() {
            return titleImageUrl;
        }

        public void setTitleImageUrl(Object titleImageUrl) {
            this.titleImageUrl = titleImageUrl;
        }

        public Object getEnglishTitle() {
            return englishTitle;
        }

        public void setEnglishTitle(Object englishTitle) {
            this.englishTitle = englishTitle;
        }

        public boolean getOpRecommend() {
            return opRecommend;
        }

        public void setOpRecommend(boolean opRecommend) {
            this.opRecommend = opRecommend;
        }

        public Object getRecommendInfo() {
            return recommendInfo;
        }

        public void setRecommendInfo(Object recommendInfo) {
            this.recommendInfo = recommendInfo;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public boolean getOrdered() {
            return ordered;
        }

        public void setOrdered(boolean ordered) {
            this.ordered = ordered;
        }

        public String getCoverImgUrl() {
            return coverImgUrl;
        }

        public void setCoverImgUrl(String coverImgUrl) {
            this.coverImgUrl = coverImgUrl;
        }

        public long getCoverImgId() {
            return coverImgId;
        }

        public void setCoverImgId(long coverImgId) {
            this.coverImgId = coverImgId;
        }

        public long getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(long updateTime) {
            this.updateTime = updateTime;
        }

        public int getTrackCount() {
            return trackCount;
        }

        public void setTrackCount(int trackCount) {
            this.trackCount = trackCount;
        }

        public String getCommentThreadId() {
            return commentThreadId;
        }

        public void setCommentThreadId(String commentThreadId) {
            this.commentThreadId = commentThreadId;
        }

        public long getTrackUpdateTime() {
            return trackUpdateTime;
        }

        public void setTrackUpdateTime(long trackUpdateTime) {
            this.trackUpdateTime = trackUpdateTime;
        }

        public List<?> getTags() {
            return tags;
        }

        public void setTags(List<?> tags) {
            this.tags = tags;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public boolean getHighQuality() {
            return highQuality;
        }

        public void setHighQuality(boolean highQuality) {
            this.highQuality = highQuality;
        }

        public int getTotalDuration() {
            return totalDuration;
        }

        public void setTotalDuration(int totalDuration) {
            this.totalDuration = totalDuration;
        }

        public int getPrivacy() {
            return privacy;
        }

        public void setPrivacy(int privacy) {
            this.privacy = privacy;
        }

        public int getSpecialType() {
            return specialType;
        }

        public void setSpecialType(int specialType) {
            this.specialType = specialType;
        }

        public boolean getNewImported() {
            return newImported;
        }

        public void setNewImported(boolean newImported) {
            this.newImported = newImported;
        }

        public boolean getAnonimous() {
            return anonimous;
        }

        public void setAnonimous(boolean anonimous) {
            this.anonimous = anonimous;
        }

        public int getPlayCount() {
            return playCount;
        }

        public void setPlayCount(int playCount) {
            this.playCount = playCount;
        }

        public long getTrackNumberUpdateTime() {
            return trackNumberUpdateTime;
        }

        public void setTrackNumberUpdateTime(long trackNumberUpdateTime) {
            this.trackNumberUpdateTime = trackNumberUpdateTime;
        }

        public int getSubscribedCount() {
            return subscribedCount;
        }

        public void setSubscribedCount(int subscribedCount) {
            this.subscribedCount = subscribedCount;
        }

        public int getCloudTrackCount() {
            return cloudTrackCount;
        }

        public void setCloudTrackCount(int cloudTrackCount) {
            this.cloudTrackCount = cloudTrackCount;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getAdType() {
            return adType;
        }

        public void setAdType(int adType) {
            this.adType = adType;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public int getShareCount() {
            return shareCount;
        }

        public void setShareCount(int shareCount) {
            this.shareCount = shareCount;
        }

        public String getCoverimgidStr() {
            return coverimgidStr;
        }

        public void setCoverimgidStr(String coverimgidStr) {
            this.coverimgidStr = coverimgidStr;
        }

        public int getCommentCount() {
            return commentCount;
        }

        public void setCommentCount(int commentCount) {
            this.commentCount = commentCount;
        }

        public static class CreatorDTO {
            @SerializedName("defaultAvatar")
            private boolean defaultAvatar;
            @SerializedName("province")
            private int province;
            @SerializedName("authStatus")
            private int authStatus;
            @SerializedName("followed")
            private boolean followed;
            @SerializedName("avatarUrl")
            private String avatarUrl;
            @SerializedName("accountStatus")
            private int accountStatus;
            @SerializedName("gender")
            private int gender;
            @SerializedName("city")
            private int city;
            @SerializedName("birthday")
            private long birthday;
            @SerializedName("userId")
            private int userId;
            @SerializedName("userType")
            private int userType;
            @SerializedName("nickname")
            private String nickname;
            @SerializedName("signature")
            private String signature;
            @SerializedName("description")
            private String description;
            @SerializedName("detailDescription")
            private String detailDescription;
            @SerializedName("avatarImgId")
            private long avatarImgId;
            @SerializedName("backgroundImgId")
            private long backgroundImgId;
            @SerializedName("backgroundUrl")
            private String backgroundUrl;
            @SerializedName("authority")
            private int authority;
            @SerializedName("mutual")
            private boolean mutual;
            @SerializedName("expertTags")
            private Object expertTags;
            @SerializedName("experts")
            private Object experts;
            @SerializedName("djStatus")
            private int djStatus;
            @SerializedName("vipType")
            private int vipType;
            @SerializedName("remarkName")
            private Object remarkName;
            @SerializedName("authenticationTypes")
            private int authenticationTypes;
            @SerializedName("avatarDetail")
            private Object avatarDetail;
            @SerializedName("anchor")
            private boolean anchor;
            @SerializedName("backgroundImgIdStr")
            private String backgroundImgIdStr;
            @SerializedName("avatarImgIdStr")
            private String avatarImgIdStr;
            @SerializedName("avatarImgId_str")
            private String avatarimgidStr;

            public boolean getDefaultAvatar() {
                return defaultAvatar;
            }

            public void setDefaultAvatar(boolean defaultAvatar) {
                this.defaultAvatar = defaultAvatar;
            }

            public int getProvince() {
                return province;
            }

            public void setProvince(int province) {
                this.province = province;
            }

            public int getAuthStatus() {
                return authStatus;
            }

            public void setAuthStatus(int authStatus) {
                this.authStatus = authStatus;
            }

            public boolean getFollowed() {
                return followed;
            }

            public void setFollowed(boolean followed) {
                this.followed = followed;
            }

            public String getAvatarUrl() {
                return avatarUrl;
            }

            public void setAvatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
            }

            public int getAccountStatus() {
                return accountStatus;
            }

            public void setAccountStatus(int accountStatus) {
                this.accountStatus = accountStatus;
            }

            public int getGender() {
                return gender;
            }

            public void setGender(int gender) {
                this.gender = gender;
            }

            public int getCity() {
                return city;
            }

            public void setCity(int city) {
                this.city = city;
            }

            public long getBirthday() {
                return birthday;
            }

            public void setBirthday(long birthday) {
                this.birthday = birthday;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getUserType() {
                return userType;
            }

            public void setUserType(int userType) {
                this.userType = userType;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getSignature() {
                return signature;
            }

            public void setSignature(String signature) {
                this.signature = signature;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getDetailDescription() {
                return detailDescription;
            }

            public void setDetailDescription(String detailDescription) {
                this.detailDescription = detailDescription;
            }

            public long getAvatarImgId() {
                return avatarImgId;
            }

            public void setAvatarImgId(long avatarImgId) {
                this.avatarImgId = avatarImgId;
            }

            public long getBackgroundImgId() {
                return backgroundImgId;
            }

            public void setBackgroundImgId(long backgroundImgId) {
                this.backgroundImgId = backgroundImgId;
            }

            public String getBackgroundUrl() {
                return backgroundUrl;
            }

            public void setBackgroundUrl(String backgroundUrl) {
                this.backgroundUrl = backgroundUrl;
            }

            public int getAuthority() {
                return authority;
            }

            public void setAuthority(int authority) {
                this.authority = authority;
            }

            public boolean getMutual() {
                return mutual;
            }

            public void setMutual(boolean mutual) {
                this.mutual = mutual;
            }

            public Object getExpertTags() {
                return expertTags;
            }

            public void setExpertTags(Object expertTags) {
                this.expertTags = expertTags;
            }

            public Object getExperts() {
                return experts;
            }

            public void setExperts(Object experts) {
                this.experts = experts;
            }

            public int getDjStatus() {
                return djStatus;
            }

            public void setDjStatus(int djStatus) {
                this.djStatus = djStatus;
            }

            public int getVipType() {
                return vipType;
            }

            public void setVipType(int vipType) {
                this.vipType = vipType;
            }

            public Object getRemarkName() {
                return remarkName;
            }

            public void setRemarkName(Object remarkName) {
                this.remarkName = remarkName;
            }

            public int getAuthenticationTypes() {
                return authenticationTypes;
            }

            public void setAuthenticationTypes(int authenticationTypes) {
                this.authenticationTypes = authenticationTypes;
            }

            public Object getAvatarDetail() {
                return avatarDetail;
            }

            public void setAvatarDetail(Object avatarDetail) {
                this.avatarDetail = avatarDetail;
            }

            public boolean getAnchor() {
                return anchor;
            }

            public void setAnchor(boolean anchor) {
                this.anchor = anchor;
            }

            public String getBackgroundImgIdStr() {
                return backgroundImgIdStr;
            }

            public void setBackgroundImgIdStr(String backgroundImgIdStr) {
                this.backgroundImgIdStr = backgroundImgIdStr;
            }

            public String getAvatarImgIdStr() {
                return avatarImgIdStr;
            }

            public void setAvatarImgIdStr(String avatarImgIdStr) {
                this.avatarImgIdStr = avatarImgIdStr;
            }

            public String getAvatarimgidStr() {
                return avatarimgidStr;
            }

            public void setAvatarimgidStr(String avatarimgidStr) {
                this.avatarimgidStr = avatarimgidStr;
            }
        }

        public static class TracksDTO {
            @SerializedName("name")
            private String name;
            @SerializedName("id")
            private int id;
            @SerializedName("position")
            private int position;
            @SerializedName("alias")
            private List<?> alias;
            @SerializedName("status")
            private int status;
            @SerializedName("fee")
            private int fee;
            @SerializedName("copyrightId")
            private int copyrightId;
            @SerializedName("disc")
            private String disc;
            @SerializedName("no")
            private int no;
            @SerializedName("artists")
            private List<ArtistsDTO> artists;
            @SerializedName("album")
            private AlbumDTO album;
            @SerializedName("starred")
            private boolean starred;
            @SerializedName("popularity")
            private Double popularity;
            @SerializedName("score")
            private int score;
            @SerializedName("starredNum")
            private int starredNum;
            @SerializedName("duration")
            private int duration;
            @SerializedName("playedNum")
            private int playedNum;
            @SerializedName("dayPlays")
            private int dayPlays;
            @SerializedName("hearTime")
            private int hearTime;
            @SerializedName("ringtone")
            private String ringtone;
            @SerializedName("crbt")
            private Object crbt;
            @SerializedName("audition")
            private Object audition;
            @SerializedName("copyFrom")
            private String copyFrom;
            @SerializedName("commentThreadId")
            private String commentThreadId;
            @SerializedName("rtUrl")
            private Object rtUrl;
            @SerializedName("ftype")
            private int ftype;
            @SerializedName("rtUrls")
            private List<?> rtUrls;
            @SerializedName("copyright")
            private int copyright;
            @SerializedName("transName")
            private Object transName;
            @SerializedName("sign")
            private Object sign;
            @SerializedName("mark")
            private int mark;
            @SerializedName("originCoverType")
            private int originCoverType;
            @SerializedName("originSongSimpleData")
            private Object originSongSimpleData;
            @SerializedName("single")
            private int single;
            @SerializedName("noCopyrightRcmd")
            private Object noCopyrightRcmd;
            @SerializedName("hMusic")
            private HMusicDTO hMusic;
            @SerializedName("mMusic")
            private MMusicDTO mMusic;
            @SerializedName("lMusic")
            private LMusicDTO lMusic;
            @SerializedName("bMusic")
            private BMusicDTO bMusic;
            @SerializedName("rtype")
            private int rtype;
            @SerializedName("rurl")
            private Object rurl;
            @SerializedName("mvid")
            private int mvid;
            @SerializedName("mp3Url")
            private Object mp3Url;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getPosition() {
                return position;
            }

            public void setPosition(int position) {
                this.position = position;
            }

            public List<?> getAlias() {
                return alias;
            }

            public void setAlias(List<?> alias) {
                this.alias = alias;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getFee() {
                return fee;
            }

            public void setFee(int fee) {
                this.fee = fee;
            }

            public int getCopyrightId() {
                return copyrightId;
            }

            public void setCopyrightId(int copyrightId) {
                this.copyrightId = copyrightId;
            }

            public String getDisc() {
                return disc;
            }

            public void setDisc(String disc) {
                this.disc = disc;
            }

            public int getNo() {
                return no;
            }

            public void setNo(int no) {
                this.no = no;
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

            public boolean getStarred() {
                return starred;
            }

            public void setStarred(boolean starred) {
                this.starred = starred;
            }

            public Double getPopularity() {
                return popularity;
            }

            public void setPopularity(Double popularity) {
                this.popularity = popularity;
            }

            public int getScore() {
                return score;
            }

            public void setScore(int score) {
                this.score = score;
            }

            public int getStarredNum() {
                return starredNum;
            }

            public void setStarredNum(int starredNum) {
                this.starredNum = starredNum;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public int getPlayedNum() {
                return playedNum;
            }

            public void setPlayedNum(int playedNum) {
                this.playedNum = playedNum;
            }

            public int getDayPlays() {
                return dayPlays;
            }

            public void setDayPlays(int dayPlays) {
                this.dayPlays = dayPlays;
            }

            public int getHearTime() {
                return hearTime;
            }

            public void setHearTime(int hearTime) {
                this.hearTime = hearTime;
            }

            public String getRingtone() {
                return ringtone;
            }

            public void setRingtone(String ringtone) {
                this.ringtone = ringtone;
            }

            public Object getCrbt() {
                return crbt;
            }

            public void setCrbt(Object crbt) {
                this.crbt = crbt;
            }

            public Object getAudition() {
                return audition;
            }

            public void setAudition(Object audition) {
                this.audition = audition;
            }

            public String getCopyFrom() {
                return copyFrom;
            }

            public void setCopyFrom(String copyFrom) {
                this.copyFrom = copyFrom;
            }

            public String getCommentThreadId() {
                return commentThreadId;
            }

            public void setCommentThreadId(String commentThreadId) {
                this.commentThreadId = commentThreadId;
            }

            public Object getRtUrl() {
                return rtUrl;
            }

            public void setRtUrl(Object rtUrl) {
                this.rtUrl = rtUrl;
            }

            public int getFtype() {
                return ftype;
            }

            public void setFtype(int ftype) {
                this.ftype = ftype;
            }

            public List<?> getRtUrls() {
                return rtUrls;
            }

            public void setRtUrls(List<?> rtUrls) {
                this.rtUrls = rtUrls;
            }

            public int getCopyright() {
                return copyright;
            }

            public void setCopyright(int copyright) {
                this.copyright = copyright;
            }

            public Object getTransName() {
                return transName;
            }

            public void setTransName(Object transName) {
                this.transName = transName;
            }

            public Object getSign() {
                return sign;
            }

            public void setSign(Object sign) {
                this.sign = sign;
            }

            public int getMark() {
                return mark;
            }

            public void setMark(int mark) {
                this.mark = mark;
            }

            public int getOriginCoverType() {
                return originCoverType;
            }

            public void setOriginCoverType(int originCoverType) {
                this.originCoverType = originCoverType;
            }

            public Object getOriginSongSimpleData() {
                return originSongSimpleData;
            }

            public void setOriginSongSimpleData(Object originSongSimpleData) {
                this.originSongSimpleData = originSongSimpleData;
            }

            public int getSingle() {
                return single;
            }

            public void setSingle(int single) {
                this.single = single;
            }

            public Object getNoCopyrightRcmd() {
                return noCopyrightRcmd;
            }

            public void setNoCopyrightRcmd(Object noCopyrightRcmd) {
                this.noCopyrightRcmd = noCopyrightRcmd;
            }

            public HMusicDTO getHMusic() {
                return hMusic;
            }

            public void setHMusic(HMusicDTO hMusic) {
                this.hMusic = hMusic;
            }

            public MMusicDTO getMMusic() {
                return mMusic;
            }

            public void setMMusic(MMusicDTO mMusic) {
                this.mMusic = mMusic;
            }

            public LMusicDTO getLMusic() {
                return lMusic;
            }

            public void setLMusic(LMusicDTO lMusic) {
                this.lMusic = lMusic;
            }

            public BMusicDTO getBMusic() {
                return bMusic;
            }

            public void setBMusic(BMusicDTO bMusic) {
                this.bMusic = bMusic;
            }

            public int getRtype() {
                return rtype;
            }

            public void setRtype(int rtype) {
                this.rtype = rtype;
            }

            public Object getRurl() {
                return rurl;
            }

            public void setRurl(Object rurl) {
                this.rurl = rurl;
            }

            public int getMvid() {
                return mvid;
            }

            public void setMvid(int mvid) {
                this.mvid = mvid;
            }

            public Object getMp3Url() {
                return mp3Url;
            }

            public void setMp3Url(Object mp3Url) {
                this.mp3Url = mp3Url;
            }

            public static class AlbumDTO {
                @SerializedName("name")
                private String name;
                @SerializedName("id")
                private int id;
                @SerializedName("type")
                private String type;
                @SerializedName("size")
                private int size;
                @SerializedName("picId")
                private long picId;
                @SerializedName("blurPicUrl")
                private String blurPicUrl;
                @SerializedName("companyId")
                private int companyId;
                @SerializedName("pic")
                private long pic;
                @SerializedName("picUrl")
                private String picUrl;
                @SerializedName("publishTime")
                private long publishTime;
                @SerializedName("description")
                private String description;
                @SerializedName("tags")
                private String tags;
                @SerializedName("company")
                private String company;
                @SerializedName("briefDesc")
                private String briefDesc;
                @SerializedName("artist")
                private ArtistDTO artist;
                @SerializedName("songs")
                private List<?> songs;
                @SerializedName("alias")
                private List<?> alias;
                @SerializedName("status")
                private int status;
                @SerializedName("copyrightId")
                private int copyrightId;
                @SerializedName("commentThreadId")
                private String commentThreadId;
                @SerializedName("artists")
                private List<ArtistsDTO> artists;
                @SerializedName("subType")
                private String subType;
                @SerializedName("transName")
                private Object transName;
                @SerializedName("onSale")
                private boolean onSale;
                @SerializedName("mark")
                private int mark;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public int getSize() {
                    return size;
                }

                public void setSize(int size) {
                    this.size = size;
                }

                public long getPicId() {
                    return picId;
                }

                public void setPicId(long picId) {
                    this.picId = picId;
                }

                public String getBlurPicUrl() {
                    return blurPicUrl;
                }

                public void setBlurPicUrl(String blurPicUrl) {
                    this.blurPicUrl = blurPicUrl;
                }

                public int getCompanyId() {
                    return companyId;
                }

                public void setCompanyId(int companyId) {
                    this.companyId = companyId;
                }

                public long getPic() {
                    return pic;
                }

                public void setPic(long pic) {
                    this.pic = pic;
                }

                public String getPicUrl() {
                    return picUrl;
                }

                public void setPicUrl(String picUrl) {
                    this.picUrl = picUrl;
                }

                public long getPublishTime() {
                    return publishTime;
                }

                public void setPublishTime(long publishTime) {
                    this.publishTime = publishTime;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getTags() {
                    return tags;
                }

                public void setTags(String tags) {
                    this.tags = tags;
                }

                public String getCompany() {
                    return company;
                }

                public void setCompany(String company) {
                    this.company = company;
                }

                public String getBriefDesc() {
                    return briefDesc;
                }

                public void setBriefDesc(String briefDesc) {
                    this.briefDesc = briefDesc;
                }

                public ArtistDTO getArtist() {
                    return artist;
                }

                public void setArtist(ArtistDTO artist) {
                    this.artist = artist;
                }

                public List<?> getSongs() {
                    return songs;
                }

                public void setSongs(List<?> songs) {
                    this.songs = songs;
                }

                public List<?> getAlias() {
                    return alias;
                }

                public void setAlias(List<?> alias) {
                    this.alias = alias;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public int getCopyrightId() {
                    return copyrightId;
                }

                public void setCopyrightId(int copyrightId) {
                    this.copyrightId = copyrightId;
                }

                public String getCommentThreadId() {
                    return commentThreadId;
                }

                public void setCommentThreadId(String commentThreadId) {
                    this.commentThreadId = commentThreadId;
                }

                public List<ArtistsDTO> getArtists() {
                    return artists;
                }

                public void setArtists(List<ArtistsDTO> artists) {
                    this.artists = artists;
                }

                public String getSubType() {
                    return subType;
                }

                public void setSubType(String subType) {
                    this.subType = subType;
                }

                public Object getTransName() {
                    return transName;
                }

                public void setTransName(Object transName) {
                    this.transName = transName;
                }

                public boolean getOnSale() {
                    return onSale;
                }

                public void setOnSale(boolean onSale) {
                    this.onSale = onSale;
                }

                public int getMark() {
                    return mark;
                }

                public void setMark(int mark) {
                    this.mark = mark;
                }

                public static class ArtistDTO {
                    @SerializedName("name")
                    private String name;
                    @SerializedName("id")
                    private int id;
                    @SerializedName("picId")
                    private int picId;
                    @SerializedName("img1v1Id")
                    private int img1v1Id;
                    @SerializedName("briefDesc")
                    private String briefDesc;
                    @SerializedName("picUrl")
                    private String picUrl;
                    @SerializedName("img1v1Url")
                    private String img1v1Url;
                    @SerializedName("albumSize")
                    private int albumSize;
                    @SerializedName("alias")
                    private List<?> alias;
                    @SerializedName("trans")
                    private String trans;
                    @SerializedName("musicSize")
                    private int musicSize;
                    @SerializedName("topicPerson")
                    private int topicPerson;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public int getPicId() {
                        return picId;
                    }

                    public void setPicId(int picId) {
                        this.picId = picId;
                    }

                    public int getImg1v1Id() {
                        return img1v1Id;
                    }

                    public void setImg1v1Id(int img1v1Id) {
                        this.img1v1Id = img1v1Id;
                    }

                    public String getBriefDesc() {
                        return briefDesc;
                    }

                    public void setBriefDesc(String briefDesc) {
                        this.briefDesc = briefDesc;
                    }

                    public String getPicUrl() {
                        return picUrl;
                    }

                    public void setPicUrl(String picUrl) {
                        this.picUrl = picUrl;
                    }

                    public String getImg1v1Url() {
                        return img1v1Url;
                    }

                    public void setImg1v1Url(String img1v1Url) {
                        this.img1v1Url = img1v1Url;
                    }

                    public int getAlbumSize() {
                        return albumSize;
                    }

                    public void setAlbumSize(int albumSize) {
                        this.albumSize = albumSize;
                    }

                    public List<?> getAlias() {
                        return alias;
                    }

                    public void setAlias(List<?> alias) {
                        this.alias = alias;
                    }

                    public String getTrans() {
                        return trans;
                    }

                    public void setTrans(String trans) {
                        this.trans = trans;
                    }

                    public int getMusicSize() {
                        return musicSize;
                    }

                    public void setMusicSize(int musicSize) {
                        this.musicSize = musicSize;
                    }

                    public int getTopicPerson() {
                        return topicPerson;
                    }

                    public void setTopicPerson(int topicPerson) {
                        this.topicPerson = topicPerson;
                    }
                }

                public static class ArtistsDTO {
                    @SerializedName("name")
                    private String name;
                    @SerializedName("id")
                    private int id;
                    @SerializedName("picId")
                    private int picId;
                    @SerializedName("img1v1Id")
                    private int img1v1Id;
                    @SerializedName("briefDesc")
                    private String briefDesc;
                    @SerializedName("picUrl")
                    private String picUrl;
                    @SerializedName("img1v1Url")
                    private String img1v1Url;
                    @SerializedName("albumSize")
                    private int albumSize;
                    @SerializedName("alias")
                    private List<?> alias;
                    @SerializedName("trans")
                    private String trans;
                    @SerializedName("musicSize")
                    private int musicSize;
                    @SerializedName("topicPerson")
                    private int topicPerson;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public int getPicId() {
                        return picId;
                    }

                    public void setPicId(int picId) {
                        this.picId = picId;
                    }

                    public int getImg1v1Id() {
                        return img1v1Id;
                    }

                    public void setImg1v1Id(int img1v1Id) {
                        this.img1v1Id = img1v1Id;
                    }

                    public String getBriefDesc() {
                        return briefDesc;
                    }

                    public void setBriefDesc(String briefDesc) {
                        this.briefDesc = briefDesc;
                    }

                    public String getPicUrl() {
                        return picUrl;
                    }

                    public void setPicUrl(String picUrl) {
                        this.picUrl = picUrl;
                    }

                    public String getImg1v1Url() {
                        return img1v1Url;
                    }

                    public void setImg1v1Url(String img1v1Url) {
                        this.img1v1Url = img1v1Url;
                    }

                    public int getAlbumSize() {
                        return albumSize;
                    }

                    public void setAlbumSize(int albumSize) {
                        this.albumSize = albumSize;
                    }

                    public List<?> getAlias() {
                        return alias;
                    }

                    public void setAlias(List<?> alias) {
                        this.alias = alias;
                    }

                    public String getTrans() {
                        return trans;
                    }

                    public void setTrans(String trans) {
                        this.trans = trans;
                    }

                    public int getMusicSize() {
                        return musicSize;
                    }

                    public void setMusicSize(int musicSize) {
                        this.musicSize = musicSize;
                    }

                    public int getTopicPerson() {
                        return topicPerson;
                    }

                    public void setTopicPerson(int topicPerson) {
                        this.topicPerson = topicPerson;
                    }
                }
            }

            public static class HMusicDTO {
                @SerializedName("name")
                private Object name;
                @SerializedName("id")
                private long id;
                @SerializedName("size")
                private int size;
                @SerializedName("extension")
                private String extension;
                @SerializedName("sr")
                private int sr;
                @SerializedName("dfsId")
                private int dfsId;
                @SerializedName("bitrate")
                private int bitrate;
                @SerializedName("playTime")
                private int playTime;
                @SerializedName("volumeDelta")
                private Double volumeDelta;

                public Object getName() {
                    return name;
                }

                public void setName(Object name) {
                    this.name = name;
                }

                public long getId() {
                    return id;
                }

                public void setId(long id) {
                    this.id = id;
                }

                public int getSize() {
                    return size;
                }

                public void setSize(int size) {
                    this.size = size;
                }

                public String getExtension() {
                    return extension;
                }

                public void setExtension(String extension) {
                    this.extension = extension;
                }

                public int getSr() {
                    return sr;
                }

                public void setSr(int sr) {
                    this.sr = sr;
                }

                public int getDfsId() {
                    return dfsId;
                }

                public void setDfsId(int dfsId) {
                    this.dfsId = dfsId;
                }

                public int getBitrate() {
                    return bitrate;
                }

                public void setBitrate(int bitrate) {
                    this.bitrate = bitrate;
                }

                public int getPlayTime() {
                    return playTime;
                }

                public void setPlayTime(int playTime) {
                    this.playTime = playTime;
                }

                public Double getVolumeDelta() {
                    return volumeDelta;
                }

                public void setVolumeDelta(Double volumeDelta) {
                    this.volumeDelta = volumeDelta;
                }
            }

            public static class MMusicDTO {
                @SerializedName("name")
                private Object name;
                @SerializedName("id")
                private long id;
                @SerializedName("size")
                private int size;
                @SerializedName("extension")
                private String extension;
                @SerializedName("sr")
                private int sr;
                @SerializedName("dfsId")
                private int dfsId;
                @SerializedName("bitrate")
                private int bitrate;
                @SerializedName("playTime")
                private int playTime;
                @SerializedName("volumeDelta")
                private Double volumeDelta;

                public Object getName() {
                    return name;
                }

                public void setName(Object name) {
                    this.name = name;
                }

                public long getId() {
                    return id;
                }

                public void setId(long id) {
                    this.id = id;
                }

                public int getSize() {
                    return size;
                }

                public void setSize(int size) {
                    this.size = size;
                }

                public String getExtension() {
                    return extension;
                }

                public void setExtension(String extension) {
                    this.extension = extension;
                }

                public int getSr() {
                    return sr;
                }

                public void setSr(int sr) {
                    this.sr = sr;
                }

                public int getDfsId() {
                    return dfsId;
                }

                public void setDfsId(int dfsId) {
                    this.dfsId = dfsId;
                }

                public int getBitrate() {
                    return bitrate;
                }

                public void setBitrate(int bitrate) {
                    this.bitrate = bitrate;
                }

                public int getPlayTime() {
                    return playTime;
                }

                public void setPlayTime(int playTime) {
                    this.playTime = playTime;
                }

                public Double getVolumeDelta() {
                    return volumeDelta;
                }

                public void setVolumeDelta(Double volumeDelta) {
                    this.volumeDelta = volumeDelta;
                }
            }

            public static class LMusicDTO {
                @SerializedName("name")
                private Object name;
                @SerializedName("id")
                private long id;
                @SerializedName("size")
                private int size;
                @SerializedName("extension")
                private String extension;
                @SerializedName("sr")
                private int sr;
                @SerializedName("dfsId")
                private int dfsId;
                @SerializedName("bitrate")
                private int bitrate;
                @SerializedName("playTime")
                private int playTime;
                @SerializedName("volumeDelta")
                private Double volumeDelta;

                public Object getName() {
                    return name;
                }

                public void setName(Object name) {
                    this.name = name;
                }

                public long getId() {
                    return id;
                }

                public void setId(long id) {
                    this.id = id;
                }

                public int getSize() {
                    return size;
                }

                public void setSize(int size) {
                    this.size = size;
                }

                public String getExtension() {
                    return extension;
                }

                public void setExtension(String extension) {
                    this.extension = extension;
                }

                public int getSr() {
                    return sr;
                }

                public void setSr(int sr) {
                    this.sr = sr;
                }

                public int getDfsId() {
                    return dfsId;
                }

                public void setDfsId(int dfsId) {
                    this.dfsId = dfsId;
                }

                public int getBitrate() {
                    return bitrate;
                }

                public void setBitrate(int bitrate) {
                    this.bitrate = bitrate;
                }

                public int getPlayTime() {
                    return playTime;
                }

                public void setPlayTime(int playTime) {
                    this.playTime = playTime;
                }

                public Double getVolumeDelta() {
                    return volumeDelta;
                }

                public void setVolumeDelta(Double volumeDelta) {
                    this.volumeDelta = volumeDelta;
                }
            }

            public static class BMusicDTO {
                @SerializedName("name")
                private Object name;
                @SerializedName("id")
                private long id;
                @SerializedName("size")
                private int size;
                @SerializedName("extension")
                private String extension;
                @SerializedName("sr")
                private int sr;
                @SerializedName("dfsId")
                private int dfsId;
                @SerializedName("bitrate")
                private int bitrate;
                @SerializedName("playTime")
                private int playTime;
                @SerializedName("volumeDelta")
                private Double volumeDelta;

                public Object getName() {
                    return name;
                }

                public void setName(Object name) {
                    this.name = name;
                }

                public long getId() {
                    return id;
                }

                public void setId(long id) {
                    this.id = id;
                }

                public int getSize() {
                    return size;
                }

                public void setSize(int size) {
                    this.size = size;
                }

                public String getExtension() {
                    return extension;
                }

                public void setExtension(String extension) {
                    this.extension = extension;
                }

                public int getSr() {
                    return sr;
                }

                public void setSr(int sr) {
                    this.sr = sr;
                }

                public int getDfsId() {
                    return dfsId;
                }

                public void setDfsId(int dfsId) {
                    this.dfsId = dfsId;
                }

                public int getBitrate() {
                    return bitrate;
                }

                public void setBitrate(int bitrate) {
                    this.bitrate = bitrate;
                }

                public int getPlayTime() {
                    return playTime;
                }

                public void setPlayTime(int playTime) {
                    this.playTime = playTime;
                }

                public Double getVolumeDelta() {
                    return volumeDelta;
                }

                public void setVolumeDelta(Double volumeDelta) {
                    this.volumeDelta = volumeDelta;
                }
            }

            public static class ArtistsDTO {
                @SerializedName("name")
                private String name;
                @SerializedName("id")
                private int id;
                @SerializedName("picId")
                private int picId;
                @SerializedName("img1v1Id")
                private int img1v1Id;
                @SerializedName("briefDesc")
                private String briefDesc;
                @SerializedName("picUrl")
                private String picUrl;
                @SerializedName("img1v1Url")
                private String img1v1Url;
                @SerializedName("albumSize")
                private int albumSize;
                @SerializedName("alias")
                private List<?> alias;
                @SerializedName("trans")
                private String trans;
                @SerializedName("musicSize")
                private int musicSize;
                @SerializedName("topicPerson")
                private int topicPerson;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getPicId() {
                    return picId;
                }

                public void setPicId(int picId) {
                    this.picId = picId;
                }

                public int getImg1v1Id() {
                    return img1v1Id;
                }

                public void setImg1v1Id(int img1v1Id) {
                    this.img1v1Id = img1v1Id;
                }

                public String getBriefDesc() {
                    return briefDesc;
                }

                public void setBriefDesc(String briefDesc) {
                    this.briefDesc = briefDesc;
                }

                public String getPicUrl() {
                    return picUrl;
                }

                public void setPicUrl(String picUrl) {
                    this.picUrl = picUrl;
                }

                public String getImg1v1Url() {
                    return img1v1Url;
                }

                public void setImg1v1Url(String img1v1Url) {
                    this.img1v1Url = img1v1Url;
                }

                public int getAlbumSize() {
                    return albumSize;
                }

                public void setAlbumSize(int albumSize) {
                    this.albumSize = albumSize;
                }

                public List<?> getAlias() {
                    return alias;
                }

                public void setAlias(List<?> alias) {
                    this.alias = alias;
                }

                public String getTrans() {
                    return trans;
                }

                public void setTrans(String trans) {
                    this.trans = trans;
                }

                public int getMusicSize() {
                    return musicSize;
                }

                public void setMusicSize(int musicSize) {
                    this.musicSize = musicSize;
                }

                public int getTopicPerson() {
                    return topicPerson;
                }

                public void setTopicPerson(int topicPerson) {
                    this.topicPerson = topicPerson;
                }
            }
        }
    }
}
