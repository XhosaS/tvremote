package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lin implements lio {
    public final liq a;
    public final lid b;
    public lid c;
    public boolean d = true;
    public final nqq e;
    private final Handler f;
    private long g;
    private boolean h;

    private lin(nqq nqqVar, liq liqVar, Handler handler, lid lidVar) {
        nqqVar.getClass();
        this.e = nqqVar;
        this.a = liqVar;
        this.f = handler;
        this.c = lidVar;
        this.b = lidVar;
    }

    public static lin l(nqq nqqVar, int i) {
        return n(nqqVar, liq.e(i), lid.a);
    }

    public static lin m(nqq nqqVar, int i, lid lidVar) {
        return n(nqqVar, liq.e(i), lidVar);
    }

    public static lin n(nqq nqqVar, liq liqVar, lid lidVar) {
        return new lin(nqqVar, liqVar, new Handler(Looper.getMainLooper()), lidVar);
    }

    @Override // defpackage.lio
    public final int a() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.g;
        return ((((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    @Override // defpackage.lio
    public final lio b() {
        return null;
    }

    @Override // defpackage.lio
    public final liq c() {
        return this.a;
    }

    @Override // defpackage.lio
    public final void d(liq liqVar) {
        nqq.e(this, liqVar);
        if (this.d) {
            this.e.i(this.f, this.g, this);
        }
    }

    @Override // defpackage.lio
    public final boolean e(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lin linVar = (lin) obj;
        if (this.g == linVar.g && this.a.equals(linVar.a) && this.b.equals(linVar.b)) {
            return this.c.equals(linVar.c);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        return e(obj);
    }

    public final void f() {
        if (this.d) {
            nqq nqqVar = this.e;
            Handler handler = this.f;
            long j = this.g;
            handler.removeCallbacksAndMessages(null);
            nqqVar.g(j, this, true, "Flushing");
        }
    }

    public final synchronized void g() {
        this.h = true;
        this.d = true;
        this.e.i(this.f, this.g, this);
    }

    public final synchronized void h(boolean z) {
        this.h = z;
        this.d = z;
        if (z) {
            this.e.i(this.f, this.g, this);
        }
    }

    public final int hashCode() {
        return a();
    }

    public final synchronized void i() {
        this.h = false;
    }

    public final void j() {
        this.g = this.e.b();
    }

    public final synchronized boolean k() {
        return this.h;
    }

    public final synchronized kuw o() {
        lid lidVar;
        lid lidVarA;
        lidVar = this.c;
        lidVarA = lid.a();
        this.c = lidVarA;
        return new kuw(lidVarA, lidVar, (byte[]) null);
    }
}
