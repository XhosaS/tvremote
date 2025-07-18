package androidx.compose.foundation.selection;

import defpackage.a;
import defpackage.aeg;
import defpackage.bko;
import defpackage.bzi;
import defpackage.cbp;
import defpackage.cez;
import defpackage.kw;
import defpackage.rs;
import defpackage.yjv;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ToggleableElement extends bzi<aeg> {
    private final boolean a;
    private final rs b;
    private final boolean c;
    private final cez d;
    private final yjv e;
    private final kw f;

    public /* synthetic */ ToggleableElement(boolean z, kw kwVar, rs rsVar, boolean z2, cez cezVar, yjv yjvVar) {
        this.a = z;
        this.f = kwVar;
        this.b = rsVar;
        this.c = z2;
        this.d = cezVar;
        this.e = yjvVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new aeg(this.a, this.f, this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        aeg aegVar = (aeg) bkoVar;
        boolean z = aegVar.j;
        boolean z2 = this.a;
        if (z != z2) {
            aegVar.j = z2;
            cbp.M(aegVar);
        }
        yjv yjvVar = this.e;
        cez cezVar = this.d;
        boolean z3 = this.c;
        rs rsVar = this.b;
        kw kwVar = this.f;
        aegVar.k = yjvVar;
        aegVar.C(kwVar, rsVar, false, z3, null, cezVar, aegVar.l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.a == toggleableElement.a && yks.e(this.f, toggleableElement.f) && yks.e(this.b, toggleableElement.b) && this.c == toggleableElement.c && yks.e(this.d, toggleableElement.d) && this.e == toggleableElement.e;
    }

    public final int hashCode() {
        kw kwVar = this.f;
        int iHashCode = kwVar != null ? kwVar.hashCode() : 0;
        boolean z = this.a;
        rs rsVar = this.b;
        int iHashCode2 = rsVar != null ? rsVar.hashCode() : 0;
        int iQ = (a.q(z) * 31) + iHashCode;
        int iQ2 = a.q(false);
        boolean z2 = this.c;
        cez cezVar = this.d;
        return (((((((((iQ * 31) + iHashCode2) * 31) + iQ2) * 31) + a.q(z2)) * 31) + (cezVar != null ? cezVar.a : 0)) * 31) + this.e.hashCode();
    }
}
