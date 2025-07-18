package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pcy extends tsg {
    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doBackward(Object obj) {
        uzg uzgVar = (uzg) obj;
        int iOrdinal = uzgVar.ordinal();
        if (iOrdinal == 0) {
            return vmx.ACTION_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return vmx.DISPLAYED;
        }
        if (iOrdinal == 2) {
            return vmx.TAPPED;
        }
        if (iOrdinal == 3) {
            return vmx.AUTOMATED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(uzgVar))));
    }

    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doForward(Object obj) {
        vmx vmxVar = (vmx) obj;
        int iOrdinal = vmxVar.ordinal();
        if (iOrdinal == 0) {
            return uzg.UNKNOWN;
        }
        if (iOrdinal == 1) {
            return uzg.DISPLAYED;
        }
        if (iOrdinal == 2) {
            return uzg.TAPPED;
        }
        if (iOrdinal == 3) {
            return uzg.AUTOMATED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(vmxVar))));
    }
}
