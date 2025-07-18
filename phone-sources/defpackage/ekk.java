package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekk implements ejj {
    public eai a = eai.a;
    private boolean b;
    private long c;
    private long d;

    @Override // defpackage.ejj
    public final long a() {
        long j = this.c;
        if (!this.b) {
            return j;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.d;
        return j + (this.a.d == 1.0f ? edt.y(jElapsedRealtime) : jElapsedRealtime * r4.f);
    }

    @Override // defpackage.ejj
    public final eai b() {
        return this.a;
    }

    public final void c(long j) {
        this.c = j;
        if (this.b) {
            this.d = SystemClock.elapsedRealtime();
        }
    }

    @Override // defpackage.ejj
    public final void d(eai eaiVar) {
        if (this.b) {
            c(a());
        }
        this.a = eaiVar;
    }

    public final void e() {
        if (this.b) {
            return;
        }
        this.d = SystemClock.elapsedRealtime();
        this.b = true;
    }

    public final void f() {
        if (this.b) {
            c(a());
            this.b = false;
        }
    }

    @Override // defpackage.ejj
    public final /* synthetic */ boolean g() {
        return false;
    }
}
