package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpg extends cpk {
    public cpd[] aH;
    public int a = -1;
    public int b = -1;
    public int c = -1;
    public int d = -1;
    public int as = -1;
    public int at = -1;
    public float au = 0.5f;
    public float av = 0.5f;
    public float aw = 0.5f;
    public float ax = 0.5f;
    public float ay = 0.5f;
    public float az = 0.5f;
    public int aA = 0;
    public int aB = 0;
    public int aC = 2;
    public int aD = 2;
    public int aE = 0;
    public int aF = -1;
    public int aG = 0;
    private final ArrayList aW = new ArrayList();
    private cpd[] aX = null;
    private cpd[] aY = null;
    private int[] aZ = null;
    public int aI = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:273:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f7  */
    @Override // defpackage.cpk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W(int r37, int r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpg.W(int, int, int, int):void");
    }

    public final int a(cpd cpdVar, int i) {
        cpd cpdVar2;
        if (cpdVar == null) {
            return 0;
        }
        if (cpdVar.P() == 3) {
            int i2 = cpdVar.u;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (cpdVar.B * i);
                if (i3 != cpdVar.h()) {
                    cpdVar.k = true;
                    aa(cpdVar, cpdVar.O(), cpdVar.j(), 1, i3);
                }
                return i3;
            }
            cpdVar2 = cpdVar;
            if (i2 != 1 && i2 == 3) {
                return (int) ((cpdVar2.j() * cpdVar2.Y) + 0.5f);
            }
        } else {
            cpdVar2 = cpdVar;
        }
        return cpdVar2.h();
    }

    @Override // defpackage.cpd
    public final void b(cov covVar, boolean z) {
        cpd cpdVar;
        float f;
        int i;
        super.b(covVar, z);
        cpd cpdVar2 = this.V;
        boolean z2 = cpdVar2 != null && ((cpe) cpdVar2).c;
        int i2 = this.aE;
        if (i2 == 0) {
            ArrayList arrayList = this.aW;
            if (arrayList.size() > 0) {
                ((cpf) arrayList.get(0)).d(z2, 0, true);
            }
        } else if (i2 == 1) {
            ArrayList arrayList2 = this.aW;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                ((cpf) arrayList2.get(i3)).d(z2, i3, i3 == size + (-1));
                i3++;
            }
        } else if (i2 != 2) {
            if (i2 == 3) {
                ArrayList arrayList3 = this.aW;
                int size2 = arrayList3.size();
                int i4 = 0;
                while (i4 < size2) {
                    ((cpf) arrayList3.get(i4)).d(z2, i4, i4 == size2 + (-1));
                    i4++;
                }
            }
        } else if (this.aZ != null && this.aY != null && this.aX != null) {
            for (int i5 = 0; i5 < this.aI; i5++) {
                this.aH[i5].u();
            }
            int[] iArr = this.aZ;
            int i6 = iArr[0];
            int i7 = iArr[1];
            float f2 = this.au;
            cpd cpdVar3 = null;
            int i8 = 0;
            while (i8 < i6) {
                if (z2) {
                    i = (i6 - i8) - 1;
                    f = 1.0f - this.au;
                } else {
                    f = f2;
                    i = i8;
                }
                cpd cpdVar4 = this.aY[i];
                if (cpdVar4 != null && cpdVar4.ai != 8) {
                    if (i8 == 0) {
                        cpdVar4.q(cpdVar4.K, this.K, this.aP);
                        cpdVar4.ak = this.a;
                        cpdVar4.af = f;
                        i8 = 0;
                    }
                    if (i8 == i6 - 1) {
                        cpdVar4.q(cpdVar4.M, this.M, this.aQ);
                    }
                    if (i8 > 0 && cpdVar3 != null) {
                        cpc cpcVar = cpdVar4.K;
                        int i9 = this.aA;
                        cpc cpcVar2 = cpdVar3.M;
                        cpdVar4.q(cpcVar, cpcVar2, i9);
                        cpdVar3.q(cpcVar2, cpcVar, 0);
                    }
                    cpdVar3 = cpdVar4;
                }
                i8++;
                f2 = f;
            }
            int i10 = 0;
            while (i10 < i7) {
                cpd cpdVar5 = this.aX[i10];
                if (cpdVar5 != null && cpdVar5.ai != 8) {
                    if (i10 == 0) {
                        cpdVar5.q(cpdVar5.L, this.L, this.aL);
                        cpdVar5.al = this.b;
                        cpdVar5.ag = this.av;
                        i10 = 0;
                    }
                    if (i10 == i7 - 1) {
                        cpdVar5.q(cpdVar5.N, this.N, this.aM);
                    }
                    if (i10 > 0 && cpdVar3 != null) {
                        cpc cpcVar3 = cpdVar5.L;
                        int i11 = this.aB;
                        cpc cpcVar4 = cpdVar3.N;
                        cpdVar5.q(cpcVar3, cpcVar4, i11);
                        cpdVar3.q(cpcVar4, cpcVar3, 0);
                    }
                    cpdVar3 = cpdVar5;
                }
                i10++;
            }
            for (int i12 = 0; i12 < i6; i12++) {
                for (int i13 = 0; i13 < i7; i13++) {
                    int i14 = (i13 * i6) + i12;
                    if (this.aG == 1) {
                        i14 = (i12 * i7) + i13;
                    }
                    cpd[] cpdVarArr = this.aH;
                    if (i14 < cpdVarArr.length && (cpdVar = cpdVarArr[i14]) != null && cpdVar.ai != 8) {
                        cpd cpdVar6 = this.aY[i12];
                        cpd cpdVar7 = this.aX[i13];
                        if (cpdVar != cpdVar6) {
                            cpdVar.q(cpdVar.K, cpdVar6.K, 0);
                            cpdVar.q(cpdVar.M, cpdVar6.M, 0);
                        }
                        if (cpdVar != cpdVar7) {
                            cpdVar.q(cpdVar.L, cpdVar7.L, 0);
                            cpdVar.q(cpdVar.N, cpdVar7.N, 0);
                        }
                    }
                }
            }
        }
        this.aR = false;
    }

    public final int c(cpd cpdVar, int i) {
        cpd cpdVar2;
        if (cpdVar == null) {
            return 0;
        }
        if (cpdVar.O() == 3) {
            int i2 = cpdVar.t;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (cpdVar.y * i);
                if (i3 != cpdVar.j()) {
                    cpdVar.k = true;
                    aa(cpdVar, 1, i3, cpdVar.P(), cpdVar.h());
                }
                return i3;
            }
            cpdVar2 = cpdVar;
            if (i2 != 1 && i2 == 3) {
                return (int) ((cpdVar2.h() * cpdVar2.Y) + 0.5f);
            }
        } else {
            cpdVar2 = cpdVar;
        }
        return cpdVar2.j();
    }
}
