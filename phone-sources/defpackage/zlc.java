package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zlc extends zlh {
    private static final byte[] e = new byte[0];
    public final int a;
    public int b;

    public zlc(InputStream inputStream, int i, int i2) {
        super(inputStream, i2);
        if (i <= 0) {
            b();
            i = 0;
        }
        this.a = i;
        this.b = i;
    }

    final byte[] a() {
        int i = this.b;
        if (i == 0) {
            return e;
        }
        int i2 = this.d;
        if (i >= i2) {
            throw new IOException(a.ce(i2, i, "corrupted stream - out of bounds length found: ", " >= "));
        }
        byte[] bArr = new byte[i];
        int iAP = i - vxr.aP(this.c, bArr, i);
        this.b = iAP;
        if (iAP == 0) {
            b();
            return bArr;
        }
        throw new EOFException("DEF length " + this.a + " object truncated by " + this.b);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.b == 0) {
            return -1;
        }
        int i = this.c.read();
        if (i >= 0) {
            int i2 = this.b - 1;
            this.b = i2;
            if (i2 == 0) {
                b();
            }
            return i;
        }
        throw new EOFException("DEF length " + this.a + " object truncated by " + this.b);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.b;
        if (i3 == 0) {
            return -1;
        }
        int i4 = this.c.read(bArr, i, Math.min(i2, i3));
        if (i4 >= 0) {
            int i5 = this.b - i4;
            this.b = i5;
            if (i5 == 0) {
                b();
            }
            return i4;
        }
        throw new EOFException("DEF length " + this.a + " object truncated by " + this.b);
    }
}
