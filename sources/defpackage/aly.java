package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aly implements amj, amg, amf, amc {
    public final alx a;
    public final amn b;
    private final Executor c;

    public aly(Executor executor, alx alxVar, amn amnVar) {
        this.c = executor;
        this.a = alxVar;
        this.b = amnVar;
    }

    @Override // defpackage.amg
    public final void a(Object obj) {
        this.b.l(obj);
    }

    @Override // defpackage.amc
    public final void b() {
        this.b.m();
    }

    @Override // defpackage.amj
    public final void c(ami amiVar) {
        this.c.execute(new bb(this, amiVar, 20, (short[]) null));
    }

    @Override // defpackage.amf
    public final void d(Exception exc) {
        this.b.k(exc);
    }
}
