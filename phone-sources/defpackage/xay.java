package defpackage;

import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum xay implements vug {
    ANDROID_APP(1),
    MUSIC_ALBUM(2),
    MUSIC_ARTIST(3),
    MUSIC_SONG(4),
    OCEAN_BOOK(5),
    MOVIE(6),
    CONTAINER(7),
    EDITORIAL(12),
    SHOW(18),
    SEASON(19),
    EPISODE(20),
    VOUCHER(29),
    ENTERTAINMENT_STORY(50),
    DISTRIBUTOR(61),
    MOVIE_PERSON(65),
    BANNER(70),
    ATV_BANNER(R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle),
    MOVIES_BUNDLE(5000);

    public final int s;

    xay(int i) {
        this.s = i;
    }

    public static xay b(int i) {
        if (i == 12) {
            return EDITORIAL;
        }
        if (i == 29) {
            return VOUCHER;
        }
        if (i == 50) {
            return ENTERTAINMENT_STORY;
        }
        if (i == 61) {
            return DISTRIBUTOR;
        }
        if (i == 65) {
            return MOVIE_PERSON;
        }
        if (i == 70) {
            return BANNER;
        }
        if (i == 107) {
            return ATV_BANNER;
        }
        if (i == 5000) {
            return MOVIES_BUNDLE;
        }
        switch (i) {
            case 1:
                return ANDROID_APP;
            case 2:
                return MUSIC_ALBUM;
            case 3:
                return MUSIC_ARTIST;
            case 4:
                return MUSIC_SONG;
            case 5:
                return OCEAN_BOOK;
            case 6:
                return MOVIE;
            case 7:
                return CONTAINER;
            default:
                switch (i) {
                    case 18:
                        return SHOW;
                    case 19:
                        return SEASON;
                    case 20:
                        return EPISODE;
                    default:
                        return null;
                }
        }
    }

    @Override // defpackage.vug
    public final int a() {
        return this.s;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.s);
    }
}
