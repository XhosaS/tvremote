package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xbl implements abxh {
    public static final abxh a = new xbl();

    private xbl() {
    }

    @Override // defpackage.abxh
    public final boolean a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return true;
            case 7:
            default:
                return false;
        }
    }
}
