package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class zkj extends zic {
    /* JADX WARN: Illegal instructions before constructor call */
    public zkj() {
        int i;
        int i2 = 3;
        int i3 = 4;
        int i4 = 3;
        while (true) {
            i = 164;
            if (i4 <= 0 || ((255 << (i4 * 8)) & 164) != 0) {
                break;
            }
            i3--;
            i4--;
        }
        byte[] bArr = new byte[i3];
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            bArr[i6] = (byte) (164 >> (i6 * 8));
        }
        while (true) {
            if (i2 < 0) {
                i = 0;
                break;
            } else {
                if (i2 == 0) {
                    break;
                }
                int i7 = 164 >> (i2 * 8);
                if (i7 != 0) {
                    i = i7;
                    break;
                }
                i2--;
            }
        }
        if (i != 0) {
            int i8 = 1;
            while (true) {
                i += i;
                if ((i & 255) == 0) {
                    break;
                } else {
                    i8++;
                }
            }
            i5 = 8 - i8;
        }
        super(bArr, i5);
    }

    @Override // defpackage.zjh
    public final int a(boolean z) {
        return zjf.b(z, this.a.length);
    }

    @Override // defpackage.zjh
    public final void c(zjf zjfVar, boolean z) throws IOException {
        byte[] bArr = this.a;
        int i = bArr[0] & 255;
        int length = bArr.length;
        int i2 = length - 1;
        byte b = bArr[i2];
        byte b2 = (byte) ((255 << i) & b);
        if (b == b2) {
            zjfVar.j(z, 3, bArr);
            return;
        }
        zjfVar.m(z, 3);
        zjfVar.h(length);
        zjfVar.g(bArr, 0, i2);
        zjfVar.f(b2);
    }

    @Override // defpackage.zjh
    public final boolean e() {
        return false;
    }

    public zkj(zih zihVar) {
        super(zihVar.p().u(), 0);
    }

    public zkj(byte[] bArr) {
        super(bArr, 0);
    }

    public zkj(byte[] bArr, int i) {
        super(bArr, i);
    }

    public zkj(byte[] bArr, byte[] bArr2) {
        super(bArr);
    }

    public zkj(zic zicVar) {
        super(zicVar.m(), zicVar.f());
    }

    @Override // defpackage.zic, defpackage.zjh
    public final zjh k() {
        return this;
    }

    @Override // defpackage.zic, defpackage.zjh
    public final zjh l() {
        return this;
    }
}
