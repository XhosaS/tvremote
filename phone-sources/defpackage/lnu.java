package defpackage;

import android.os.SystemClock;
import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lnu {
    public int a;
    public boolean b;
    public int c;
    private final lny e;
    private boolean g;
    private boolean h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private boolean n;
    private boolean o;
    private final SparseArray d = new SparseArray();
    private final long f = SystemClock.elapsedRealtime();

    public lnu(lfn lfnVar, lny lnyVar) {
        this.h = !lfnVar.dv();
        this.e = lnyVar;
    }

    public static wja i(vtw vtwVar, int i, boolean z, int i2, int i3) {
        int i4;
        int i5 = 1;
        if (i != 5) {
            krd.f(a.cf(i, "Unknown player type: "));
            i4 = 1;
        } else {
            i4 = 12;
        }
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wja wjaVar = (wja) vtwVar.b;
        wja wjaVar2 = wja.a;
        wjaVar.d = i4 - 1;
        wjaVar.b |= 2;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vuc vucVar = vtwVar.b;
        wja wjaVar3 = (wja) vucVar;
        wjaVar3.b |= 524288;
        wjaVar3.t = z;
        if (!vucVar.A()) {
            vtwVar.u();
        }
        wja wjaVar4 = (wja) vtwVar.b;
        wjaVar4.b |= 262144;
        wjaVar4.s = i2;
        if (i3 == 1) {
            i5 = 2;
        } else if (i3 == 5) {
            i5 = 6;
        } else if (i3 == 6) {
            i5 = 7;
        } else if (i3 != 7) {
            krd.f(a.cf(i3, "Unknown playback drm type: "));
        } else {
            i5 = 8;
        }
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wja wjaVar5 = (wja) vtwVar.b;
        wjaVar5.v = i5 - 1;
        wjaVar5.b |= 8388608;
        return (wja) vtwVar.r();
    }

    private final int j() {
        return (int) (SystemClock.elapsedRealtime() - this.f);
    }

    private static boolean k(int i) {
        return i == 8 || i == 9 || i == 10 || i == 12 || i == 13 || i == 14;
    }

    public final synchronized void a(lie lieVar) {
        if (!this.h && this.g) {
            SparseArray sparseArray = this.d;
            int size = sparseArray.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                lih lihVar = (lih) sparseArray.valueAt(i2);
                if (lihVar.b >= lihVar.a && lihVar.c) {
                }
            }
            lieVar.aw(this.i, this.j, this.k, this.l, this.m, this.n, this.o, sparseArray, new lnt(this, i));
            this.h = true;
            return;
        }
        this.h = true;
    }

    public final synchronized void b(int i, long j, long j2) {
        SparseArray sparseArray = this.d;
        if (sparseArray.get(i) != null) {
            if (k(i)) {
                return;
            }
            krd.g(a.cf(i, "Already recorded task info for "), new Exception());
            this.h = true;
            return;
        }
        lih lihVar = new lih();
        long j3 = this.f;
        lihVar.a = (int) (j - j3);
        lihVar.b = (int) (j2 - j3);
        lihVar.c = true;
        sparseArray.put(i, lihVar);
    }

    public final synchronized void c(int i) {
        d(i, true);
    }

    public final synchronized void d(int i, boolean z) {
        if (!this.h) {
            lih lihVar = (lih) this.d.get(i);
            if (lihVar == null) {
                krd.g(a.cf(i, "Don't have start time for "), new Exception());
                this.h = true;
            } else {
                if (!lihVar.c) {
                    if (!z) {
                        lihVar.d = true;
                    }
                    lihVar.b = j();
                    lihVar.c = true;
                    return;
                }
                if (!k(i)) {
                    krd.g(a.cf(i, "Already recorded task info for "), new Exception());
                    this.h = true;
                }
            }
        }
    }

    public final synchronized void e(int i) {
        if (!this.h) {
            SparseArray sparseArray = this.d;
            if (sparseArray.get(i) == null) {
                lih lihVar = new lih();
                lihVar.a = j();
                sparseArray.put(i, lihVar);
            } else if (!k(i)) {
                krd.g(a.cf(i, "Already recorded task info for "), new Exception());
                this.h = true;
            }
        }
    }

    public final synchronized void f() {
        this.h = true;
    }

    public final synchronized boolean g() {
        lih lihVar = (lih) this.d.get(10);
        if (lihVar != null) {
            if (lihVar.b > 0) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void h(String str, String str2, String str3, String str4, boolean z, boolean z2, int i, boolean z3) {
        this.g = true;
        this.i = str;
        this.a = 5;
        this.j = str2;
        this.k = str3;
        this.l = str4;
        this.m = this.e.a();
        this.n = z;
        this.b = z2;
        this.c = i;
        this.o = z3;
    }
}
