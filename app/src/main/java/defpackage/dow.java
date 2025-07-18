package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dow implements dpf {
    private final int a;
    private final int b;
    public don c;

    public dow(int i, int i2) {
        if (!dqm.k(i, i2)) {
            throw new IllegalArgumentException(a.k(i2, i, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", " and height: "));
        }
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.dpf
    public final don d() {
        return this.c;
    }

    @Override // defpackage.dpf
    public final void f(don donVar) {
        this.c = donVar;
    }

    @Override // defpackage.dpf
    public final void g(dpe dpeVar) {
        dpeVar.e(this.a, this.b);
    }

    @Override // defpackage.dne
    public final void l() {
    }

    @Override // defpackage.dne
    public final void m() {
    }

    @Override // defpackage.dne
    public final void n() {
    }

    @Override // defpackage.dpf
    public void a(Drawable drawable) {
    }

    @Override // defpackage.dpf
    public final void e(Drawable drawable) {
    }

    @Override // defpackage.dpf
    public final void h(dpe dpeVar) {
    }
}
