package androidx.compose.foundation;

import defpackage.bko;
import defpackage.bxv;
import defpackage.bzi;
import defpackage.kw;
import defpackage.rr;
import defpackage.rs;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class IndicationModifierElement extends bzi<rr> {
    private final rs a;
    private final kw b;

    public IndicationModifierElement(kw kwVar, rs rsVar) {
        this.b = kwVar;
        this.a = rsVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new rr(this.a.b(this.b));
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        rr rrVar = (rr) bkoVar;
        bxv bxvVarB = this.a.b(this.b);
        rrVar.N(rrVar.a);
        rrVar.a = bxvVarB;
        rrVar.O(bxvVarB);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return yks.e(this.b, indicationModifierElement.b) && yks.e(this.a, indicationModifierElement.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
