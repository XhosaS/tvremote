package defpackage;

import com.google.android.apps.play.movies.common.view.subtitles.SubtitlesOverlay;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lku implements lks {
    private static final lks a = new lkz();
    private final lie b;
    private final ksy c;
    private final String d;
    private final String e;
    private final boolean f;
    private final lnu g;
    private final llw h;
    private final kwx i;
    private final lld j;
    private final lkr k;
    private final krl l;
    private final idf m;
    private final idf n;
    private lks o = a;
    private mfy p;
    private SubtitlesOverlay q;
    private fbt r;
    private final jzs s;

    public lku(lkr lkrVar, lie lieVar, llw llwVar, lld lldVar, ksy ksyVar, String str, String str2, boolean z, lnu lnuVar, kwx kwxVar, jzs jzsVar, krl krlVar, idf idfVar, idf idfVar2) {
        this.k = lkrVar;
        this.g = lnuVar;
        llwVar.getClass();
        this.h = llwVar;
        ksyVar.getClass();
        this.c = ksyVar;
        this.b = lieVar;
        boolean z2 = true;
        if (str2 == null && str != null) {
            z2 = false;
        }
        a.ah(z2, "ShowId cannot be null when seasonId is not null");
        this.d = str;
        this.e = str2;
        this.f = z;
        this.j = lldVar;
        this.i = kwxVar;
        this.s = jzsVar;
        this.l = krlVar;
        this.m = idfVar;
        this.n = idfVar2;
        x();
    }

    private final void x() {
        if (this.o instanceof lkz) {
            this.o = new llh(this, this.k, this.b, this.h, this.j, this.c, this.d, this.e, this.f, this.g, this.i, this.s, this.m, this.n);
            mfy mfyVar = this.p;
            if (mfyVar != null) {
                if (this.r == null) {
                    mfyVar.d();
                }
                this.o.a(this.p, this.q, this.r);
            }
        }
    }

    @Override // defpackage.lks
    public final void a(mfy mfyVar, SubtitlesOverlay subtitlesOverlay, fbt fbtVar) {
        this.p = mfyVar;
        this.q = subtitlesOverlay;
        this.r = fbtVar;
        this.o.a(mfyVar, subtitlesOverlay, fbtVar);
    }

    @Override // defpackage.lks
    public final void b() {
        this.o.b();
    }

    @Override // defpackage.lks
    public final void c(boolean z) {
        x();
        this.o.c(z);
    }

    @Override // defpackage.lks
    public final void d() {
        this.l.c(true);
        x();
        this.o.d();
    }

    @Override // defpackage.lks
    public final void e(boolean z) {
        this.o.e(z);
    }

    @Override // defpackage.lks
    public final void f() {
        this.o.f();
        w();
    }

    @Override // defpackage.lks
    public final void g() {
        this.o.g();
        w();
    }

    @Override // defpackage.lks
    public final boolean h() {
        return this.o.h();
    }

    @Override // defpackage.lks
    public final boolean i() {
        return this.o.i();
    }

    @Override // defpackage.lwl
    public final int j() {
        return this.o.j();
    }

    @Override // defpackage.llf
    public final void k() {
        this.o.k();
    }

    @Override // defpackage.llf
    public final void l() {
        this.o.l();
    }

    @Override // defpackage.llg
    public final void m() {
        this.o.m();
    }

    @Override // defpackage.loa
    public final void n() {
        this.o.n();
    }

    @Override // defpackage.llf
    public final void o(boolean z) {
        this.o.o(z);
    }

    @Override // defpackage.loa
    public final void p() {
        x();
        this.o.p();
    }

    @Override // defpackage.llg
    public final void q() {
        this.o.q();
    }

    @Override // defpackage.loc
    public final void r() {
        this.o.r();
    }

    @Override // defpackage.loc
    public final void s(int i) {
        this.o.s(i);
    }

    @Override // defpackage.loc
    public final void t(int i, int i2, boolean z) {
        this.o.t(i, i2, z);
    }

    @Override // defpackage.lod
    public final void u(int i) {
        this.o.u(i);
    }

    @Override // defpackage.lod
    public final void v(kwx kwxVar) {
        this.o.v(kwxVar);
    }

    public final void w() {
        this.o = a;
    }
}
