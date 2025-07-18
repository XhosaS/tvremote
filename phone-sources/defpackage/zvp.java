package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zvp extends zvf implements zxn {
    public final zvn c;
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;
    private final byte[] g;
    private volatile zuo h;

    public zvp(zvo zvoVar) {
        super(true, zvoVar.a.e);
        zvn zvnVar = zvoVar.a;
        this.c = zvnVar;
        int i = zvnVar.f;
        byte[] bArr = zvoVar.d;
        if (bArr == null) {
            this.d = new byte[i];
        } else {
            if (bArr.length != i) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.d = bArr;
        }
        byte[] bArr2 = zvoVar.e;
        if (bArr2 == null) {
            this.e = new byte[i];
        } else {
            if (bArr2.length != i) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.e = bArr2;
        }
        byte[] bArr3 = zvoVar.f;
        if (bArr3 == null) {
            this.f = new byte[i];
        } else {
            if (bArr3.length != i) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.f = bArr3;
        }
        byte[] bArr4 = zvoVar.g;
        if (bArr4 == null) {
            this.g = new byte[i];
        } else {
            if (bArr4.length != i) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.g = bArr4;
        }
        zuo zuoVar = zvoVar.h;
        if (zuoVar != null) {
            this.h = zuoVar;
        } else {
            int i2 = zvoVar.b;
            int i3 = 1 << zvnVar.c;
            if (i2 >= i3 - 2 || bArr3 == null || bArr == null) {
                this.h = new zuo(zvnVar, i3 - 1, i2);
            } else {
                this.h = new zuo(zvnVar, bArr3, bArr, new zuz(new zuy()), i2);
            }
        }
        int i4 = zvoVar.c;
        if (i4 >= 0 && i4 != this.h.b) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public final byte[] a() {
        byte[] bArrBf;
        synchronized (this) {
            int i = this.c.f;
            int i2 = i + 4;
            int i3 = i2 + i;
            int i4 = i3 + i;
            byte[] bArr = new byte[i + i4];
            vxr.aU(this.h.a, bArr, 0);
            vxr.bw(bArr, this.d, 4);
            vxr.bw(bArr, this.e, i2);
            vxr.bw(bArr, this.f, i3);
            vxr.bw(bArr, this.g, i4);
            try {
                bArrBf = vxr.bf(bArr, vxr.bB(this.h));
            } catch (IOException e) {
                throw new RuntimeException("error serializing bds state: " + e.getMessage());
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
