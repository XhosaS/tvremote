package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class szp {
    public static final String a(sdw sdwVar) {
        switch (sdwVar.ordinal()) {
            case 0:
                return "unknown";
            case 1:
                return "builtin";
            case 2:
                return "zlm";
            case 3:
                return "sync";
            case 4:
                return "dsp";
            case 5:
                return "soda";
            case 6:
                return "bisto";
            case 7:
                return "car";
            case 8:
                return "uri";
            case 9:
                return "pfd";
            case 10:
                return "voicedsp";
            case 11:
                return "gacs";
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return "hotword";
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return "echoref";
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return "media";
            case 15:
                return "virtualar";
            default:
                throw new agpg();
        }
    }
}
