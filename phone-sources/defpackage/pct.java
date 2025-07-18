package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pct extends tsg {
    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doBackward(Object obj) {
        uzc uzcVar = (uzc) obj;
        int iOrdinal = uzcVar.ordinal();
        if (iOrdinal == 0) {
            return vmq.DASHER_DEVICE_FILTER_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return vmq.BLOCK_WHEN_DASHER_ON_DEVICE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(uzcVar))));
    }

    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doForward(Object obj) {
        vmq vmqVar = (vmq) obj;
        int iOrdinal = vmqVar.ordinal();
        if (iOrdinal == 0) {
            return uzc.DASHER_DEVICE_FILTER_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return uzc.BLOCK_WHEN_DASHER_ON_DEVICE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(vmqVar))));
    }
}
