package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggj {
    public static int a(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int b(int i) {
        if (i == 20) {
            return 22;
        }
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            default:
                switch (i) {
                    case 11:
                        return 13;
                    case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                        return 14;
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                        return 15;
                    default:
                        return 0;
                }
        }
    }
}
