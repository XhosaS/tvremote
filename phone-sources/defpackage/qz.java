package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qz extends qg implements bxu {
    public yjk j;
    public boolean k;
    private final jj l;
    private final jj m;

    public qz(yjk yjkVar, yjk yjkVar2, kw kwVar, boolean z) {
        super(kwVar, null, z, true, null, null, yjkVar);
        this.j = yjkVar2;
        this.k = true;
        int i = jk.a;
        this.l = new jj((byte[]) null);
        this.m = new jj((byte[]) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void D() {
        /*
            r23 = this;
            r0 = r23
            jj r1 = r0.l
            java.lang.Object[] r2 = r1.c
            long[] r3 = r1.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            r9 = 7
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r12 = 0
            r13 = 8
            if (r4 < 0) goto L4b
            r14 = r12
            r15 = 128(0x80, double:6.3E-322)
        L19:
            r5 = r3[r14]
            r17 = 255(0xff, double:1.26E-321)
            long r7 = ~r5
            long r7 = r7 << r9
            long r7 = r7 & r5
            long r7 = r7 & r10
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 == 0) goto L46
            int r7 = r14 - r4
            int r7 = ~r7
            int r7 = r7 >>> 31
            int r7 = 8 - r7
            r8 = r12
        L2d:
            if (r8 >= r7) goto L44
            long r19 = r5 & r17
            int r19 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r19 >= 0) goto L40
            int r19 = r14 << 3
            int r19 = r19 + r8
            r19 = r2[r19]
            yqe r19 = (defpackage.yqe) r19
            defpackage.ylh.ah(r19)
        L40:
            long r5 = r5 >> r13
            int r8 = r8 + 1
            goto L2d
        L44:
            if (r7 != r13) goto L4f
        L46:
            if (r14 == r4) goto L4f
            int r14 = r14 + 1
            goto L19
        L4b:
            r15 = 128(0x80, double:6.3E-322)
            r17 = 255(0xff, double:1.26E-321)
        L4f:
            r1.d()
            jj r1 = r0.m
            java.lang.Object[] r2 = r1.c
            long[] r3 = r1.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L93
            r5 = r12
        L5e:
            r6 = r3[r5]
            r8 = r9
            r19 = r10
            long r9 = ~r6
            long r9 = r9 << r8
            long r9 = r9 & r6
            long r9 = r9 & r19
            int r9 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r9 == 0) goto L8b
            int r9 = r5 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r10 = r12
        L74:
            if (r10 >= r9) goto L89
            long r21 = r6 & r17
            int r11 = (r21 > r15 ? 1 : (r21 == r15 ? 0 : -1))
            if (r11 < 0) goto L80
            long r6 = r6 >> r13
            int r10 = r10 + 1
            goto L74
        L80:
            int r1 = r5 << 3
            int r1 = r1 + r10
            r1 = r2[r1]
            hu r1 = (defpackage.hu) r1
            r1 = 0
            throw r1
        L89:
            if (r9 != r13) goto L93
        L8b:
            if (r5 == r4) goto L93
            int r5 = r5 + 1
            r9 = r8
            r10 = r19
            goto L5e
        L93:
            r1.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz.D():void");
    }

    @Override // defpackage.qg
    protected final void A(KeyEvent keyEvent) {
        jj jjVar = this.l;
        long jB = brx.b(keyEvent);
        if (jjVar.a(jB) != null) {
            yqe yqeVar = (yqe) jjVar.a(jB);
            boolean z = false;
            if (yqeVar != null) {
                if (yqeVar.u()) {
                    yqeVar.t(null);
                } else {
                    z = true;
                }
            }
            jjVar.c(jB);
            if (z) {
                return;
            }
        }
        ((qg) this).b.a();
    }

    @Override // defpackage.qg
    public final Object b(bte bteVar, yih yihVar) {
        Object objJ = wf.j(bteVar, (!((qg) this).a || this.j == null) ? null : new kb(this, 11), new qx(this, (yih) null, 0), new kb(this, 12), yihVar);
        return objJ == yio.a ? objJ : ygi.a;
    }

    @Override // defpackage.bko
    public final void bS() {
        D();
    }

    @Override // defpackage.qg
    public final void h() {
        D();
    }

    @Override // defpackage.qg
    protected final boolean r(KeyEvent keyEvent) {
        long jB = brx.b(keyEvent);
        boolean z = false;
        if (this.j != null) {
            jj jjVar = this.l;
            if (jjVar.a(jB) == null) {
                jjVar.e(jB, ykr.q(F(), null, 0, new qy(this, (yih) null, 0), 3));
                z = true;
            }
        }
        if (((hu) this.m.a(jB)) == null) {
            return z;
        }
        throw null;
    }

    @Override // defpackage.qg
    public final void w(cfc cfcVar) {
        if (this.j != null) {
            cfk.v(cfcVar, new fg(this, 13));
        }
    }
}
