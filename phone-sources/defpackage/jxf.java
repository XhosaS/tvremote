package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxf {
    public static final jxf a = new jxf();
    public static final yy b = wv.t(4.0f, 0.0f, 4.0f, 0.0f, 10);
    public static final yy c = wv.t(44.0f, 0.0f, 0.0f, 0.0f, 14);
    private static final float j = 0.6f;
    public static final float d = 376.0f;
    public static final float e = 370.0f;
    public static final float f = 619.0f;
    public static final float g = 430.0f;
    public static final float h = 480.0f;
    public static final float i = 616.0f;

    private jxf() {
    }

    public final void a(String str, bkp bkpVar, bao baoVar, int i2) {
        int i3;
        bkpVar.getClass();
        int i4 = i2 & 6;
        bao baoVarD = baoVar.d(1629670631);
        if (i4 == 0) {
            i3 = (true != baoVarD.F(str) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != baoVarD.F(this) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            long j2 = wv.K(baoVarD).q;
            jxl.m(str, bny.k(bnq.d(j2), bnq.c(j2), bnq.b(j2), j, bnq.f(j2)), wv.N(baoVarD).l, bkpVar, baoVarD, (i3 & 14) | ((i3 << 6) & 7168));
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sv(this, str, bkpVar, i2, 17, (char[]) null);
        }
    }

    public final void b(final int i2, bkp bkpVar, bao baoVar, final int i3, final int i4) {
        int i5;
        int i6 = i4 & 1;
        bao baoVarD = baoVar.d(688109641);
        if (i6 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (true != baoVarD.D(i2) ? 2 : 4) | i3;
        } else {
            i5 = i3;
        }
        int i7 = i4 & 2;
        if (i7 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i5 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            if (i7 != 0) {
                bkpVar = bkp.g;
            }
            asg.a(ccf.y(i2, baoVarD, i5 & 14), null, ccf.d(bkpVar, String.valueOf(i2)), wv.K(baoVarD).s, baoVarD, 48, 0);
        }
        final bkp bkpVar2 = bkpVar;
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: jxe
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    jxf jxfVar = this.a;
                    int i8 = i2;
                    jxfVar.b(i8, bkpVar2, (bao) obj, bdi.n(i3 | 1), i4);
                    return ygi.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.String r25, defpackage.bkp r26, defpackage.bao r27, int r28, int r29) {
        /*
            r24 = this;
            r0 = r29 & 1
            r1 = -2086774011(0xffffffff839e5b05, float:-9.307302E-37)
            r2 = r27
            bao r1 = r2.d(r1)
            r2 = 1
            if (r0 == 0) goto L13
            r0 = r28 | 6
            r5 = r25
            goto L27
        L13:
            r0 = r28 & 6
            r5 = r25
            if (r0 != 0) goto L25
            boolean r0 = r1.F(r5)
            if (r2 == r0) goto L21
            r0 = 2
            goto L22
        L21:
            r0 = 4
        L22:
            r0 = r28 | r0
            goto L27
        L25:
            r0 = r28
        L27:
            r3 = r29 & 2
            if (r3 == 0) goto L2e
            r0 = r0 | 48
            goto L41
        L2e:
            r4 = r28 & 48
            if (r4 != 0) goto L41
            r4 = r26
            boolean r6 = r1.F(r4)
            if (r2 == r6) goto L3d
            r2 = 16
            goto L3f
        L3d:
            r2 = 32
        L3f:
            r0 = r0 | r2
            goto L43
        L41:
            r4 = r26
        L43:
            r2 = r0 & 19
            r6 = 18
            if (r2 != r6) goto L57
            boolean r2 = r1.K()
            if (r2 != 0) goto L50
            goto L57
        L50:
            r1.t()
            r20 = r1
            r6 = r4
            goto L8c
        L57:
            if (r3 == 0) goto L5d
            bkm r2 = defpackage.bkp.g
            r3 = r2
            goto L5e
        L5d:
            r3 = r4
        L5e:
            axg r2 = defpackage.wv.N(r1)
            chc r2 = r2.h
            arl r4 = defpackage.wv.K(r1)
            long r6 = r4.s
            r21 = r0 & 126(0x7e, float:1.77E-43)
            r22 = 0
            r23 = 131064(0x1fff8, float:1.8366E-40)
            r4 = r6
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = r1
            r19 = r2
            r2 = r25
            defpackage.axa.b(r2, r3, r4, r6, r8, r9, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r6 = r3
        L8c:
            bcr r0 = r20.M()
            if (r0 == 0) goto La2
            adj r3 = new adj
            r9 = 4
            r4 = r24
            r5 = r25
            r7 = r28
            r8 = r29
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.d = r3
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jxf.c(java.lang.String, bkp, bao, int, int):void");
    }

    public final void d(String str, bkp bkpVar, bao baoVar, int i2) {
        String str2;
        int i3;
        int i4 = i2 & 6;
        bao baoVarD = baoVar.d(-1221973778);
        if (i4 == 0) {
            str2 = str;
            i3 = i2 | (true != baoVarD.F(str2) ? 2 : 4);
        } else {
            str2 = str;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            jxl.m(str2, wv.K(baoVarD).q, wv.N(baoVarD).f, bkpVar, baoVarD, (i3 & 14) | ((i3 << 6) & 7168));
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sv(this, str, bkpVar, i2, 16, (char[]) null);
        }
    }
}
