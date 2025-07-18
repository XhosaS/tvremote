package defpackage;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fau implements fae {
    private final faf a;
    private final int b;
    private final long c;
    private int d;
    private long e;
    private long f;
    private int i;
    private long j;
    private final /* synthetic */ int k;
    private final dhq l = new dhq((byte[]) null, (byte[]) null, (byte[]) null);
    private long g = Long.MIN_VALUE;
    private long h = Long.MIN_VALUE;

    /* JADX WARN: Type inference failed for: r2v1, types: [faf, java.lang.Object] */
    public fau(fat fatVar, int i, byte[] bArr) {
        this.k = i;
        this.a = fatVar.c;
        this.b = fatVar.a;
        this.c = fatVar.b;
    }

    private final void h(int i, long j, long j2) {
        int i2;
        long j3;
        if (j2 != Long.MIN_VALUE) {
            if (i == 0) {
                if (j != 0) {
                    j3 = j;
                } else if (j2 == this.h) {
                    return;
                } else {
                    j3 = 0;
                }
                i2 = 0;
            } else {
                i2 = i;
                j3 = j;
            }
            this.h = j2;
            this.l.y(i2, j3, j2);
        }
    }

    private final void i(int i, long j, long j2) {
        int i2;
        long j3;
        if (j2 != Long.MIN_VALUE) {
            if (i == 0) {
                if (j != 0) {
                    j3 = j;
                } else if (j2 == this.h) {
                    return;
                } else {
                    j3 = 0;
                }
                i2 = 0;
            } else {
                i2 = i;
                j3 = j;
            }
            this.h = j2;
            this.l.y(i2, j3, j2);
        }
    }

    @Override // defpackage.fae
    public final long a() {
        return this.k != 0 ? this.g : this.g;
    }

    @Override // defpackage.fae
    public final void b(long j) {
        if (this.k != 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            i(this.d > 0 ? (int) (jElapsedRealtime - this.e) : 0, this.f, j);
            this.a.c();
            this.g = Long.MIN_VALUE;
            this.e = jElapsedRealtime;
            this.f = 0L;
            this.i = 0;
            this.j = 0L;
            return;
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        h(this.d > 0 ? (int) (jElapsedRealtime2 - this.e) : 0, this.f, j);
        this.a.c();
        this.g = Long.MIN_VALUE;
        this.e = jElapsedRealtime2;
        this.f = 0L;
        this.i = 0;
        this.j = 0L;
    }

    @Override // defpackage.fae
    public final void c(Handler handler, ele eleVar) {
        if (this.k != 0) {
            this.l.z(handler, eleVar);
        } else {
            this.l.z(handler, eleVar);
        }
    }

    @Override // defpackage.fae
    public final void d(ele eleVar) {
        if (this.k != 0) {
            this.l.A(eleVar);
        } else {
            this.l.A(eleVar);
        }
    }

    @Override // defpackage.fae
    public final void e(int i) {
        int i2 = this.k;
        long j = i;
        this.f += j;
        this.j += j;
    }

    @Override // defpackage.fae
    public final void f() {
        if (this.k == 0) {
            a.ab(this.d > 0);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = (int) (jElapsedRealtime - this.e);
            if (j > 0) {
                faf fafVar = this.a;
                fafVar.b(this.f, 1000 * j);
                int i = this.i + 1;
                this.i = i;
                if (i > this.b && this.j > this.c) {
                    this.g = fafVar.a();
                }
                h((int) j, this.f, this.g);
                this.e = jElapsedRealtime;
                this.f = 0L;
            }
            this.d--;
            return;
        }
        a.ab(this.d > 0);
        int i2 = this.d - 1;
        this.d = i2;
        if (i2 > 0) {
            return;
        }
        long jElapsedRealtime2 = (int) (SystemClock.elapsedRealtime() - this.e);
        if (jElapsedRealtime2 > 0) {
            faf fafVar2 = this.a;
            fafVar2.b(this.f, 1000 * jElapsedRealtime2);
            int i3 = this.i + 1;
            this.i = i3;
            if (i3 > this.b && this.j > this.c) {
                this.g = fafVar2.a();
            }
            i((int) jElapsedRealtime2, this.f, this.g);
            this.f = 0L;
        }
    }

    @Override // defpackage.fae
    public final void g() {
        if (this.k != 0) {
            if (this.d == 0) {
                this.e = SystemClock.elapsedRealtime();
            }
            this.d++;
        } else {
            if (this.d == 0) {
                this.e = SystemClock.elapsedRealtime();
            }
            this.d++;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [faf, java.lang.Object] */
    public fau(fat fatVar, int i) {
        this.k = i;
        this.a = fatVar.c;
        this.b = fatVar.a;
        this.c = fatVar.b;
    }
}
