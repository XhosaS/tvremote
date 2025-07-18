package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class oxs extends tsg {
    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doBackward(Object obj) {
        uwu uwuVar = (uwu) obj;
        int iOrdinal = uwuVar.ordinal();
        if (iOrdinal == 0) {
            return vof.ORIENTATION_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return vof.ORIENTATION_PORTRAIT;
        }
        if (iOrdinal == 2) {
            return vof.ORIENTATION_LANDSCAPE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(uwuVar))));
    }

    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doForward(Object obj) {
        vof vofVar = (vof) obj;
        int iOrdinal = vofVar.ordinal();
        if (iOrdinal == 0) {
            return uwu.ORIENTATION_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return uwu.ORIENTATION_PORTRAIT;
        }
        if (iOrdinal == 2) {
            return uwu.ORIENTATION_LANDSCAPE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(vofVar))));
    }
}
