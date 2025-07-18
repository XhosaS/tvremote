package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bin extends bit {
    private static final int[] l = new int[0];
    public final yjv a;
    public final yjv b;
    public int c;
    public bja d;
    public int[] e;
    public boolean f;
    public kk g;
    private List m;
    private int n;

    public bin(long j, bja bjaVar, yjv yjvVar, yjv yjvVar2) {
        super(j, bjaVar);
        this.a = yjvVar;
        this.b = yjvVar2;
        this.d = bja.a;
        this.e = l;
        this.n = 1;
    }

    private final void F() {
        if (!this.f || this.k >= 0) {
            return;
        }
        bcm.b("Unsupported operation on a disposed or applied snapshot");
    }

    public bin a(yjv yjvVar, yjv yjvVar2) throws Throwable {
        long j;
        bja bjaVarX;
        C();
        F();
        o(v());
        synchronized (bjb.b) {
            try {
                j = bjb.d;
                bjb.d = j + 1;
                bjb.c = bjb.c.d(j);
                bjaVarX = x();
                A(bjaVarX.d(j));
            } catch (Throwable th) {
                th = th;
            }
            try {
                bio bioVar = new bio(j, bjb.d(bjaVarX, v() + 1, j), bjb.p(yjvVar, i(), true), bjb.q(yjvVar2, k()), this);
                if (this.f || this.j) {
                    return bioVar;
                }
                long jV = v();
                synchronized (bjb.b) {
                    long j2 = bjb.d;
                    bjb.d = j2 + 1;
                    B(j2);
                    bjb.c = bjb.c.d(v());
                }
                A(bjb.d(x(), jV + 1, v()));
                return bioVar;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // defpackage.bit
    public bit b(yjv yjvVar) throws Throwable {
        long j;
        C();
        F();
        long jV = v();
        o(v());
        synchronized (bjb.b) {
            try {
                j = bjb.d;
                bjb.d = j + 1;
                bjb.c = bjb.c.d(j);
            } catch (Throwable th) {
                th = th;
            }
            try {
                bip bipVar = new bip(j, bjb.d(x(), jV + 1, j), bjb.p(yjvVar, i(), true), this);
                if (this.f || this.j) {
                    return bipVar;
                }
                long jV2 = v();
                synchronized (bjb.b) {
                    long j2 = bjb.d;
                    bjb.d = j2 + 1;
                    B(j2);
                    bjb.c = bjb.c.d(v());
                }
                A(bjb.d(x(), jV2 + 1, v()));
                return bipVar;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.bix c() {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bin.c():bix");
    }

    @Override // defpackage.bit
    public void d() {
        if (this.j) {
            return;
        }
        super.d();
        g();
    }

    @Override // defpackage.bit
    public void e() {
        if (this.f || this.j) {
            return;
        }
        l();
    }

    @Override // defpackage.bit
    public void f() {
        this.n++;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    @Override // defpackage.bit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g() {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.n
            if (r1 > 0) goto Lb
            java.lang.String r1 = "no pending nested snapshots"
            defpackage.bcm.a(r1)
        Lb:
            int r1 = r0.n
            int r1 = r1 + (-1)
            r0.n = r1
            if (r1 != 0) goto L93
            boolean r1 = r0.f
            if (r1 != 0) goto L93
            kk r1 = r0.s()
            if (r1 == 0) goto L90
            boolean r2 = r0.f
            if (r2 == 0) goto L26
            java.lang.String r2 = "Unsupported operation on a snapshot that has been applied"
            defpackage.bcm.b(r2)
        L26:
            r2 = 0
            r0.u(r2)
            long r2 = r0.v()
            java.lang.Object[] r4 = r1.b
            long[] r1 = r1.a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L90
            r7 = 0
        L38:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L8b
            int r10 = r7 - r5
            int r10 = ~r10
            r11 = 0
        L4c:
            int r12 = r10 >>> 31
            r13 = 8
            int r12 = 8 - r12
            if (r11 >= r12) goto L89
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r8
            r16 = 128(0x80, double:6.3E-322)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 >= 0) goto L85
            int r12 = r7 << 3
            int r12 = r12 + r11
            r12 = r4[r12]
            bjk r12 = (defpackage.bjk) r12
            bjm r12 = r12.c()
        L68:
            if (r12 == 0) goto L85
            long r14 = r12.m
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L7c
            bja r6 = r0.d
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            boolean r6 = defpackage.yfm.as(r6, r14)
            if (r6 == 0) goto L82
        L7c:
            yjv r6 = defpackage.bjb.a
            r14 = 0
            r12.m = r14
        L82:
            bjm r12 = r12.n
            goto L68
        L85:
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L4c
        L89:
            if (r12 != r13) goto L90
        L8b:
            if (r7 == r5) goto L90
            int r7 = r7 + 1
            goto L38
        L90:
            r0.y()
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bin.g():void");
    }

    @Override // defpackage.bit
    public int h() {
        return this.c;
    }

    @Override // defpackage.bit
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public yjv i() {
        return this.a;
    }

    @Override // defpackage.bit
    public yjv k() {
        return this.b;
    }

    public final void l() {
        o(v());
        if (this.f || this.j) {
            return;
        }
        long jV = v();
        synchronized (bjb.b) {
            long j = bjb.d;
            bjb.d = j + 1;
            B(j);
            bjb.c = bjb.c.d(v());
        }
        A(bjb.d(x(), jV + 1, v()));
    }

    @Override // defpackage.bit
    public final void m() {
        bjb.c = bjb.c.b(v()).a(this.d);
    }

    @Override // defpackage.bit
    public void n(bjk bjkVar) {
        kk kkVarS = s();
        if (kkVarS == null) {
            int i = kl.a;
            kkVarS = new kk((byte[]) null);
            u(kkVarS);
        }
        kkVarS.j(bjkVar);
    }

    public final void o(long j) {
        synchronized (bjb.b) {
            this.d = this.d.d(j);
        }
    }

    @Override // defpackage.bit
    public final void p() {
        int length = this.e.length;
        for (int i = 0; i < length; i++) {
            bjb.v(this.e[i]);
        }
        z();
    }

    @Override // defpackage.bit
    public void q(int i) {
        this.c = i;
    }

    @Override // defpackage.bit
    public boolean r() {
        return false;
    }

    public kk s() {
        return this.g;
    }

    public final bix t(long j, kk kkVar, Map map, bja bjaVar) {
        List listAf;
        bja bjaVar2;
        Object[] objArr;
        long[] jArr;
        bja bjaVar3;
        long[] jArr2;
        int i;
        ArrayList arrayList;
        long j2;
        int i2;
        bjm bjmVarD;
        bja bjaVarC = x().d(v()).c(this.d);
        Object[] objArr2 = kkVar.b;
        long[] jArr3 = kkVar.a;
        int length = jArr3.length - 2;
        ArrayList arrayList2 = null;
        if (length >= 0) {
            listAf = null;
            int i3 = 0;
            while (true) {
                long j3 = jArr3[i3];
                ArrayList arrayList3 = arrayList2;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    objArr = objArr2;
                    arrayList2 = arrayList3;
                    int i5 = 0;
                    while (true) {
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 >= i6) {
                            bjaVar2 = bjaVarC;
                            jArr = jArr3;
                            if (i6 != 8) {
                                break;
                            }
                        } else {
                            if ((j3 & 255) < 128) {
                                bjk bjkVar = (bjk) objArr[(i3 << 3) + i5];
                                jArr2 = jArr3;
                                bjm bjmVarC = bjkVar.c();
                                i = i4;
                                arrayList = arrayList2;
                                bjm bjmVarK = bjb.k(bjmVarC, j, bjaVar);
                                if (bjmVarK != null) {
                                    j2 = j3;
                                    bjm bjmVarK2 = bjb.k(bjmVarC, v(), bjaVarC);
                                    if (bjmVarK2 == null) {
                                        bjaVar3 = bjaVarC;
                                    } else {
                                        i2 = i5;
                                        if (bjmVarK2.m == 1 || yks.e(bjmVarK, bjmVarK2)) {
                                            bjaVar3 = bjaVarC;
                                        } else {
                                            bjaVar3 = bjaVarC;
                                            bjm bjmVarK3 = bjb.k(bjmVarC, v(), x());
                                            if (bjmVarK3 == null) {
                                                bjb.z();
                                                throw new yfs();
                                            }
                                            if (map == null || (bjmVarD = (bjm) map.get(bjmVarK)) == null) {
                                                bjmVarD = bjkVar.d(bjmVarK2, bjmVarK, bjmVarK3);
                                            }
                                            if (bjmVarD == null) {
                                                return new biv(this);
                                            }
                                            if (!yks.e(bjmVarD, bjmVarK3)) {
                                                if (yks.e(bjmVarD, bjmVarK)) {
                                                    ArrayList arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                                                    arrayList4.add(new yfw(bjkVar, bjmVarK.c(v())));
                                                    if (listAf == null) {
                                                        listAf = new ArrayList();
                                                    }
                                                    listAf.add(bjkVar);
                                                    arrayList2 = arrayList4;
                                                } else {
                                                    arrayList2 = arrayList == null ? new ArrayList() : arrayList;
                                                    arrayList2.add(!yks.e(bjmVarD, bjmVarK2) ? new yfw(bjkVar, bjmVarD) : new yfw(bjkVar, bjmVarK2.c(v())));
                                                }
                                            }
                                            j3 = j2 >> 8;
                                            i5 = i2 + 1;
                                            jArr3 = jArr2;
                                            i4 = i;
                                            bjaVarC = bjaVar3;
                                        }
                                    }
                                } else {
                                    bjaVar3 = bjaVarC;
                                    j2 = j3;
                                }
                                i2 = i5;
                            } else {
                                bjaVar3 = bjaVarC;
                                jArr2 = jArr3;
                                i = i4;
                                arrayList = arrayList2;
                                j2 = j3;
                                i2 = i5;
                            }
                            arrayList2 = arrayList;
                            j3 = j2 >> 8;
                            i5 = i2 + 1;
                            jArr3 = jArr2;
                            i4 = i;
                            bjaVarC = bjaVar3;
                        }
                    }
                } else {
                    bjaVar2 = bjaVarC;
                    objArr = objArr2;
                    jArr = jArr3;
                    arrayList2 = arrayList3;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                objArr2 = objArr;
                jArr3 = jArr;
                bjaVarC = bjaVar2;
            }
        } else {
            listAf = null;
        }
        if (arrayList2 != null) {
            l();
            int size = arrayList2.size();
            for (int i7 = 0; i7 < size; i7++) {
                yfw yfwVar = (yfw) arrayList2.get(i7);
                bjk bjkVar2 = (bjk) yfwVar.a;
                bjm bjmVar = (bjm) yfwVar.b;
                bjmVar.m = j;
                synchronized (bjb.b) {
                    bjmVar.n = bjkVar2.c();
                    bjkVar2.g(bjmVar);
                }
            }
        }
        if (listAf != null) {
            int size2 = listAf.size();
            for (int i8 = 0; i8 < size2; i8++) {
                kkVar.l((bjk) listAf.get(i8));
            }
            List list = this.m;
            if (list != null) {
                listAf = yfm.af(list, listAf);
            }
            this.m = listAf;
        }
        return biw.a;
    }

    public void u(kk kkVar) {
        this.g = kkVar;
    }
}
