package defpackage;

import androidx.compose.foundation.layout.BoxChildDataElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xt implements xr {
    public final clx a;
    public final long b;
    private final /* synthetic */ xs c = xs.a;

    public xt(clx clxVar, long j) {
        this.a = clxVar;
        this.b = j;
    }

    @Override // defpackage.xr
    public final bkp a(bkp bkpVar, bkd bkdVar) {
        return this.c.a(bkpVar, bkdVar);
    }

    @Override // defpackage.xr
    public final bkp b(bkp bkpVar) {
        return new BoxChildDataElement(bkb.e, true);
    }

    public final float c() {
        long j = this.b;
        if (clv.h(j)) {
            return this.a.cp(clv.b(j));
        }
        return Float.POSITIVE_INFINITY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt)) {
            return false;
        }
        xt xtVar = (xt) obj;
        return yks.e(this.a, xtVar.a) && a.s(this.b, xtVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.k(this.b);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + ((Object) clv.e(this.b)) + ')';
    }
}
