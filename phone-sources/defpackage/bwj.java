package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bwj implements bvw {
    public int a;
    public int b;
    public long c = 0;
    public long d = bwk.b;
    public long e = 0;

    private final void cE() {
        long j = this.c >> 32;
        long j2 = this.d;
        this.a = ykn.l((int) j, clv.d(j2), clv.b(j2));
        long j3 = this.c & 4294967295L;
        long j4 = this.d;
        this.b = ykn.l((int) j3, clv.c(j4), clv.a(j4));
        int i = this.a;
        long j5 = this.c;
        this.e = (((i - ((int) (j5 >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j5 & 4294967295L))) / 2));
    }

    public int cC() {
        return (int) (this.c & 4294967295L);
    }

    public abstract void cm(long j, float f, yjv yjvVar);

    public /* synthetic */ Object g() {
        return null;
    }

    public int w() {
        return (int) (this.c >> 32);
    }

    public void x(long j, float f, bpu bpuVar) {
        cm(j, f, null);
    }

    protected final void y(long j) {
        if (a.s(this.c, j)) {
            return;
        }
        this.c = j;
        cE();
    }

    protected final void z(long j) {
        if (a.s(this.d, j)) {
            return;
        }
        this.d = j;
        cE();
    }
}
