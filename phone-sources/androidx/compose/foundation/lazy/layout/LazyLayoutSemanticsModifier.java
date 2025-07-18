package androidx.compose.foundation.lazy.layout;

import defpackage.a;
import defpackage.ado;
import defpackage.adp;
import defpackage.bko;
import defpackage.bzi;
import defpackage.cbp;
import defpackage.uv;
import defpackage.yjk;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LazyLayoutSemanticsModifier extends bzi<adp> {
    private final yjk a;
    private final ado b;
    private final uv c;
    private final boolean d;
    private final boolean e = false;

    public LazyLayoutSemanticsModifier(yjk yjkVar, ado adoVar, uv uvVar, boolean z) {
        this.a = yjkVar;
        this.b = adoVar;
        this.c = uvVar;
        this.d = z;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new adp(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        adp adpVar = (adp) bkoVar;
        adpVar.a = this.a;
        adpVar.b = this.b;
        uv uvVar = adpVar.c;
        uv uvVar2 = this.c;
        if (uvVar != uvVar2) {
            adpVar.c = uvVar2;
            cbp.M(adpVar);
        }
        boolean z = this.d;
        if (adpVar.d == z) {
            return;
        }
        adpVar.d = z;
        adpVar.b();
        cbp.M(adpVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        if (this.a != lazyLayoutSemanticsModifier.a || !yks.e(this.b, lazyLayoutSemanticsModifier.b) || this.c != lazyLayoutSemanticsModifier.c || this.d != lazyLayoutSemanticsModifier.d) {
            return false;
        }
        boolean z = lazyLayoutSemanticsModifier.e;
        return true;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + a.q(this.d)) * 31) + a.q(false);
    }
}
