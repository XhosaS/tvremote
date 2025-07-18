package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vak implements vug {
    TYPE_UNSPECIFIED(0),
    MOVIE(1),
    BUNDLE(2),
    SHOW(3),
    SEASON(4),
    EPISODE(5),
    ANDROID_APP(6),
    ALBUM(7),
    SONG(8),
    VOUCHER(9),
    DISTRIBUTOR(10),
    PERSON(11),
    STORY(12),
    BOOK(13),
    TRAILER(14),
    BANNER(15),
    ATV_BANNER(16),
    LIVE_CHANNEL(17),
    UNRECOGNIZED(-1);

    private final int u;

    vak(int i) {
        this.u = i;
    }

    public static vak b(int i) {
        switch (i) {
            case 0:
                return TYPE_UNSPECIFIED;
            case 1:
                return MOVIE;
            case 2:
                return BUNDLE;
            case 3:
                return SHOW;
            case 4:
                return SEASON;
            case 5:
                return EPISODE;
            case 6:
                return ANDROID_APP;
            case 7:
                return ALBUM;
            case 8:
                return SONG;
            case 9:
                return VOUCHER;
            case 10:
                return DISTRIBUTOR;
            case 11:
                return PERSON;
            case 12:
                return STORY;
            case 13:
                return BOOK;
            case 14:
                return TRAILER;
            case 15:
                return BANNER;
            case 16:
                return ATV_BANNER;
            case 17:
                return LIVE_CHANNEL;
            default:
                return null;
        }
    }

    @Override // defpackage.vug
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.u;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.u);
    }
}
