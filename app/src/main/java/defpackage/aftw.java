package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aftw extends afhe {
    afng a;
    public final /* synthetic */ afun b;

    public aftw(afun afunVar) {
        this.b = afunVar;
    }

    @Override // defpackage.afhe
    public final /* bridge */ /* synthetic */ afhj a(afhb afhbVar) {
        afun afunVar = this.b;
        afunVar.m.d();
        yqw.M(!afunVar.D, "Channel is being terminated");
        return new aful(afunVar, afhbVar);
    }

    @Override // defpackage.afhe
    public final afkc b() {
        return this.b.m;
    }

    @Override // defpackage.afhe
    public final ScheduledExecutorService c() {
        return this.b.j;
    }

    @Override // defpackage.afhe
    public final void d() {
        afkc afkcVar = this.b.m;
        afkcVar.d();
        afkcVar.c(new aftv(this));
        afkcVar.b();
    }

    @Override // defpackage.afhe
    public final void e(affe affeVar, afhk afhkVar) {
        afun afunVar = this.b;
        afunVar.m.d();
        affeVar.getClass();
        if (this != afunVar.v || afunVar.w) {
            return;
        }
        afunVar.A.a(afhkVar);
        if (affeVar != affe.SHUTDOWN) {
            afunVar.J.b(2, "Entering {0} state with picker: {1}", affeVar, afhkVar);
            afunVar.p.a(affeVar);
        }
    }
}
