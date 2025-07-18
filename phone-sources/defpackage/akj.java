package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akj extends akg implements bxu {
    public akb a;
    public alg b;
    public boolean c;
    public final bcb d = new bci(new cmh(0), bcz.c);
    public final mr e;
    public lhr f;
    private final rt h;
    private yqe i;

    public akj(akb akbVar, alg algVar, lhr lhrVar, boolean z) {
        this.a = akbVar;
        this.b = algVar;
        this.f = lhrVar;
        this.c = z;
        this.e = new mr(new bmx(hv.p(this.a, this.b, this.f, g())), ang.d, new bmx(ang.b), 8);
        akh akhVar = new akh(this, 0);
        akh akhVar2 = new akh(this, 2);
        if (!ru.a()) {
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
        rt rtVar = new rt(akhVar, akhVar2, Build.VERSION.SDK_INT == 28 ? sg.b : sg.a);
        O(rtVar);
        this.h = rtVar;
    }

    private final void h() {
        yqe yqeVar = this.i;
        if (yqeVar != null) {
            yqeVar.t(null);
        }
        this.i = null;
        if (ru.a()) {
            this.i = ykr.q(F(), null, 0, new aki(this, (yih) null, 0), 3);
        }
    }

    @Override // defpackage.akg, defpackage.byc
    public final void bU(byu byuVar) {
        byuVar.r();
        this.h.bU(byuVar);
    }

    @Override // defpackage.bko
    public final void cd() {
        h();
    }

    @Override // defpackage.akg, defpackage.bwa
    public final void e(bvc bvcVar) {
        this.h.g(bvcVar);
    }

    @Override // defpackage.akg
    public final void f(akb akbVar, alg algVar, lhr lhrVar, boolean z) {
        akb akbVar2 = this.a;
        alg algVar2 = this.b;
        lhr lhrVar2 = this.f;
        boolean z2 = this.c;
        this.a = akbVar;
        this.b = algVar;
        this.f = lhrVar;
        this.c = z;
        if (yks.e(akbVar, akbVar2) && yks.e(algVar, algVar2) && yks.e(lhrVar, lhrVar2) && z == z2) {
            return;
        }
        h();
    }

    public final long g() {
        return ((cmh) this.d.a()).a;
    }

    @Override // defpackage.akg, defpackage.cae
    public final void x(cfc cfcVar) {
        this.h.x(cfcVar);
    }
}
