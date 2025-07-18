package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbx {
    private final fbw b;
    private final fcb c;
    private final long d;
    private boolean e;
    private long h;
    private boolean k;
    private boolean m;
    private boolean n;
    private int f = 0;
    private long g = -9223372036854775807L;
    private long i = -9223372036854775807L;
    private long j = -9223372036854775807L;
    private float l = 1.0f;
    public ecn a = ecn.a;

    public fbx(Context context, fbw fbwVar, long j) {
        this.b = fbwVar;
        this.d = j;
        this.c = new fcb(context);
    }

    private final void n(int i) {
        this.f = Math.min(this.f, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x013a, code lost:
    
        if (r4 > 100000) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0145, code lost:
    
        if (r28 >= r32) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014a, code lost:
    
        if (r25.e != false) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(long r26, long r28, long r30, long r32, boolean r34, boolean r35, defpackage.fbv r36) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbx.a(long, long, long, long, boolean, boolean, fbv):int");
    }

    public final void b() {
        if (this.f == 0) {
            this.f = 1;
        }
    }

    public final void c(boolean z) {
        this.k = z;
        long j = this.d;
        this.j = j > 0 ? SystemClock.elapsedRealtime() + j : -9223372036854775807L;
    }

    public final void d() {
        this.e = true;
        this.h = edt.y(SystemClock.elapsedRealtime());
        fcb fcbVar = this.c;
        fcbVar.d = true;
        fcbVar.b();
        fbz fbzVar = fcbVar.b;
        if (fbzVar != null) {
            fca fcaVar = fcbVar.c;
            fcaVar.getClass();
            fcaVar.c.sendEmptyMessage(2);
            fbzVar.a.registerDisplayListener(fbzVar, edt.J());
            fbzVar.b.c(fbzVar.a());
        }
        fcbVar.e(false);
    }

    public final void e() {
        this.e = false;
        this.j = -9223372036854775807L;
        fcb fcbVar = this.c;
        fcbVar.d = false;
        fbz fbzVar = fcbVar.b;
        if (fbzVar != null) {
            fbzVar.a.unregisterDisplayListener(fbzVar);
            fca fcaVar = fcbVar.c;
            fcaVar.getClass();
            fcaVar.c.sendEmptyMessage(3);
        }
        fcbVar.a();
    }

    public final void f(int i) {
        if (i == 0) {
            this.f = 1;
        } else if (i != 1) {
            n(2);
        } else {
            this.f = 0;
        }
    }

    public final void g() {
        this.c.b();
        this.i = -9223372036854775807L;
        this.g = -9223372036854775807L;
        n(1);
        this.j = -9223372036854775807L;
    }

    public final void h(int i) {
        fcb fcbVar = this.c;
        if (fcbVar.h == i) {
            return;
        }
        fcbVar.h = i;
        fcbVar.e(true);
    }

    public final void i(float f) {
        fcb fcbVar = this.c;
        fcbVar.f = f;
        fbf fbfVar = fcbVar.a;
        fbfVar.a.d();
        fbfVar.b.d();
        fbfVar.c = false;
        fbfVar.d = -9223372036854775807L;
        fbfVar.e = 0;
        fcbVar.d();
    }

    public final void j(Surface surface) {
        this.m = surface != null;
        this.n = false;
        fcb fcbVar = this.c;
        if (fcbVar.e != surface) {
            fcbVar.a();
            fcbVar.e = surface;
            fcbVar.e(true);
        }
        n(1);
    }

    public final void k(float f) {
        a.H(f > 0.0f);
        if (f == this.l) {
            return;
        }
        this.l = f;
        fcb fcbVar = this.c;
        fcbVar.g = f;
        fcbVar.b();
        fcbVar.e(false);
    }

    public final boolean l(boolean z) {
        if (z && (this.f == 3 || (!this.m && this.n))) {
            this.j = -9223372036854775807L;
            return true;
        }
        if (this.j != -9223372036854775807L) {
            if (SystemClock.elapsedRealtime() < this.j) {
                return true;
            }
            this.j = -9223372036854775807L;
        }
        return false;
    }

    public final boolean m() {
        int i = this.f;
        this.f = 3;
        this.h = edt.y(SystemClock.elapsedRealtime());
        return i != 3;
    }
}
