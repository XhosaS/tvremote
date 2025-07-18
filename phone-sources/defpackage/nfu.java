package defpackage;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nfu extends nez implements Runnable {
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean i;
    private boolean j;
    private boolean k;
    private String l;
    private final Handler a = edt.L();
    private int h = 1;

    private final void A(long j, String str) {
        nfa nfaVar = this.b;
        StringBuilder sbE = nfaVar.e(j);
        sbE.append(str);
        nfaVar.f("vps", sbE.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void B(long r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.l
            java.lang.String r1 = "N"
            if (r0 != 0) goto Ld
            r8.l = r1
            r2 = 0
            r8.A(r2, r1)
        Ld:
            java.lang.String r0 = r8.l
            boolean r2 = r8.e
            java.lang.String r3 = "EN"
            r4 = 1
            if (r2 == 0) goto L21
            boolean r0 = r3.equals(r0)
            if (r4 == r0) goto L1e
            goto L77
        L1e:
            r1 = r3
            goto L77
        L21:
            boolean r2 = r8.c
            if (r2 == 0) goto L2c
            boolean r2 = r8.d
            if (r2 == 0) goto L2c
            java.lang.String r1 = "S"
            goto L77
        L2c:
            boolean r2 = r8.j
            if (r2 == 0) goto L33
            java.lang.String r1 = "ER"
            goto L77
        L33:
            boolean r2 = r8.d
            java.lang.String r5 = "PB"
            if (r2 != 0) goto L40
            boolean r0 = r8.k
            if (r4 == r0) goto L3e
            goto L77
        L3e:
            r1 = r5
            goto L77
        L40:
            boolean r2 = r8.f
            java.lang.String r6 = "SU"
            if (r2 == 0) goto L48
        L46:
            r1 = r6
            goto L77
        L48:
            int r2 = r8.h
            r7 = 4
            if (r2 != r7) goto L4e
            goto L1e
        L4e:
            r3 = 2
            if (r2 != r3) goto L5c
            boolean r0 = r8.g
            if (r0 == 0) goto L3e
            boolean r0 = r8.i
            if (r4 == r0) goto L46
            java.lang.String r1 = "B"
            goto L77
        L5c:
            r3 = 3
            if (r2 != r3) goto L6d
            boolean r0 = r8.g
            if (r0 == 0) goto L6a
            boolean r0 = r8.i
            if (r4 == r0) goto L46
            java.lang.String r1 = "PL"
            goto L77
        L6a:
            java.lang.String r1 = "PA"
            goto L77
        L6d:
            if (r2 != r4) goto L76
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L76
            goto L46
        L76:
            r1 = r0
        L77:
            java.lang.String r0 = r8.l
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L80
            return
        L80:
            r8.l = r1
            r8.A(r9, r1)
            android.os.Handler r9 = r8.a
            r9.removeCallbacks(r8)
            r0 = 600000(0x927c0, double:2.964394E-318)
            r9.postDelayed(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfu.B(long):void");
    }

    @Override // defpackage.nez
    public final void a(ekl eklVar) {
        this.d = true;
    }

    @Override // defpackage.nez
    public final void b() {
        this.b.g("vps");
    }

    @Override // defpackage.nez
    public final void c(ekl eklVar, String str) {
        this.f = true;
        this.c = false;
        B(eklVar.a);
    }

    @Override // defpackage.nez
    public final void h(long j, boolean z) {
        this.f = false;
        if (z) {
            this.h = 4;
            B(j);
        }
        this.e = true;
        B(j);
        this.a.removeCallbacks(this);
    }

    @Override // defpackage.nez
    protected final void i() {
        this.a.postDelayed(this, 600000L);
    }

    @Override // defpackage.nez
    public final void k(ekl eklVar, int i, boolean z) {
        this.i = i != 0;
        B(eklVar.a);
    }

    @Override // defpackage.nez
    public final void l(ekl eklVar, eah eahVar, boolean z) {
        if (z) {
            this.j = true;
            this.f = false;
            this.c = false;
            B(eklVar.a);
        }
    }

    @Override // defpackage.nez
    public final void m(ekl eklVar, boolean z, int i, boolean z2) {
        this.g = z;
        this.h = i;
        if (i != 1) {
            this.j = false;
        }
        if (i != 2) {
            this.c = false;
        }
        if (i == 1 || i == 4) {
            this.f = false;
        }
        B(eklVar.a);
    }

    @Override // defpackage.nez
    public final void n(ekl eklVar, ean eanVar, ean eanVar2, int i, boolean z, boolean z2) {
        if (i == 1 && this.h != 1) {
            this.c = true;
        }
        if (z2) {
            this.f = false;
        }
        B(eklVar.a);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.l != null) {
            A(SystemClock.elapsedRealtime(), this.l);
        }
        this.a.postDelayed(this, 600000L);
    }

    @Override // defpackage.nez
    public final void u(ekl eklVar, boolean z) {
        if (z) {
            this.k = true;
            B(eklVar.a);
        }
    }
}
