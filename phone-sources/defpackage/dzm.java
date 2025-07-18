package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzm {
    public long a;
    public long b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;

    public dzm() {
        this.b = Long.MIN_VALUE;
    }

    public final void a(long j) {
        boolean z = true;
        if (j != Long.MIN_VALUE && j < 0) {
            z = false;
        }
        a.H(z);
        this.b = j;
    }

    public final void b(long j) {
        a.H(j >= 0);
        this.a = j;
    }

    public dzm(dzn dznVar) {
        this.a = dznVar.k;
        this.b = dznVar.m;
        this.c = dznVar.n;
        this.d = dznVar.o;
        this.e = dznVar.p;
        this.f = dznVar.q;
    }
}
