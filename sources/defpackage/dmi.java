package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmi extends dlw implements dof {
    public final dme c;
    public final byte[] d;
    public final byte[] e;
    private final int f;

    public dmi(dmh dmhVar) {
        super(false, ((dme) dmhVar.d).e);
        dme dmeVar = (dme) dmhVar.d;
        this.c = dmeVar;
        if (dmeVar == null) {
            throw new NullPointerException("params == null");
        }
        int i = dmeVar.f;
        byte[] bArr = dmhVar.c;
        if (bArr != null) {
            int i2 = i + i;
            int length = bArr.length;
            if (length == i2) {
                this.f = 0;
                this.d = dnx.m(bArr, 0, i);
                this.e = dnx.m(bArr, i, i);
                return;
            } else {
                int i3 = i + 4;
                if (length != i3 + i) {
                    throw new IllegalArgumentException("public key has wrong size");
                }
                this.f = dos.c(bArr, 0);
                this.d = dnx.m(bArr, 4, i);
                this.e = dnx.m(bArr, i3, i);
                return;
            }
        }
        dmd dmdVar = dmeVar.b;
        if (dmdVar != null) {
            this.f = ((dlj) dmdVar).b;
        } else {
            this.f = 0;
        }
        byte[] bArr2 = dmhVar.a;
        if (bArr2 == null) {
            this.d = new byte[i];
        } else {
            if (bArr2.length != i) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.d = bArr2;
        }
        byte[] bArr3 = dmhVar.b;
        if (bArr3 == null) {
            this.e = new byte[i];
        } else {
            if (bArr3.length != i) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.e = bArr3;
        }
    }

    public final byte[] a() {
        byte[] bArr;
        int i = this.c.f;
        int i2 = this.f;
        int i3 = 0;
        if (i2 != 0) {
            bArr = new byte[i + 4 + i];
            dos.g(i2, bArr, 0);
            i3 = 4;
        } else {
            bArr = new byte[i + i];
        }
        dnx.i(bArr, this.d, i3);
        dnx.i(bArr, this.e, i3 + i);
        return bArr;
    }

    @Override // defpackage.dof
    public final byte[] s() {
        return a();
    }
}
