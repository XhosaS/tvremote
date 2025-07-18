package defpackage;

import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vce implements vug {
    ID_UNSPECIFIED(0),
    STREAM_DISTRIBUTOR_CONTENT(1),
    STREAM_SVOD_DISTRIBUTOR_CONTENT(2),
    STREAM_PRIMETIME_GUIDE(3),
    STREAM_DETAILS_PAGE(4),
    STREAM_SEARCH(5),
    STREAM_EMBEDDED(6),
    DISTRIBUTOR_CONTENT(7),
    SVOD_DISTRIBUTOR_CONTENT(8),
    CROSS_DISTRIBUTOR_CONTENT(9),
    TAG_BROWSE(10),
    PROMOTIONAL_BANNER(11),
    NO_ANNOTATION(12),
    WITH_ANNOTATION(13),
    SEARCH(14),
    VERTICAL_SEARCH(15),
    PLAY_STORIES(16),
    CONTINUE_WATCHING(17),
    CREDITS(18),
    CARD(19),
    EMBEDDED_STREAM_CONTENT(20),
    EMBEDDED_STREAM_CONTENT_TWO_ROWS(21),
    EMBEDDED_STREAM_CONTENT_WITH_ANNOTATION(22),
    EMBEDDED_STREAM_CONTENT_TWO_ROWS_WITH_ANNOTATION(23),
    STREAM_DISTRIBUTORS_SETUP_LIST(24),
    DISTRIBUTORS_SVOD(25),
    DISTRIBUTORS_TVOD(26),
    DISTRIBUTORS_PREMIUM(27),
    DISTRIBUTORS_ALL_TVOD(28),
    DISTRIBUTORS_ALL_AVOD(29),
    DISTRIBUTORS_ALL_BASIC_CHANNEL(30),
    DISTRIBUTORS_ALL_CABLE_CHANNEL(31),
    FHR_CONTAINER(32),
    PLAY_MOVIES_AVOD_CONTENT(33),
    FEATURED_CAROUSEL(34),
    UNRECOGNIZED(-1);

    private final int L;

    vce(int i) {
        this.L = i;
    }

    public static vce b(int i) {
        switch (i) {
            case 0:
                return ID_UNSPECIFIED;
            case 1:
                return STREAM_DISTRIBUTOR_CONTENT;
            case 2:
                return STREAM_SVOD_DISTRIBUTOR_CONTENT;
            case 3:
                return STREAM_PRIMETIME_GUIDE;
            case 4:
                return STREAM_DETAILS_PAGE;
            case 5:
                return STREAM_SEARCH;
            case 6:
                return STREAM_EMBEDDED;
            case 7:
                return DISTRIBUTOR_CONTENT;
            case 8:
                return SVOD_DISTRIBUTOR_CONTENT;
            case 9:
                return CROSS_DISTRIBUTOR_CONTENT;
            case 10:
                return TAG_BROWSE;
            case 11:
                return PROMOTIONAL_BANNER;
            case 12:
                return NO_ANNOTATION;
            case 13:
                return WITH_ANNOTATION;
            case 14:
                return SEARCH;
            case 15:
                return VERTICAL_SEARCH;
            case 16:
                return PLAY_STORIES;
            case 17:
                return CONTINUE_WATCHING;
            case 18:
                return CREDITS;
            case 19:
                return CARD;
            case 20:
                return EMBEDDED_STREAM_CONTENT;
            case 21:
                return EMBEDDED_STREAM_CONTENT_TWO_ROWS;
            case 22:
                return EMBEDDED_STREAM_CONTENT_WITH_ANNOTATION;
            case 23:
                return EMBEDDED_STREAM_CONTENT_TWO_ROWS_WITH_ANNOTATION;
            case 24:
                return STREAM_DISTRIBUTORS_SETUP_LIST;
            case 25:
                return DISTRIBUTORS_SVOD;
            case 26:
                return DISTRIBUTORS_TVOD;
            case 27:
                return DISTRIBUTORS_PREMIUM;
            case 28:
                return DISTRIBUTORS_ALL_TVOD;
            case 29:
                return DISTRIBUTORS_ALL_AVOD;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return DISTRIBUTORS_ALL_BASIC_CHANNEL;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return DISTRIBUTORS_ALL_CABLE_CHANNEL;
            case 32:
                return FHR_CONTAINER;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return PLAY_MOVIES_AVOD_CONTENT;
            case 34:
                return FEATURED_CAROUSEL;
            default:
                return null;
        }
    }

    @Override // defpackage.vug
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.L;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.L);
    }
}
