package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afle extends InputStream implements InputStreamRetargetInterface, afgy, affx {
    private byte[][] a;
    private byte[] b;
    private int c;
    private int d;
    private int e;
    private boolean f;

    public afle(byte[] bArr) {
        this.a = null;
        int length = bArr.length;
        this.b = length <= 0 ? null : bArr;
        this.e = length;
    }

    private final void b() {
        int i = this.c + 1;
        this.c = i;
        this.d = 0;
        byte[][] bArr = this.a;
        if (bArr == null || i >= bArr.length) {
            this.b = null;
        } else {
            this.b = bArr[i];
        }
    }

    @Override // defpackage.affx
    public final int a(OutputStream outputStream) {
        throw null;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.e;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f) {
            return;
        }
        this.f = true;
        byte[][] bArr = this.a;
        if (bArr != null) {
            for (byte[] bArr2 : bArr) {
                aflf.a(bArr2);
            }
        } else {
            byte[] bArr3 = this.b;
            if (bArr3 != null) {
                aflf.a(bArr3);
            }
        }
        this.b = null;
        this.a = null;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.b;
        if (bArr == null) {
            return -1;
        }
        int i = this.d;
        int i2 = i + 1;
        this.d = i2;
        byte b = bArr[i];
        this.e--;
        if (i2 == bArr.length) {
            b();
        }
        return b;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public afle(byte[][] bArr, int i) {
        this.a = bArr;
        this.e = i;
        if (bArr.length > 0) {
            this.b = bArr[0];
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (true) {
            byte[] bArr2 = this.b;
            if (bArr2 == null) {
                break;
            }
            int i4 = this.d;
            int iC = ztm.c(i3, bArr2.length - i4, this.e);
            System.arraycopy(bArr2, i4, bArr, i, iC);
            i += iC;
            i3 -= iC;
            this.e -= iC;
            if (i3 == 0) {
                int i5 = this.d + iC;
                this.d = i5;
                if (i5 == this.b.length) {
                    b();
                }
            } else {
                b();
            }
        }
        int i6 = i2 - i3;
        if (i6 > 0 || this.e > 0) {
            return i6;
        }
        return -1;
    }
}
