package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aful extends afnb {
    final afhb a;
    final afgr b;
    final afnt c;
    final afnu d;
    List e;
    afsv f;
    boolean g;
    boolean h;
    afkb i;
    final /* synthetic */ afun j;

    public aful(afun afunVar, afhb afhbVar) {
        this.j = afunVar;
        this.e = afhbVar.a;
        this.a = afhbVar;
        afgr afgrVarA = afgr.a("Subchannel", afunVar.q.b());
        this.b = afgrVarA;
        afnu afnuVar = new afnu(afgrVarA, afunVar.l.a(), "Subchannel for ".concat(afhbVar.a.toString()));
        this.d = afnuVar;
        this.c = new afnt(afnuVar, afunVar.l);
    }

    @Override // defpackage.afhj
    public final void a() {
        this.j.m.d();
        yqw.M(this.g, "not started");
        this.f.a();
    }

    @Override // defpackage.afhj
    public final void b() {
        afkb afkbVar;
        afun afunVar = this.j;
        afkc afkcVar = afunVar.m;
        afkcVar.d();
        if (this.f == null) {
            this.h = true;
            return;
        }
        if (!this.h) {
            this.h = true;
        } else {
            if (!afunVar.D || (afkbVar = this.i) == null) {
                return;
            }
            afkbVar.a();
            this.i = null;
        }
        if (afunVar.D) {
            this.f.h(afun.b);
        } else {
            this.i = afkcVar.a(new aftd(new afuk(this)), 5L, TimeUnit.SECONDS, afunVar.i.c());
        }
    }

    @Override // defpackage.afhj
    public final void c(afhl afhlVar) {
        afun afunVar = this.j;
        afkc afkcVar = afunVar.m;
        afkcVar.d();
        yqw.M(!this.g, "already started");
        yqw.M(!this.h, "already shutdown");
        yqw.M(!afunVar.D, "Channel is being terminated");
        this.g = true;
        String strB = afunVar.q.b();
        afoj afojVar = afunVar.i;
        ScheduledExecutorService scheduledExecutorServiceC = afojVar.c();
        afuj afujVar = new afuj(this, afhlVar);
        afgm afgmVar = afunVar.K;
        afsv afsvVar = new afsv(this.a, strB, afunVar.s, afojVar, scheduledExecutorServiceC, afkcVar, afujVar, afgmVar, afunVar.G.a(), this.b, this.c, afunVar.r);
        afunVar.I.b(afgi.a("Child Subchannel started", afgj.CT_INFO, Long.valueOf(afunVar.l.a()), afsvVar));
        this.f = afsvVar;
        afgm.b(afgmVar.e, afsvVar);
        afunVar.x.add(afsvVar);
    }

    @Override // defpackage.afhj
    public final void d(List list) {
        this.j.m.d();
        this.e = list;
        afsv afsvVar = this.f;
        list.getClass();
        afsv.j(list);
        yqw.B(!list.isEmpty(), "newAddressGroups is empty");
        List listUnmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list));
        afkc afkcVar = afsvVar.g;
        afkcVar.c(new afsh(afsvVar, listUnmodifiableList));
        afkcVar.b();
    }

    public final String toString() {
        return this.b.toString();
    }
}
