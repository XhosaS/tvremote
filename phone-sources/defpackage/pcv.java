package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pcv extends tsg {
    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doBackward(Object obj) {
        uxe uxeVar = (uxe) obj;
        int iOrdinal = uxeVar.ordinal();
        if (iOrdinal == 0) {
            return voa.UNKNOWN;
        }
        if (iOrdinal == 1) {
            return voa.ACTIVITY;
        }
        if (iOrdinal == 2) {
            return voa.SERVICE;
        }
        if (iOrdinal == 3) {
            return voa.BROADCAST;
        }
        if (iOrdinal == 4) {
            return voa.ACTIVITY_WITH_RESULT;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(uxeVar))));
    }

    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doForward(Object obj) {
        voa voaVar = (voa) obj;
        int iOrdinal = voaVar.ordinal();
        if (iOrdinal == 0) {
            return uxe.UNKNOWN;
        }
        if (iOrdinal == 1) {
            return uxe.ACTIVITY;
        }
        if (iOrdinal == 2) {
            return uxe.SERVICE;
        }
        if (iOrdinal == 3) {
            return uxe.BROADCAST;
        }
        if (iOrdinal == 4) {
            return uxe.ACTIVITY_WITH_RESULT;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(voaVar))));
    }
}
