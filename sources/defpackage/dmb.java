package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmb extends dlx implements dof {
    public final dly c;
    private final int d;
    private final byte[] e;
    private final byte[] f;

    public dmb(dmh dmhVar) {
        super(false, ((dly) dmhVar.d).b());
        dly dlyVar = (dly) dmhVar.d;
        this.c = dlyVar;
        if (dlyVar == null) {
            throw new NullPointerException("params == null");
        }
        int iA = dlyVar.a();
        byte[] bArr = dmhVar.c;
        if (bArr != null) {
            int i = iA + iA;
            int length = bArr.length;
            if (length == i) {
                this.d = 0;
                this.e = dnx.m(bArr, 0, iA);
                this.f = dnx.m(bArr, iA, iA);
                return;
            } else {
                int i2 = iA + 4;
                if (length != i2 + iA) {
                    throw new IllegalArgumentException("public key has wrong size");
                }
                this.d = dos.c(bArr, 0);
                this.e = dnx.m(bArr, 4, iA);
                this.f = dnx.m(bArr, i2, iA);
                return;
            }
        }
        dmd dmdVar = dlyVar.b;
        if (dmdVar != null) {
            this.d = ((dli) dmdVar).b;
        } else {
            this.d = 0;
        }
        byte[] bArr2 = dmhVar.a;
        if (bArr2 == null) {
            this.e = new byte[iA];
        } else {
            if (bArr2.length != iA) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.e = bArr2;
        }
        byte[] bArr3 = dmhVar.b;
        if (bArr3 == null) {
            this.f = new byte[iA];
        } else {
            if (bArr3.length != iA) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.f = bArr3;
        }
    }

    public final byte[] a() {
        return dnx.l(this.f);
    }

    public final byte[] b() {
        return dnx.l(this.e);
    }

    public final byte[] c() {
        byte[] bArr;
        int i = this.d;
        int iA = this.c.a();
        int i2 = 0;
        if (i != 0) {
            bArr = new byte[iA + 4 + iA];
            dos.g(i, bArr, 0);
            i2 = 4;
        } else {
            bArr = new byte[iA + iA];
        }
        dnx.i(bArr, this.e, i2);
        dnx.i(bArr, this.f, i2 + iA);
        return bArr;
    }

    @Override // defpackage.dof
    public final byte[] s() {
        return c();
    }
}
