package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oye {
    private final int a;
    private final uyv b;

    public oye() {
        throw null;
    }

    public final voh a() {
        vtw vtwVarM = voh.a.m();
        int i = this.a;
        vof vofVar = i != 1 ? i != 2 ? vof.ORIENTATION_UNKNOWN : vof.ORIENTATION_LANDSCAPE : vof.ORIENTATION_PORTRAIT;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        voh vohVar = (voh) vtwVarM.b;
        vohVar.c = vofVar.d;
        vohVar.b |= 1;
        int iOrdinal = this.b.ordinal();
        vog vogVar = iOrdinal != 1 ? iOrdinal != 2 ? vog.THEME_UNKNOWN : vog.THEME_DARK : vog.THEME_LIGHT;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        voh vohVar2 = (voh) vtwVarM.b;
        vohVar2.d = vogVar.d;
        vohVar2.b |= 2;
        return (voh) vtwVarM.r();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oye) {
            oye oyeVar = (oye) obj;
            if (this.a == oyeVar.a && this.b.equals(oyeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "PromoDisplayContext{screenOrientation=" + this.a + ", theme=" + String.valueOf(this.b) + "}";
    }

    public oye(int i, uyv uyvVar) {
        this.a = i;
        this.b = uyvVar;
    }
}
