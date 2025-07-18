package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hvh implements hvm {
    private hux a;

    public hvh() {
        if (!hwp.l(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
    }

    @Override // defpackage.hvm
    public final hux c() {
        return this.a;
    }

    @Override // defpackage.hvm
    public final void f(hux huxVar) {
        this.a = huxVar;
    }

    @Override // defpackage.hvm
    public final void g(hvd hvdVar) {
        hvdVar.e(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // defpackage.hud
    public final void k() {
    }

    @Override // defpackage.hud
    public final void l() {
    }

    @Override // defpackage.hud
    public final void m() {
    }

    @Override // defpackage.hvm
    public final void d(Drawable drawable) {
    }

    @Override // defpackage.hvm
    public final void e(Drawable drawable) {
    }

    @Override // defpackage.hvm
    public final void h(hvd hvdVar) {
    }
}
