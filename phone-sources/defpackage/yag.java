package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yag extends InputStream implements InputStreamRetargetInterface, xrj {
    private final yaf a;

    public yag(yaf yafVar) {
        yafVar.getClass();
        this.a = yafVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((xvu) this.a).a;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.a.b();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.a.d();
    }

    @Override // java.io.InputStream
    public final int read() {
        yaf yafVar = this.a;
        if (((xvu) yafVar).a == 0) {
            return -1;
        }
        return yafVar.e();
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.a.c();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        yaf yafVar = this.a;
        int iMin = (int) Math.min(((xvu) yafVar).a, j);
        yafVar.l(iMin);
        return iMin;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        yaf yafVar = this.a;
        int i3 = ((xvu) yafVar).a;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i3, i2);
        yafVar.k(bArr, i, iMin);
        return iMin;
    }
}
