package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum wij implements vug {
    UNKNOWN_ASSET_TYPE(0),
    MOVIE(1),
    EPISODE(2),
    TRAILER(3),
    SEASON(4),
    SHOW(5),
    MUSIC_ALBUM(6),
    ACTOR(7),
    SONG(8),
    DEPRECATED_PAGE(9),
    DUB_CARD(10),
    VOUCHER(11),
    CONTAINER(12),
    DISTRIBUTOR(13),
    ANDROID_APP(14),
    FHR_BANNER(15);

    public final int q;

    wij(int i) {
        this.q = i;
    }

    public static wij b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ASSET_TYPE;
            case 1:
                return MOVIE;
            case 2:
                return EPISODE;
            case 3:
                return TRAILER;
            case 4:
                return SEASON;
            case 5:
                return SHOW;
            case 6:
                return MUSIC_ALBUM;
            case 7:
                return ACTOR;
            case 8:
                return SONG;
            case 9:
                return DEPRECATED_PAGE;
            case 10:
                return DUB_CARD;
            case 11:
                return VOUCHER;
            case 12:
                return CONTAINER;
            case 13:
                return DISTRIBUTOR;
            case 14:
                return ANDROID_APP;
            case 15:
                return FHR_BANNER;
            default:
                return null;
        }
    }

    @Override // defpackage.vug
    public final int a() {
        return this.q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.q);
    }
}
