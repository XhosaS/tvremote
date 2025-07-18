package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class zjf {
    private final OutputStream a;

    public zjf(OutputStream outputStream) {
        this.a = outputStream;
    }

    static int a(int i) {
        if (i < 128) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 8;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    static int b(boolean z, int i) {
        return (z ? 1 : 0) + a(i) + i;
    }

    static int c(int i) {
        if (i < 31) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 7;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public zkp d() {
        return new zkp(this.a);
    }

    public zkx e() {
        return new zkx(this.a);
    }

    final void f(int i) throws IOException {
        this.a.write(i);
    }

    final void g(byte[] bArr, int i, int i2) throws IOException {
        this.a.write(bArr, i, i2);
    }

    final void h(int i) throws IOException {
        if (i < 128) {
            f(i);
            return;
        }
        int i2 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i3 = i2 - 1;
            bArr[i3] = (byte) i;
            i >>>= 8;
            if (i == 0) {
                int i4 = i2 - 2;
                bArr[i4] = (byte) ((5 - i3) | 128);
                g(bArr, i4, 6 - i3);
                return;
            }
            i2 = i3;
        }
    }

    public void i(zih[] zihVarArr) {
        for (zih zihVar : zihVarArr) {
            zihVar.p().c(this, true);
        }
    }

    final void j(boolean z, int i, byte[] bArr) throws IOException {
        m(z, i);
        int length = bArr.length;
        h(length);
        g(bArr, 0, length);
    }

    final void k(boolean z, int i, byte[] bArr, int i2, int i3) throws IOException {
        m(z, i);
        h(i3);
        g(bArr, i2, i3);
    }

    final void l(boolean z, int i, zih[] zihVarArr) throws IOException {
        m(z, i);
        f(128);
        i(zihVarArr);
        f(0);
        f(0);
    }

    final void m(boolean z, int i) throws IOException {
        if (z) {
            f(i);
        }
    }

    public void n(zjh[] zjhVarArr) {
        for (zjh zjhVar : zjhVarArr) {
            zjhVar.c(this, true);
        }
    }

    final void o(int i, int i2) throws IOException {
        if (i2 < 31) {
            f(i | i2);
            return;
        }
        byte[] bArr = new byte[6];
        int i3 = 5;
        bArr[5] = (byte) (i2 & 127);
        while (true) {
            i3--;
            if (i2 <= 127) {
                bArr[i3] = (byte) (i | 31);
                g(bArr, i3, 6 - i3);
                return;
            } else {
                i2 >>>= 7;
                bArr[i3] = (byte) ((i2 & 127) | 128);
            }
        }
    }

    public void p(zjh zjhVar) {
        throw null;
    }
}
