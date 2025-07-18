package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmg extends dlw implements dof {
    public final dme c;
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;
    private final byte[] g;
    private volatile dlf h;

    public dmg(dmf dmfVar) {
        super(true, dmfVar.a.e);
        dme dmeVar = dmfVar.a;
        this.c = dmeVar;
        int i = dmeVar.f;
        byte[] bArr = dmfVar.d;
        if (bArr == null) {
            this.d = new byte[i];
        } else {
            if (bArr.length != i) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.d = bArr;
        }
        byte[] bArr2 = dmfVar.e;
        if (bArr2 == null) {
            this.e = new byte[i];
        } else {
            if (bArr2.length != i) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.e = bArr2;
        }
        byte[] bArr3 = dmfVar.f;
        if (bArr3 == null) {
            this.f = new byte[i];
        } else {
            if (bArr3.length != i) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.f = bArr3;
        }
        byte[] bArr4 = dmfVar.g;
        if (bArr4 == null) {
            this.g = new byte[i];
        } else {
            if (bArr4.length != i) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.g = bArr4;
        }
        dlf dlfVar = dmfVar.h;
        if (dlfVar != null) {
            this.h = dlfVar;
        } else {
            int i2 = dmfVar.b;
            int i3 = 1 << dmeVar.c;
            if (i2 >= i3 - 2 || bArr3 == null || bArr == null) {
                this.h = new dlf(dmeVar, i3 - 1, i2);
            } else {
                this.h = new dlf(dmeVar, bArr3, bArr, new dlq(new dlp()), i2);
            }
        }
        int i4 = dmfVar.c;
        if (i4 >= 0 && i4 != this.h.b) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public final byte[] a() {
        byte[] bArrR;
        synchronized (this) {
            int i = this.c.f;
            int i2 = i + 4;
            int i3 = i2 + i;
            int i4 = i3 + i;
            byte[] bArr = new byte[i + i4];
            dos.g(this.h.a, bArr, 0);
            dnx.i(bArr, this.d, 4);
            dnx.i(bArr, this.e, i2);
            dnx.i(bArr, this.f, i3);
            dnx.i(bArr, this.g, i4);
            try {
                bArrR = dos.r(bArr, dnx.n(this.h));
            } catch (IOException e) {
                throw new RuntimeException("error serializing bds state: " + e.getMessage());
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
