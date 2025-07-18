package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agmg extends agfw {
    volatile boolean a;
    private final aghf b;
    private final aggh c;
    private final aghf d;
    private final agmi e;

    public agmg(agmi agmiVar) {
        this.e = agmiVar;
        aghf aghfVar = new aghf();
        this.b = aghfVar;
        aggh agghVar = new aggh();
        this.c = agghVar;
        aghf aghfVar2 = new aghf();
        this.d = aghfVar2;
        aghfVar2.a(aghfVar);
        aghfVar2.a(agghVar);
    }

    @Override // defpackage.agfw
    public final aggi b(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.a ? aghe.INSTANCE : this.e.g(runnable, j, timeUnit, this.c);
    }

    @Override // defpackage.aggi
    public final void dispose() {
        if (this.a) {
            return;
        }
        this.a = true;
        this.d.dispose();
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }
}
