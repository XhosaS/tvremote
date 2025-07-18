package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjh {
    public final yjv a;
    public Object b;
    public int c = -1;
    public final bfz d;
    public final bbi e;
    public int f;
    public final HashMap g;
    public jz h;
    public final ki i;
    public final ki j;
    public final kk k;
    public final ki l;

    public bjh(yjv yjvVar) {
        this.a = yjvVar;
        long[] jArr = kj.a;
        this.i = new ki((byte[]) null);
        this.j = new ki((byte[]) null);
        this.k = new kk((byte[]) null);
        this.d = new bfz(new bbh[16], 0);
        this.e = new bjg(this, 0);
        this.l = new ki((byte[]) null);
        this.g = new HashMap();
    }

    public final void a(Object obj, Object obj2) {
        ki kiVar = this.i;
        bgc.c(kiVar, obj2, obj);
        if (!(obj2 instanceof bbh) || ki.e(kiVar, obj2)) {
            return;
        }
        bgc.b(this.l, obj2);
        this.g.remove(obj2);
    }

    public final boolean b() {
        return this.j.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Object r21, int r22, java.lang.Object r23, defpackage.jz r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            int r3 = r0.f
            if (r3 <= 0) goto Lc
            goto L91
        Lc:
            r3 = r24
            int r3 = r3.h(r1, r2)
            boolean r4 = r1 instanceof defpackage.bbh
            r5 = 2
            if (r4 == 0) goto L7d
            if (r3 == r2) goto L7d
            r2 = r1
            bbh r2 = (defpackage.bbh) r2
            bbg r2 = r2.e()
            java.util.HashMap r4 = r0.g
            java.lang.Object r6 = r2.e
            r4.put(r1, r6)
            jz r2 = r2.d
            ki r4 = r0.l
            defpackage.bgc.b(r4, r1)
            java.lang.Object[] r6 = r2.b
            long[] r2 = r2.a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7d
            r9 = 0
        L38:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            r13 = 0
        L4c:
            int r14 = r12 >>> 31
            r15 = 8
            int r14 = 8 - r14
            if (r13 >= r14) goto L76
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r10 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r14 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r14 >= 0) goto L72
            int r14 = r9 << 3
            int r14 = r14 + r13
            r14 = r6[r14]
            bjk r14 = (defpackage.bjk) r14
            boolean r8 = r14 instanceof defpackage.bjl
            if (r8 == 0) goto L6f
            r8 = r14
            bjl r8 = (defpackage.bjl) r8
            r8.i(r5)
        L6f:
            defpackage.bgc.a(r4, r14, r1)
        L72:
            long r10 = r10 >> r15
            int r13 = r13 + 1
            goto L4c
        L76:
            if (r14 != r15) goto L7d
        L78:
            if (r9 == r7) goto L7d
            int r9 = r9 + 1
            goto L38
        L7d:
            r2 = -1
            if (r3 != r2) goto L91
            boolean r2 = r1 instanceof defpackage.bjl
            if (r2 == 0) goto L8a
            r2 = r1
            bjl r2 = (defpackage.bjl) r2
            r2.i(r5)
        L8a:
            ki r2 = r0.i
            r3 = r23
            defpackage.bgc.a(r2, r1, r3)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjh.c(java.lang.Object, int, java.lang.Object, jz):void");
    }
}
