package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zvk extends zvg implements zxn {
    public final zvh c;
    private final int d;
    private final byte[] e;
    private final byte[] f;

    public zvk(zvq zvqVar) {
        super(false, ((zvh) zvqVar.d).b());
        zvh zvhVar = (zvh) zvqVar.d;
        this.c = zvhVar;
        if (zvhVar == null) {
            throw new NullPointerException("params == null");
        }
        int iA = zvhVar.a();
        byte[] bArr = zvqVar.c;
        if (bArr != null) {
            int i = iA + iA;
            int length = bArr.length;
            if (length == i) {
                this.d = 0;
                this.e = vxr.bA(bArr, 0, iA);
                this.f = vxr.bA(bArr, iA, iA);
                return;
            } else {
                int i2 = iA + 4;
                if (length != i2 + iA) {
                    throw new IllegalArgumentException("public key has wrong size");
                }
                this.d = vxr.aQ(bArr, 0);
                this.e = vxr.bA(bArr, 4, iA);
                this.f = vxr.bA(bArr, i2, iA);
                return;
            }
        }
        zvm zvmVar = zvhVar.b;
        if (zvmVar != null) {
            this.d = ((zur) zvmVar).b;
        } else {
            this.d = 0;
        }
        byte[] bArr2 = zvqVar.a;
        if (bArr2 == null) {
            this.e = new byte[iA];
        } else {
            if (bArr2.length != iA) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.e = bArr2;
        }
        byte[] bArr3 = zvqVar.b;
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
        return vxr.bz(this.f);
    }

    public final byte[] b() {
        return vxr.bz(this.e);
    }

    public final byte[] c() {
        byte[] bArr;
        int i = this.d;
        int iA = this.c.a();
        int i2 = 0;
        if (i != 0) {
            bArr = new byte[iA + 4 + iA];
            vxr.aU(i, bArr, 0);
            i2 = 4;
        } else {
            bArr = new byte[iA + iA];
        }
        vxr.bw(bArr, this.e, i2);
        vxr.bw(bArr, this.f, i2 + iA);
        return bArr;
    }

    @Override // defpackage.zxn
    public final byte[] s() {
        return c();
    }
}
