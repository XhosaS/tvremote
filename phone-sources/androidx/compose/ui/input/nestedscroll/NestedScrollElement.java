package androidx.compose.ui.input.nestedscroll;

import defpackage.bko;
import defpackage.bsb;
import defpackage.bse;
import defpackage.bsh;
import defpackage.bzi;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class NestedScrollElement extends bzi<bsh> {
    private final bsb a;
    private final bse b;

    public NestedScrollElement(bsb bsbVar, bse bseVar) {
        this.a = bsbVar;
        this.b = bseVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new bsh(this.a, this.b);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        bsh bshVar = (bsh) bkoVar;
        bshVar.a = this.a;
        bshVar.h();
        bse bseVar = this.b;
        if (bseVar == null) {
            bshVar.b = new bse();
        } else if (!yks.e(bseVar, bshVar.b)) {
            bshVar.b = bseVar;
        }
        if (bshVar.A) {
            bshVar.i();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return yks.e(nestedScrollElement.a, this.a) && yks.e(nestedScrollElement.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        bse bseVar = this.b;
        return iHashCode + (bseVar != null ? bseVar.hashCode() : 0);
    }
}
