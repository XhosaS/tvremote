package androidx.compose.foundation.selection;

import defpackage.a;
import defpackage.aee;
import defpackage.bko;
import defpackage.bzi;
import defpackage.cbp;
import defpackage.cez;
import defpackage.kw;
import defpackage.rs;
import defpackage.yjk;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SelectableElement extends bzi<aee> {
    private final boolean a;
    private final rs b;
    private final boolean c;
    private final boolean d;
    private final cez e;
    private final yjk f;
    private final kw h;

    public SelectableElement(boolean z, kw kwVar, rs rsVar, boolean z2, boolean z3, cez cezVar, yjk yjkVar) {
        this.a = z;
        this.h = kwVar;
        this.b = rsVar;
        this.c = z2;
        this.d = z3;
        this.e = cezVar;
        this.f = yjkVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new aee(this.a, this.h, this.b, this.c, this.d, this.e, this.f);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        aee aeeVar = (aee) bkoVar;
        boolean z = aeeVar.j;
        boolean z2 = this.a;
        if (z != z2) {
            aeeVar.j = z2;
            cbp.M(aeeVar);
        }
        yjk yjkVar = this.f;
        cez cezVar = this.e;
        boolean z3 = this.d;
        boolean z4 = this.c;
        aeeVar.C(this.h, this.b, z4, z3, null, cezVar, yjkVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.a == selectableElement.a && yks.e(this.h, selectableElement.h) && yks.e(this.b, selectableElement.b) && this.c == selectableElement.c && this.d == selectableElement.d && yks.e(this.e, selectableElement.e) && this.f == selectableElement.f;
    }

    public final int hashCode() {
        kw kwVar = this.h;
        int iHashCode = kwVar != null ? kwVar.hashCode() : 0;
        boolean z = this.a;
        rs rsVar = this.b;
        int iHashCode2 = rsVar != null ? rsVar.hashCode() : 0;
        int iQ = (a.q(z) * 31) + iHashCode;
        boolean z2 = this.c;
        boolean z3 = this.d;
        cez cezVar = this.e;
        return (((((((((iQ * 31) + iHashCode2) * 31) + a.q(z2)) * 31) + a.q(z3)) * 31) + (cezVar != null ? cezVar.a : 0)) * 31) + this.f.hashCode();
    }
}
