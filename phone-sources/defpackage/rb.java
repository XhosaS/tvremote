package defpackage;

import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rb extends bko implements byc {
    public boolean a;
    public boolean b;
    public boolean c;
    public final kw d;

    public rb(kw kwVar) {
        this.d = kwVar;
    }

    @Override // defpackage.byc
    public final void bU(byu byuVar) {
        byuVar.r();
        if (this.a) {
            long j = bnq.a;
            brx.o(byuVar, bny.k(bnq.d(j), bnq.c(j), bnq.b(j), 0.3f, bnq.f(j)), 0L, byuVar.n(), 0.0f, null, R.styleable.AppCompatTheme_windowFixedWidthMajor);
        } else if (this.b || this.c) {
            long j2 = bnq.a;
            brx.o(byuVar, bny.k(bnq.d(j2), bnq.c(j2), bnq.b(j2), 0.1f, bnq.f(j2)), 0L, byuVar.n(), 0.0f, null, R.styleable.AppCompatTheme_windowFixedWidthMajor);
        }
    }

    @Override // defpackage.bko
    public final void cd() {
        ykr.q(F(), null, 0, new qy(this, (yih) null, 2), 3);
    }

    @Override // defpackage.byc
    public final /* synthetic */ void bW() {
    }
}
