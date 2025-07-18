package defpackage;

import android.view.WindowInsetsAnimation;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aia {
    public final acs a;
    public final acs b;

    public aia(acs acsVar, acs acsVar2) {
        this.a = acsVar;
        this.b = acsVar2;
    }

    public final String toString() {
        return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
    }

    public aia(WindowInsetsAnimation.Bounds bounds) {
        this.a = acs.e(bounds.getLowerBound());
        this.b = acs.e(bounds.getUpperBound());
    }
}
