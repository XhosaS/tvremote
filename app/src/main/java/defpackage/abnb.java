package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum abnb implements abxf {
    UNKNOWN(0),
    ZERO_STATE_SEARCH_TAB(1),
    SEARCH_RESULT_PAGE(2),
    FOR_YOU_TAB(3),
    MOVIE_TAB(4),
    SHOWS_TAB(5),
    APP_TAB(6),
    LIBRARY_TAB(7),
    TVM_ENTITY_PAGE(8),
    PERSON_ENTITY_PAGE(9),
    APP_SEARCH_CTA(10),
    MEDIA_SEARCH_RESULT_PAGE(11),
    NON_MEDIA_PERSON_PAGE(12),
    ANSWER_PAGE(13),
    IMMERSIVE_SEARCH_TAB(14),
    GEMINI_PAGE(15);

    public final int q;

    abnb(int i) {
        this.q = i;
    }

    public static abnb b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return ZERO_STATE_SEARCH_TAB;
            case 2:
                return SEARCH_RESULT_PAGE;
            case 3:
                return FOR_YOU_TAB;
            case 4:
                return MOVIE_TAB;
            case 5:
                return SHOWS_TAB;
            case 6:
                return APP_TAB;
            case 7:
                return LIBRARY_TAB;
            case 8:
                return TVM_ENTITY_PAGE;
            case 9:
                return PERSON_ENTITY_PAGE;
            case 10:
                return APP_SEARCH_CTA;
            case 11:
                return MEDIA_SEARCH_RESULT_PAGE;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return NON_MEDIA_PERSON_PAGE;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return ANSWER_PAGE;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return IMMERSIVE_SEARCH_TAB;
            case 15:
                return GEMINI_PAGE;
            default:
                return null;
        }
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.q);
    }
}
