package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pw implements pq {
    public final int a;
    private final ja b;
    private final jc c;
    private final nl d;
    private int[] e = pp.a;
    private float[] f;
    private ne g;
    private ne h;
    private ne i;
    private ne j;
    private float[] k;
    private float[] l;
    private kw m;

    public pw(ja jaVar, jc jcVar, int i, nl nlVar) {
        this.b = jaVar;
        this.c = jcVar;
        this.a = i;
        this.d = nlVar;
        float[] fArr = pp.b;
        this.f = fArr;
        this.k = fArr;
        this.l = fArr;
        this.m = pp.c;
    }

    private final float h(int i) {
        return i(j(i), i, false);
    }

    private final float i(int i, int i2, boolean z) {
        nl nlVar;
        float f;
        ja jaVar = this.b;
        if (i >= jaVar.b - 1) {
            f = i2;
        } else {
            int iA = jaVar.a(i);
            int iA2 = jaVar.a(i + 1);
            if (i2 == iA) {
                f = iA;
            } else {
                int i3 = iA2 - iA;
                pv pvVar = (pv) this.c.a(iA);
                if (pvVar == null || (nlVar = pvVar.b) == null) {
                    nlVar = this.d;
                }
                float f2 = i3;
                float fA = nlVar.a((i2 - iA) / f2);
                if (z) {
                    return fA;
                }
                f = (f2 * fA) + iA;
            }
        }
        return f / 1000.0f;
    }

    private final int j(int i) {
        int i2;
        ja jaVar = this.b;
        int i3 = jaVar.b;
        if (i3 <= 0) {
            kv.c("");
        }
        int i4 = i3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = jaVar.a[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = -(i5 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6 A[LOOP:5: B:40:0x00c4->B:41:0x00c6, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void k(defpackage.ne r10, defpackage.ne r11, defpackage.ne r12) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pw.k(ne, ne, ne):void");
    }

    @Override // defpackage.pn
    public final /* synthetic */ long a(ne neVar, ne neVar2, ne neVar3) {
        return hq.i(this);
    }

    @Override // defpackage.pn
    public final /* synthetic */ ne b(ne neVar, ne neVar2, ne neVar3) {
        return hq.j(this, neVar, neVar2, neVar3);
    }

    @Override // defpackage.pn
    public final ne c(long j, ne neVar, ne neVar2, ne neVar3) {
        ne neVar4;
        ne neVar5;
        ne neVar6 = neVar;
        ne neVar7 = neVar2;
        int iA = (int) pp.a(this, j / 1000000);
        jc jcVar = this.c;
        pv pvVar = (pv) jcVar.a(iA);
        if (pvVar != null) {
            return pvVar.a;
        }
        if (iA >= this.a) {
            return neVar7;
        }
        if (iA <= 0) {
            return neVar6;
        }
        k(neVar6, neVar7, neVar3);
        ne neVar8 = this.g;
        neVar8.getClass();
        int i = 0;
        if (this.m != pp.c) {
            float fH = h(iA);
            float[] fArr = this.k;
            ng[][] ngVarArr = (ng[][]) this.m.a;
            int length = ngVarArr.length;
            float f = ngVarArr[0][0].a;
            int i2 = length - 1;
            float f2 = ngVarArr[i2][0].b;
            int length2 = fArr.length;
            if (fH >= f && fH <= f2) {
                int i3 = 0;
                boolean z = false;
                while (i3 < length) {
                    int i4 = i;
                    int i5 = i4;
                    while (i4 < length2 - 1) {
                        ng ngVar = ngVarArr[i3][i5];
                        if (fH <= ngVar.b) {
                            int i6 = i4 + 1;
                            if (ngVar.g) {
                                fArr[i4] = ngVar.c(fH);
                                fArr[i6] = ngVar.d(fH);
                            } else {
                                ngVar.e(fH);
                                fArr[i4] = ngVar.h + (ngVar.e * ngVar.c);
                                fArr[i6] = ngVar.i + (ngVar.f * ngVar.d);
                            }
                            z = true;
                        }
                        i5++;
                        i4 += 2;
                    }
                    if (z) {
                        break;
                    }
                    i3++;
                    i = 0;
                }
            } else {
                int i7 = length2 - 1;
                if (fH > f2) {
                    f = f2;
                }
                if (fH <= f2) {
                    i2 = 0;
                }
                float f3 = fH - f;
                int i8 = 0;
                int i9 = 0;
                while (i8 < i7) {
                    int i10 = i8 + 1;
                    ng ngVar2 = ngVarArr[i2][i9];
                    if (ngVar2.g) {
                        fArr[i8] = ngVar2.c(f) + (ngVar2.h * f3);
                        fArr[i10] = ngVar2.d(f) + (ngVar2.i * f3);
                    } else {
                        ngVar2.e(f);
                        fArr[i8] = ngVar2.h + (ngVar2.e * ngVar2.c) + (ngVar2.a() * f3);
                        fArr[i10] = ngVar2.i + (ngVar2.f * ngVar2.d) + (ngVar2.b() * f3);
                    }
                    i8 += 2;
                    i9++;
                }
            }
            int length3 = fArr.length;
            for (int i11 = 0; i11 < length3; i11++) {
                neVar8.e(i11, fArr[i11]);
            }
        } else {
            int iJ = j(iA);
            float fI = i(iJ, iA, true);
            ja jaVar = this.b;
            pv pvVar2 = (pv) jcVar.a(jaVar.a(iJ));
            if (pvVar2 != null && (neVar5 = pvVar2.a) != null) {
                neVar6 = neVar5;
            }
            pv pvVar3 = (pv) jcVar.a(jaVar.a(iJ + 1));
            if (pvVar3 != null && (neVar4 = pvVar3.a) != null) {
                neVar7 = neVar4;
            }
            int iB = neVar8.b();
            for (int i12 = 0; i12 < iB; i12++) {
                neVar8.e(i12, (neVar6.a(i12) * (1.0f - fI)) + (neVar7.a(i12) * fI));
            }
        }
        return neVar8;
    }

    @Override // defpackage.pn
    public final ne d(long j, ne neVar, ne neVar2, ne neVar3) {
        long jA = pp.a(this, j / 1000000);
        k(neVar, neVar2, neVar3);
        ne neVar4 = this.h;
        neVar4.getClass();
        int i = 0;
        if (this.m != pp.c) {
            float fH = h((int) jA);
            float[] fArr = this.l;
            ng[][] ngVarArr = (ng[][]) this.m.a;
            float f = ngVarArr[0][0].a;
            float f2 = ngVarArr[ngVarArr.length - 1][0].b;
            if (fH < f) {
                fH = f;
            }
            if (fH <= f2) {
                f2 = fH;
            }
            int length = fArr.length;
            boolean z = false;
            for (ng[] ngVarArr2 : ngVarArr) {
                int i2 = 0;
                int i3 = 0;
                while (i2 < length - 1) {
                    ng ngVar = ngVarArr2[i3];
                    if (f2 <= ngVar.b) {
                        int i4 = i2 + 1;
                        if (ngVar.g) {
                            fArr[i2] = ngVar.h;
                            fArr[i4] = ngVar.i;
                        } else {
                            ngVar.e(f2);
                            fArr[i2] = ngVar.a();
                            fArr[i4] = ngVar.b();
                        }
                        z = true;
                    }
                    i2 += 2;
                    i3++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                neVar4.e(i, fArr[i]);
                i++;
            }
        } else {
            ne neVarB = pp.b(this, (-1) + jA, neVar, neVar2, neVar3);
            ne neVarB2 = pp.b(this, jA, neVar, neVar2, neVar3);
            int iB = neVarB.b();
            while (i < iB) {
                neVar4.e(i, (neVarB.a(i) - neVarB2.a(i)) * 1000.0f);
                i++;
            }
        }
        return neVar4;
    }

    @Override // defpackage.pn
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // defpackage.pq
    public final int f() {
        return 0;
    }

    @Override // defpackage.pq
    public final int g() {
        return this.a;
    }
}
