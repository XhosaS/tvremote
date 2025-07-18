package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zvr extends zvf implements zxn {
    public final zvn c;
    public final byte[] d;
    public final byte[] e;
    private final int f;

    public zvr(zvq zvqVar) {
        super(false, ((zvn) zvqVar.d).e);
        zvn zvnVar = (zvn) zvqVar.d;
        this.c = zvnVar;
        if (zvnVar == null) {
            throw new NullPointerException("params == null");
        }
        int i = zvnVar.f;
        byte[] bArr = zvqVar.c;
        if (bArr != null) {
            int i2 = i + i;
            int length = bArr.length;
            if (length == i2) {
                this.f = 0;
                this.d = vxr.bA(bArr, 0, i);
                this.e = vxr.bA(bArr, i, i);
                return;
            } else {
                int i3 = i + 4;
                if (length != i3 + i) {
                    throw new IllegalArgumentException("public key has wrong size");
                }
                this.f = vxr.aQ(bArr, 0);
                this.d = vxr.bA(bArr, 4, i);
                this.e = vxr.bA(bArr, i3, i);
                return;
            }
        }
        zvm zvmVar = zvnVar.b;
        if (zvmVar != null) {
            this.f = ((zus) zvmVar).b;
        } else {
            this.f = 0;
        }
        byte[] bArr2 = zvqVar.a;
        if (bArr2 == null) {
            this.d = new byte[i];
        } else {
            if (bArr2.length != i) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.d = bArr2;
        }
        byte[] bArr3 = zvqVar.b;
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
            vxr.aU(i2, bArr, 0);
            i3 = 4;
        } else {
            bArr = new byte[i + i];
        }
        vxr.bw(bArr, this.d, i3);
        vxr.bw(bArr, this.e, i3 + i);
        return bArr;
    }

    @Override // defpackage.zxn
    public final byte[] s() {
        return a();
    }
}
