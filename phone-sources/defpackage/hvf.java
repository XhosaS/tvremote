package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public abstract class hvf implements hvm {
    public hux a;

    @Override // defpackage.hvm
    public hux c() {
        return this.a;
    }

    @Override // defpackage.hvm
    public void f(hux huxVar) {
        this.a = huxVar;
    }

    @Override // defpackage.hvm
    public void g(hvd hvdVar) {
        if (!hwp.l(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648, either provide dimensions in the constructor or call override()");
        }
        hvdVar.e(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // defpackage.hud
    public final void k() {
    }

    @Override // defpackage.hud
    public void l() {
    }

    @Override // defpackage.hud
    public void m() {
    }

    @Override // defpackage.hvm
    public void a(Drawable drawable) {
    }

    @Override // defpackage.hvm
    public void d(Drawable drawable) {
    }

    @Override // defpackage.hvm
    public void e(Drawable drawable) {
    }

    @Override // defpackage.hvm
    public void h(hvd hvdVar) {
    }
}
