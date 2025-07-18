package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class lsw implements tsl {
    public lbw a() {
        throw null;
    }

    @Override // defpackage.tsl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        vcv vcvVar = (vcv) obj;
        int iOrdinal = vcvVar.ordinal();
        if (iOrdinal == 0) {
            return lbw.COLOR_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return lbw.COLOR_SOLID;
        }
        if (iOrdinal == 2) {
            return lbw.COLOR_GRADIENT;
        }
        if (iOrdinal == 3) {
            return lbw.COLOR_UI_THEME;
        }
        if (iOrdinal == 4) {
            return a();
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(vcvVar))));
    }
}
