package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pcr extends tsg {
    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doBackward(Object obj) {
        uxy uxyVar = (uxy) obj;
        int iOrdinal = uxyVar.ordinal();
        if (iOrdinal == 0) {
            return vnd.BUTTONS_LAYOUT_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return vnd.STACKED;
        }
        if (iOrdinal == 2) {
            return vnd.SIDE_BY_SIDE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(uxyVar))));
    }

    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doForward(Object obj) {
        vnd vndVar = (vnd) obj;
        int iOrdinal = vndVar.ordinal();
        if (iOrdinal == 0) {
            return uxy.UNKNOWN_LAYOUT;
        }
        if (iOrdinal == 1) {
            return uxy.VERTICAL;
        }
        if (iOrdinal == 2) {
            return uxy.HORIZONTAL;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(vndVar))));
    }
}
