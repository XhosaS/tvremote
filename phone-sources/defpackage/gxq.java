package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gxq extends InputStream implements InputStreamRetargetInterface {
    private final InputStream a;
    private int b = 1073741824;

    public gxq(InputStream inputStream) {
        this.a = inputStream;
    }

    private final void a(int i) {
        if (i == -1) {
            this.b = 0;
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.a.read();
        a(i);
        return i;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.a.skip(j);
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        bArr.getClass();
        int i = this.a.read(bArr);
        a(i);
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        bArr.getClass();
        int i3 = this.a.read(bArr, i, i2);
        a(i3);
        return i3;
    }
}
