package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acp {
    public final bcb a;
    public long b;
    public long c;
    public bpu d;
    public final mr e;
    public final mr f;
    public long g;
    private final yow h;
    private final bcb i;
    private final bcb j;
    private final bcb k;
    private final bcb l;
    private final bnf m;

    public acp(yow yowVar, bnf bnfVar) {
        this.h = yowVar;
        this.m = bnfVar;
        bcz bczVar = bcz.c;
        this.i = new bci(false, bczVar);
        this.j = new bci(false, bczVar);
        this.k = new bci(false, bczVar);
        this.a = new bci(false, bczVar);
        this.b = 9223372034707292159L;
        long j = 0;
        this.c = 0L;
        Object obj = null;
        this.d = bnfVar != null ? bnfVar.a() : null;
        int i = 12;
        this.e = new mr(new cmf(j), pm.g, obj, i);
        this.f = new mr(Float.valueOf(1.0f), pm.a, obj, i);
        this.l = new bci(new cmf(j), bczVar);
        this.g = 9223372034707292159L;
    }

    public final long a() {
        return ((cmf) this.l.a()).a;
    }

    public final void b() {
        bpu bpuVar = this.d;
        e();
        if (f()) {
            if (bpuVar != null) {
                bpuVar.h(1.0f);
            }
            ykr.q(this.h, null, 0, new qy(this, (yih) null, 10), 3);
        }
    }

    public final void c() {
        if (g()) {
            ykr.q(this.h, null, 0, new qy(this, (yih) null, 11, (byte[]) null), 3);
        }
    }

    public final void d() {
        bnf bnfVar;
        if (g()) {
            h();
            ykr.q(this.h, null, 0, new qy(this, (yih) null, 12, (char[]) null), 3);
        }
        if (e()) {
            this.j.b(false);
            ykr.q(this.h, null, 0, new qy(this, (yih) null, 13, (short[]) null), 3);
        }
        if (f()) {
            this.k.b(false);
            ykr.q(this.h, null, 0, new qy(this, (yih) null, 14, (int[]) null), 3);
        }
        i();
        this.b = 9223372034707292159L;
        bpu bpuVar = this.d;
        if (bpuVar != null && (bnfVar = this.m) != null) {
            bnfVar.c(bpuVar);
        }
        this.d = null;
    }

    public final boolean e() {
        return ((Boolean) this.j.a()).booleanValue();
    }

    public final boolean f() {
        return ((Boolean) this.k.a()).booleanValue();
    }

    public final boolean g() {
        return ((Boolean) this.i.a()).booleanValue();
    }

    public final void h() {
        this.i.b(false);
    }

    public final void i() {
        this.l.b(new cmf(0L));
    }
}
