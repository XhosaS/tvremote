package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qot extends tsg {
    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doBackward(Object obj) {
        vhu vhuVar = (vhu) obj;
        int iOrdinal = vhuVar.ordinal();
        if (iOrdinal == 0) {
            return vkb.APP_BLOCK_STATE_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return vkb.ALLOWED;
        }
        if (iOrdinal == 2) {
            return vkb.BANNED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(vhuVar))));
    }

    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doForward(Object obj) {
        vkb vkbVar = (vkb) obj;
        int iOrdinal = vkbVar.ordinal();
        if (iOrdinal == 0) {
            return vhu.APP_BLOCK_STATE_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return vhu.ALLOWED;
        }
        if (iOrdinal == 2) {
            return vhu.BANNED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(vkbVar))));
    }
}
