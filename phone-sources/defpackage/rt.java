package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rt extends bko implements byd, byc, cae, bzt {
    public final yjv a;
    public final sd b;
    public View c;
    public clx d;
    public final bcb e = new bci(null, bcz.b);
    public long f = 9205357640488583168L;
    public yrz g;
    public se h;
    private final yjv i;
    private bdy j;
    private cmh k;

    public rt(yjv yjvVar, yjv yjvVar2, sd sdVar) {
        this.a = yjvVar;
        this.i = yjvVar2;
        this.b = sdVar;
    }

    @Override // defpackage.byd
    public final void bT(bvc bvcVar) {
        g(bvcVar);
    }

    @Override // defpackage.byc
    public final void bU(byu byuVar) {
        byuVar.r();
        yrz yrzVar = this.g;
        if (yrzVar != null) {
            yrzVar.b(ygi.a);
        }
    }

    @Override // defpackage.bko
    public final void cd() {
        l();
        this.g = vyf.R(0, 0, 7);
        ykr.q(F(), null, 4, new qy(this, (yih) null, 6), 1);
    }

    @Override // defpackage.bko
    public final void ch() {
        se seVar = this.h;
        if (seVar != null) {
            seVar.b();
        }
        this.h = null;
    }

    public final long e() {
        if (this.j == null) {
            fg fgVar = new fg(this, 16);
            ivx ivxVar = bdt.a;
            this.j = new bbh(fgVar, null);
        }
        bdy bdyVar = this.j;
        if (bdyVar != null) {
            return ((bmx) bdyVar.a()).a;
        }
        return 9205357640488583168L;
    }

    public final void g(bvc bvcVar) {
        this.e.b(bvcVar);
    }

    public final void h() {
        clx clxVar;
        se seVar = this.h;
        if (seVar == null || (clxVar = this.d) == null || cmh.b(seVar.a(), this.k)) {
            return;
        }
        this.i.a(new cmc(clxVar.cv(clw.y(seVar.a()))));
        this.k = new cmh(seVar.a());
    }

    @Override // defpackage.bzt
    public final void l() {
        cbp.Q(this, new fg(this, 14));
    }

    @Override // defpackage.cae
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // defpackage.cae
    public final void x(cfc cfcVar) {
        cfcVar.e(ru.a, new fg(this, 15));
    }

    @Override // defpackage.cae
    public final /* synthetic */ void B() {
    }

    @Override // defpackage.byc
    public final /* synthetic */ void bW() {
    }

    @Override // defpackage.cae
    public final /* synthetic */ void z() {
    }
}
