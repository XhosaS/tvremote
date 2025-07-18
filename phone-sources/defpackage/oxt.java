package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class oxt extends tsg {
    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doBackward(Object obj) {
        uwv uwvVar = (uwv) obj;
        int iOrdinal = uwvVar.ordinal();
        if (iOrdinal == 0) {
            return vog.THEME_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return vog.THEME_LIGHT;
        }
        if (iOrdinal == 2) {
            return vog.THEME_DARK;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(uwvVar))));
    }

    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doForward(Object obj) {
        vog vogVar = (vog) obj;
        int iOrdinal = vogVar.ordinal();
        if (iOrdinal == 0) {
            return uwv.THEME_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return uwv.THEME_LIGHT;
        }
        if (iOrdinal == 2) {
            return uwv.THEME_DARK;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(vogVar))));
    }
}
