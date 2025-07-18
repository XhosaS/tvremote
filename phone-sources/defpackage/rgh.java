package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rgh extends qub {
    private final qth b;
    private final tst c;

    public rgh(qth qthVar, Drawable drawable) {
        this.b = qthVar;
        this.c = tst.i(new qtz(drawable, null, 8));
    }

    @Override // defpackage.qub
    protected final void a(Object obj) {
        sjl.c();
        this.a.k(cb.A(obj, this.b) ? tst.i(new qua(this.c, trk.a)) : trk.a);
    }
}
