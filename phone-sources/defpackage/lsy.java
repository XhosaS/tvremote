package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class lsy implements tsl {
    public lca a() {
        throw null;
    }

    @Override // defpackage.tsl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        vcz vczVar = (vcz) obj;
        int iOrdinal = vczVar.ordinal();
        if (iOrdinal == 0) {
            return lca.THEME_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return lca.DARK_THEME;
        }
        if (iOrdinal == 2) {
            return lca.LIGHT_THEME;
        }
        if (iOrdinal == 3) {
            return a();
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(vczVar))));
    }
}
