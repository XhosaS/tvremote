package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dbd extends cyw {
    /* JADX WARN: Illegal instructions before constructor call */
    public dbd() {
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

    @Override // defpackage.dab
    public final int a(boolean z) {
        return czz.b(z, this.a.length);
    }

    @Override // defpackage.dab
    public final void c(czz czzVar, boolean z) throws IOException {
        byte[] bArr = this.a;
        int i = bArr[0] & 255;
        int length = bArr.length;
        int i2 = length - 1;
        byte b = bArr[i2];
        byte b2 = (byte) ((255 << i) & b);
        if (b == b2) {
            czzVar.j(z, 3, bArr);
            return;
        }
        czzVar.m(z, 3);
        czzVar.h(length);
        czzVar.g(bArr, 0, i2);
        czzVar.f(b2);
    }

    @Override // defpackage.dab
    public final boolean e() {
        return false;
    }

    public dbd(czb czbVar) {
        super(czbVar.p().u(), 0);
    }

    public dbd(byte[] bArr) {
        super(bArr, 0);
    }

    public dbd(byte[] bArr, int i) {
        super(bArr, i);
    }

    public dbd(byte[] bArr, byte[] bArr2) {
        super(bArr);
    }

    public dbd(cyw cywVar) {
        super(cywVar.m(), cywVar.f());
    }

    @Override // defpackage.cyw, defpackage.dab
    public final dab k() {
        return this;
    }

    @Override // defpackage.cyw, defpackage.dab
    public final dab l() {
        return this;
    }
}
