package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjb {
    public static bja c;
    public static long d;
    public static List f;
    public static List g;
    public static final bim h;
    private static final bhn j;
    public static final yjv a = new aru(19);
    public static final ivx i = new ivx();
    public static final Object b = new Object();
    public static final biy e = new biy();
    private static final cfp k = new cfp(null);

    static {
        c = bja.a;
        d = 2L;
        yhb yhbVar = yhb.a;
        f = yhbVar;
        g = yhbVar;
        long j2 = d;
        d = 1 + j2;
        bim bimVar = new bim(j2, bja.a);
        c = c.d(bimVar.i);
        h = bimVar;
        j = new bhn();
    }

    public static final void A() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    private static final boolean B(bjk bjkVar) {
        long jA = e.a(d);
        bjm bjmVar = null;
        int i2 = 0;
        bjm bjmVarC = null;
        for (bjm bjmVarC2 = bjkVar.c(); bjmVarC2 != null; bjmVarC2 = bjmVarC2.n) {
            long j2 = bjmVarC2.m;
            if (j2 != 0) {
                if (yks.b(j2, jA) >= 0) {
                    i2++;
                } else if (bjmVar == null) {
                    i2++;
                    bjmVar = bjmVarC2;
                } else {
                    int iB = yks.b(j2, bjmVar.m);
                    bjm bjmVar2 = iB < 0 ? bjmVarC2 : bjmVar;
                    if (iB >= 0) {
                        bjmVar = bjmVarC2;
                    }
                    if (bjmVarC == null) {
                        bjmVarC = bjkVar.c();
                        bjm bjmVar3 = bjmVarC;
                        while (true) {
                            if (bjmVarC == null) {
                                bjmVarC = bjmVar3;
                                break;
                            }
                            long j3 = bjmVarC.m;
                            if (yks.b(j3, jA) >= 0) {
                                break;
                            }
                            if (yks.b(bjmVar3.m, j3) < 0) {
                                bjmVar3 = bjmVarC;
                            }
                            bjmVarC = bjmVarC.n;
                        }
                    }
                    bjmVar2.m = 0L;
                    bjmVar2.b(bjmVarC);
                }
            }
        }
        return i2 > 1;
    }

    private static final boolean C(bjm bjmVar, long j2, bja bjaVar) {
        long j3 = bjmVar.m;
        return (j3 == 0 || yks.b(j3, j2) > 0 || bjaVar.e(j3)) ? false : true;
    }

    public static final bit a(bit bitVar, yjv yjvVar, boolean z) {
        boolean z2 = bitVar instanceof bin;
        if (z2 || bitVar == null) {
            return new bjp(z2 ? (bin) bitVar : null, yjvVar, null, false, z);
        }
        return new bjq(bitVar, yjvVar, false, z);
    }

    public static final bit b() {
        bit bitVar = (bit) i.h();
        return bitVar == null ? h : bitVar;
    }

    public static final bit c(yjv yjvVar) {
        return (bit) m(new bap(yjvVar, 10));
    }

    public static final bja d(bja bjaVar, long j2, long j3) {
        while (yks.b(j2, j3) < 0) {
            bjaVar = bjaVar.d(j2);
            j2++;
        }
        return bjaVar;
    }

    public static final bjm e(bjm bjmVar) {
        bjm bjmVarK;
        bit bitVarB = b();
        bjm bjmVarK2 = k(bjmVar, bitVarB.v(), bitVarB.x());
        if (bjmVarK2 != null) {
            return bjmVarK2;
        }
        synchronized (b) {
            bit bitVarB2 = b();
            bjmVarK = k(bjmVar, bitVarB2.v(), bitVarB2.x());
        }
        if (bjmVarK != null) {
            return bjmVarK;
        }
        z();
        throw new yfs();
    }

    public static final bjm f(bjm bjmVar, bit bitVar) {
        bjm bjmVarK;
        bjm bjmVarK2 = k(bjmVar, bitVar.v(), bitVar.x());
        if (bjmVarK2 != null) {
            return bjmVarK2;
        }
        synchronized (b) {
            bjmVarK = k(bjmVar, bitVar.v(), bitVar.x());
        }
        if (bjmVarK != null) {
            return bjmVarK;
        }
        z();
        throw new yfs();
    }

    public static final bjm g(bjm bjmVar, bjk bjkVar) {
        bjm bjmVarC = bjkVar.c();
        long jA = e.a(d) - 1;
        bja bjaVar = bja.a;
        bjm bjmVar2 = null;
        bjm bjmVar3 = null;
        while (true) {
            if (bjmVarC == null) {
                break;
            }
            if (bjmVarC.m == 0) {
                break;
            }
            if (C(bjmVarC, jA, bjaVar)) {
                if (bjmVar3 == null) {
                    bjmVar3 = bjmVarC;
                } else if (yks.b(bjmVarC.m, bjmVar3.m) >= 0) {
                    bjmVar2 = bjmVar3;
                }
            }
            bjmVarC = bjmVarC.n;
        }
        bjmVar2 = bjmVarC;
        if (bjmVar2 != null) {
            bjmVar2.m = Long.MAX_VALUE;
            return bjmVar2;
        }
        bjm bjmVarC2 = bjmVar.c(Long.MAX_VALUE);
        bjmVarC2.n = bjkVar.c();
        bjkVar.g(bjmVarC2);
        return bjmVarC2;
    }

    public static final bjm h(bjm bjmVar, bjk bjkVar, bit bitVar) {
        bjm bjmVarG = g(bjmVar, bjkVar);
        bjmVarG.b(bjmVar);
        bjmVarG.m = bitVar.v();
        return bjmVarG;
    }

    public static final bjm i(bjm bjmVar, bjk bjkVar, bit bitVar, bjm bjmVar2) {
        bjm bjmVarG;
        if (bitVar.r()) {
            bitVar.n(bjkVar);
        }
        long jV = bitVar.v();
        if (bjmVar2.m == jV) {
            return bjmVar2;
        }
        synchronized (b) {
            bjmVarG = g(bjmVar, bjkVar);
        }
        bjmVarG.m = jV;
        if (bjmVar2.m != 1) {
            bitVar.n(bjkVar);
        }
        return bjmVarG;
    }

    public static final bjm j(bjm bjmVar, bjk bjkVar) {
        bjm bjmVarK;
        bit bitVarB = b();
        yjv yjvVarI = bitVarB.i();
        if (yjvVarI != null) {
            yjvVarI.a(bjkVar);
        }
        bjm bjmVarK2 = k(bjmVar, bitVarB.v(), bitVarB.x());
        if (bjmVarK2 != null) {
            return bjmVarK2;
        }
        synchronized (b) {
            bit bitVarB2 = b();
            bjm bjmVarC = bjkVar.c();
            bjmVarC.getClass();
            bjmVarK = k(bjmVarC, bitVarB2.v(), bitVarB2.x());
            if (bjmVarK == null) {
                z();
                throw new yfs();
            }
        }
        return bjmVarK;
    }

    public static final bjm k(bjm bjmVar, long j2, bja bjaVar) {
        bjm bjmVar2 = null;
        while (bjmVar != null) {
            if (C(bjmVar, j2, bjaVar) && (bjmVar2 == null || yks.b(bjmVar2.m, bjmVar.m) < 0)) {
                bjmVar2 = bjmVar;
            }
            bjmVar = bjmVar.n;
        }
        if (bjmVar2 != null) {
            return bjmVar2;
        }
        return null;
    }

    public static final bjm l(bjm bjmVar, bjk bjkVar, bit bitVar) {
        bjm bjmVarK;
        if (bitVar.r()) {
            bitVar.n(bjkVar);
        }
        long jV = bitVar.v();
        bjm bjmVarK2 = k(bjmVar, jV, bitVar.x());
        if (bjmVarK2 == null) {
            z();
            throw new yfs();
        }
        if (bjmVarK2.m == bitVar.v()) {
            return bjmVarK2;
        }
        synchronized (b) {
            bjmVarK = k(bjkVar.c(), jV, bitVar.x());
            if (bjmVarK == null) {
                z();
                throw new yfs();
            }
            if (bjmVarK.m != jV) {
                bjmVarK = h(bjmVarK, bjkVar, bitVar);
            }
        }
        if (bjmVarK2.m != 1) {
            bitVar.n(bjkVar);
        }
        return bjmVarK;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m(defpackage.yjv r17) {
        /*
            bim r0 = defpackage.bjb.h
            java.lang.Object r1 = defpackage.bjb.b
            monitor-enter(r1)
            kk r2 = r0.g     // Catch: java.lang.Throwable -> L92
            if (r2 == 0) goto Lf
            bhn r3 = defpackage.bjb.j     // Catch: java.lang.Throwable -> L92
            r4 = 1
            r3.addAndGet(r4)     // Catch: java.lang.Throwable -> L92
        Lf:
            r3 = r17
            java.lang.Object r3 = n(r0, r3)     // Catch: java.lang.Throwable -> L92
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L41
            r4 = -1
            java.util.List r5 = defpackage.bjb.f     // Catch: java.lang.Throwable -> L3a
            int r6 = r5.size()     // Catch: java.lang.Throwable -> L3a
            r7 = r1
        L21:
            if (r7 >= r6) goto L34
            java.lang.Object r8 = r5.get(r7)     // Catch: java.lang.Throwable -> L3a
            yjz r8 = (defpackage.yjz) r8     // Catch: java.lang.Throwable -> L3a
            bgb r9 = new bgb     // Catch: java.lang.Throwable -> L3a
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L3a
            r8.a(r9, r0)     // Catch: java.lang.Throwable -> L3a
            int r7 = r7 + 1
            goto L21
        L34:
            bhn r0 = defpackage.bjb.j
            r0.addAndGet(r4)
            goto L41
        L3a:
            r0 = move-exception
            bhn r1 = defpackage.bjb.j
            r1.addAndGet(r4)
            throw r0
        L41:
            java.lang.Object r4 = defpackage.bjb.b
            monitor-enter(r4)
            s()     // Catch: java.lang.Throwable -> L8f
            if (r2 == 0) goto L8d
            java.lang.Object[] r0 = r2.b     // Catch: java.lang.Throwable -> L8f
            long[] r2 = r2.a     // Catch: java.lang.Throwable -> L8f
            int r5 = r2.length     // Catch: java.lang.Throwable -> L8f
            int r5 = r5 + (-2)
            if (r5 < 0) goto L8d
            r6 = r1
        L53:
            r7 = r2[r6]     // Catch: java.lang.Throwable -> L8f
            long r9 = ~r7     // Catch: java.lang.Throwable -> L8f
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L88
            int r9 = r6 - r5
            int r9 = ~r9     // Catch: java.lang.Throwable -> L8f
            r10 = r1
        L67:
            int r11 = r9 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L86
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L82
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r0[r11]     // Catch: java.lang.Throwable -> L8f
            bjk r11 = (defpackage.bjk) r11     // Catch: java.lang.Throwable -> L8f
            u(r11)     // Catch: java.lang.Throwable -> L8f
        L82:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L67
        L86:
            if (r11 != r12) goto L8d
        L88:
            if (r6 == r5) goto L8d
            int r6 = r6 + 1
            goto L53
        L8d:
            monitor-exit(r4)
            return r3
        L8f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L92:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjb.m(yjv):java.lang.Object");
    }

    public static final Object n(bim bimVar, yjv yjvVar) {
        long j2 = bimVar.i;
        Object objA = yjvVar.a(c.b(j2));
        long j3 = d;
        d = 1 + j3;
        c = c.b(j2);
        bimVar.i = j3;
        bimVar.h = c;
        bimVar.c = 0;
        bimVar.g = null;
        bimVar.z();
        c = c.d(j3);
        return objA;
    }

    public static final Map o(long j2, bin binVar, bja bjaVar) {
        long[] jArr;
        Map map;
        bja bjaVar2;
        long[] jArr2;
        char c2;
        bja bjaVar3;
        bjm bjmVarK;
        long j3 = j2;
        kk kkVarS = binVar.s();
        Map map2 = null;
        if (kkVarS == null) {
            return null;
        }
        bja bjaVarC = binVar.x().d(binVar.v()).c(binVar.d);
        Object[] objArr = kkVarS.b;
        long[] jArr3 = kkVarS.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return null;
        }
        HashMap map3 = null;
        int i2 = 0;
        while (true) {
            long j4 = jArr3[i2];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    map = map2;
                    int i5 = 8 - ((~i3) >>> 31);
                    if (i4 < i5) {
                        if ((j4 & 255) < 128) {
                            bjk bjkVar = (bjk) objArr[(i2 << 3) + i4];
                            bjm bjmVarC = bjkVar.c();
                            jArr2 = jArr3;
                            c2 = '\b';
                            bjm bjmVarK2 = k(bjmVarC, j3, bjaVar);
                            if (bjmVarK2 != null && (bjmVarK = k(bjmVarC, j3, bjaVarC)) != null && !yks.e(bjmVarK2, bjmVarK)) {
                                bjaVar3 = bjaVarC;
                                bjm bjmVarK3 = k(bjmVarC, binVar.v(), binVar.x());
                                if (bjmVarK3 == null) {
                                    z();
                                    throw new yfs();
                                }
                                bjm bjmVarD = bjkVar.d(bjmVarK, bjmVarK2, bjmVarK3);
                                if (bjmVarD == null) {
                                    return map;
                                }
                                if (map3 == null) {
                                    map3 = new HashMap();
                                }
                                map3.put(bjmVarK2, bjmVarD);
                            }
                            j4 >>= c2;
                            i4++;
                            j3 = j2;
                            map2 = map;
                            jArr3 = jArr2;
                            bjaVarC = bjaVar3;
                        } else {
                            jArr2 = jArr3;
                            c2 = '\b';
                        }
                        bjaVar3 = bjaVarC;
                        j4 >>= c2;
                        i4++;
                        j3 = j2;
                        map2 = map;
                        jArr3 = jArr2;
                        bjaVarC = bjaVar3;
                    } else {
                        jArr = jArr3;
                        bjaVar2 = bjaVarC;
                        if (i5 != 8) {
                            return map3;
                        }
                    }
                }
            } else {
                jArr = jArr3;
                map = map2;
                bjaVar2 = bjaVarC;
            }
            if (i2 == length) {
                return map3;
            }
            i2++;
            j3 = j2;
            map2 = map;
            jArr3 = jArr;
            bjaVarC = bjaVar2;
        }
    }

    public static final yjv p(yjv yjvVar, yjv yjvVar2, boolean z) {
        byte[] bArr = null;
        if (true != z) {
            yjvVar2 = null;
        }
        return (yjvVar == null || yjvVar2 == null || yjvVar == yjvVar2) ? yjvVar == null ? yjvVar2 : yjvVar : new bct(yjvVar, yjvVar2, 2, bArr);
    }

    public static final yjv q(yjv yjvVar, yjv yjvVar2) {
        return (yjvVar == null || yjvVar2 == null || yjvVar == yjvVar2) ? yjvVar == null ? yjvVar2 : yjvVar : new bct(yjvVar, yjvVar2, 3, null);
    }

    public static final void r() {
        m(a);
    }

    public static final void s() {
        cfp cfpVar = k;
        int i2 = cfpVar.a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            cam camVar = ((cam[]) cfpVar.c)[i3];
            Object obj = camVar != null ? camVar.get() : null;
            if (obj != null && B((bjk) obj)) {
                if (i4 != i3) {
                    ((cam[]) cfpVar.c)[i4] = camVar;
                    int[] iArr = (int[]) cfpVar.b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((cam[]) cfpVar.c)[i5] = null;
            ((int[]) cfpVar.b)[i5] = 0;
        }
        if (i4 != i2) {
            cfpVar.a = i4;
        }
    }

    public static final void t(bit bitVar, bjk bjkVar) {
        bitVar.q(bitVar.h() + 1);
        yjv yjvVarK = bitVar.k();
        if (yjvVarK != null) {
            yjvVarK.a(bjkVar);
        }
    }

    public static final void u(bjk bjkVar) {
        if (B(bjkVar)) {
            cfp cfpVar = k;
            int i2 = cfpVar.a;
            int iIdentityHashCode = System.identityHashCode(bjkVar);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = cfpVar.a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) cfpVar.b)[i6];
                    if (i7 < iIdentityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > iIdentityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        cam camVar = ((cam[]) cfpVar.c)[i6];
                        if (bjkVar == (camVar != null ? camVar.get() : null)) {
                            i3 = i6;
                            break;
                        }
                        i3 = i6 - 1;
                        while (i3 >= 0 && ((int[]) cfpVar.b)[i3] == iIdentityHashCode) {
                            cam camVar2 = ((cam[]) cfpVar.c)[i3];
                            if ((camVar2 != null ? camVar2.get() : null) == bjkVar) {
                                break;
                            } else {
                                i3--;
                            }
                        }
                        i6++;
                        int i8 = cfpVar.a;
                        while (i6 < i8) {
                            if (((int[]) cfpVar.b)[i6] == iIdentityHashCode) {
                                cam camVar3 = ((cam[]) cfpVar.c)[i6];
                                if ((camVar3 != null ? camVar3.get() : null) == bjkVar) {
                                    i3 = i6;
                                    break;
                                }
                                i6++;
                            } else {
                                i3 = -(i6 + 1);
                                break;
                            }
                        }
                        i5 = cfpVar.a;
                    }
                }
                i3 = -(i5 + 1);
                if (i3 >= 0) {
                    return;
                }
            }
            int i9 = -(i3 + 1);
            int i10 = i9 + 1;
            Object obj = cfpVar.c;
            int length = ((cam[]) obj).length;
            if (i2 == length) {
                int i11 = length + length;
                cam[] camVarArr = new cam[i11];
                int[] iArr = new int[i11];
                System.arraycopy(obj, i9, camVarArr, i10, i2 - i9);
                System.arraycopy(cfpVar.c, 0, camVarArr, 0, i9);
                yfm.bh((int[]) cfpVar.b, iArr, i10, i9, i2);
                yfm.bm((int[]) cfpVar.b, iArr, 0, i9, 6);
                cfpVar.c = camVarArr;
                cfpVar.b = iArr;
            } else {
                System.arraycopy(obj, i9, obj, i10, i2 - i9);
                int[] iArr2 = (int[]) cfpVar.b;
                yfm.bh(iArr2, iArr2, i10, i9, i2);
            }
            ((cam[]) cfpVar.c)[i9] = new cam(bjkVar, null);
            ((int[]) cfpVar.b)[i9] = iIdentityHashCode;
            cfpVar.a++;
        }
    }

    public static final void v(int i2) {
        biy biyVar = e;
        int i3 = biyVar.d[i2];
        biyVar.c(i3, biyVar.a - 1);
        biyVar.a--;
        biyVar.b(i3);
        long[] jArr = biyVar.b;
        int i4 = biyVar.a >> 1;
        while (i3 < i4) {
            int i5 = i3 + 1;
            int i6 = i5 + i5;
            int i7 = i6 - 1;
            if (i6 < biyVar.a) {
                long j2 = jArr[i6];
                if (yks.b(j2, jArr[i7]) < 0) {
                    if (yks.b(j2, jArr[i3]) >= 0) {
                        break;
                    }
                    biyVar.c(i6, i3);
                    i3 = i6;
                }
            }
            if (yks.b(jArr[i7], jArr[i3]) >= 0) {
                break;
            }
            biyVar.c(i7, i3);
            i3 = i7;
        }
        biyVar.d[i2] = biyVar.e;
        biyVar.e = i2;
    }

    public static final void w(bit bitVar) {
        long jA;
        if (c.e(bitVar.v())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(bitVar.v());
        sb.append(", disposed=");
        sb.append(bitVar.j);
        sb.append(", applied=");
        bin binVar = bitVar instanceof bin ? (bin) bitVar : null;
        sb.append(binVar != null ? Boolean.valueOf(binVar.f) : "read-only");
        sb.append(", lowestPin=");
        synchronized (b) {
            jA = e.a(-1L);
        }
        sb.append(jA);
        throw new IllegalStateException(sb.toString());
    }

    public static final void z() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }
}
