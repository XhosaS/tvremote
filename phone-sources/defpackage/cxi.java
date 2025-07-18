package defpackage;

import android.view.WindowInsetsAnimation;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxi {
    public final csr a;
    public final csr b;

    public cxi(csr csrVar, csr csrVar2) {
        this.a = csrVar;
        this.b = csrVar2;
    }

    public final String toString() {
        return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
    }

    public cxi(WindowInsetsAnimation.Bounds bounds) {
        this.a = csr.f(bounds.getLowerBound());
        this.b = csr.f(bounds.getUpperBound());
    }
}
