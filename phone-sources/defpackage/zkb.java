package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zkb extends zjd {
    private final zjd[] d;

    public zkb(byte[] bArr, zjd[] zjdVarArr) {
        super(bArr);
        this.d = zjdVarArr;
    }

    static byte[] h(zjd[] zjdVarArr) {
        int length = zjdVarArr.length;
        if (length == 0) {
            return a;
        }
        if (length == 1) {
            return zjdVarArr[0].b;
        }
        int length2 = 0;
        for (zjd zjdVar : zjdVarArr) {
            length2 += zjdVar.b.length;
        }
        byte[] bArr = new byte[length2];
        int i = 0;
        for (zjd zjdVar2 : zjdVarArr) {
            byte[] bArr2 = zjdVar2.b;
            int length3 = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i, length3);
            i += length3;
        }
        return bArr;
    }

    @Override // defpackage.zjh
    public final int a(boolean z) {
        int iA = true != z ? 3 : 4;
        zjd[] zjdVarArr = this.d;
        if (zjdVarArr != null) {
            for (zjd zjdVar : zjdVarArr) {
                iA += zjdVar.a(true);
            }
            return iA;
        }
        int length = this.b.length;
        int i = length / 1000;
        int iH = iA + (zkn.h(1000) * i);
        int i2 = length - (i * 1000);
        return i2 > 0 ? iH + zkn.h(i2) : iH;
    }

    @Override // defpackage.zjh
    public final void c(zjf zjfVar, boolean z) throws IOException {
        zjfVar.m(z, 36);
        zjfVar.f(128);
        zjd[] zjdVarArr = this.d;
        if (zjdVarArr == null) {
            int i = 0;
            while (true) {
                int length = this.b.length;
                if (i >= length) {
                    break;
                }
                int iMin = Math.min(length - i, 1000);
                zjfVar.k(true, 4, this.b, i, iMin);
                i += iMin;
            }
        } else {
            zjfVar.n(zjdVarArr);
        }
        zjfVar.f(0);
        zjfVar.f(0);
    }

    @Override // defpackage.zjh
    public final boolean e() {
        return true;
    }

    public zkb(zjd[] zjdVarArr) {
        this(h(zjdVarArr), zjdVarArr);
    }
}
