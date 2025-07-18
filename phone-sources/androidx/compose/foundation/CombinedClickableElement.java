package androidx.compose.foundation;

import defpackage.a;
import defpackage.bko;
import defpackage.bts;
import defpackage.bzi;
import defpackage.cbp;
import defpackage.kw;
import defpackage.qg;
import defpackage.qz;
import defpackage.yjk;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class CombinedClickableElement extends bzi<qz> {
    private final boolean a;
    private final yjk b;
    private final yjk c;
    private final kw d;

    public /* synthetic */ CombinedClickableElement(kw kwVar, boolean z, yjk yjkVar, yjk yjkVar2) {
        this.d = kwVar;
        this.a = z;
        this.b = yjkVar;
        this.c = yjkVar2;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new qz(this.b, this.c, this.d, this.a);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        boolean z;
        bts btsVar;
        qz qzVar = (qz) bkoVar;
        qzVar.k = true;
        if (!yks.e(null, null)) {
            cbp.M(qzVar);
        }
        yjk yjkVar = this.c;
        if ((qzVar.j == null) != (yjkVar == null)) {
            qzVar.f();
            cbp.M(qzVar);
            z = true;
        } else {
            z = false;
        }
        boolean z2 = this.a;
        kw kwVar = this.d;
        yjk yjkVar2 = this.b;
        qzVar.j = yjkVar;
        boolean z3 = true ^ ((qg) qzVar).a;
        qzVar.C(kwVar, null, z2, true, null, null, yjkVar2);
        if ((!z3 && !z) || (btsVar = qzVar.f) == null) {
            return;
        }
        btsVar.q();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return yks.e(this.d, combinedClickableElement.d) && yks.e(null, null) && this.a == combinedClickableElement.a && yks.e(null, null) && yks.e(null, null) && this.b == combinedClickableElement.b && yks.e(null, null) && this.c == combinedClickableElement.c;
    }

    public final int hashCode() {
        kw kwVar = this.d;
        int iHashCode = ((((((kwVar != null ? kwVar.hashCode() : 0) * 961) + a.q(this.a)) * 31) + a.q(true)) * 29791) + this.b.hashCode();
        yjk yjkVar = this.c;
        return (((iHashCode * 961) + (yjkVar != null ? yjkVar.hashCode() : 0)) * 961) + a.q(true);
    }
}
