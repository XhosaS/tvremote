package defpackage;

import android.view.WindowInsetsAnimation;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rf {
    public final nt a;
    public final nt b;

    public rf(nt ntVar, nt ntVar2) {
        this.a = ntVar;
        this.b = ntVar2;
    }

    public final String toString() {
        return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
    }

    public rf(WindowInsetsAnimation.Bounds bounds) {
        this.a = nt.e(bounds.getLowerBound());
        this.b = nt.e(bounds.getUpperBound());
    }
}
