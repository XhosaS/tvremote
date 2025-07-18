package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uge extends InputStream implements InputStreamRetargetInterface {
    private final Callable a;
    private volatile boolean b = false;
    private InputStream c;

    public uge(Callable callable) {
        this.a = callable;
    }

    private final void a() throws IOException {
        if (this.b) {
            return;
        }
        this.b = true;
        try {
            this.c = new ByteArrayInputStream((byte[]) this.a.call());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        if (this.b) {
            return this.c.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        a();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        if (this.b) {
            this.c.mark(i);
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        a();
        return this.c.read();
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        a();
        this.c.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        a();
        return this.c.skip(j);
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        a();
        return this.c.read(bArr);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        a();
        return this.c.read(bArr, i, i2);
    }
}
