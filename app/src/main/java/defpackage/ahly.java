package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahly {
    public static final ahmg a = new ahmg("REMOVE_FROZEN");
    public final agzx b;
    private final int c;
    private final boolean d;
    private final int e;
    private final agzy f;
    private final agzu g;

    public ahly(int i, boolean z) {
        this.c = i;
        this.d = z;
        int i2 = i - 1;
        this.e = i2;
        agzz agzzVar = agzz.a;
        this.f = new agzy(null, agzzVar);
        this.b = new agzx(0L, agzzVar);
        this.g = new agzu(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r15) {
        /*
            r14 = this;
        L0:
            agzx r0 = r14.b
            long r1 = r0.c
            r3 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r3 = r3 & r1
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r4 = 1
            if (r3 == 0) goto L18
            r7 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r1 = r1 & r7
            int r15 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r15 == 0) goto L17
            r15 = 2
            return r15
        L17:
            return r4
        L18:
            r7 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r7 = r7 & r1
            r9 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r9 = r9 & r1
            int r3 = r14.e
            r11 = 30
            long r9 = r9 >> r11
            int r9 = (int) r9
            int r10 = r9 + 2
            r10 = r10 & r3
            int r7 = (int) r7
            r8 = r7 & r3
            if (r10 != r8) goto L31
            return r4
        L31:
            boolean r8 = r14.d
            r10 = 1073741823(0x3fffffff, float:1.9999999)
            if (r8 != 0) goto L52
            r8 = r9 & r3
            agzu r12 = r14.g
            agzy[] r12 = r12.a
            r8 = r12[r8]
            java.lang.Object r8 = r8.a
            if (r8 == 0) goto L52
            int r0 = r14.c
            r1 = 1024(0x400, float:1.435E-42)
            if (r0 < r1) goto L51
            int r9 = r9 - r7
            r1 = r9 & r10
            int r0 = r0 >> 1
            if (r1 <= r0) goto L0
        L51:
            return r4
        L52:
            int r4 = r9 + 1
            r4 = r4 & r10
            r7 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r7 = r7 & r1
            long r12 = (long) r4
            long r10 = r12 << r11
            long r7 = r7 | r10
            boolean r0 = r0.a(r1, r7)
            if (r0 == 0) goto L0
            r0 = r9 & r3
            agzu r1 = r14.g
            agzy[] r1 = r1.a
            r0 = r1[r0]
            r0.c(r15)
            r0 = r14
        L71:
            agzx r1 = r0.b
            long r1 = r1.c
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto La3
            long r1 = r0.b()
            ahly r0 = r0.d(r1)
            agzu r1 = r0.g
            int r2 = r0.e
            r2 = r2 & r9
            agzy[] r1 = r1.a
            r3 = r1[r2]
            java.lang.Object r3 = r3.a
            boolean r4 = r3 instanceof defpackage.ahlx
            r7 = 0
            if (r4 == 0) goto La0
            ahlx r3 = (defpackage.ahlx) r3
            int r3 = r3.a
            if (r3 != r9) goto La0
            r1 = r1[r2]
            r1.c(r15)
            goto La1
        La0:
            r0 = r7
        La1:
            if (r0 != 0) goto L71
        La3:
            r15 = 0
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahly.a(java.lang.Object):int");
    }

    public final long b() {
        agzx agzxVar;
        long j;
        long j2;
        do {
            agzxVar = this.b;
            j = agzxVar.c;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = 1152921504606846976L | j;
        } while (!agzxVar.a(j, j2));
        return j2;
    }

    public final Object c() {
        while (true) {
            agzx agzxVar = this.b;
            long j = agzxVar.c;
            long j2 = 0;
            if ((j & 1152921504606846976L) != 0) {
                return a;
            }
            int i = this.e;
            int i2 = (int) (j & 1073741823);
            int i3 = i2 & i;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i) == i3) {
                return null;
            }
            agzy[] agzyVarArr = this.g.a;
            Object obj = agzyVarArr[i3].a;
            if (obj == null) {
                if (this.d) {
                    return null;
                }
            } else {
                if (obj instanceof ahlx) {
                    return null;
                }
                long j3 = (i2 + 1) & 1073741823;
                if (agzxVar.a(j, (j & (-1073741824)) | j3)) {
                    agzyVarArr[i3].c(null);
                    return obj;
                }
                if (this.d) {
                    ahly ahlyVarD = this;
                    while (true) {
                        agzx agzxVar2 = ahlyVarD.b;
                        while (true) {
                            long j4 = agzxVar2.c;
                            long j5 = j4 & 1073741823;
                            boolean z = ahbx.a;
                            if ((j4 & 1152921504606846976L) != j2) {
                                ahlyVarD = ahlyVarD.d(ahlyVarD.b());
                                break;
                            }
                            if (agzxVar2.a(j4, (j4 & (-1073741824)) | j3)) {
                                ahlyVarD.g.a[ahlyVarD.e & ((int) j5)].c(null);
                                ahlyVarD = null;
                                break;
                            }
                            j2 = 0;
                        }
                        if (ahlyVarD == null) {
                            return obj;
                        }
                        j2 = 0;
                    }
                }
            }
        }
    }

    public final ahly d(long j) {
        while (true) {
            agzy agzyVar = this.f;
            ahly ahlyVar = (ahly) agzyVar.a;
            if (ahlyVar != null) {
                return ahlyVar;
            }
            int i = this.c;
            ahly ahlyVar2 = new ahly(i + i, this.d);
            long j2 = 1152921503533105152L & j;
            int i2 = (int) (1073741823 & j);
            while (true) {
                int i3 = this.e;
                int i4 = i2 & i3;
                if (i4 != (i3 & ((int) (j2 >> 30)))) {
                    Object ahlxVar = this.g.a[i4].a;
                    if (ahlxVar == null) {
                        ahlxVar = new ahlx(i2);
                    }
                    agzu agzuVar = ahlyVar2.g;
                    agzuVar.a[ahlyVar2.e & i2].c(ahlxVar);
                    i2++;
                }
            }
            ahlyVar2.b.c = (-1152921504606846977L) & j;
            agzyVar.d(null, ahlyVar2);
        }
    }

    public final boolean e() {
        agzx agzxVar;
        long j;
        do {
            agzxVar = this.b;
            j = agzxVar.c;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!agzxVar.a(j, 2305843009213693952L | j));
        return true;
    }

    public final boolean f() {
        long j = this.b.c;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }
}
