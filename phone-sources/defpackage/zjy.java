package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zjy extends zic {
    private final zic[] c;

    public zjy(byte[] bArr, int i) {
        super(bArr, i);
        this.c = null;
    }

    static byte[] q(zic[] zicVarArr) {
        int length = zicVarArr.length;
        if (length == 0) {
            return new byte[]{0};
        }
        if (length == 1) {
            return zicVarArr[0].a;
        }
        int i = length - 1;
        int length2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            if (zicVarArr[i2].a[0] != 0) {
                throw new IllegalArgumentException("only the last nested bitstring can have padding");
            }
            length2 += r6.length - 1;
        }
        byte[] bArr = zicVarArr[i].a;
        byte b = bArr[0];
        byte[] bArr2 = new byte[length2 + bArr.length];
        bArr2[0] = b;
        int i3 = 1;
        for (zic zicVar : zicVarArr) {
            byte[] bArr3 = zicVar.a;
            int length3 = bArr3.length - 1;
            System.arraycopy(bArr3, 1, bArr2, i3, length3);
            i3 += length3;
        }
        return bArr2;
    }

    @Override // defpackage.zjh
    public final int a(boolean z) {
        if (!e()) {
            int length = this.a.length;
            int i = zkt.c;
            return zjf.b(z, length);
        }
        int iA = true != z ? 3 : 4;
        zic[] zicVarArr = this.c;
        if (zicVarArr != null) {
            for (zic zicVar : zicVarArr) {
                iA += zicVar.a(true);
            }
            return iA;
        }
        int length2 = this.a.length;
        if (length2 < 2) {
            return iA;
        }
        int i2 = zkt.c;
        int i3 = (length2 - 2) / 999;
        return iA + (zjf.b(true, 1000) * i3) + zjf.b(true, length2 - (i3 * 999));
    }

    @Override // defpackage.zjh
    public final void c(zjf zjfVar, boolean z) throws IOException {
        if (!e()) {
            byte[] bArr = this.a;
            int length = bArr.length;
            int i = zkt.c;
            zjfVar.k(z, 3, bArr, 0, length);
            return;
        }
        zjfVar.m(z, 35);
        zjfVar.f(128);
        zic[] zicVarArr = this.c;
        if (zicVarArr != null) {
            zjfVar.n(zicVarArr);
        } else {
            byte[] bArr2 = this.a;
            int length2 = bArr2.length;
            if (length2 >= 2) {
                byte b = bArr2[0];
                int i2 = length2 - 1;
                while (i2 > 999) {
                    zkt.q(zjfVar, (byte) 0, bArr2, length2 - i2, 999);
                    i2 -= 999;
                }
                zkt.q(zjfVar, b, bArr2, length2 - i2, i2);
            }
        }
        zjfVar.f(0);
        zjfVar.f(0);
    }

    @Override // defpackage.zjh
    public final boolean e() {
        return this.c != null || this.a.length > 1000;
    }

    public zjy(zic[] zicVarArr) {
        super(q(zicVarArr));
        this.c = zicVarArr;
    }
}
