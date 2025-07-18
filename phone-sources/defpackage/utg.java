package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class utg extends xpz {
    private final tpv a;
    private final String b;
    private final Executor c;

    public utg(uqw uqwVar, uqv uqvVar) {
        this.b = uqvVar.c.getAuthority();
        this.c = uqvVar.e;
        this.a = new tpv(new lhx(uqwVar, uqvVar, 16), uqvVar.d);
    }

    @Override // defpackage.xpz
    public final xqb a(xsq xsqVar, xpy xpyVar) {
        if (own.a.compareAndSet(false, true)) {
            vtp vtpVarA = vtp.a();
            vtp vtpVar = yer.a;
            vtpVarA.getClass();
            yer.a = vtpVarA;
        }
        Executor executor = xpyVar.c;
        uhp uhpVarC = this.a.c();
        nbb nbbVar = new nbb(xsqVar, xpyVar, 12);
        if (executor == null) {
            executor = this.c;
        }
        return new utf(szg.l(uhpVarC, nbbVar, executor));
    }

    @Override // defpackage.xpz
    public final String b() {
        return this.b;
    }
}
