package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfu extends a {
    public bfp[] a;
    public int b;
    public int[] c;
    public int d;
    public Object[] e;
    public int f;

    public bfu() {
        super(null);
        this.a = new bfp[16];
        this.c = new int[16];
        this.e = new Object[16];
    }

    private static final int cG(int i, int i2) {
        return ykn.j(i + ykn.k(i, 1024), i2);
    }

    public final void cB() {
        this.b = 0;
        this.d = 0;
        yfm.aD(this.e, null, 0, this.f);
        this.f = 0;
    }

    public final void cC(bfp bfpVar) {
        int i = this.b;
        bfp[] bfpVarArr = this.a;
        if (i == bfpVarArr.length) {
            bfp[] bfpVarArr2 = new bfp[ykn.k(i, 1024) + i];
            System.arraycopy(bfpVarArr, 0, bfpVarArr2, 0, i);
            this.a = bfpVarArr2;
        }
        int i2 = this.d;
        int i3 = bfpVar.b;
        int i4 = i2 + i3;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i4 > length) {
            int[] iArr2 = new int[cG(length, i4)];
            yfm.bh(iArr, iArr2, 0, 0, length);
            this.c = iArr2;
        }
        int i5 = this.f;
        int i6 = bfpVar.c;
        int i7 = i5 + i6;
        Object[] objArr = this.e;
        int length2 = objArr.length;
        if (i7 > length2) {
            Object[] objArr2 = new Object[cG(length2, i7)];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.e = objArr2;
        }
        bfp[] bfpVarArr3 = this.a;
        int i8 = this.b;
        this.b = i8 + 1;
        bfpVarArr3[i8] = bfpVar;
        this.d += i3;
        this.f += i6;
    }

    public final boolean cD() {
        return this.b == 0;
    }

    public final boolean cE() {
        return this.b != 0;
    }

    public final void cF(bad badVar, bdj bdjVar, bhx bhxVar, bfq bfqVar) {
        if (cE()) {
            bfs bfsVar = new bfs(this);
            while (true) {
                bfp bfpVarB = bfsVar.b();
                bac bacVarB = bfpVarB.b(bfsVar);
                bad badVar2 = badVar;
                bdj bdjVar2 = bdjVar;
                bhx bhxVar2 = bhxVar;
                bfq bfqVar2 = bfqVar;
                try {
                    bfpVarB.a(bfsVar, badVar2, bdjVar2, bhxVar2, bfqVar2);
                    int i = bfsVar.a;
                    bfu bfuVar = bfsVar.d;
                    if (i < bfuVar.b) {
                        bfp bfpVarB2 = bfsVar.b();
                        bfsVar.b += bfpVarB2.b;
                        bfsVar.c += bfpVarB2.c;
                        int i2 = bfsVar.a + 1;
                        bfsVar.a = i2;
                        if (i2 >= bfuVar.b) {
                            break;
                        }
                        badVar = badVar2;
                        bdjVar = bdjVar2;
                        bhxVar = bhxVar2;
                        bfqVar = bfqVar2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        cB();
    }
}
