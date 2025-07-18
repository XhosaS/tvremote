package defpackage;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dyo implements dyp {
    final int a;
    final Interpolator b;

    public dyo(int i, Interpolator interpolator) {
        this.a = i;
        this.b = interpolator;
    }

    @Override // defpackage.dyp
    public final eas a(ean eanVar) {
        return new eaq(this.a, eanVar, this.b);
    }
}
