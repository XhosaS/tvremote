package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flv implements fln {
    private final boolean a;
    private final boolean b;
    private long g;
    private String i;
    private fel j;
    private flu k;
    private boolean l;
    private boolean n;
    private final iom p;
    private final String c = "video/mp2t";
    private final boolean[] h = new boolean[3];
    private final fmd d = new fmd(7);
    private final fmd e = new fmd(8);
    private final fmd f = new fmd(6);
    private long m = -9223372036854775807L;
    private final edi o = new edi();

    public flv(iom iomVar, boolean z, boolean z2) {
        this.p = iomVar;
        this.a = z;
        this.b = z2;
    }

    private final void f() {
        eci.e(this.j);
        String str = edt.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g(long r19, int r21, int r22, long r23) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.flv.g(long, int, int, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void h(byte[] r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.flv.h(byte[], int, int):void");
    }

    private final void i(long j, int i, long j2) {
        if (!this.l || this.k.c) {
            this.d.c(i);
            this.e.c(i);
        }
        this.f.c(i);
        flu fluVar = this.k;
        boolean z = this.n;
        fluVar.h = i;
        fluVar.k = j2;
        fluVar.i = j;
        fluVar.r = z;
        if (!fluVar.b || i != 1) {
            if (!fluVar.c) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        flt fltVar = fluVar.l;
        fluVar.l = fluVar.m;
        fluVar.m = fltVar;
        fluVar.m.a();
        fluVar.g = 0;
        fluVar.j = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    @Override // defpackage.fln
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.edi r15) {
        /*
            r14 = this;
            r14.f()
            int r2 = r15.b
            int r7 = r15.c
            byte[] r8 = r15.a
            long r3 = r14.g
            int r5 = r15.a()
            long r5 = (long) r5
            long r3 = r3 + r5
            r14.g = r3
            fel r3 = r14.j
            int r4 = r15.a()
            r3.c(r15, r4)
        L1c:
            boolean[] r1 = r14.h
            int r1 = defpackage.eee.c(r8, r2, r7, r1)
            if (r1 == r7) goto L5d
            int r3 = r1 + 3
            r3 = r8[r3]
            r9 = r3 & 31
            r3 = 3
            if (r1 <= 0) goto L37
            int r4 = r1 + (-1)
            r5 = r8[r4]
            if (r5 != 0) goto L37
            r3 = 4
            r11 = r3
            r10 = r4
            goto L39
        L37:
            r10 = r1
            r11 = r3
        L39:
            int r1 = r10 - r2
            if (r1 <= 0) goto L40
            r14.h(r8, r2, r10)
        L40:
            int r3 = r7 - r10
            long r4 = r14.g
            long r12 = (long) r3
            long r4 = r4 - r12
            if (r1 >= 0) goto L4a
            int r1 = -r1
            goto L4b
        L4a:
            r1 = 0
        L4b:
            r12 = r4
            long r5 = r14.m
            r0 = r14
            r4 = r1
            r1 = r12
            r0.g(r1, r3, r4, r5)
            long r4 = r14.m
            r3 = r9
            r0.i(r1, r3, r4)
            int r2 = r10 + r11
            goto L1c
        L5d:
            r14.h(r8, r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.flv.a(edi):void");
    }

    @Override // defpackage.fln
    public final void b(fdr fdrVar, fmr fmrVar) {
        fmrVar.c();
        this.i = fmrVar.b();
        this.j = fdrVar.dq(fmrVar.a(), 2);
        this.k = new flu(this.j, this.a, this.b);
        this.p.y(fdrVar, fmrVar);
    }

    @Override // defpackage.fln
    public final void c(boolean z) {
        f();
        if (z) {
            this.p.z();
            g(this.g, 0, 0, this.m);
            i(this.g, 9, this.m);
            g(this.g, 0, 0, this.m);
        }
    }

    @Override // defpackage.fln
    public final void d(long j, int i) {
        this.m = j;
        int i2 = i & 2;
        this.n = (i2 != 0) | this.n;
    }

    @Override // defpackage.fln
    public final void e() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        eee.g(this.h);
        this.d.b();
        this.e.b();
        this.f.b();
        this.p.w();
        flu fluVar = this.k;
        if (fluVar != null) {
            fluVar.b();
        }
    }
}
