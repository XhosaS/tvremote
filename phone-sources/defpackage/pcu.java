package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pcu extends tsg {
    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doBackward(Object obj) {
        uyb uybVar = (uyb) obj;
        int iOrdinal = uybVar.ordinal();
        if (iOrdinal == 0) {
            return vni.FONT_SIZE_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return vni.SMALL;
        }
        if (iOrdinal == 2) {
            return vni.LARGE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(uybVar))));
    }

    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doForward(Object obj) {
        vni vniVar = (vni) obj;
        int iOrdinal = vniVar.ordinal();
        if (iOrdinal == 0) {
            return uyb.TEXT_SIZE_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return uyb.MATERIAL_SUBHEAD_1;
        }
        if (iOrdinal == 2) {
            return uyb.MATERIAL_HEADLINE_5;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(vniVar))));
    }
}
