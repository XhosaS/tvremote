package defpackage;

import android.app.Activity;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etb extends evl {
    public final Activity a;
    public final wit b;
    public final eup c;
    final aejl d;
    public final aejl e;
    public final aejl f;
    public final aejl g;
    final aejl h;
    public final aejl i;
    final aejl j;
    final aejl k;
    final aejl l;
    final aejl m;
    final aejl n;
    private final ete o;
    private final etb p = this;

    public etb(eup eupVar, ete eteVar, Activity activity, wit witVar) {
        this.c = eupVar;
        this.o = eteVar;
        this.a = activity;
        this.b = witVar;
        this.d = aejo.b(new eta(eupVar, this, 0));
        this.e = aejf.c(new eta(eupVar, this, 2));
        this.f = new eta(eupVar, this, 1);
        this.g = aejf.c(new eta(eupVar, this, 3));
        this.h = aejo.b(new eta(eupVar, this, 5));
        this.i = aejf.c(new eta(eupVar, this, 4));
        this.j = aejf.c(new eta(eupVar, this, 9));
        this.k = aejf.c(new eta(eupVar, this, 10));
        aeje aejeVar = new aeje();
        this.l = aejeVar;
        aejf.c(new eta(eupVar, this, 8));
        this.m = aejf.c(new eta(eupVar, this, 11));
        aeje.b(aejeVar, aejf.c(new eta(eupVar, this, 6)));
        this.n = aejf.c(new eta(eupVar, this, 12));
    }

    public final fdd a() {
        eup eupVar = this.c;
        return new fdd((fda) eupVar.fS.a(), (ahbt) eupVar.q.a());
    }

    public final fro b() {
        eup eupVar = this.c;
        return new fro((ahbt) eupVar.q.a(), eupVar.an());
    }

    public final fsb c() {
        eup eupVar = this.c;
        return new fsb((ahbt) eupVar.q.a(), eupVar.ap());
    }

    public final ftw d() {
        eup eupVar = this.c;
        return new ftw((ahbt) eupVar.q.a(), eupVar.ax());
    }

    public final fvd e() {
        eup eupVar = this.c;
        return new fvd((ahbt) eupVar.q.a(), eupVar.aD());
    }

    public final gtw f() {
        eup eupVar = this.c;
        return new gtw((ahbt) eupVar.q.a(), (gtu) eupVar.bE.a());
    }

    public final gzb g() {
        eup eupVar = this.c;
        return new gzb((ahbt) eupVar.q.a(), (gyy) eupVar.fX.a());
    }

    public final iba h() {
        eup eupVar = this.c;
        return new iba((iax) eupVar.gb.a(), (ahbt) eupVar.q.a());
    }

    public final icz i() {
        eup eupVar = this.c;
        return new icz((ahbt) eupVar.q.a(), eupVar.bZ());
    }

    public final irl j() {
        return new irl((bw) this.d.a());
    }

    @Override // defpackage.wjh
    public final wjl k() {
        return (wjl) this.n.a();
    }

    @Override // defpackage.wxi
    public final wxc l() {
        return (wxc) this.c.ii.a();
    }

    @Override // defpackage.aehp
    public final aehr m() {
        return new aehr(new aeji(yyr.m("vgq", true, "vrp", true, "vze", true)), new euq(this.c));
    }

    @Override // defpackage.wxi
    public final Set n() {
        return zcp.b;
    }

    @Override // defpackage.aeij
    public final etf o() {
        return new etf(this.c, this.p);
    }
}
