package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbg extends bjm {
    public static final Object a = new Object();
    public long b;
    public int c;
    public jz d;
    public Object e;
    public int f;

    public bbg(long j) {
        super(j);
        this.d = ka.a();
        this.e = a;
    }

    @Override // defpackage.bjm
    public final bjm a() {
        return new bbg(bjb.b().v());
    }

    @Override // defpackage.bjm
    public final void b(bjm bjmVar) {
        bjmVar.getClass();
        bbg bbgVar = (bbg) bjmVar;
        this.d = bbgVar.d;
        this.e = bbgVar.e;
        this.f = bbgVar.f;
    }

    @Override // defpackage.bjm
    public final bjm c(long j) {
        return new bbg(j);
    }

    public final int d(bit bitVar) throws Throwable {
        jz jzVar;
        long[] jArr;
        int i;
        int i2;
        char c;
        long[] jArr2;
        bjm bjmVarB;
        synchronized (bjb.b) {
            jzVar = this.d;
        }
        int i3 = 7;
        if (!jzVar.d()) {
            return 7;
        }
        bfz bfzVarA = bdt.a();
        Object[] objArr = bfzVarA.a;
        int i4 = bfzVarA.b;
        for (int i5 = 0; i5 < i4; i5++) {
            ((bbi) objArr[i5]).b();
        }
        try {
            Object[] objArr2 = jzVar.b;
            int[] iArr = jzVar.c;
            long[] jArr3 = jzVar.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int iIdentityHashCode = 7;
                int i6 = 0;
                while (true) {
                    long j = jArr3[i6];
                    if ((((~j) << i3) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = i6 - length;
                        int i8 = 0;
                        while (true) {
                            i = i3;
                            i2 = 8 - ((~i7) >>> 31);
                            if (i8 >= i2) {
                                break;
                            }
                            if ((j & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                c = '\b';
                                bjk bjkVar = (bjk) objArr2[i9];
                                if (iArr[i9] == 1) {
                                    if (bjkVar instanceof bbh) {
                                        try {
                                            bbh bbhVar = (bbh) bjkVar;
                                            bjmVarB = bbhVar.b((bbg) bjb.f(bbhVar.c, bitVar), bitVar, false, bbhVar.a);
                                        } catch (Throwable th) {
                                            th = th;
                                            Object[] objArr3 = bfzVarA.a;
                                            int i10 = bfzVarA.b;
                                            for (int i11 = 0; i11 < i10; i11++) {
                                                ((bbi) objArr3[i11]).a();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        bjmVarB = bjb.f(bjkVar.c(), bitVar);
                                    }
                                    jArr2 = jArr3;
                                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(bjmVarB)) * 31) + a.k(bjmVarB.m);
                                    j >>= c;
                                    i8++;
                                    jArr3 = jArr2;
                                    i3 = i;
                                }
                            } else {
                                c = '\b';
                            }
                            jArr2 = jArr3;
                            j >>= c;
                            i8++;
                            jArr3 = jArr2;
                            i3 = i;
                        }
                        jArr = jArr3;
                        if (i2 == 8) {
                            break;
                            break;
                        }
                        break;
                    }
                    jArr = jArr3;
                    i = i3;
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    jArr3 = jArr;
                    i3 = i;
                }
                i3 = iIdentityHashCode;
            }
            Object[] objArr4 = bfzVarA.a;
            int i12 = bfzVarA.b;
            for (int i13 = 0; i13 < i12; i13++) {
                ((bbi) objArr4[i13]).a();
            }
            return i3;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(defpackage.bit r6) {
        /*
            r5 = this;
            java.lang.Object r0 = defpackage.bjb.b
            monitor-enter(r0)
            long r1 = r5.b     // Catch: java.lang.Throwable -> L46
            long r3 = r6.v()     // Catch: java.lang.Throwable -> L46
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L1a
            int r1 = r5.c     // Catch: java.lang.Throwable -> L46
            int r4 = r6.h()     // Catch: java.lang.Throwable -> L46
            if (r1 == r4) goto L18
            goto L1a
        L18:
            r1 = r2
            goto L1b
        L1a:
            r1 = r3
        L1b:
            monitor-exit(r0)
            java.lang.Object r0 = r5.e
            java.lang.Object r4 = defpackage.bbg.a
            if (r0 == r4) goto L2d
            if (r1 == 0) goto L2c
            int r0 = r5.f
            int r4 = r5.d(r6)
            if (r0 != r4) goto L2d
        L2c:
            r2 = r3
        L2d:
            if (r2 == 0) goto L45
            if (r1 == 0) goto L45
            java.lang.Object r0 = defpackage.bjb.b
            monitor-enter(r0)
            long r3 = r6.v()     // Catch: java.lang.Throwable -> L42
            r5.b = r3     // Catch: java.lang.Throwable -> L42
            int r6 = r6.h()     // Catch: java.lang.Throwable -> L42
            r5.c = r6     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)
            return r2
        L42:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L45:
            return r2
        L46:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbg.e(bit):boolean");
    }
}
