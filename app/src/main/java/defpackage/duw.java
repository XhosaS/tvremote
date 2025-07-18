package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class duw {
    static dvu a(dvk dvkVar, Drawable drawable, int i) {
        dvu dvuVar;
        boolean z;
        int i2;
        long j;
        dvu dvuVar2;
        drq dthVar = new dth(drawable);
        dvd dvdVar = dvkVar.a.b;
        dvdVar.getClass();
        dvs dvsVarJ = dvkVar.j();
        String strQ = dvsVarJ.q();
        dsz dszVar = dvkVar.m;
        if (dszVar == null) {
            dvuVar = null;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        throw new IllegalArgumentException(a.a(i, "OutputUnitType ", " not supported"));
                    }
                    dvuVar2 = dszVar.c;
                }
                dvuVar = null;
            } else {
                dvuVar2 = dszVar.b;
            }
            dvuVar = dvuVar2;
        }
        if (dvuVar != null) {
            try {
                z = !dthVar.af(null, dvuVar.b.c, null, dthVar);
            } catch (Exception e) {
                dsq.e(dvkVar.b, dthVar, e);
            }
        } else {
            z = false;
        }
        long j2 = dvuVar != null ? dvuVar.a : -1L;
        long jD = dvdVar.d(dthVar, strQ, dvdVar.u, i, j2);
        boolean z2 = ebc.a;
        try {
            dthVar.I(dvkVar.b, dvkVar, null);
        } catch (Exception e2) {
            dsq.e(dvkVar.b, dthVar, e2);
        }
        if (j2 != jD) {
            j = jD;
            i2 = 0;
        } else {
            i2 = z ? 1 : 2;
            j = jD;
        }
        return c(j, dthVar, null, dvkVar, dvsVarJ, 2, i2, dvdVar.v, b(dvkVar, dvdVar), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static boolean b(defpackage.dvk r13, defpackage.dvd r14) {
        /*
            dvs r0 = r13.j()
            boolean r1 = defpackage.dvk.n(r13)
            r2 = 0
            if (r1 != 0) goto Lb7
            boolean r1 = r0.B
            r3 = 1
            if (r1 != 0) goto Lb6
            drq r1 = r0.d()
            dww r4 = r0.f
            if (r4 == 0) goto L1e
            boolean r5 = r4.Q()
            if (r5 != 0) goto L24
        L1e:
            boolean r1 = r1.V()
            if (r1 == 0) goto L26
        L24:
            r1 = r3
            goto L27
        L26:
            r1 = r2
        L27:
            int r5 = r0.D
            boolean r14 = r14.D
            r6 = 2
            if (r14 == 0) goto L3e
            if (r5 == r6) goto L3e
            if (r1 != 0) goto Lb6
            if (r4 == 0) goto L3c
            java.lang.CharSequence r14 = r4.a
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 == 0) goto Lb6
        L3c:
            if (r5 != 0) goto Lb6
        L3e:
            if (r4 != 0) goto L41
            goto L7c
        L41:
            dtu r14 = r4.r
            boolean r1 = r4.G()
            if (r1 == 0) goto L4f
            int r1 = r4.E
            if (r1 == r6) goto L4f
            r1 = r3
            goto L50
        L4f:
            r1 = r2
        L50:
            java.lang.Object r5 = r4.c
            android.util.SparseArray r6 = r4.d
            int r7 = r4.e
            int r8 = r4.f
            android.view.ViewOutlineProvider r9 = r4.g
            boolean r10 = r4.h
            int r11 = r4.B
            int r12 = r4.C
            boolean r4 = r4.I()
            if (r14 != 0) goto Lb6
            if (r1 != 0) goto Lb6
            if (r5 != 0) goto Lb6
            if (r6 != 0) goto Lb6
            r14 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r7 != r14) goto Lb6
            if (r8 != r14) goto Lb6
            if (r9 != 0) goto Lb6
            if (r10 != 0) goto Lb6
            if (r4 != 0) goto Lb6
            if (r11 == r3) goto Lb6
            if (r12 == r3) goto Lb6
        L7c:
            int r14 = r0.C
            r1 = -1
            if (r14 == r1) goto L82
            goto Lb6
        L82:
            java.util.List r14 = r0.b
            java.util.Iterator r14 = r14.iterator()
        L88:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L9f
            java.lang.Object r0 = r14.next()
            dxo r0 = (defpackage.dxo) r0
            if (r0 == 0) goto L88
            drq r0 = r0.a
            boolean r0 = r0.S()
            if (r0 == 0) goto L88
            return r3
        L9f:
            dvs r14 = r13.j()
            java.lang.String r14 = r14.q
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto Lb2
            boolean r14 = defpackage.dvk.n(r13)
            if (r14 != 0) goto Lb2
            return r3
        Lb2:
            r13.j()
            return r2
        Lb6:
            return r3
        Lb7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duw.b(dvk, dvd):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static defpackage.dvu c(long r16, defpackage.drq r18, defpackage.dru r19, defpackage.dvk r20, defpackage.dvs r21, int r22, int r23, boolean r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duw.c(long, drq, dru, dvk, dvs, int, int, boolean, boolean, boolean):dvu");
    }
}
