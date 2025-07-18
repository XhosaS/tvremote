package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum xmj implements abxf {
    UNKNOWN(0),
    TRACK(1),
    ALBUM(2),
    ARTIST(3),
    PLAYLIST(4),
    EPISODE(5),
    MOVIE(6),
    PHOTO(7),
    TV_SHOW_EPISODE(8),
    MUSIC_GENRE(10),
    MUSIC_STATION(25),
    AUDIO_BOOK(11),
    CHAPTER(12),
    RADIO_STATION(13),
    MUSIC_MIX(14),
    SPORTS_EVENT(15),
    TV_CHANNEL(16),
    VIDEO(17),
    VIDEO_RECOMMENDED_PLAYLIST(27),
    YOUTUBE_CHANNEL(18),
    YOUTUBE_VIDEO_PLAYLIST(19),
    TV_SHOW(20),
    NEWS(21),
    NARRATED_WEB(22),
    NEWS_CALL_TO_ACTION(26),
    NEWS_OVERVIEW(28),
    AUDIO_STORY(23),
    PODCAST_SERIES(24),
    PODCAST_EPISODE(9);

    public final int D;

    xmj(int i) {
        this.D = i;
    }

    public static xmj b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return TRACK;
            case 2:
                return ALBUM;
            case 3:
                return ARTIST;
            case 4:
                return PLAYLIST;
            case 5:
                return EPISODE;
            case 6:
                return MOVIE;
            case 7:
                return PHOTO;
            case 8:
                return TV_SHOW_EPISODE;
            case 9:
                return PODCAST_EPISODE;
            case 10:
                return MUSIC_GENRE;
            case 11:
                return AUDIO_BOOK;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return CHAPTER;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return RADIO_STATION;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return MUSIC_MIX;
            case 15:
                return SPORTS_EVENT;
            case 16:
                return TV_CHANNEL;
            case 17:
                return VIDEO;
            case 18:
                return YOUTUBE_CHANNEL;
            case 19:
                return YOUTUBE_VIDEO_PLAYLIST;
            case 20:
                return TV_SHOW;
            case 21:
                return NEWS;
            case 22:
                return NARRATED_WEB;
            case 23:
                return AUDIO_STORY;
            case 24:
                return PODCAST_SERIES;
            case 25:
                return MUSIC_STATION;
            case 26:
                return NEWS_CALL_TO_ACTION;
            case 27:
                return VIDEO_RECOMMENDED_PLAYLIST;
            case 28:
                return NEWS_OVERVIEW;
            default:
                return null;
        }
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.D;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.D);
    }
}
