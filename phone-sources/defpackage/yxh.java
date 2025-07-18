package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yxh {
    public static final yxo a = new yxo("REMOVE_FROZEN");
    public final ynt b;
    private final int c;
    private final boolean d;
    private final int e;
    private final ynu f;
    private final upq g;

    public yxh(int i, boolean z) {
        this.c = i;
        this.d = z;
        int i2 = i - 1;
        this.e = i2;
        ynv ynvVar = ynv.a;
        this.f = new ynu(null, ynvVar);
        this.b = new ynt(0L, ynvVar);
        this.g = new upq(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
        L4:
            ynt r2 = r0.b
            long r3 = r2.b
            r5 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r5 = r5 & r3
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r6 = 1
            if (r5 == 0) goto L1c
            r1 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L1b
            r1 = 2
            return r1
        L1b:
            return r6
        L1c:
            r9 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r9 = r9 & r3
            r11 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r13 = r3 & r11
            int r5 = r0.e
            r15 = 30
            long r13 = r13 >> r15
            int r13 = (int) r13
            int r14 = r13 + 2
            r14 = r14 & r5
            int r9 = (int) r9
            r10 = r9 & r5
            if (r14 != r10) goto L36
            return r6
        L36:
            boolean r10 = r0.d
            r14 = 1073741823(0x3fffffff, float:1.9999999)
            if (r10 != 0) goto L59
            r10 = r13 & r5
            r16 = r6
            upq r6 = r0.g
            ynu r6 = r6.C(r10)
            java.lang.Object r6 = r6.a
            if (r6 == 0) goto L59
            int r2 = r0.c
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L58
            int r13 = r13 - r9
            r3 = r13 & r14
            int r2 = r2 >> 1
            if (r3 <= r2) goto L4
        L58:
            return r16
        L59:
            int r6 = r13 + 1
            r6 = r6 & r14
            long r9 = defpackage.wae.Q(r3, r11)
            long r11 = (long) r6
            long r11 = r11 << r15
            long r9 = r9 | r11
            boolean r2 = r2.c(r3, r9)
            if (r2 == 0) goto L4
            r2 = r13 & r5
            upq r3 = r0.g
            ynu r2 = r3.C(r2)
            r2.c(r1)
            r2 = r0
        L75:
            ynt r3 = r2.b
            long r3 = r3.b
            r5 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r3 = r3 & r5
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 == 0) goto La5
            yxh r2 = r2.c()
            upq r3 = r2.g
            int r4 = r2.e
            r4 = r4 & r13
            ynu r5 = r3.C(r4)
            java.lang.Object r5 = r5.a
            boolean r6 = r5 instanceof defpackage.yxg
            r9 = 0
            if (r6 == 0) goto La2
            yxg r5 = (defpackage.yxg) r5
            int r5 = r5.a
            if (r5 != r13) goto La2
            ynu r3 = r3.C(r4)
            r3.c(r1)
            goto La3
        La2:
            r2 = r9
        La3:
            if (r2 != 0) goto L75
        La5:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yxh.a(java.lang.Object):int");
    }

    public final Object b() {
        while (true) {
            ynt yntVar = this.b;
            long j = yntVar.b;
            if ((j & 1152921504606846976L) != 0) {
                return a;
            }
            long j2 = 1073741823;
            int i = this.e;
            int i2 = (int) (j & 1073741823);
            int i3 = i2 & i;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i) == i3) {
                return null;
            }
            upq upqVar = this.g;
            Object obj = upqVar.C(i3).a;
            if (obj == null) {
                if (this.d) {
                    return null;
                }
            } else {
                if (obj instanceof yxg) {
                    return null;
                }
                int i4 = (i2 + 1) & 1073741823;
                if (yntVar.c(j, wae.R(j, i4))) {
                    upqVar.C(i3).c(null);
                    return obj;
                }
                if (this.d) {
                    yxh yxhVarC = this;
                    while (true) {
                        ynt yntVar2 = yxhVarC.b;
                        while (true) {
                            long j3 = yntVar2.b;
                            long j4 = j3 & j2;
                            boolean z = yoy.a;
                            if ((j3 & 1152921504606846976L) != 0) {
                                yxhVarC = yxhVarC.c();
                                break;
                            }
                            if (yntVar2.c(j3, wae.R(j3, i4))) {
                                yxhVarC.g.C(yxhVarC.e & ((int) j4)).c(null);
                                yxhVarC = null;
                                break;
                            }
                            j2 = 1073741823;
                        }
                        if (yxhVarC == null) {
                            return obj;
                        }
                        j2 = 1073741823;
                    }
                }
            }
        }
    }

    public final yxh c() {
        long j;
        while (true) {
            ynt yntVar = this.b;
            j = yntVar.b;
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = j | 1152921504606846976L;
            if (yntVar.c(j, j2)) {
                j = j2;
                break;
            }
        }
        ynu ynuVar = this.f;
        while (true) {
            yxh yxhVar = (yxh) ynuVar.a;
            if (yxhVar != null) {
                return yxhVar;
            }
            int i = this.c;
            yxh yxhVar2 = new yxh(i + i, this.d);
            long j3 = 1152921503533105152L & j;
            int i2 = (int) (1073741823 & j);
            while (true) {
                int i3 = this.e;
                int i4 = i2 & i3;
                if (i4 != (i3 & ((int) (j3 >> 30)))) {
                    Object yxgVar = this.g.C(i4).a;
                    if (yxgVar == null) {
                        yxgVar = new yxg(i2);
                    }
                    yxhVar2.g.C(yxhVar2.e & i2).c(yxgVar);
                    i2++;
                }
            }
            yxhVar2.b.b = wae.Q(j, 1152921504606846976L);
            ynuVar.d(null, yxhVar2);
        }
    }

    public final boolean d() {
        ynt yntVar;
        long j;
        do {
            yntVar = this.b;
            j = yntVar.b;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!yntVar.c(j, 2305843009213693952L | j));
        return true;
    }

    public final boolean e() {
        long j = this.b.b;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }
}
