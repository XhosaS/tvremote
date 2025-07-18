package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class trf extends ugx {
    private trf(uhp uhpVar) {
        super(uhpVar);
    }

    public static trf d(uhp uhpVar) {
        return uhpVar instanceof trf ? (trf) uhpVar : new trf(uhpVar);
    }

    public final trf a(Class cls, tsl tslVar, Executor executor) {
        return new trf(ues.i(this.b, cls, trc.a(tslVar), executor));
    }

    public final trf b(Class cls, ufw ufwVar, Executor executor) {
        return new trf(szg.j(this.b, cls, ufwVar, executor));
    }

    public final trf e(tsl tslVar, Executor executor) {
        return new trf(szg.l(this.b, tslVar, executor));
    }

    public final trf f(ufw ufwVar, Executor executor) {
        return new trf(szg.m(this.b, ufwVar, executor));
    }
}
