package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qov extends tsg {
    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doBackward(Object obj) {
        vgr vgrVar = (vgr) obj;
        int iOrdinal = vgrVar.ordinal();
        if (iOrdinal == 0) {
            return vkf.CHANNEL_GROUP_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return vkf.ALLOWED;
        }
        if (iOrdinal == 2) {
            return vkf.BANNED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(vgrVar))));
    }

    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doForward(Object obj) {
        vkf vkfVar = (vkf) obj;
        int iOrdinal = vkfVar.ordinal();
        if (iOrdinal == 0) {
            return vgr.CHANNEL_GROUP_STATE_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return vgr.ALLOWED;
        }
        if (iOrdinal == 2) {
            return vgr.BANNED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(vkfVar))));
    }
}
