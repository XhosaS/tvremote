package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bit {
    public bja h;
    public long i;
    public boolean j;
    public int k;

    public bit(long j, bja bjaVar) {
        int i;
        long j2;
        int iNumberOfTrailingZeros;
        this.h = bjaVar;
        this.i = j;
        yjv yjvVar = bjb.a;
        if (j != 0) {
            bja bjaVarX = x();
            long[] jArr = bjaVarX.e;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = bjaVarX.c;
                if (j3 != 0) {
                    j2 = bjaVarX.d;
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = bjaVarX.b;
                    if (j4 != 0) {
                        j2 = bjaVarX.d + 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = j2 + iNumberOfTrailingZeros;
            }
            synchronized (bjb.b) {
                biy biyVar = bjb.e;
                int i2 = biyVar.a + 1;
                long[] jArr2 = biyVar.b;
                int length = jArr2.length;
                if (i2 > length) {
                    int i3 = length + length;
                    long[] jArr3 = new long[i3];
                    int[] iArr = new int[i3];
                    yfm.bi(jArr2, jArr3, 0, 0, jArr2.length);
                    yfm.bm(biyVar.c, iArr, 0, 0, 14);
                    biyVar.b = jArr3;
                    biyVar.c = iArr;
                }
                int i4 = biyVar.a;
                biyVar.a = i4 + 1;
                int length2 = biyVar.d.length;
                if (biyVar.e >= length2) {
                    int i5 = length2 + length2;
                    int[] iArr2 = new int[i5];
                    int i6 = 0;
                    while (i6 < i5) {
                        int i7 = i6 + 1;
                        iArr2[i6] = i7;
                        i6 = i7;
                    }
                    yfm.bm(biyVar.d, iArr2, 0, 0, 14);
                    biyVar.d = iArr2;
                }
                i = biyVar.e;
                int[] iArr3 = biyVar.d;
                biyVar.e = iArr3[i];
                biyVar.b[i4] = j;
                biyVar.c[i4] = i;
                iArr3[i] = i4;
                biyVar.b(i4);
            }
        } else {
            i = -1;
        }
        this.k = i;
    }

    public static final void E(bit bitVar) {
        bjb.i.i(bitVar);
    }

    public void A(bja bjaVar) {
        this.h = bjaVar;
    }

    public void B(long j) {
        this.i = j;
    }

    public final void C() {
        if (this.j) {
            bcm.a("Cannot use a disposed snapshot");
        }
    }

    public final void D() {
        this.j = true;
    }

    public abstract bit b(yjv yjvVar);

    public void d() {
        this.j = true;
        synchronized (bjb.b) {
            z();
        }
    }

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public int h() {
        return 0;
    }

    public abstract yjv i();

    public abstract yjv k();

    public void m() {
        bjb.c = bjb.c.b(v());
    }

    public abstract void n(bjk bjkVar);

    public void p() {
        z();
    }

    public void q(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract boolean r();

    public long v() {
        return this.i;
    }

    public final bit w() {
        ivx ivxVar = bjb.i;
        bit bitVar = (bit) ivxVar.h();
        ivxVar.i(this);
        return bitVar;
    }

    public bja x() {
        return this.h;
    }

    public final void y() {
        synchronized (bjb.b) {
            m();
            p();
        }
    }

    public final void z() {
        int i = this.k;
        if (i >= 0) {
            bjb.v(i);
            this.k = -1;
        }
    }
}
