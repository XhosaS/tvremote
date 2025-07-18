package defpackage;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tzx extends FilterOutputStream {
    public long a;

    public tzx(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        this.out.write(i);
        this.a++;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        this.a += i2;
    }
}
