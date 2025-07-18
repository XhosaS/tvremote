package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zkl extends zio {
    public zkl(String str) {
        super(str);
    }

    private final byte[] j() {
        byte[] bArr = this.a;
        int length = bArr.length;
        int i = length - 1;
        if (bArr[i] == 90) {
            if (!h()) {
                byte[] bArr2 = new byte[length + 4];
                System.arraycopy(bArr, 0, bArr2, 0, i);
                System.arraycopy(zxr.d("0000Z"), 0, bArr2, i, 5);
                return bArr2;
            }
            if (!i()) {
                byte[] bArr3 = new byte[length + 2];
                System.arraycopy(bArr, 0, bArr3, 0, i);
                System.arraycopy(zxr.d("00Z"), 0, bArr3, i, 3);
                return bArr3;
            }
            if (g()) {
                int i2 = length - 2;
                while (i2 > 0 && bArr[i2] == 48) {
                    i2--;
                }
                int i3 = i2 + 1;
                if (bArr[i2] == 46) {
                    byte[] bArr4 = new byte[i3];
                    System.arraycopy(bArr, 0, bArr4, 0, i2);
                    bArr4[i2] = 90;
                    return bArr4;
                }
                byte[] bArr5 = new byte[i2 + 2];
                System.arraycopy(bArr, 0, bArr5, 0, i3);
                bArr5[i3] = 90;
                return bArr5;
            }
        }
        return bArr;
    }

    @Override // defpackage.zio, defpackage.zjh
    public final int a(boolean z) {
        return zjf.b(z, j().length);
    }

    @Override // defpackage.zio, defpackage.zjh
    public final void c(zjf zjfVar, boolean z) throws IOException {
        zjfVar.j(z, 24, j());
    }

    public zkl(byte[] bArr) {
        super(bArr);
    }

    @Override // defpackage.zio, defpackage.zjh
    public final zjh k() {
        return this;
    }

    @Override // defpackage.zjh
    public final zjh l() {
        return this;
    }
}
