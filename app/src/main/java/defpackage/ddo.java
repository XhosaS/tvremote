package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddo implements ddp, dqs {
    private static final afh a = dqu.a(20, new ddn());
    private final dqw b = new dqv();
    private ddp c;
    private boolean d;
    private boolean e;

    static ddo d(ddp ddpVar) {
        ddo ddoVar = (ddo) a.a();
        ddoVar.e = false;
        ddoVar.d = true;
        ddoVar.c = ddpVar;
        return ddoVar;
    }

    @Override // defpackage.ddp
    public final int a() {
        return this.c.a();
    }

    @Override // defpackage.ddp
    public final Class b() {
        return this.c.b();
    }

    @Override // defpackage.ddp
    public final Object c() {
        return this.c.c();
    }

    @Override // defpackage.dqs
    public final dqw cB() {
        return this.b;
    }

    @Override // defpackage.ddp
    public final synchronized void e() {
        this.b.a();
        this.e = true;
        if (this.d) {
            return;
        }
        this.c.e();
        this.c = null;
        a.b(this);
    }

    final synchronized void f() {
        this.b.a();
        if (!this.d) {
            throw new IllegalStateException("Already unlocked");
        }
        this.d = false;
        if (this.e) {
            e();
        }
    }
}
