package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum adsg implements abxf {
    NO_ERROR(0),
    UNKNOWN_FAILURE(1),
    DOUBLE_INIT(2),
    INVALID_CONFIG(3),
    UNSUPPORTED_LOCALE(4),
    INVALID_LANGUAGE_PACK(5),
    UNDEFINED_BEHAVIOR(6),
    MISSING_HOTWORD(7),
    UNSUPPORTED_LANGUAGE_PACK(8),
    INVALID_LANGUAGE_PACK_FOR_LANGID(9),
    INVALID_LANGUAGE_PACK_FOR_DIARIZATION(10),
    INCOMPATIBLE_SPEAKERID_AND_HOTWORD_MODEL(11),
    THREAD_SCHEDULING_FAILURE(12),
    CONCURRENCY_LIMIT_REACHED(13);

    public final int o;

    adsg(int i) {
        this.o = i;
    }

    public static adsg b(int i) {
        switch (i) {
            case 0:
                return NO_ERROR;
            case 1:
                return UNKNOWN_FAILURE;
            case 2:
                return DOUBLE_INIT;
            case 3:
                return INVALID_CONFIG;
            case 4:
                return UNSUPPORTED_LOCALE;
            case 5:
                return INVALID_LANGUAGE_PACK;
            case 6:
                return UNDEFINED_BEHAVIOR;
            case 7:
                return MISSING_HOTWORD;
            case 8:
                return UNSUPPORTED_LANGUAGE_PACK;
            case 9:
                return INVALID_LANGUAGE_PACK_FOR_LANGID;
            case 10:
                return INVALID_LANGUAGE_PACK_FOR_DIARIZATION;
            case 11:
                return INCOMPATIBLE_SPEAKERID_AND_HOTWORD_MODEL;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return THREAD_SCHEDULING_FAILURE;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return CONCURRENCY_LIMIT_REACHED;
            default:
                return null;
        }
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.o;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.o);
    }
}
