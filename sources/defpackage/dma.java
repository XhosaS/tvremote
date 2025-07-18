package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dma extends dlx implements dof {
    public final dly c;
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;
    private final byte[] g;
    private volatile long h;
    private volatile dlg i;

    public dma(dlz dlzVar) {
        super(true, dlzVar.a.b());
        dly dlyVar = dlzVar.a;
        this.c = dlyVar;
        int iA = dlyVar.a();
        this.h = dlzVar.b;
        byte[] bArr = dlzVar.d;
        if (bArr == null) {
            this.d = new byte[iA];
        } else {
            if (bArr.length != iA) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.d = bArr;
        }
        byte[] bArr2 = dlzVar.e;
        if (bArr2 == null) {
            this.e = new byte[iA];
        } else {
            if (bArr2.length != iA) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.e = bArr2;
        }
        byte[] bArr3 = dlzVar.f;
        if (bArr3 == null) {
            this.f = new byte[iA];
        } else {
            if (bArr3.length != iA) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.f = bArr3;
        }
        byte[] bArr4 = dlzVar.g;
        if (bArr4 == null) {
            this.g = new byte[iA];
        } else {
            if (bArr4.length != iA) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.g = bArr4;
        }
        dlg dlgVar = dlzVar.h;
        if (dlgVar != null) {
            this.i = dlgVar;
        } else {
            if (!dnx.k(dlyVar.d, dlzVar.b) || bArr3 == null || bArr == null) {
                this.i = new dlg(dlzVar.c + 1);
            } else {
                this.i = new dlg(dlyVar, dlzVar.b, bArr3, bArr);
            }
        }
        long j = dlzVar.c;
        if (j >= 0 && j != this.i.b) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public final byte[] a() {
        byte[] bArrR;
        synchronized (this) {
            dly dlyVar = this.c;
            int iA = dlyVar.a();
            int i = (dlyVar.d + 7) / 8;
            int i2 = i + iA;
            int i3 = i2 + iA;
            int i4 = i3 + iA;
            byte[] bArr = new byte[iA + i4];
            dnx.i(bArr, dnx.o(this.h, i), 0);
            dnx.i(bArr, this.d, i);
            dnx.i(bArr, this.e, i2);
            dnx.i(bArr, this.f, i3);
            dnx.i(bArr, this.g, i4);
            try {
                bArrR = dos.r(bArr, dnx.n(this.i));
            } catch (IOException e) {
                throw new IllegalStateException("error serializing bds state: " + e.getMessage(), e);
            }
        }
        return bArrR;
    }

    @Override // defpackage.dof
    public final byte[] s() {
        byte[] bArrA;
        synchronized (this) {
            bArrA = a();
        }
        return bArrA;
    }
}
