package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yxb extends yot implements ypd {
    public final yot a;
    public final yns b;
    public final Object c;
    private final /* synthetic */ ypd d;
    private final int e;
    private final upq f;

    /* JADX WARN: Multi-variable type inference failed */
    public yxb(yot yotVar, int i) {
        ypd ypdVar = yotVar instanceof ypd ? (ypd) yotVar : null;
        this.d = ypdVar == null ? ypb.a : ypdVar;
        this.a = yotVar;
        this.e = i;
        this.b = new yns(0, ynv.a);
        this.f = new upq(null, null, null, null);
        this.c = new Object();
    }

    private final boolean i() {
        synchronized (this.c) {
            yns ynsVar = this.b;
            if (ynsVar.b >= this.e) {
                return false;
            }
            ynsVar.c();
            return true;
        }
    }

    @Override // defpackage.yot
    public final void a(yil yilVar, Runnable runnable) {
        Runnable runnableE;
        this.f.B(runnable);
        if (this.b.b >= this.e || !i() || (runnableE = e()) == null) {
            return;
        }
        try {
            ywv.b(this.a, this, new yxa(this, runnableE));
        } catch (Throwable th) {
            this.b.a();
            throw th;
        }
    }

    @Override // defpackage.ypd
    public final void c(long j, yoe yoeVar) {
        this.d.c(j, yoeVar);
    }

    public final Runnable e() {
        while (true) {
            upq upqVar = this.f;
            Runnable runnable = (Runnable) upqVar.z();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.c) {
                yns ynsVar = this.b;
                ynsVar.a();
                if (upqVar.y() == 0) {
                    return null;
                }
                ynsVar.c();
            }
        }
    }

    @Override // defpackage.yot
    public final void f(yil yilVar, Runnable runnable) {
        Runnable runnableE;
        this.f.B(runnable);
        if (this.b.b >= this.e || !i() || (runnableE = e()) == null) {
            return;
        }
        try {
            this.a.f(this, new yxa(this, runnableE));
        } catch (Throwable th) {
            this.b.a();
            throw th;
        }
    }

    @Override // defpackage.yot
    public final yot g(int i) {
        wae.S(1);
        return this.e <= 1 ? this : super.g(1);
    }

    @Override // defpackage.ypd
    public final ypm h(long j, Runnable runnable, yil yilVar) {
        return this.d.h(j, runnable, yilVar);
    }

    @Override // defpackage.yot
    public final String toString() {
        return this.a + ".limitedParallelism(" + this.e + ")";
    }
}
