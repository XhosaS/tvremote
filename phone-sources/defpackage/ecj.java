package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecj extends OutputStream {
    private final FileOutputStream a;
    private boolean b = false;

    public ecj(File file) {
        this.a = new FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.b) {
            return;
        }
        this.b = true;
        flush();
        try {
            this.a.getFD().sync();
        } catch (IOException e) {
            edb.f("AtomicFile", "Failed to sync file descriptor:", e);
        }
        this.a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.a.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.a.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.a.write(bArr, i, i2);
    }
}
