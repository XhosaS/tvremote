package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class an extends aq {
    int ag;
    int ah;
    private edc at;
    protected final aj af = new aj();
    private int am = 0;
    private int an = 0;
    private am[] ao = new am[4];
    private am[] ap = new am[4];
    private am[] aq = new am[4];
    public int ai = 2;
    private final boolean[] ar = new boolean[3];
    private final am[] as = new am[4];
    public boolean aj = false;
    public boolean ak = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014e  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int G(defpackage.aj r23, defpackage.am[] r24, defpackage.am r25, int r26, boolean[] r27) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an.G(aj, am[], am, int, boolean[]):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:249:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04c6 A[PHI: r4
  0x04c6: PHI (r4v9 am) = (r4v8 am), (r4v20 am) binds: [B:256:0x04b8, B:259:0x04c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04f7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void H(defpackage.aj r37) {
        /*
            Method dump skipped, instructions count: 1350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an.H(aj):void");
    }

    final void A(am amVar, int i) {
        int i2 = 0;
        if (i == 0) {
            while (true) {
                al alVar = amVar.i;
                al alVar2 = alVar.b;
                if (alVar2 == null) {
                    break;
                }
                am amVar2 = alVar2.a;
                al alVar3 = amVar2.k.b;
                if (alVar3 == null || alVar3 != alVar || amVar2 == amVar) {
                    break;
                } else {
                    amVar = amVar2;
                }
            }
            while (true) {
                int i3 = this.am;
                if (i2 >= i3) {
                    int i4 = i3 + 1;
                    am[] amVarArr = this.aq;
                    int length = amVarArr.length;
                    if (i4 >= length) {
                        this.aq = (am[]) Arrays.copyOf(amVarArr, length + length);
                    }
                    am[] amVarArr2 = this.aq;
                    int i5 = this.am;
                    amVarArr2[i5] = amVar;
                    this.am = i5 + 1;
                    return;
                }
                if (this.aq[i2] == amVar) {
                    return;
                } else {
                    i2++;
                }
            }
        } else {
            while (true) {
                al alVar4 = amVar.j;
                al alVar5 = alVar4.b;
                if (alVar5 == null) {
                    break;
                }
                am amVar3 = alVar5.a;
                al alVar6 = amVar3.l.b;
                if (alVar6 == null || alVar6 != alVar4 || amVar3 == amVar) {
                    break;
                } else {
                    amVar = amVar3;
                }
            }
            while (true) {
                int i6 = this.an;
                if (i2 >= i6) {
                    int i7 = i6 + 1;
                    am[] amVarArr3 = this.ap;
                    int length2 = amVarArr3.length;
                    if (i7 >= length2) {
                        this.ap = (am[]) Arrays.copyOf(amVarArr3, length2 + length2);
                    }
                    am[] amVarArr4 = this.ap;
                    int i8 = this.an;
                    amVarArr4[i8] = amVar;
                    this.an = i8 + 1;
                    return;
                }
                if (this.ap[i2] == amVar) {
                    return;
                } else {
                    i2++;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f A[PHI: r0 r7
  0x003f: PHI (r0v7 int) = (r0v2 int), (r0v2 int), (r0v3 int), (r0v3 int), (r0v8 int) binds: [B:95:0x0100, B:97:0x0106, B:114:0x0133, B:119:0x013e, B:26:0x003e] A[DONT_GENERATE, DONT_INLINE]
  0x003f: PHI (r7v13 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v16 int) binds: [B:95:0x0100, B:97:0x0106, B:114:0x0133, B:119:0x013e, B:26:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(defpackage.am r12, boolean[] r13) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an.B(am, boolean[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(defpackage.am r12, boolean[] r13) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an.C(am, boolean[]):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05b7 A[LOOP:16: B:274:0x05b5->B:275:0x05b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x039f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:337:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x025c  */
    /* JADX WARN: Type inference failed for: r0v12, types: [am] */
    /* JADX WARN: Type inference failed for: r0v126 */
    /* JADX WARN: Type inference failed for: r0v127 */
    /* JADX WARN: Type inference failed for: r0v36, types: [int] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r2v4, types: [am] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25, types: [int] */
    /* JADX WARN: Type inference failed for: r4v29, types: [int] */
    @Override // defpackage.aq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D() {
        /*
            Method dump skipped, instructions count: 1477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an.D():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0a1e  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0b1f  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0b22  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0b25  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0b31  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0b3d  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0b41  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0b6c  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0b78  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0b85  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0bbe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0b79 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [an] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r2v26, types: [am] */
    /* JADX WARN: Type inference failed for: r2v4, types: [am[]] */
    /* JADX WARN: Type inference failed for: r3v1, types: [am] */
    /* JADX WARN: Type inference failed for: r6v44, types: [am] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean E(defpackage.aj r39) {
        /*
            Method dump skipped, instructions count: 3017
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an.E(aj):boolean");
    }

    @Override // defpackage.aq, defpackage.am
    public final void i() {
        this.af.l();
        super.i();
    }
}
