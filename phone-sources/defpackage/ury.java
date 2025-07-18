package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ury implements urz {
    private final urr b;
    private final urx c;
    private final String d;
    private final Object e;

    public ury(urr urrVar) {
        this.b = urrVar;
        this.c = urrVar.b;
        this.d = urrVar.a;
        this.e = urrVar.c;
    }

    @Override // defpackage.urz
    public final tst a(vvj vvjVar) {
        sjl.b();
        return this.c.a(new urw(this.e, this.d, new tsj(tsh.a, vvjVar)), this.b);
    }

    @Override // defpackage.urz
    public final tst b(vvj vvjVar) {
        sjl.b();
        return this.c.b(new urw(this.e, this.d, new tsj(tsh.a, vvjVar)), this.b);
    }

    @Override // defpackage.urz
    public final void c(vvj vvjVar, xsm xsmVar, vvj vvjVar2, xsm xsmVar2, long j, TimeUnit timeUnit) {
        sjl.b();
        vvjVar.getClass();
        xsmVar.getClass();
        xsmVar2.getClass();
        urw urwVar = new urw(this.e, this.d, new tsj(tsh.a, vvjVar));
        urr urrVar = this.b;
        urx urxVar = urrVar.b;
        int iL = 0;
        if (urxVar.e != -1 && urxVar.f == 1) {
            iL = vvjVar.l() + vvjVar2.l() + uiv.k(xsmVar) + uiv.k(xsmVar2);
        }
        this.c.d(urwVar, xsmVar, vvjVar2, xsmVar2, iL, j, timeUnit, urrVar);
    }
}
