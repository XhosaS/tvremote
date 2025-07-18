package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zvj extends zvg implements zxn {
    public final zvh c;
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;
    private final byte[] g;
    private volatile long h;
    private volatile zup i;

    public zvj(zvi zviVar) {
        super(true, zviVar.a.b());
        zvh zvhVar = zviVar.a;
        this.c = zvhVar;
        int iA = zvhVar.a();
        this.h = zviVar.b;
        byte[] bArr = zviVar.d;
        if (bArr == null) {
            this.d = new byte[iA];
        } else {
            if (bArr.length != iA) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.d = bArr;
        }
        byte[] bArr2 = zviVar.e;
        if (bArr2 == null) {
            this.e = new byte[iA];
        } else {
            if (bArr2.length != iA) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.e = bArr2;
        }
        byte[] bArr3 = zviVar.f;
        if (bArr3 == null) {
            this.f = new byte[iA];
        } else {
            if (bArr3.length != iA) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.f = bArr3;
        }
        byte[] bArr4 = zviVar.g;
        if (bArr4 == null) {
            this.g = new byte[iA];
        } else {
            if (bArr4.length != iA) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.g = bArr4;
        }
        zup zupVar = zviVar.h;
        if (zupVar != null) {
            this.i = zupVar;
        } else {
            if (!vxr.by(zvhVar.d, zviVar.b) || bArr3 == null || bArr == null) {
                this.i = new zup(zviVar.c + 1);
            } else {
                this.i = new zup(zvhVar, zviVar.b, bArr3, bArr);
            }
        }
        long j = zviVar.c;
        if (j >= 0 && j != this.i.b) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public final byte[] a() {
        byte[] bArrBf;
        synchronized (this) {
            zvh zvhVar = this.c;
            int iA = zvhVar.a();
            int i = (zvhVar.d + 7) / 8;
            int i2 = i + iA;
            int i3 = i2 + iA;
            int i4 = i3 + iA;
            byte[] bArr = new byte[iA + i4];
            vxr.bw(bArr, vxr.bC(this.h, i), 0);
            vxr.bw(bArr, this.d, i);
            vxr.bw(bArr, this.e, i2);
            vxr.bw(bArr, this.f, i3);
            vxr.bw(bArr, this.g, i4);
            try {
                bArrBf = vxr.bf(bArr, vxr.bB(this.i));
            } catch (IOException e) {
                throw new IllegalStateException("error serializing bds state: " + e.getMessage(), e);
            }
        }
        return bArrBf;
    }

    @Override // defpackage.zxn
    public final byte[] s() {
        byte[] bArrA;
        synchronized (this) {
            bArrA = a();
        }
        return bArrA;
    }
}
